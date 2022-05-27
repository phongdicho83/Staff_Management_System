/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.TheoDoiTangLuongDAO;
import staff_management_system.DTO.TheoDoiTangLuongDTO;
import staff_management_system.UI.TheoDoiLuongUI;

/**
 *
 * @author Nguyen Anh Quang
 */
public class TheoDoiLuongTangBUS {
       public ArrayList<TheoDoiTangLuongDTO> getTheoDoiList() throws Exception {
        TheoDoiTangLuongDAO dao = new TheoDoiTangLuongDAO();
        return TheoDoiLuongUI.list = dao.getListTangLuongs();
    }

    public boolean add(TheoDoiTangLuongDTO item) {
        TheoDoiTangLuongDAO dao = new TheoDoiTangLuongDAO();
        return dao.addTheoDoiLuong(item);
    }

    public boolean del(String MaTienThuong) {
        TheoDoiTangLuongDAO dao = new TheoDoiTangLuongDAO();
        return dao.delTheoDoi(MaTienThuong);
    }

    public boolean update(TheoDoiTangLuongDTO item) {
        TheoDoiTangLuongDAO dao = new TheoDoiTangLuongDAO();
        return dao.updateTheoDoi(item);
    }
    
    public boolean check(String mnv) {
        TheoDoiTangLuongDAO dao = new TheoDoiTangLuongDAO();
        return dao.checkMaNhanVien(mnv);
    }
}
