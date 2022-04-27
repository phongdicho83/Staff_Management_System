/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import staff_management_system.DAO.BangChamCongDAO;
import staff_management_system.DTO.BangChamCong;
import staff_management_system.UI.BangChamCongUI;

/**
 *
 * @author Utech
 */
public class BangChamCongBUS {

    public ArrayList<BangChamCong> getBangChamCongs() throws Exception {
        BangChamCongDAO dao = new BangChamCongDAO();
        return BangChamCongUI.listChamCong = dao.getBangChamCongs();
    }

    public boolean addChamCong(BangChamCong chamCong) {
        BangChamCongDAO dao = new BangChamCongDAO();
        if (dao.addChamCong(chamCong)) {
            return true;
        }
        return false;
    }

    public boolean delChamCong(String MaChamCong) {
        BangChamCongDAO dao = new BangChamCongDAO();
        if (!dao.delChamCong(MaChamCong)) {
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
