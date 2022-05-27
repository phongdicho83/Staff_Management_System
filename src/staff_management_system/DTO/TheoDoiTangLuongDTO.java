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
public class TheoDoiTangLuongDTO {
    private String MaNV;
    private int SoNgayLam,Tang,LuongTang;

    public TheoDoiTangLuongDTO() {
    }

    
    public TheoDoiTangLuongDTO(String MaNV, int SoNgayLam, int Tang, int LuongTang) {
        this.MaNV = MaNV;
        this.SoNgayLam = SoNgayLam;
        this.Tang = Tang;
        this.LuongTang = LuongTang;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getSoNgayLam() {
        return SoNgayLam;
    }

    public void setSoNgayLam(int SoNgayLam) {
        this.SoNgayLam = SoNgayLam;
    }

    public int getTang() {
        return Tang;
    }

    public void setTang(int Tang) {
        this.Tang = Tang;
    }

    public int getLuongTang() {
        return LuongTang;
    }

    public void setLuongTang(int LuongTang) {
        this.LuongTang = LuongTang;
    }
    
    
}
