/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import staff_management_system.DAO.NhanVienDAO;
import staff_management_system.DTO.NhanVien;
import staff_management_system.Helpers.CommonAttribute;
import staff_management_system.UI.NhanVienUI;

/**
 *
 * @author Utech
 */
public class NhanVienBUS {
    public ArrayList<NhanVien> getNhanViens() throws Exception {
        NhanVienDAO dao = new NhanVienDAO();
        return CommonAttribute.dsnv = dao.getNhanViens();
    }

    public boolean addNhanVien(NhanVien nhanVien) {
        NhanVienDAO dao = new NhanVienDAO();
        if (dao.addNhanVien(nhanVien)) {
            return true;
        }
        return false;
    }

    public boolean delNhanVien(String MaNV) {
        NhanVienDAO dao = new NhanVienDAO();
        if (!dao.delNhanVien(MaNV)) {
            return false;
        }
        return true;
    }

    public boolean updateNhanVien(NhanVien nhanVien) {
        NhanVienDAO dao = new NhanVienDAO();
        if (!dao.updateNhanVien(nhanVien)) {
            return false;
        }
        return true;
    }
}