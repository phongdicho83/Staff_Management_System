package staff_management_system.BUS;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import staff_management_system.DAO.TangCaDAO;
import staff_management_system.DTO.TangCa;

public class TangCaBUS {
    public static ArrayList<TangCa> dstc;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public TangCaBUS(){
    }
    
    public boolean checkPK(String maTC, String maNV, Date ngayThangNam){
        for(TangCa tc:dstc){
            if(tc.getMaTC().equals(maTC)||(tc.getMaNV().equals(maNV)&&tc.getNgayThangNam().equals(ngayThangNam)))
                return false;
        }
        return true;
    }
    
    public void docDSTC(){
       TangCaDAO data = new TangCaDAO();
        if(dstc==null)
            dstc = new ArrayList<>();
        dstc = data.docDSTC();
    }
    
    public void themTC(TangCa tc){
        TangCaDAO data = new TangCaDAO();
        data.themTC(tc);
        dstc.add(tc);
    }
    
    public void suaTC(TangCa tc){
        TangCaDAO data = new TangCaDAO();
        data.suaTC(tc);
        for(TangCa temp:dstc)
            if(tc.getMaTC().equals(temp.getMaTC())){
                int pos = dstc.indexOf(temp);
                TangCa old= dstc.set(pos, tc);
                break;
            }
    }
    
    public void xoaTC(int index){
        TangCaDAO data = new TangCaDAO();
        data.xoaTC(dstc.get(index).getMaTC());
        dstc.remove(index);
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<TangCa> tc = new ArrayList <> ();
        switch(num1){
            case 1:
                for (TangCa temp: dstc)
                    if(temp.getMaTC().toUpperCase().contains(s.toUpperCase()))
                        tc.add(temp);
                break;
            case 2:
                for (TangCa temp: dstc)
                    if(temp.getMaNV().toUpperCase().contains(s.toUpperCase()))
                        tc.add(temp);
                break;
            case 3:
                for (TangCa temp: dstc)
                    if(sdf.format(temp.getNgayThangNam()).equals(s))
                        tc.add(temp);
                break;
            case 4:
                for (TangCa temp: dstc)
                    if(temp.getSoGioTangCa().equals(s))
                        tc.add(temp);
                break;
        }
        return tc;
    }
    
    public ArrayList timKiem2 (Date s1, Date s2) {
        ArrayList<TangCa> tc = new ArrayList <> ();
        for (TangCa temp: dstc){
            System.out.println(temp.getNgayThangNam());
            System.out.println(s1);
            System.out.println(temp.getNgayThangNam().equals(s1));
            System.out.println(temp.getNgayThangNam().equals(s2));
            if((temp.getNgayThangNam().after(s1)&&temp.getNgayThangNam().before(s2))||sdf.format(temp.getNgayThangNam()).equals(sdf.format(s1))||sdf.format(temp.getNgayThangNam()).equals(sdf.format(s2)))
            { tc.add(temp);
                System.out.println("ok");
            }
        }
        return tc;
    }
    
}
