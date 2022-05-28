package staff_management_system.DTO;

import java.util.Date;

public class TheoDoiTangLuong {
    private String maNV;
    private String soNgayLam;
    private Date ngayTangLuong;
    private String luongHienHanh;

    public TheoDoiTangLuong(String maNV, String soNgayLam, Date ngayTangLuong, String luongHienHanh) {
        this.maNV = maNV;
        this.soNgayLam = soNgayLam;
        this.ngayTangLuong = ngayTangLuong;
        this.luongHienHanh = luongHienHanh;
    }

    public TheoDoiTangLuong() {
    }

    public Date getNgayTangLuong() {
        return ngayTangLuong;
    }

    public void setNgayTangLuong(Date ngayTangLuong) {
        this.ngayTangLuong = ngayTangLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(String soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public String getLuongHienHanh() {
        return luongHienHanh;
    }

    public void setLuongHienHanh(String luongHienHanh) {
        this.luongHienHanh = luongHienHanh;
    }
    
}
