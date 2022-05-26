package staff_management_system.BUS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import staff_management_system.DAO.TongKetTangCaThangDAO;
import staff_management_system.DTO.TongKetTangCaThang;

public class TongKetTangCaThangBUS {
    public static ArrayList<TongKetTangCaThang> dstktct;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public TongKetTangCaThangBUS() {
    }
    
    public boolean checkPK(String maNV, String thangNam){
        for(TongKetTangCaThang tktct:dstktct){
            if(tktct.getMaNV().equals(maNV)&&tktct.getThangNam().equals(thangNam))
                return false;
        }
        return true;
    }
    
    public void docDSTKTCT(){
       TongKetTangCaThangDAO data = new TongKetTangCaThangDAO();
        if(dstktct==null)
            dstktct = new ArrayList<>();
        dstktct = data.docDSTKTCT();
    }
    
    public void themTKTCT(TongKetTangCaThang tktct){
        TongKetTangCaThangDAO data = new TongKetTangCaThangDAO();
        data.themTKTCT(tktct);
        dstktct.add(tktct);
    }
    
    public void suaTKTCT(TongKetTangCaThang tktct){
        TongKetTangCaThangDAO data = new TongKetTangCaThangDAO();
        data.suaTKTCT(tktct);
        for(TongKetTangCaThang temp:dstktct)
            if(temp.getMaNV().equals(tktct.getMaNV())&&temp.getThangNam().equals(tktct.getThangNam())){
                int pos = dstktct.indexOf(temp);
                TongKetTangCaThang old= dstktct.set(pos, tktct);
                break;
            }
    }
    
    public void xoaTKTCT(int index){
        TongKetTangCaThangDAO data = new TongKetTangCaThangDAO();
        data.xoaTKTCT(dstktct.get(index).getMaNV(),dstktct.get(index).getThangNam());
        dstktct.remove(index);
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<TongKetTangCaThang> tktct = new ArrayList <> ();
        switch(num1){
            case 1:
                for (TongKetTangCaThang temp: dstktct)
                    if(temp.getMaNV().toUpperCase().contains(s.toUpperCase()))
                        tktct.add(temp);
                break;
            case 2:
                for (TongKetTangCaThang temp: dstktct)
                    if(temp.getThangNam().equals(s))
                        tktct.add(temp);
                break;
            case 3:
                for (TongKetTangCaThang temp: dstktct)
                    if(temp.getTongGioTangCa().equals(s))
                        tktct.add(temp);
                break;
            case 4:
                for (TongKetTangCaThang temp: dstktct)
                    if(temp.getSoTienDuocHuong().equals(s))
                        tktct.add(temp);
                break;
      
        }
        return tktct;
    }
    
    public ArrayList timKiem2 (int num1, String s1, String s2) throws ParseException {
        ArrayList<TongKetTangCaThang> tktct = new ArrayList <> ();
        switch(num1){
            case 1:
                Date d1 = sdf.parse("1-"+s1);
                Date d2 = sdf.parse("29-"+s2);
                Date d3;
                for (TongKetTangCaThang temp: dstktct){
                    d3 = sdf.parse("5-"+temp.getThangNam());
                    if(d1.before(d3)&&d3.before(d2))
                        tktct.add(temp);
                }
                break;
            case 2:
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int i3;
                for (TongKetTangCaThang temp: dstktct){
                    i3 = Integer.parseInt(temp.getTongGioTangCa());
                    if(i1<=i3&&i3<=i2)
                        tktct.add(temp);
                }   
                break;
        }
        return tktct;
    }
    
}
