package staff_management_system.DAO;

import Helpers.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.TangCa;
import staff_management_system.Helpers.ConnectSql;

public class TangCaDAO {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ResultSet rs = null;
    PreparedStatement st = null;
    MyConnection conn = new MyConnection();
    
    public TangCaDAO(){
    }
    
    public ArrayList docDSTC(){
        ArrayList dstc = new ArrayList<TangCa>();
        try {
            String qry = "SELECT * FROM tangca";
            st = conn.getConnection().prepareStatement(qry);
            rs = st.executeQuery();
            while(rs.next()){
                TangCa tc = new TangCa();
                tc.setMaTC(rs.getString(1));
                tc.setMaNV(rs.getString(2));
                tc.setNgayThangNam(sdf.parse(rs.getString(3)));
                tc.setSoGioTangCa(rs.getString(4));
                dstc.add(tc);
            }
            conn.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(TangCaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstc;
    }
    
    public boolean themTC(TangCa tc){
        try {
            String s="INSERT INTO tangca VALUES ";
            s+="('"+tc.getMaTC()+"','"+tc.getMaNV()+"','"+sdf.format(tc.getNgayThangNam())+"','"+tc.getSoGioTangCa()+"');";
            st = conn.getConnection().prepareStatement(s);
            st.executeUpdate();
            conn.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(TangCaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaTC(TangCa tc){
        try {
            String s="UPDATE tangca SET ";
            s+="MaNV='"+tc.getMaNV()+"',NgayThangNam='"+sdf.format(tc.getNgayThangNam())+"',SoGioTangCa='"+tc.getSoGioTangCa();
            s+="' WHERE MATC='"+tc.getMaTC()+"';";
            st = conn.getConnection().prepareStatement(s);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(TangCaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaTC(String ma ){
        try {
            String s = "DELETE FROM tangca WHERE MATC='"+ma+"';";
            st = conn.getConnection().prepareStatement(s);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(TangCaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
