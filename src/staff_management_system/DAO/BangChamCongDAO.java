/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DAO;

import Helpers.MyConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.BangChamCong;

/**
 *
 * @author Utech
 */
public class BangChamCongDAO {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<BangChamCong> getBangChamCongs() throws SQLException {
        ArrayList<BangChamCong> list = new ArrayList<>();
        String qry = "select * from bangchamcong";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                BangChamCong bangChamCong = new BangChamCong();
                bangChamCong.setMaChamCong(rs.getString(1));
                bangChamCong.setMaNV(rs.getString(2));
                bangChamCong.setDate(formatter.parse(rs.getString(3)));
                bangChamCong.setTrangThai(rs.getString(4));
                list.add(bangChamCong);
            }
            conn.closeConnection();
        } catch (Exception e) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addChamCong(BangChamCong chamcong) {
        String date = formatter.format(chamcong.getDate());
        try {
            String qry = "INSERT INTO `bangchamcong` (`MaChamCong`, `MaNV`, `NgayThangNam`, `TrangThai`) VALUES (";
            qry += "'" + chamcong.getMaChamCong() + "'";
            qry += ",'" + chamcong.getMaNV() + "'";
            qry += ",'" + date + "'";
            qry += ",'" + chamcong.getTrangThai() + "');";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delChamCong(String MaChamCong) {
        try {
            String qry = "delete from `bangchamcong` where machamcong = '" + MaChamCong + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateChamCong(BangChamCong chamCong) {
        try {
            String qry = "update `bangchamcong` set ";
            qry += "manv =" + "'" + chamCong.getMaNV() + "'";
            qry += ",ngaythangnam =" + "'" + formatter.format(chamCong.getDate()) + "'";
            qry += ",trangthai =" + "'" + chamCong.getTrangThai() + "'";
            qry += " where machamcong = " + "'" + chamCong.getMaChamCong() + "'";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
