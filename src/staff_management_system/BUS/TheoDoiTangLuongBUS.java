package staff_management_system.BUS;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import staff_management_system.DAO.TheoDoiTangLuongDAO;
import staff_management_system.DTO.TheoDoiTangLuong;

public class TheoDoiTangLuongBUS {
    public static ArrayList<TheoDoiTangLuong> dstdtl;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public void docDSTDTL(){
       TheoDoiTangLuongDAO data = new TheoDoiTangLuongDAO();
        if(dstdtl==null)
            dstdtl = new ArrayList<>();
        dstdtl = data.docDSTDTL();
    }
    
    public boolean checkPK(String maNV, Date ngayThangNam){
        for(TheoDoiTangLuong tdtl:dstdtl){
            if(tdtl.getMaNV().equals(maNV)&&tdtl.getNgayTangLuong().equals(ngayThangNam))
                return false;
        }
        return true;
    }
        
    public void themTDTL(TheoDoiTangLuong tdtl){
        TheoDoiTangLuongDAO data = new TheoDoiTangLuongDAO();
        data.themTDTL(tdtl);
        dstdtl.add(tdtl);
    }
    
    public void suaTDTL(TheoDoiTangLuong tdtl){
        TheoDoiTangLuongDAO data = new TheoDoiTangLuongDAO();
        data.suaTDTL(tdtl);
        for(TheoDoiTangLuong temp:dstdtl)
            if(tdtl.getMaNV().equals(temp.getMaNV())&&tdtl.getNgayTangLuong().equals(temp.getNgayTangLuong())){
                int pos = dstdtl.indexOf(temp);
                TheoDoiTangLuong old= dstdtl.set(pos, tdtl);
                break;
            }
    }
    
    public void xoaTDTL(int index){
        TheoDoiTangLuongDAO data = new TheoDoiTangLuongDAO();
        data.xoaTDTL(dstdtl.get(index).getMaNV(),sdf.format(dstdtl.get(index).getNgayTangLuong()));
        dstdtl.remove(index);
    }
    
}
