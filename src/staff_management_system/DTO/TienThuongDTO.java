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
public class TienThuongDTO {
    private String MaTienThuong,TenTienThuong;
    private int Thang;
    private Long tienThuong;

    public TienThuongDTO(String MaTienThuong, String TenTienThuong, int Thang, Long tienThuong) {
        this.MaTienThuong = MaTienThuong;
        this.TenTienThuong = TenTienThuong;
        this.Thang = Thang;
        this.tienThuong = tienThuong;
    }

    public TienThuongDTO() {
       //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaTienThuong() {
        return MaTienThuong;
    }

    public void setMaTienThuong(String MaTienThuong) {
        this.MaTienThuong = MaTienThuong;
    }

    public String getTenTienThuong() {
        return TenTienThuong;
    }

    public void setTenTienThuong(String TenTienThuong) {
        this.TenTienThuong = TenTienThuong;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public Long getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(Long tienThuong) {
        this.tienThuong = tienThuong;
    }

  
    
    
}
