package staff_management_system.DAO;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import staff_management_system.DTO.LuongThang;
import staff_management_system.Helpers.ConnectSql;

public class LuongThangDAO {
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");

    
    public ArrayList docDSLT(){
        ArrayList dslt = new ArrayList<LuongThang>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM luongthang";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                LuongThang lt = new LuongThang();
                lt.setMaNV(rs.getString(1));
                lt.setThangNam(rs.getString(2));
                lt.setMaPC(rs.getString(3));
                lt.setMaThuong(rs.getString(4));
                lt.setTienTangCa(rs.getString(5));
                lt.setLuongBiTru(rs.getString(6));
                lt.setLuongHienHanh(rs.getString(7));
                lt.setTongLuong(rs.getString(8));
                dslt.add(lt);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(LuongThangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dslt;
    }
    
    public boolean themLT(LuongThang lt){
        try {
            String s="INSERT INTO luongthang VALUES ";
            s+="('"+lt.getMaNV()+"','"+lt.getThangNam()+"','"+lt.getMaPC()+"','"+lt.getMaThuong()+"','"+lt.getTienTangCa()+"','"+
                    lt.getLuongBiTru()+"','"+lt.getLuongHienHanh()+"','"+lt.getTongLuong()+"');";
            System.out.println(s);
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaLT(LuongThang lt){
        try {
            String s="UPDATE luongthang SET ";
            s+="MaPhuCap='"+lt.getMaPC()+"',MaThuong='"+lt.getMaThuong()+"',TienTangCa='"+lt.getTienTangCa();
            s+="',TongKetChamCong='"+lt.getLuongBiTru()+"',LuongHienHanh='"+lt.getLuongHienHanh()+"',TongLuong='"+lt.getTongLuong()+
                    "' WHERE MaNV='"+lt.getMaNV()+"' AND ThangNam='"+lt.getThangNam()+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaLT(String ma, String thangNam){
        try {
            String s = "DELETE FROM luongthang WHERE MaNV='"+ma+"' AND ThangNam='"+thangNam+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
