/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff_management_system.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import staff_management_system.UI.DanhMuc;
import staff_management_system.UI.MainContentPanels.BangChamCongGUI;
import staff_management_system.UI.MainContentPanels.CongViecGUI;
import staff_management_system.UI.MainContentPanels.NguoiThanGUI;
import staff_management_system.UI.MainContentPanels.NhanVienGUI;
import staff_management_system.UI.MainContentPanels.PhongBanGUI;
import staff_management_system.UI.MainContentPanels.PhuCapGUI;
import staff_management_system.UI.MainContentPanels.TangCaGUI;
import staff_management_system.UI.MainContentPanels.TongKetTangCaThangGUI;

/**
 *
 * @author Utech
 */
public class ChangeController {
    private JPanel root;
    private String kindSelected = "";
    private ArrayList<DanhMuc> listItem = null;
    
    public ChangeController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "NhanVien";
        
        jpnItem.setBackground(new Color(255,255,153));
        jlbItem.setBackground(new Color(255,255,153));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new NhanVienGUI());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(ArrayList<DanhMuc> listItem) {
        this.listItem = listItem;
        
        for(DanhMuc item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener {
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind) {
                case "nhanvien" :
                    node = new NhanVienGUI();
                    break;
                case "phongban" :
                    node = new PhongBanGUI();
                    break;
                case "tongkettangca" :
                    node = new TongKetTangCaThangGUI();
                    break;
                case "tangca" : 
                    node = new TangCaGUI();
                    break;
                case "nguoithan" : 
                    node = new NguoiThanGUI();
                    break;
                case "congviec" :
                    node = new CongViecGUI();
                    break;
                case "bangchamcong" :
                    node = new BangChamCongGUI();
                    break;
//                case "tongketchamcong" :
//                    node = new TongKetChamCongGUI();
//                    break;
//                case "tienthuong" :
//                    node = new TienThuongGUI();
//                    break;
                case "phucap" :
                    node = new PhuCapGUI();
                    break;
//                case "bangluongthang" :
//                    node = new BangLuongThangGUI();
//                    break;
//                case "theodoitangluong" :
//                    node = new TheoDoiTangLuongGUI();
//                    break;
                    
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackGround(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(204,204,127));
            jlbItem.setBackground(new Color(204,204,127));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(255,255,153));
            jlbItem.setBackground(new Color(255,255,153));   
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(171,235,198));
                jlbItem.setBackground(new Color(171,235,198));
            }
        }
 
        private void setChangeBackGround(String kind) {
            for(DanhMuc item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(new Color(255,255,153));
                    item.getJpn().setBackground(new Color(255,255,153));
                } else {
                    item.getJlb().setBackground(new Color(171,235,198));
                    item.getJpn().setBackground(new Color(171,235,198));
                }
            }
        }
    }
}
