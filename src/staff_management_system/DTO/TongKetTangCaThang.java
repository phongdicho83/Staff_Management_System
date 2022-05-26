package staff_management_system.DTO;

public class TongKetTangCaThang {
    private String maNV;
    private String thangNam;
    private String tongGioTangCa;
    private String soTienDuocHuong;

    public TongKetTangCaThang(String maNV, String thangNam, String tongGioTangCa, String soTienDuocHuong) {
        this.maNV = maNV;
        this.thangNam = thangNam;
        this.tongGioTangCa = tongGioTangCa;
        this.soTienDuocHuong = soTienDuocHuong;
    }

    public TongKetTangCaThang() {
    }

    public String getThangNam() {
        return thangNam;
    }

    public void setThangNam(String thangNam) {
        this.thangNam = thangNam;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
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
    
}
