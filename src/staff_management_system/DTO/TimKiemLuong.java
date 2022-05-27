package staff_management_system.DTO;

public class TimKiemLuong {
    private String maNV;
    private String ten;
    private String thangNam;
    private String tongGioTangCa;
    private String soTienDuocHuong;
    private String soNgayVangCoPhep;
    private String soNgayVangKhongPhep;
    private String soNgayNghiOm;
    private String luongBiTru;
    private String luongHienHanh;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThangNam() {
        return thangNam;
    }

    public void setThangNam(String thangNam) {
        this.thangNam = thangNam;
    }

    public String getTongGioTangCa() {
        return tongGioTangCa;
    }

    public void setTongGioTangCa(String tongGioTangCa) {
        this.tongGioTangCa = tongGioTangCa;
    }

    public String getSoTienDuocHuong() {
        return soTienDuocHuong;
    }

    public void setSoTienDuocHuong(String soTienDuocHuong) {
        this.soTienDuocHuong = soTienDuocHuong;
    }

    public String getSoNgayVangCoPhep() {
        return soNgayVangCoPhep;
    }

    public void setSoNgayVangCoPhep(String soNgayVangCoPhep) {
        this.soNgayVangCoPhep = soNgayVangCoPhep;
    }

    public String getSoNgayVangKhongPhep() {
        return soNgayVangKhongPhep;
    }

    public void setSoNgayVangKhongPhep(String soNgayVangKhongPhep) {
        this.soNgayVangKhongPhep = soNgayVangKhongPhep;
    }

    public String getSoNgayNghiOm() {
        return soNgayNghiOm;
    }

    public void setSoNgayNghiOm(String soNgayNghiOm) {
        this.soNgayNghiOm = soNgayNghiOm;
    }

    public String getLuongBiTru() {
        return luongBiTru;
    }

    public void setLuongBiTru(String luongBiTru) {
        this.luongBiTru = luongBiTru;
    }

    public String getLuongHienHanh() {
        return luongHienHanh;
    }

    public void setLuongHienHanh(String luongHienHanh) {
        this.luongHienHanh = luongHienHanh;
    }

    public TimKiemLuong() {
    }

    public TimKiemLuong(String maNV, String ten, String thangNam, String tongGioTangCa, String soTienDuocHuong, String soNgayVangCoPhep, String soNgayVangKhongPhep, String soNgayNghiOm, String luongBiTru, String luongHienHanh) {
        this.maNV = maNV;
        this.ten = ten;
        this.thangNam = thangNam;
        this.tongGioTangCa = tongGioTangCa;
        this.soTienDuocHuong = soTienDuocHuong;
        this.soNgayVangCoPhep = soNgayVangCoPhep;
        this.soNgayVangKhongPhep = soNgayVangKhongPhep;
        this.soNgayNghiOm = soNgayNghiOm;
        this.luongBiTru = luongBiTru;
        this.luongHienHanh = luongHienHanh;
    }
    
}
