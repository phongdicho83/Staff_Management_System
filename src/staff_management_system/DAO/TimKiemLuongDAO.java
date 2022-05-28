package staff_management_system.DAO;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TimKiemLuong;
import staff_management_system.Helpers.ConnectSql;

public class TimKiemLuongDAO {
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");

    public TimKiemLuongDAO() {
    }
    
    public ArrayList docDSTKL(){
        ArrayList dstkl = new ArrayList<TimKiemLuong>();
        ResultSet rs;
        try {
            String qry = "    SELECT a.MaNV, a.Ten, b.ThangNam, b.TongGioTangCa, b.SoTienDuocHuong, c.SoNgayVangCoPhep, c.SoNgayVangKhongPhep, c.SoNgayNghiOm, c.LuongBiTru, f.LuongHienHanh\n" +
"    FROM nhanvien a\n" +
"    JOIN tongkettangcathang b ON a.MaNV = b.MaNV\n" +
"    JOIN tongketchamcongthang c ON a.MaNV = c.MaNV AND b.ThangNam=c.ThangNam\n" +
"    JOIN (SELECT *\n" +
"          FROM theodoitangluong d\n" +
"          WHERE d.NgayTangLuong>=(SELECT max(e.NgayTangLuong)\n" +
"                                  FROM theodoitangluong e\n" +
"                                  WHERE d.MaNV=e.MaNV)\n" +
"         ) f ON a.MaNV = f.MaNV ;";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                TimKiemLuong tkl = new TimKiemLuong();
                tkl.setMaNV(rs.getString(1));
                tkl.setTen(rs.getString(2));
                tkl.setThangNam(rs.getString(3));
                tkl.setTongGioTangCa(rs.getString(4));
                tkl.setSoTienDuocHuong(rs.getString(5));
                tkl.setSoNgayVangCoPhep(rs.getString(6));
                tkl.setSoNgayVangKhongPhep(rs.getString(7));
                tkl.setSoNgayNghiOm(rs.getString(8));
                tkl.setLuongBiTru(rs.getString(9));
                tkl.setLuongHienHanh(rs.getString(10));
                dstkl.add(tkl);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TimKiemLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstkl;
    }
}
