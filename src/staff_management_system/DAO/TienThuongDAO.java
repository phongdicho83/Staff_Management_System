/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_management_system.DAO;

import Helpers.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TienThuongDTO;

/**
 *
 * @author Nguyen Anh Quang
 */
public class TienThuongDAO {
    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<TienThuongDTO> getTienThuongs() throws SQLException {
        ArrayList<TienThuongDTO> list = new ArrayList<>();
        String qry = "select * from tienthuong";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                TienThuongDTO tienthuong = new TienThuongDTO();
                tienthuong.setMaTienThuong(rs.getString(1));
                tienthuong.setTenTienThuong(rs.getString(2));
                tienthuong.setThang(rs.getInt(3));
                tienthuong.setTienThuong(rs.getLong(4));
                list.add(tienthuong);
            }
            conn.closeConnection();
        } catch (SQLException e) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addTienThuong(TienThuongDTO tienthuong) {
        try {
            String qry = "INSERT INTO `tienthuong` (`MaTienThuong`, `TenThuong`,`Thang`,`SoTienThuong`) VALUES (";
            qry += "'" + tienthuong.getMaTienThuong()+ "'";
            qry += ",'" + tienthuong.getTenTienThuong()+ "'";
            qry += ",'" + tienthuong.getThang()+ "'";
            qry += ",'" + tienthuong.getTienThuong()+ "');";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TienThuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delTienThuong(String MaTienThuong) {
        try {
            String qry = "delete from `tienthuong` where MaTienThuong = '" + MaTienThuong + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TienThuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateTienThuong(TienThuongDTO tienthuong) {
        try {
            String qry = "update `tienthuong` set ";
            qry += "TenThuong =" + "'" + tienthuong.getTenTienThuong()+ "'";
            qry += ",Thang = " + tienthuong.getThang();
            qry += ",SoTienThuong =" + tienthuong.getTienThuong();
            qry += " where MaTienThuong = " + "'" + tienthuong.getMaTienThuong()+ "'";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TienThuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
