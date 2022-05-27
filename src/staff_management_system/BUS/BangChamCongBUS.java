/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

    public ArrayList<BangChamCong> getBangChamCongs(int selectedIndex, String timKiem) {
        try {
            BangChamCongDAO dao = new BangChamCongDAO();
            if (dscc == null) {
                dscc = new ArrayList<>();
            }

            if (selectedIndex == 0 && timKiem.equals("") == true) {
                return dscc = dao.getBangChamCongs();
            }

            if (selectedIndex != 0 && timKiem.equals("") == false) {

                ArrayList<BangChamCong> temp = new ArrayList<>();

                for (BangChamCong bcc : dscc) {
                    if (bcc.getMaNV().toLowerCase().contains(timKiem.toLowerCase())) {
                        temp.add(bcc);
                    }
                    if (bcc.getTrangThai().toLowerCase().contains(timKiem.toLowerCase())) {
                        temp.add(bcc);
                    }
                }
                return temp;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkPK(String maNV, String thangNam) {
        for (BangChamCong bcc : dscc) {
            if (bcc.getMaNV().equals(maNV) && bcc.getDate().equals(thangNam)) {
                return false;
            }
        }
        return true;
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
