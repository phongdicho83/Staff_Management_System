package staff_management_system.DTO;

import java.util.Date;

public class TangCa {
    private String maTC;
    private String maNV;
    private Date ngayThangNam;
    private String soGioTangCa;

    public TangCa() {
    }

    public TangCa(String maTC, String maNV, Date ngayThangNam, String soGioTangCa) {
        this.maTC = maTC;
        this.maNV = maNV;
        this.ngayThangNam = ngayThangNam;
        this.soGioTangCa = soGioTangCa;
    }

    public String getMaTC() {
        return maTC;
    }

    public void setMaTC(String maTC) {
        this.maTC = maTC;
    }

    

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(Date ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public String getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(String soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }
    
}
