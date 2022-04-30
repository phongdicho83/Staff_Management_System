/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DTO;

import java.util.Date;
import java.util.Objects;
/**
 *
 * @author Chi Thien
 */
public class PhongBan {
    private String MaPhongBan;
    private String TenPhongBan;
    private String MaCongViec;
    private String DiaChi;

    public PhongBan() {
    }
    
    /**
     * @return the MaPhongBan
     */
    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public PhongBan(String MaPhongBan, String TenPhongBan, String MaCongViec, String DiaChi) {
        this.MaPhongBan = MaPhongBan;
        this.TenPhongBan = TenPhongBan;
        this.MaCongViec = MaCongViec;
        this.DiaChi = DiaChi;
    }
@Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhongBan other = (PhongBan) obj;
        if (!Objects.equals(this.MaPhongBan, other.MaPhongBan)) {
            return false;
        }
        if (!Objects.equals(this.TenPhongBan, other.TenPhongBan)) {
            return false;
        }
        if (!Objects.equals(this.MaCongViec, other.MaCongViec)) {
            return false;
        }
        if (!Objects.equals(this.DiaChi, other.DiaChi)) {
            return false;
        }
        return true;
    }

    /**
     * @param MaPhongBan the MaPhongBan to set
     */
    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    /**
     * @return the TenPhongBan
     */
    public String getTenPhongBan() {
        return TenPhongBan;
    }

    /**
     * @param TenPhongBan the TenPhongBan to set
     */
    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    /**
     * @return the MaCongViec
     */
    public String getMaCongViec() {
        return MaCongViec;
    }

    /**
     * @param MaCongViec the MaCongViec to set
     */
    public void setMaCongViec(String MaCongViec) {
        this.MaCongViec = MaCongViec;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
}
