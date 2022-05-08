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
public class NhanVien {

    private String MaNV;
    private String Ho;
    private String Ten;
    private String SoDienThoai;
    private String GioiTinh;
    private String MaPhongBan;
    private String MaChucVu;
    private Date NgaySinh;

    public NhanVien(){      
    }
    public NhanVien(String MaNV, String Ho, String Ten, Date NgaySinh, String SoDienThoai, String GioiTinh, String MaPhongBan, String MaChucVu) {
        this.MaNV = MaNV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.GioiTinh = GioiTinh;
        this.MaPhongBan = MaPhongBan;
        this.MaChucVu = MaChucVu;
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
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        if (!Objects.equals(this.Ho, other.Ho)) {
            return false;
        }
        if (!Objects.equals(this.Ten, other.Ten)) {
            return false;
        }
        if (!Objects.equals(this.NgaySinh, other.NgaySinh)) {
            return false;
        }
        if (!Objects.equals(this.SoDienThoai, other.SoDienThoai)) {
            return false;
        }
        if (!Objects.equals(this.GioiTinh, other.GioiTinh)) {
            return false;
        }
        if (!Objects.equals(this.MaPhongBan, other.MaPhongBan)) {
            return false;
        }
        if (!Objects.equals(this.MaChucVu, other.MaChucVu)) {
            return false;
        }
        return true;
    }
/**
 * @return the MaNV
 */
public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the Ho
     */
    public String getHo() {
        return Ho;
    }

    /**
     * @param Ho the Ho to set
     */
    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    /**
     * @return the Ten
     */
    public String getTen() {
        return Ten;
    }

    /**
     * @param Ten the Ten to set
     */
    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    /**
     * @return the SoDienThoai
     */
    public String getSoDienThoai() {
        return SoDienThoai;
    }

    /**
     * @param SoDienThoai the SoDienThoai to set
     */
    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the MaPhongBan
     */
    public String getMaPhongBan() {
        return MaPhongBan;
    }

    /**
     * @param MaPhongBan the MaPhongBan to set
     */
    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    /**
     * @return the MaCongViec
     */
    public String getMaChucVu() {
        return MaChucVu;
    }

    /**
     * @param MaChucVu the MaCongViec to set
     */
    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

}
