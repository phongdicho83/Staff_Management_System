
package staff_management_system.BUS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import staff_management_system.DAO.LuongThangDAO;
import staff_management_system.DTO.LuongThang;

/**
 *
 * @author ngahz
 */
public class LuongThangBUS {
    public static ArrayList <LuongThang> dslt;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public boolean checkPK(String ma, String thangNam){
        for(LuongThang lt:dslt){
            if(lt.getMaNV().equals(ma)&&lt.getThangNam().equals(thangNam))
                return false;
        }
        return true;
    }
    
    public void docDSLT(){
        LuongThangDAO data = new LuongThangDAO();
        if(dslt==null)
            dslt = new ArrayList<>();
        dslt = data.docDSLT();
    }
    
    public boolean themLT(LuongThang lt){
        LuongThangDAO data = new LuongThangDAO();
        if(!data.themLT(lt))
            return false;
        dslt.add(lt);
        return true;
    }
    
    public boolean suaLT(LuongThang lt){
        LuongThangDAO data = new LuongThangDAO();
        if(!data.suaLT(lt))
            return false;
        for(LuongThang temp:dslt)
            if(temp.getMaNV().equals(lt.getMaNV())&&temp.getThangNam().equals(lt.getThangNam())){
                int pos = dslt.indexOf(temp);
                LuongThang old= dslt.set(pos, lt);
                break;
            }
        return true;
    }
    
    public boolean xoaLT(int index){
        LuongThangDAO data = new LuongThangDAO();
        if(!data.xoaLT(dslt.get(index).getMaNV(),dslt.get(index).getThangNam()))
            return false;
        dslt.remove(index);
        return true;
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<LuongThang> lt = new ArrayList <> ();
        switch(num1){
            case 1:
                for (LuongThang temp: dslt)
                    if(temp.getMaNV().toUpperCase().contains(s.toUpperCase()))
                        lt.add(temp);
                break;
            case 2:
                for (LuongThang temp: dslt)
                    if(temp.getThangNam().equals(s))
                        lt.add(temp);
                break;
            case 3:
                for (LuongThang temp: dslt)
                    if(temp.getTongLuong().equals(s))
                        lt.add(temp);
                break;
             }
        return lt;
    }
    
    public ArrayList timKiem2 (int num1, String s1, String s2) throws ParseException {
        ArrayList<LuongThang> lt = new ArrayList <> ();
        switch(num1){
            case 1:
                Date d1 = sdf.parse("1-"+s1);
                Date d2 = sdf.parse("29-"+s2);
                Date d3;
                for (LuongThang temp: dslt){
                    d3 = sdf.parse("5-"+temp.getThangNam());
                    if(d1.before(d3)&&d3.before(d2))
                        lt.add(temp);
                }
                break;
            case 2:
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int i3;
                for (LuongThang temp: dslt){
                    i3 = Integer.parseInt(temp.getTongLuong());
                    if(i1<=i3&&i3<=i2)
                        lt.add(temp);
                }   
                break;
        }
        return lt;
    }
    
}
