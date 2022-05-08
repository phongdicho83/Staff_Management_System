package staff_management_system.Helpers;

import java.sql.*;
/**
 *
 * @author ngahz
 */
public class ConnectSql {
    String Host="";
    String UserName="";
    String Pass="";
    String Dtb="";

    public ConnectSql(String Host, String UserName, String Pass, String Dtb) {
        this.Host = Host;
        this.UserName = UserName;
        this.Pass = Pass;
        this.Dtb = Dtb;
    }
    
    Connection connect=null;
    Statement stm=null;
    ResultSet rs=null;

    protected void driverTest () throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (java.lang.ClassNotFoundException e){
            throw new Exception("MySQL JDBC Driver not found");
        }
    }
    
    protected Connection getConnect() throws Exception {
        if(connect==null){
            driverTest();
            String url="jdbc:mysql://"+Host+":3307/"+Dtb;
            try {
                this.connect=DriverManager.getConnection(url,UserName,Pass);
            }
            catch (java.sql.SQLException e){
                throw new Exception ("Không thể kết nối đến dtb"+url+e.getMessage());
            }
        }
        return connect;
    }
    
    protected Statement getStatement() throws Exception {
        if(stm==null?true:stm.isClosed())
            stm=this.getConnect().createStatement();
        return stm;
    }
    
    public ResultSet excuteQuery(String Query) throws Exception{
        try{
            rs = getStatement().executeQuery(Query);
        }
        catch(Exception e){
            throw new Exception("Error: "+e.getMessage()+" - ");
        }
        return rs;
    }
    
    public int executeUpdate (String Query) throws Exception{
        int res = Integer.MIN_VALUE;
        try {
            res = getStatement().executeUpdate(Query);
        }
        catch(Exception e){
            throw new Exception("Error "+e.getMessage());
        }
        finally{
            this.Close();
        }
        return res;
    }
    
    public void Close() throws SQLException{
        if(rs!=null && rs.isClosed()){
            rs.close();
            rs = null;
        }
        if(stm!=null && !stm.isClosed()){
            stm.close();
            stm = null;
        }
        if(connect!=null && !connect.isClosed()){
            connect.close();
            connect = null;
        }
    }
    
}
