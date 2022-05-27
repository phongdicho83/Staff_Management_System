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
    private String MaNV, TrangThai;
    private Date date;

    public BangChamCong() {
    }

    public BangChamCong(String MaNV, String TrangThai, Date date) {
        this.MaNV = MaNV;
        this.TrangThai = TrangThai;
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
