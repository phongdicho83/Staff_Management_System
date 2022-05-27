/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.BUS;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DAO.PhuCapDAO;
import staff_management_system.DTO.PhuCap;

/**
 *
 * @author Utech
 */
public class PhuCapBUS {
    public static ArrayList<PhuCap> dspc;
    
    public ArrayList<PhuCap> getBangChamCongs(int selectedIndex, String timKiem) {
        try {
            PhuCapDAO dao = new PhuCapDAO();
            if(dspc ==  null)
                dspc = new ArrayList<>();
            
            if(selectedIndex == 0 && timKiem.equals("") == true)
                return dspc = dao.getBangChamCongs();
            
            if(selectedIndex != 0 && timKiem.equals("") == false){
                ArrayList<PhuCap> listPhuCap = new ArrayList<>();
                listPhuCap = dao.getBangChamCongs();
                
                ArrayList<PhuCap> temp = new ArrayList<>();
                
                for(PhuCap pc : listPhuCap) {
                    if(pc.getMaPhuCap().toLowerCase().contains(timKiem.toLowerCase()))
                        temp.add(pc);
                    if(pc.getTenPhuCap().toLowerCase().contains(timKiem.toLowerCase()))
                        temp.add(pc);
                    if(pc.getSoTien().toLowerCase().contains(timKiem.toLowerCase()))
                        temp.add(pc);
                }
                return dspc = temp;
            }
        } catch (Exception ex) {
            Logger.getLogger(PhuCapBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    public boolean checkPK(String maPhucap) {
        for(PhuCap pc : dspc) {
            if(pc.getMaPhuCap().equals(maPhucap))
                return false;
        }
        return true;
    }
    
    public boolean themPhuCap(PhuCap pc) {
        PhuCapDAO dao = new PhuCapDAO();
        if(dao.addPhuCap(pc))
            return true;
        return false;
    }
    
    public boolean suaPhuCap(PhuCap pc) {
        PhuCapDAO dao = new PhuCapDAO();
        if(dao.updatePhuCap(pc))
            return true;
        
        return false;
    }
    
    public boolean delPhuCap (String maPhuCap) {
        PhuCapDAO dao = new PhuCapDAO();
        if(dao.delPhuCap(maPhuCap))
            return true;
        
        return false;
    }
}
