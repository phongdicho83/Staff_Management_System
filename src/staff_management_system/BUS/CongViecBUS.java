/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import Helpers.MessageDialogHelper;
import java.util.ArrayList;
import staff_management_system.DAO.CongViecDAO;
import staff_management_system.DTO.CongViec;
import staff_management_system.UI.CongViecUI;
import static staff_management_system.Helpers.CommonAttribute.dsvc;
/**
 *
 * @author Utech
 */
public class CongViecBUS {

    public ArrayList<CongViec> getCongViecs() throws Exception {
        CongViecDAO dao = new CongViecDAO();
        return CongViecUI.listCongViec = dao.getCongViecs();
    }
    public boolean checkPK(String maCV, String tenCV){
        for(CongViec cv: dsvc){
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
                for (CongViec temp: dsvc)
                    if(temp.getMaCongViec().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
            case 2:
                for (CongViec temp: dsvc)
                    if(temp.getTenCongViec().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
             }
        return vc;
    }      
}
