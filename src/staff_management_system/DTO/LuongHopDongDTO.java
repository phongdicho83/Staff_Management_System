/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_management_system.DTO;

/**
 *
 * @author Nguyen Anh Quang
 */
public class LuongHopDongDTO {
    private String ManV,MaHD,NgayVaoLam;
    private  Long TienLuong;

    public LuongHopDongDTO() {
    }

    public LuongHopDongDTO(String ManV, String MaHD, String NgayVaoLam, Long TienLuong) {
        this.ManV = ManV;
        this.MaHD = MaHD;
        this.NgayVaoLam = NgayVaoLam;
        this.TienLuong = TienLuong;
    }

    public String getManV() {
        return ManV;
    }

    public void setManV(String ManV) {
        this.ManV = ManV;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(String NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public Long getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(Long TienLuong) {
        this.TienLuong = TienLuong;
    }
    
}
