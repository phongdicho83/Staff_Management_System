package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.NguoiThanDAO;
import staff_management_system.DTO.NguoiThan;

public class NguoiThanBUS {
    public static ArrayList <NguoiThan> dsnt;
    
    public NguoiThanBUS(){
    }
    
    public boolean checkPK(String ma, String stt){
        for(NguoiThan nt:dsnt){
            if(nt.getMaNV().equals(ma)&&nt.getStt().equals(stt))
                return false;
        }
        return true;
    }
    
    public void docDSNT(){
        NguoiThanDAO data = new NguoiThanDAO();
        if(dsnt==null)
            dsnt = new ArrayList<>();
        dsnt = data.docDSNT();
    }
    
    public void themNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        data.themNT(nt);
        dsnt.add(nt);
    }
    
    public void suaNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        data.suaNT(nt);
        for(NguoiThan temp:dsnt)
            if(temp.getMaNV().equals(nt.getMaNV())&&temp.getStt().equals(nt.getStt())){
                int pos = dsnt.indexOf(temp);
                NguoiThan old= dsnt.set(pos, nt);
                break;
            }
    }
    
    public void xoaNT(int index){
        NguoiThanDAO data = new NguoiThanDAO();
        data.xoaNT(dsnt.get(index).getMaNV(),dsnt.get(index).getStt());
        dsnt.remove(index);
    }
    
}
