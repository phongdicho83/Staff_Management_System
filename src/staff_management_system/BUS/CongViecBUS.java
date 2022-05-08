/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import staff_management_system.DAO.CongViecDAO;
import staff_management_system.DTO.CongViec;
import staff_management_system.UI.CongViecUI;

/**
 *
 * @author Utech
 */
public class CongViecBUS {

    public ArrayList<CongViec> getCongViecs() throws Exception {
        CongViecDAO dao = new CongViecDAO();
        return CongViecUI.listCongViec = dao.getCongViecs();
    }

    public boolean addCongViec(CongViec congViec) {
        CongViecDAO dao = new CongViecDAO();
        if (dao.addCongViec(congViec)) {
            return true;
        }
        return false;
    }

    public boolean delCongViec(String MaCongViec) {
        CongViecDAO dao = new CongViecDAO();
        if (!dao.delCongViec(MaCongViec)) {
            return false;
        }
        return true;
    }

    public boolean updateCongViec(CongViec congViec) {
        CongViecDAO dao = new CongViecDAO();
        if (!dao.updateCongViec(congViec)) {
            return false;
        }
        return true;
    }
}
