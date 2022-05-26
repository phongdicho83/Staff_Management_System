/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import staff_management_system.DAO.NhanVienDAO;
import staff_management_system.DTO.NhanVien;
import staff_management_system.Helpers.CommonAttribute;
import staff_management_system.UI.NhanVienUI;
import static staff_management_system.Helpers.CommonAttribute.dsnv;

/**
 *
 * @author Utech
 */
public class NhanVienBUS {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public ArrayList<NhanVien> getNhanViens() throws Exception {
        NhanVienDAO dao = new NhanVienDAO();
        return CommonAttribute.dsnv = dao.getNhanViens();
    }
    public boolean checkPK(String manv, String mapb){
        for(NhanVien nv:dsnv){
            if(nv.getMaNV().equals(manv)&&nv.getMaPhongBan().equals(mapb))
                return false;
        }
        return true;
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
    
     public ArrayList timKiem1 (int num1, String s) {
        ArrayList<NhanVien> nv = new ArrayList <> ();
        switch(num1){
            case 1:
                for (NhanVien temp: dsnv)
                    if(temp.getMaNV().toUpperCase().contains(s.toUpperCase()))
                        nv.add(temp);
                break;
            case 2:
                for (NhanVien temp: dsnv)
                    if(temp.getHo().toUpperCase().contains(s.toUpperCase()))
                        nv.add(temp);
                break;
            case 3:
                for (NhanVien temp: dsnv)
                    if(temp.getTen().toUpperCase().contains(s.toUpperCase()))
                        nv.add(temp);
                break;
            case 4:
                for (NhanVien temp: dsnv)
                    if(sdf.format(temp.getNgaySinh()).equals(s))
                        nv.add(temp);
                break;
            case 5:
                for (NhanVien temp: dsnv)
                    if(temp.getSoDienThoai().toUpperCase().contains(s.toUpperCase()))
                        nv.add(temp);
                break;
            case 6:
                for (NhanVien temp: dsnv)
                    if(s.equalsIgnoreCase(temp.getGioiTinh()))
                       nv.add(temp);
                break;
            
            case 7:
                for (NhanVien temp: dsnv)
                    if(temp.getMaPhongBan().toUpperCase().contains(s.toUpperCase()))
                        nv.add(temp);
                break;
            case 8:
                for (NhanVien temp: dsnv)
                    if(sdf.format(temp.getNgayVaoLam()).equals(s))
                        nv.add(temp);
                break;
        }
            
        return nv;
    }
    
    public ArrayList timKiem2 (Date s1, Date s2) {
        ArrayList<NhanVien> nv = new ArrayList <> ();
        for (NhanVien temp: dsnv){
            System.out.println(temp.getNgaySinh());
            System.out.println(s1);
            System.out.println(temp.getNgaySinh().equals(s1));
            System.out.println(temp.getNgaySinh().equals(s2));
            if((temp.getNgaySinh().after(s1)&&temp.getNgaySinh().before(s2))||sdf.format(temp.getNgaySinh()).equals(sdf.format(s1))||sdf.format(temp.getNgaySinh()).equals(sdf.format(s2)))
            { nv.add(temp);
                System.out.println("OK");
            }
        }
        return nv;
    }
}