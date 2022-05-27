/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.LuongHopDongDAO;
import staff_management_system.DTO.LuongHopDongDTO;
import staff_management_system.UI.LuongHopDongUI;

/**
 *
 * @author Nguyen Anh Quang
 */
public class LuongHopDongBUS {
         public ArrayList<LuongHopDongDTO> getListHopDongs() throws Exception {
        LuongHopDongDAO dao = new LuongHopDongDAO();
        return LuongHopDongUI.list = dao.getListLuongs();
    }

    public boolean add(LuongHopDongDTO item) {
        LuongHopDongDAO dao = new LuongHopDongDAO();
        return dao.add(item);
    }

    public boolean del(String MaTienThuong) {
        LuongHopDongDAO dao = new LuongHopDongDAO();
        return dao.del(MaTienThuong);
    }

    public boolean update(LuongHopDongDTO item) {
        LuongHopDongDAO dao = new LuongHopDongDAO();
        return dao.updateTheoDoi(item);
    }
    
    public boolean check(String mnv) {
        LuongHopDongDAO dao = new LuongHopDongDAO();
        return dao.checkMaNhanVien(mnv);
    }
}
