package staff_management_system.DTO;

public class NguoiThan {
    private String maNV;
    private String stt;
    private String hoTen;
    private String moiQuanHe;
    private String gioiTinh;
    private String namSinh;

    public NguoiThan() {
    }

    public NguoiThan(String maNV, String stt, String hoTen, String moiQuanHe, String gioiTinh, String namSinh) {
        this.maNV = maNV;
        this.stt = stt;
        this.hoTen = hoTen;
        this.moiQuanHe = moiQuanHe;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    
}
