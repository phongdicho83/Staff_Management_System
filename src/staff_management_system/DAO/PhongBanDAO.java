/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DAO;

import Helpers.MyConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.PhongBan;

/**
 *
 * @author Utech
 */
public class PhongBanDAO {
    
    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<PhongBan> getPhongBans() throws SQLException {
        ArrayList<PhongBan> list = new ArrayList<>();
        String qry = "select * from phongban";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                PhongBan phongBan = new PhongBan();
                phongBan.setMaPhongBan(rs.getString(1));
                phongBan.setTenPhongBan(rs.getString(2));
                phongBan.setMaCongViec(rs.getString(3));
                phongBan.setDiaChi(rs.getString(4));               
                list.add(phongBan);
            }
            conn.closeConnection();
        } catch (Exception e) {
            Logger.getLogger(PhongBanDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addphongBan(PhongBan phongban) {
        try {
            String qry = "INSERT INTO `phongban` (`MaPhongBan`, `TenPhongBan`, `MaCongViec`, `DiaChi`) VALUES (";
            qry += "'" + phongban.getMaPhongBan()+ "'";
            qry += ",'" + phongban.getTenPhongBan()+ "'";
            qry += ",'" + phongban.getMaCongViec()+ "'";
            qry += ",'" + phongban.getDiaChi()+ "');";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhongBanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delPhongBan(String MaPhongBan) {
        try {
            String qry = "delete from `phongban` where MaPhongBan = '" + MaPhongBan + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhongBanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updatePhongBan(PhongBan phongBan) {
        try {
            String qry = "update `phongban` set ";
            qry += "tenphongban =" + "'" + phongBan.getTenPhongBan()+ "'";
            qry += ",macongviec =" + "'" + phongBan.getMaCongViec()+ "'";
            qry += ",diachi =" + "'" + phongBan.getDiaChi()+ "'";
            qry += " where maphongban = " + "'" + phongBan.getMaPhongBan()+ "'";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhongBanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}