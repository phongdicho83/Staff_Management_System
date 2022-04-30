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
import staff_management_system.DTO.CongViec;

/**
 *
 * @author Utech
 */
public class CongViecDAO {

    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<CongViec> getCongViecs() throws SQLException {
        ArrayList<CongViec> list = new ArrayList<>();
        String qry = "select * from congviec";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                CongViec congViec = new CongViec();
                congViec.setMaCongViec(rs.getString(1));
                congViec.setTenCongViec(rs.getString(2));
                list.add(congViec);
            }
            conn.closeConnection();
        } catch (Exception e) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addCongViec(CongViec congViec) {
        try {
            String qry = "INSERT INTO `congviec` (`MaCongViec`, `TenCongViec`) VALUES (";
            qry += "'" + congViec.getMaCongViec()+ "'";
            qry += ",'" + congViec.getTenCongViec()+ "');";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delCongViec(String MaCongViec) {
        try {
            String qry = "delete from `congviec` where macongviec = '" + MaCongViec + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateCongViec(CongViec congViec) {
        try {
            String qry = "update `congviec` set ";
            qry += "tencongviec =" + "'" + congViec.getTenCongViec()+ "'";
            qry += " where macongviec = " + "'" + congViec.getMaCongViec() + "'";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
