/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import staff_management_system.DAO.PhongBanDAO;
import staff_management_system.DTO.PhongBan;
import staff_management_system.Helpers.CommonAttribute;
import staff_management_system.UI.PhongBanUI;
/**
 *
 * @author Chi Thien
 */
public class PhongBanBUS {
     public ArrayList<PhongBan> getPhongBans() throws Exception {
        PhongBanDAO dao = new PhongBanDAO();
        return PhongBanUI.listPhongBan = dao.getPhongBans();
    }
    public boolean checkPK(String mapb, String macv){
        for(PhongBan nv:CommonAttribute.dspb){
            if(nv.getMaPhongBan().equals(mapb)&&nv.getMaCongViec().equals(macv))
                return false;
        }
        return true;
    }

    public boolean addPhongBan(PhongBan phongBan) {
        PhongBanDAO dao = new PhongBanDAO();
        if (dao.addphongBan(phongBan)) {
            return true;
        }
        return false;
    }

    public boolean delPhongBan(String MaPhongBan) {
        PhongBanDAO dao = new PhongBanDAO();
        if (!dao.delPhongBan(MaPhongBan)) {
            return false;
        }
        return true;
    }

    public boolean updatePhongBan(PhongBan phongBan) {
        PhongBanDAO dao = new PhongBanDAO();
        if (!dao.updatePhongBan(phongBan)) {
            return false;
        }
        return true;
    }
    
}
