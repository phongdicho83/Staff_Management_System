/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DAO.CongViecDAO;
import staff_management_system.DTO.CongViec;
/**
 *
 * @author Utech
 */
public class CongViecBUS {
    public static ArrayList<CongViec> dscv;

    public void getCongViecs() {
        try {
            CongViecDAO dao = new CongViecDAO();
            if(dscv == null)
                dscv = new ArrayList<>();
            dscv = dao.getCongViecs();
        } catch (SQLException ex) {
            Logger.getLogger(CongViecBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean checkPK(String maCV, String tenCV){
        for(CongViec cv: dscv){
            if(cv.getMaCongViec().equals(maCV)&&(cv.getTenCongViec().equals(tenCV)))
                return false;
        }
        return true;
    }

    public boolean addCongViec(CongViec congViec) {
        CongViecDAO dao = new CongViecDAO();
        if (dao.addCongViec(congViec)) {
            return true;
        }
        return false;
    }

    public boolean delCongViec(String MaCongViec) {
        CongViecDAO dao = new CongViecDAO();
        if (!dao.delCongViec(MaCongViec)) {
            return false;
        }
        return true;
    }

    public boolean updateCongViec(CongViec congViec) {
        CongViecDAO dao = new CongViecDAO();
        if (!dao.updateCongViec(congViec)) {
            return false;
        }
        return true;
    }
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<CongViec> vc = new ArrayList <> ();
        switch(num1){
            case 1:
                for (CongViec temp: dscv)
                    if(temp.getMaCongViec().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
            case 2:
                for (CongViec temp: dscv)
                    if(temp.getTenCongViec().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
             }
        return vc;
    }      
}
