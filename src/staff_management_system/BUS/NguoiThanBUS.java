package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.NguoiThanDAO;
import staff_management_system.DTO.NguoiThan;
import staff_management_system.Helpers.CommonAttribute;

public class NguoiThanBUS {

    
    public NguoiThanBUS(){
    }
    
    public boolean checkPK(String ma, String stt){
        for(NguoiThan nt:CommonAttribute.dsnt){
            if(nt.getMaNV().equals(ma)&&nt.getStt().equals(stt))
                return false;
        }
        return true;
    }
    
    public void docDSNT(){
        NguoiThanDAO data = new NguoiThanDAO();
        if(CommonAttribute.dsnt==null)
            CommonAttribute.dsnt = new ArrayList<>();
        CommonAttribute.dsnt = data.docDSNT();
    }
    
    public void themNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        data.themNT(nt);
        CommonAttribute.dsnt.add(nt);
    }
    
    public void suaNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        data.suaNT(nt);
        for(NguoiThan temp:CommonAttribute.dsnt)
            if(temp.getMaNV().equals(nt.getMaNV())&&temp.getStt().equals(nt.getStt())){
                int pos = CommonAttribute.dsnt.indexOf(temp);
                NguoiThan old= CommonAttribute.dsnt.set(pos, nt);
                break;
            }
    }
    
    public void xoaNT(int index){
        NguoiThanDAO data = new NguoiThanDAO();
        data.xoaNT(CommonAttribute.dsnt.get(index).getMaNV(),CommonAttribute.dsnt.get(index).getStt());
        CommonAttribute.dsnt.remove(index);
    }
    
}
