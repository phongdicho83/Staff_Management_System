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
import staff_management_system.DTO.LuongHopDongDTO;

/**
 *
 * @author Nguyen Anh Quang
 */
public class LuongHopDongDAO {
     ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<LuongHopDongDTO> getListLuongs() throws SQLException {
        ArrayList<LuongHopDongDTO> list = new ArrayList<>();
        String qry = "select * from luonghopdong";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                LuongHopDongDTO item = new LuongHopDongDTO();
                item.setManV(rs.getString(1));
                item.setMaHD(rs.getString(2));
                 item.setNgayVaoLam(rs.getString(3));
                  item.setTienLuong(Long.valueOf(rs.getString(4)));
                list.add(item);
            }
            conn.closeConnection();
        } catch (NumberFormatException | SQLException e) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean add(LuongHopDongDTO item) {
        try {
            String qry = "INSERT INTO `luonghopdong` (`MaNV`, `MaHD`,`NgayVaoLam`,`TienLuong`) VALUES (";
              qry += "'" + item.getManV()+ "'";
            qry += ",'" + item.getMaHD()+ "'";
            qry += ",'" + item.getNgayVaoLam()+ "'";
            qry += ",'" + item.getTienLuong()+ "');";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(LuongHopDongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean del(String MaNV) {
        try {
            String qry = "delete from `luonghopdong` where MaNV = '" + MaNV + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(LuongHopDongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateTheoDoi(LuongHopDongDTO item) {
        try {
            String qry = "update `luonghopdong` set ";
             qry += "NgayVaoLam =" + "'" + item.getNgayVaoLam()+ "'";
            qry += ",TienLuong = " + item.getTienLuong();
         
            qry += " where MaNV = " + "'" + item.getManV()+ "'";

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
        String qry = "select * from NhanVien  where MaNV = '" + manv + "' ";
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
