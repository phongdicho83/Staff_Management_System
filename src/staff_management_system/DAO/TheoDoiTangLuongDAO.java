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
import staff_management_system.DTO.NhanVien;
import staff_management_system.DTO.TheoDoiTangLuongDTO;

/**
 *
 * @author Nguyen Anh Quang
 */
public class TheoDoiTangLuongDAO {
     ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<TheoDoiTangLuongDTO> getListTangLuongs() throws SQLException {
        ArrayList<TheoDoiTangLuongDTO> list = new ArrayList<>();
        String qry = "select * from theodoitangluong";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                TheoDoiTangLuongDTO item = new TheoDoiTangLuongDTO();
                item.setMaNV(rs.getString(1));
                item.setSoNgayLam(Integer.valueOf(rs.getString(2)));
                 item.setTang(Integer.valueOf(rs.getString(3)));
                  item.setLuongTang(Integer.valueOf(rs.getString(4)));
                list.add(item);
            }
            conn.closeConnection();
        } catch (NumberFormatException | SQLException e) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addTheoDoiLuong(TheoDoiTangLuongDTO item) {
        try {
            String qry = "INSERT INTO `theodoitangluong` (`MaNV`, `SoNgayLam`,`Tang`,`LuongTang`) VALUES (";
              qry += "'" + item.getMaNV()+ "'";
            qry += ",'" + item.getSoNgayLam()+ "'";
            qry += ",'" + item.getTang()+ "'";
            qry += ",'" + item.getLuongTang()+ "');";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delTheoDoi(String MaNV) {
        try {
            String qry = "delete from `theodoitangluong` where MaNV = '" + MaNV + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateTheoDoi(TheoDoiTangLuongDTO item) {
        try {
            String qry = "update `theodoitangluong` set ";
             qry += "SoNgayLam =" + "'" + item.getSoNgayLam()+ "'";
            qry += ",Tang = " + item.getTang();
            qry += ",LuongTang =" + item.getLuongTang();
            qry += " where MaNV = " + "'" + item.getMaNV()+ "'";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     public boolean checkMaNhanVien(String manv) {
        ArrayList<NhanVien> list = new ArrayList<>();
        String qry = "select * from NhanVien  where MaNV = '" + manv + "'";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                NhanVien item = new NhanVien();
                item.setMaNV(rs.getString(1));
                
                list.add(item);
            }
            conn.closeConnection();
        } catch (NumberFormatException | SQLException e) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list.isEmpty();
    }
}
