package staff_management_system.BUS;

import java.util.ArrayList;
import staff_management_system.DAO.NguoiThanDAO;
import staff_management_system.DTO.NguoiThan;
import static staff_management_system.Helpers.CommonAttribute.dsnt;

public class NguoiThanBUS {
    
    public NguoiThanBUS(){
    }
    
    public boolean checkPK(String ma, String stt){
        for(NguoiThan nt:dsnt){
            if(nt.getMaNV().equals(ma)&&nt.getStt().equals(stt))
                return false;
        }
        return true;
    }
    
    public void docDSNT(){
        NguoiThanDAO data = new NguoiThanDAO();
        if(dsnt==null)
            dsnt = new ArrayList<>();
        dsnt = data.docDSNT();
    }
    
    public boolean themNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        if(!data.themNT(nt))
            return false;
        dsnt.add(nt);
        return true;
    }
    
    public boolean suaNT(NguoiThan nt){
        NguoiThanDAO data = new NguoiThanDAO();
        if(!data.suaNT(nt))
            return false;
        for(NguoiThan temp:dsnt)
            if(temp.getMaNV().equals(nt.getMaNV())&&temp.getStt().equals(nt.getStt())){
                int pos = dsnt.indexOf(temp);
                NguoiThan old= dsnt.set(pos, nt);
                break;
            }
        return true;
    }
    
    public boolean xoaNT(int index){
        NguoiThanDAO data = new NguoiThanDAO();
        String temp = dsnt.get(index).getMaNV();
        if(!data.xoaNT(temp,dsnt.get(index).getStt()))
            return false;
        dsnt.remove(index);
        int stt=1;
        for(NguoiThan nt: dsnt)
            if(nt.getMaNV().equals(temp)){
                if(!nt.getStt().equals(stt+"")){
                    data.xoaNT(nt.getMaNV(),nt.getStt());
                    nt.setStt(stt+"");
                    data.themNT(nt);
                }
                stt++;
            }
        return true;
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<NguoiThan> nt = new ArrayList <> ();
        switch(num1){
            case 1:
                for (NguoiThan temp: dsnt)
                    if(temp.getMaNV().contains(s))
                        nt.add(temp);
                break;
            case 2:
                for (NguoiThan temp: dsnt)
                    if(temp.getHoTen().contains(s))
                        nt.add(temp);
                break;
            case 3:
                for (NguoiThan temp: dsnt)
                    if(s.equalsIgnoreCase(temp.getMoiQuanHe()))
                        nt.add(temp);
                break;
            case 4:
                for (NguoiThan temp: dsnt)
                    if(s.equalsIgnoreCase(temp.getGioiTinh()))
                        nt.add(temp);
                break;
            case 5:
                for (NguoiThan temp: dsnt)
                    if(s.equalsIgnoreCase(temp.getNamSinh()))
                        nt.add(temp);
                break;
             }
        return nt;
    }
    
    public ArrayList timKiem2 (String s1, String s2) {
        ArrayList<NguoiThan> nt = new ArrayList <> ();
        for (NguoiThan temp: dsnt)
            if(Integer.parseInt(temp.getNamSinh())>Integer.parseInt(s1)&&Integer.parseInt(temp.getNamSinh())<Integer.parseInt(s2))
                nt.add(temp);
        return nt;
    }
    
}
