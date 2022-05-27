package staff_management_system.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TongKetChamCongThang;
import staff_management_system.Helpers.ConnectSql;

public class TongKetChamCongThangDAO {
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");

    public TongKetChamCongThangDAO() {
    }
    
    public ArrayList docDSTKCCT(){
        ArrayList dstkcct = new ArrayList<TongKetChamCongThang>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM tongketchamcongthang";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                TongKetChamCongThang tkcct = new TongKetChamCongThang();
                tkcct.setMaNV(rs.getString(1));
                tkcct.setThangNam(rs.getString(2));
                tkcct.setSoNgayVangCoPhep(rs.getString(3));
                tkcct.setSoNgayVangKhongPhep(rs.getString(4));
                tkcct.setSoNgayNghiOm(rs.getString(5));
                tkcct.setLuongBiTru(rs.getString(6));
                dstkcct.add(tkcct);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetChamCongThangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstkcct;
    }
    
     public boolean themTKCCT(TongKetChamCongThang tkcct){
        try {
            String s="INSERT INTO tongketchamcongthang VALUES ";
            s+="('"+tkcct.getMaNV()+"','"+tkcct.getThangNam()+"','"+tkcct.getSoNgayVangCoPhep()
                    +"','"+tkcct.getSoNgayVangKhongPhep()+"','"+tkcct.getSoNgayNghiOm()+"','"+tkcct.getLuongBiTru()+"');";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetChamCongThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaTKCCT(TongKetChamCongThang tkcct){
        try {
            String s="UPDATE tongketchamcongthang SET ";
            s+="SoNgayVangCoPhep='"+tkcct.getSoNgayVangCoPhep()+
                    "',SoNgayVangKhongPhep='"+tkcct.getSoNgayVangKhongPhep()+"',SoNgayNghiOm='"+tkcct.getSoNgayNghiOm()+"',LuongBiTru='"+tkcct.getLuongBiTru();
            s+="' WHERE MaNV='"+tkcct.getMaNV()+"' AND ThangNam = '"+tkcct.getThangNam()+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetChamCongThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaTKCCT(String ma, String thangnam){
        try {
            String s = "DELETE FROM tongketchamcongthang WHERE MaNV='"+ma+"' AND ThangNam='"+thangnam+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetChamCongThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    
}
