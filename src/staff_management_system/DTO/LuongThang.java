package staff_management_system.DTO;

public class LuongThang {
    private String maNV;
    private String thangNam;
    private String maPC;
    private String maThuong;
    private String tienTangCa;
    private String luongBiTru;
    private String luongHienHanh;
    private String tongLuong;

    public LuongThang() {
    }

    public LuongThang(String maNV, String thangNam, String maPC, String maThuong, String tienTangCa, String luongBiTru, String luongHienHanh, String tongLuong) {
        this.maNV = maNV;
        this.thangNam = thangNam;
        this.maPC = maPC;
        this.maThuong = maThuong;
        this.tienTangCa = tienTangCa;
        this.luongBiTru = luongBiTru;
        this.luongHienHanh = luongHienHanh;
        this.tongLuong = tongLuong;
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

    public String getMaPC() {
        return maPC;
    }

    public void setMaPC(String maPC) {
        this.maPC = maPC;
    }

    public String getMaThuong() {
        return maThuong;
    }

    public void setMaThuong(String maThuong) {
        this.maThuong = maThuong;
    }

    public String getTienTangCa() {
        return tienTangCa;
    }

    public void setTienTangCa(String tienTangCa) {
        this.tienTangCa = tienTangCa;
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

    public String getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(String tongLuong) {
        this.tongLuong = tongLuong;
    }
    
    
}
