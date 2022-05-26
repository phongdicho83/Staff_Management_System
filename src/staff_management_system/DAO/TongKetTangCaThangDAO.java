package staff_management_system.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TongKetTangCaThang;
import staff_management_system.Helpers.ConnectSql;

public class TongKetTangCaThangDAO {
    ConnectSql con = new ConnectSql("localhost","root","","staff_salary_management");

    public TongKetTangCaThangDAO() {
    }
    
    public ArrayList docDSTKTCT(){
        ArrayList dstktct = new ArrayList<TongKetTangCaThang>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM tongkettangcathang";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                TongKetTangCaThang tktct = new TongKetTangCaThang();
                tktct.setMaNV(rs.getString(1));
                tktct.setThangNam(rs.getString(2));
                tktct.setTongGioTangCa(rs.getString(3));
                tktct.setSoTienDuocHuong(rs.getString(4));
                dstktct.add(tktct);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetTangCaThangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstktct;
    }
    
     public boolean themTKTCT(TongKetTangCaThang tktct){
        try {
            String s="INSERT INTO tongkettangcathang VALUES ";
            s+="('"+tktct.getMaNV()+"','"+tktct.getThangNam()+"','"+tktct.getTongGioTangCa()+"','"+tktct.getSoTienDuocHuong()+"');";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetTangCaThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaTKTCT(TongKetTangCaThang tktct){
        try {
            String s="UPDATE tongkettangcathang SET ";
            s+="TongGioTangCa='"+tktct.getTongGioTangCa()+"',SoTienDuocHuong='"+tktct.getSoTienDuocHuong();
            s+="' WHERE MaNV='"+tktct.getMaNV()+"' AND ThangNam = '"+tktct.getThangNam()+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetTangCaThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaTKTCT(String ma, String thangnam){
        try {
            String s = "DELETE FROM tongkettangcathang WHERE MaNV='"+ma+"' AND ThangNam='"+thangnam+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(TongKetTangCaThangDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    
}
