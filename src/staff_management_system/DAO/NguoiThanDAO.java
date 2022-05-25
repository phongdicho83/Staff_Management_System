package staff_management_system.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.NguoiThan;
import staff_management_system.Helpers.ConnectSql;

public class NguoiThanDAO {
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");
    
    public NguoiThanDAO(){
    }
    
    public ArrayList docDSNT(){
        ArrayList dsnt = new ArrayList<NguoiThan>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM nguoithan";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                NguoiThan nt = new NguoiThan();
                nt.setMaNV(rs.getString(1));
                nt.setStt(rs.getString(2));
                nt.setHoTen(rs.getString(3));
                nt.setMoiQuanHe(rs.getString(4));
                nt.setGioiTinh(rs.getString(5));
                nt.setNamSinh(rs.getString(6));
                dsnt.add(nt);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnt;
    }
    
    public boolean themNT(NguoiThan nt){
        try {
            String s="INSERT INTO nguoithan VALUES ";
            s+="('"+nt.getMaNV()+"','"+nt.getStt()+"','"+nt.getHoTen()+"','"+nt.getMoiQuanHe()+"','"+nt.getGioiTinh()+"','"+nt.getNamSinh()+"');";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaNT(NguoiThan nt){
        try {
            String s="UPDATE nguoithan SET ";
            s+="TenNguoiThan='"+nt.getHoTen()+"',MoiQuanHe='"+nt.getMoiQuanHe()+"',GioiTinh='"+nt.getGioiTinh();
            s+="',NamSinh='"+nt.getNamSinh()+"' WHERE MaNV='"+nt.getMaNV()+"' AND STT='"+nt.getStt()+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaNT(String ma, String stt){
        try {
            String s = "DELETE FROM nguoithan WHERE MaNV='"+ma+"' AND STT='"+stt+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(NguoiThanDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
}
