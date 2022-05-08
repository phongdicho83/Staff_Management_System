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
import staff_management_system.DTO.NhanVien;

/**
 *
 * @author Utech
 */
public class NhanVienDAO {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();

    public ArrayList<NhanVien> getNhanViens() throws SQLException {
        ArrayList<NhanVien> list = new ArrayList<>();
        String qry = "select * from nhanvien";
        try {
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();

            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(rs.getString(1));
                nhanVien.setHo(rs.getString(2));
                nhanVien.setTen(rs.getString(3));
                nhanVien.setNgaySinh(formatter.parse(rs.getString(4)));
                nhanVien.setSoDienThoai(rs.getString(5));
                nhanVien.setGioiTinh(rs.getString(6));
                nhanVien.setMaPhongBan(rs.getString(7));
                nhanVien.setMaChucVu(rs.getString(8));
                list.add(nhanVien);
            }
            conn.closeConnection();
        } catch (Exception e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public boolean addNhanVien(NhanVien nhanvien) {
        String date = formatter.format(nhanvien.getNgaySinh());
        try {
            String qry = "INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `NgaySinh`, `SoDienThoai`, `GioiTinh`, `MaPhongBan`, `MaChucVu`) VALUES (";
            qry += "'" + nhanvien.getMaNV()+ "'";
            qry += ",'" + nhanvien.getHo() + "'";
            qry += ",'" + nhanvien.getTen()+ "'";
            qry += ",'" + date + "'";
            qry += ",'" + nhanvien.getSoDienThoai()+ "'";
            qry += ",'" + nhanvien.getGioiTinh()+ "'";
            qry += ",'" + nhanvien.getMaPhongBan()+ "'";
            qry += ",'" + nhanvien.getMaChucVu() + "');";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delNhanVien(String MaNV) {
        try {
            String qry = "delete from `nhanvien` where MaNV = '" + MaNV + "'";
            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateNhanVien(NhanVien nhanVien) {
        try {
            String qry = "update `nhanvien` set ";
            qry += "ho =" + "'" + nhanVien.getHo()+ "'";
            qry += ",ten =" + "'" + nhanVien.getTen()+ "'";
            qry += ",ngaysinh =" + "'" + formatter.format(nhanVien.getNgaySinh()) + "'";
            qry += ",sodienthoai =" + "'" + nhanVien.getSoDienThoai()+ "'";
            qry += ",gioitinh =" + "'" + nhanVien.getGioiTinh()+ "'";
            qry += ",maphongban =" + "'" + nhanVien.getMaPhongBan()+ "'";
            qry += ",machucvu =" + "'" + nhanVien.getMaChucVu()+ "'";
            qry += " where manv = " + "'" + nhanVien.getMaNV() + "'";

            st = conn.getConnection().prepareStatement(qry);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}