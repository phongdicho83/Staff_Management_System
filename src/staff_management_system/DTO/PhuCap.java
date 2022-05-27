/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DTO;

import java.util.Date;

/**
 *
 * @author Utech
 */
public class PhuCap {
    private String MaPhuCap, TenPhuCap, SoTien;
    private Date NgayThangNam;

    public PhuCap() {
    }

    public String getMaPhuCap() {
        return MaPhuCap;
    }

    public void setMaPhuCap(String MaPhuCap) {
        this.MaPhuCap = MaPhuCap;
    }

    public String getTenPhuCap() {
        return TenPhuCap;
    }

    public void setTenPhuCap(String TenPhuCap) {
        this.TenPhuCap = TenPhuCap;
    }

    public String getSoTien() {
        return SoTien;
    }

    public void setSoTien(String SoTien) {
        this.SoTien = SoTien;
    }

    public Date getNgayThangNam() {
        return NgayThangNam;
    }

    public void setNgayThangNam(Date NgayThangNam) {
        this.NgayThangNam = NgayThangNam;
    }
    
    
}
