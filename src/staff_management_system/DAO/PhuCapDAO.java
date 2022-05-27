/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DAO;

import Helpers.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import staff_management_system.DTO.PhuCap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utech
 */
public class PhuCapDAO {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();
    
    public ArrayList<PhuCap> getBangChamCongs() throws Exception{
        ArrayList<PhuCap> list = new ArrayList<>();
        String qry = "select * from phucap";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                PhuCap phucap = new PhuCap();
                phucap.setMaPhuCap(rs.getString(1));
                phucap.setTenPhuCap(rs.getString(2));
                phucap.setNgayThangNam(formatter.parse(rs.getString(3)));
                phucap.setSoTien(rs.getString(4));
                list.add(phucap);
            }
            conn.closeConnection();
        } catch (SQLException ex) { 
            Logger.getLogger(PhuCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public boolean addPhuCap(PhuCap pc) {
        try {
            String qry = "insert into `phucap` values (";
            qry += "'" + pc.getMaPhuCap() + "'";
            qry += ",'" + pc.getTenPhuCap() + "'";
            qry += ",'" + formatter.format(pc.getNgayThangNam()) + "'";
            qry += ",'" + pc.getSoTien() + "');";
            
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhuCapDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean delPhuCap (String maPhucap) {
        try {
            String qry = "delete from phucap where maphucap = '" + maPhucap + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhuCapDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean updatePhuCap (PhuCap pc) {
        try {
            String qry = "update phucap set";
            qry += "tenphucap = '" + pc.getTenPhuCap() + "'";
            qry += " where maphucap = '" + pc.getMaPhuCap() + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhuCapDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
}
