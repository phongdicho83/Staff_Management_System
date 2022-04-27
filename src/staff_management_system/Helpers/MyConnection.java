/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class MyConnection {

    // Statement st = null;
    // Sử dụng PreparedStatement
    ResultSet rs = null;
    Connection conn = null;

    String server = "localhost:3306";
    String dbName = "staff_salary_management";
    String userName = "root";
    String pass = "";

    public MyConnection() {
        checkDriver();
        setupConnection();
    }

    public MyConnection(String dbName) {
        checkDriver();
        server = "localhost:3306";
        this.dbName = dbName;
        userName = "root";
        this.pass = "";
        setupConnection();
    }

    public MyConnection(String dbName, String userName, String pass, String server) {
        checkDriver();
        this.dbName = dbName;
        this.userName = userName;
        this.pass = pass;
        this.server = server;
        setupConnection();
    }

    public MyConnection(String dbName, String userName, String pass) {
        checkDriver();
        this.dbName = dbName;
        this.userName = userName;
        this.pass = pass;
        setupConnection();
    }

    public void logIn(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
        setupConnection();
    }

    public boolean setupConnection() {
        try {
            String url = "jdbc:mysql://" + server + "/" + dbName;
            conn = DriverManager.getConnection(url, userName, pass);
            return conn.isValid(1000);
//            JOptionPane.showMessageDialog(null, "Ket noi database " + dbName + " thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể kết nối tới " + dbName);
            return false;
        }
    }
  

    public Boolean checkConnection() {
        try {
            return !conn.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void checkDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không tìm thấy Driver JDBC.");
        }
    }
    
    public Connection getConnection(){
        return conn;
    }

    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
//            System.out.println("Success! Đóng kết nối tới '" + dbName + "' thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đóng kết nối tới " + dbName);
        }
    }
}