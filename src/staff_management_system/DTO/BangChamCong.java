/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.DTO;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Utech
 */
public class BangChamCong {
    private String MaChamCong, MaNV, TrangThai;
    private Date date;

    public BangChamCong() {
    }

    public BangChamCong(String MaChamCong, String MaNV, String TrangThai, Date date) {
        this.MaChamCong = MaChamCong;
        this.MaNV = MaNV;
        this.TrangThai = TrangThai;
        this.date = date;
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
        final BangChamCong other = (BangChamCong) obj;
        if (!Objects.equals(this.MaChamCong, other.MaChamCong)) {
            return false;
        }
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        if (!Objects.equals(this.TrangThai, other.TrangThai)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    public String getMaChamCong() {
        return MaChamCong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public Date getDate() {
        return date;
    }

    public void setMaChamCong(String MaChamCong) {
        this.MaChamCong = MaChamCong;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
