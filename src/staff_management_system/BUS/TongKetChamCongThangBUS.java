package staff_management_system.BUS;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import staff_management_system.DAO.TongKetChamCongThangDAO;
import staff_management_system.DTO.TongKetChamCongThang;

public class TongKetChamCongThangBUS {
    public static ArrayList<TongKetChamCongThang> dstkcct;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public TongKetChamCongThangBUS() {
    }
    
    public void docDSTKCCT(){
       TongKetChamCongThangDAO data = new TongKetChamCongThangDAO();
        if(dstkcct==null)
            dstkcct = new ArrayList<>();
        dstkcct = data.docDSTKCCT();
    }
    
       public boolean checkPK(String maNV, String thangNam){
        for(TongKetChamCongThang tkcct:dstkcct){
            if(tkcct.getMaNV().equals(maNV)&&tkcct.getThangNam().equals(thangNam))
                return false;
        }
        return true;
    }
       
    public void themTKCCT(TongKetChamCongThang tkcct){
        TongKetChamCongThangDAO data = new TongKetChamCongThangDAO();
        data.themTKCCT(tkcct);
        dstkcct.add(tkcct);
    }
    
    public void suaTKCCT(TongKetChamCongThang tkcct){
        TongKetChamCongThangDAO data = new TongKetChamCongThangDAO();
        data.suaTKCCT(tkcct);
        for(TongKetChamCongThang temp:dstkcct)
            if(temp.getMaNV().equals(tkcct.getMaNV())&&temp.getThangNam().equals(tkcct.getThangNam())){
                int pos = dstkcct.indexOf(temp);
                TongKetChamCongThang old= dstkcct.set(pos, tkcct);
                break;
            }
    }
    
    public void xoaTKCCT(int index){
        TongKetChamCongThangDAO data = new TongKetChamCongThangDAO();
        data.xoaTKCCT(dstkcct.get(index).getMaNV(),dstkcct.get(index).getThangNam());
        dstkcct.remove(index);
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<TongKetChamCongThang> tkcct = new ArrayList <> ();
        switch(num1){
            case 1:
                for (TongKetChamCongThang temp: dstkcct)
                    if(temp.getMaNV().toUpperCase().contains(s.toUpperCase()))
                        tkcct.add(temp);
                break;
            case 2:
                for (TongKetChamCongThang temp: dstkcct)
                    if(temp.getThangNam().equals(s))
                        tkcct.add(temp);
                break;
            case 3:
                for (TongKetChamCongThang temp: dstkcct)
                    if(temp.getLuongBiTru().equals(s))
                        tkcct.add(temp);
                break;
        }
        return tkcct;
    }
    
}
