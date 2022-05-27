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
import staff_management_system.DAO.BangChamCongDAO;
import staff_management_system.DTO.BangChamCong;


/**
 *
 * @author Utech
 */
public class BangChamCongBUS {
    public static ArrayList<BangChamCong> dscc;

    public void getBangChamCongs() {
        BangChamCongDAO dao = new BangChamCongDAO();
        if(dscc ==  null)
            dscc = new ArrayList<>();
        try {
            dscc = dao.getBangChamCongs();
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addChamCong(BangChamCong chamCong) {
        BangChamCongDAO dao = new BangChamCongDAO();
        if (dao.addChamCong(chamCong)) {
            return true;
        }
        return false;
    }

    public boolean delChamCong(BangChamCong cC) {
        BangChamCongDAO dao = new BangChamCongDAO();
        if (!dao.delChamCong(cC.getMaNV(), cC.getDate())) {
            return false;
        }
        return true;
    }

    public boolean updateChamCong(BangChamCong chamCong) {
        BangChamCongDAO dao = new BangChamCongDAO();
        if (!dao.updateChamCong(chamCong)) {
            return false;
        }
        return true;
    }
}
