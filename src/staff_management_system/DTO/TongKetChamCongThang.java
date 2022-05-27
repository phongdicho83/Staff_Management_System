package staff_management_system.DTO;

public class TongKetChamCongThang {
    private String maNV;
    private String thangNam;
    private String soNgayVangCoPhep;
    private String soNgayVangKhongPhep;
    private String soNgayNghiOm;
    private String luongBiTru;

    public TongKetChamCongThang() {
    }

    public TongKetChamCongThang(String maNV, String thangNam, String soNgayVangCoPhep, String soNgayVangKhongPhep, String soNgayNghiOm, String luongBiTru) {
        this.maNV = maNV;
        this.thangNam = thangNam;
        this.soNgayVangCoPhep = soNgayVangCoPhep;
        this.soNgayVangKhongPhep = soNgayVangKhongPhep;
        this.soNgayNghiOm = soNgayNghiOm;
        this.luongBiTru = luongBiTru;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getThangNam() {
        return thangNam;
    }

    public void setThangNam(String thangNam) {
        this.thangNam = thangNam;
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
    
}
