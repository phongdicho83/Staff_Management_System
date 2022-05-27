/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DAO.PhongBanDAO;
import staff_management_system.DTO.PhongBan;
//import static staff_management_system.Helpers.CommonAttribute.dspb;

/**
 *
 * @author Chi Thien
 */
public class PhongBanBUS {
    public static ArrayList<PhongBan> dspb;
     public void getPhongBans() {
        PhongBanDAO dao = new PhongBanDAO();
        if(dspb == null)
            dspb = new ArrayList<>();
        try {
            dspb = dao.getPhongBans();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBanBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean checkPK(String mapb, String macv){
        for(PhongBan nv:dspb){
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
