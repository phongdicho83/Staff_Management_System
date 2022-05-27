/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.TienThuongDAO;
import staff_management_system.DTO.TienThuongDTO;
import staff_management_system.UI.TienThuongUI;

/**
 *
 * @author Nguyen Anh Quang
 */
public class TienThuongBUS {
    public static ArrayList<TienThuongDTO> dstt = new ArrayList<>();
    
     public ArrayList<TienThuongDTO> getTienThuongs() throws Exception {
        TienThuongDAO dao = new TienThuongDAO();
        return dstt = dao.getTienThuongs();
    }

    public boolean addCongViec(TienThuongDTO tienthuong) {
        TienThuongDAO dao = new TienThuongDAO();
        return dao.addTienThuong(tienthuong);
    }

    public boolean delTienThuong(String MaTienThuong) {
        TienThuongDAO dao = new TienThuongDAO();
        return dao.delTienThuong(MaTienThuong);
    }

    public boolean updateTienThuong(TienThuongDTO tienthuong) {
        TienThuongDAO dao = new TienThuongDAO();
        return dao.updateTienThuong(tienthuong);
    }
}
