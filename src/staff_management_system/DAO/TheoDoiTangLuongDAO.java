package staff_management_system.DAO;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TheoDoiTangLuong;
import staff_management_system.Helpers.ConnectSql;

public class TheoDoiTangLuongDAO {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");
    
    public TheoDoiTangLuongDAO(){
    }
    
    public ArrayList docDSTDTL(){
        ArrayList dstdtl = new ArrayList<TheoDoiTangLuong>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM theodoitangluong";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                TheoDoiTangLuong tdtl = new TheoDoiTangLuong();
                tdtl.setMaNV(rs.getString(1));
                tdtl.setSoNgayLam(rs.getString(2));
                tdtl.setNgayTangLuong(sdf.parse(rs.getString(3)));
                tdtl.setLuongHienHanh(rs.getString(4));
                dstdtl.add(tdtl);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstdtl;
    }
    
    public boolean themTDTL(TheoDoiTangLuong tdtl){
        try {
            String s="INSERT INTO theodoitangluong VALUES ";
            s+="('"+tdtl.getMaNV()+"','"+tdtl.getSoNgayLam()+"','"+sdf.format(tdtl.getNgayTangLuong())+"','"+tdtl.getLuongHienHanh()+"');";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaTDTL(TheoDoiTangLuong tdtl){
        try {
            String s="UPDATE theodoitangluong SET ";
            s+="SoNgayLam='"+tdtl.getSoNgayLam()+"',LuongHienHanh='"+tdtl.getLuongHienHanh();
            s+="' WHERE MaNV='"+tdtl.getMaNV()+"' AND NgayTangLuong='"+sdf.format(tdtl.getNgayTangLuong())+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaTDTL(String ma, String ngaythangnam){
        try {
            String s = "DELETE FROM theodoitangluong WHERE MaNV='"+ma+"' AND NgayTangLuong='"+ngaythangnam+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TheoDoiTangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
