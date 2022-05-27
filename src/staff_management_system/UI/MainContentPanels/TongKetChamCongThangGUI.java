package staff_management_system.UI.MainContentPanels;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import staff_management_system.BUS.NhanVienBUS;
import static staff_management_system.BUS.NhanVienBUS.dsnv;
import static staff_management_system.BUS.TongKetChamCongThangBUS.dstkcct;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import staff_management_system.BUS.BangChamCongBUS;
import static staff_management_system.BUS.BangChamCongBUS.dscc;
import staff_management_system.BUS.TongKetChamCongThangBUS;
import staff_management_system.DTO.BangChamCong;
import staff_management_system.DTO.NhanVien;
import staff_management_system.DTO.TongKetChamCongThang;

/**
 *
 * @author ngahz
 */
public class TongKetChamCongThangGUI extends javax.swing.JPanel {

    /**
     * Creates new form TongKetChamCongThangGUI
     */
    public TongKetChamCongThangGUI() {
        initComponents();
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        NhanVienBUS busnv = new NhanVienBUS();
        try {
            busnv.getNhanViens();
        } catch (Exception ex) {
            Logger.getLogger(TongKetChamCongThangGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (NhanVien nv : dsnv) {
            cbMaNV.addItem(nv.getMaNV());
        }
        if (dstkcct == null) {
            bus.docDSTKCCT();
        }
        System.out.println(dstkcct);
        ganDS(dstkcct);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbMaNV = new javax.swing.JComboBox<>();
        txTienTru = new javax.swing.JTextField();
        cbThang = new javax.swing.JComboBox<>();
        cbNam = new javax.swing.JComboBox<>();
        txVCP = new javax.swing.JTextField();
        txVKP = new javax.swing.JTextField();
        txOm = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btMoi = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbTimKiem = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true), "Thông tin ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        cbMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMaNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nv" }));
        cbMaNV.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Mã nhân viên ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        cbMaNV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaNVItemStateChanged(evt);
            }
        });

        txTienTru.setEditable(false);
        txTienTru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txTienTru.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Lương trừ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        cbThang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbThang.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tháng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        cbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbThangItemStateChanged(evt);
            }
        });

        cbNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2020", "2021", "2022" }));
        cbNam.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Năm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        cbNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNamItemStateChanged(evt);
            }
        });

        txVCP.setEditable(false);
        txVCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txVCP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "VCP ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        txVKP.setEditable(false);
        txVKP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txVKP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "VKP ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        txOm.setEditable(false);
        txOm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txOm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Ốm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbMaNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txVCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txOm, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txVKP)
                            .addComponent(txTienTru))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txVCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txVKP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txOm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTienTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btThem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btMoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btMoi.setText("Mới");
        btMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoiActionPerformed(evt);
            }
        });

        btThongKe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btThongKe.setText("Thống Kê");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btMoi))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua)
                    .addComponent(btXoa))
                .addGap(40, 40, 40)
                .addComponent(btThongKe)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 3, true)), "Tìm kiếm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm theo");

        cbTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lựa chọn", "mã NV", "tháng năm", "tiền bị trừ" }));
        cbTimKiem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTimKiemItemStateChanged(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2020", "2021", "2022" }));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(247, 247, 247))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ganDS(ArrayList<TongKetChamCongThang> ds) {
        Vector header = new Vector();
        header.add("Mã nhân viên");
        header.add("Tháng năm");
        header.add("Vắng có phép");
        header.add("Vắng không phép");
        header.add("Nghỉ ốm");
        header.add("Lương bị trừ");
        model = new DefaultTableModel(header, 0);
        Vector row;
        for (TongKetChamCongThang tkcct : ds) {
            row = new Vector();
            row.add(tkcct.getMaNV());
            row.add(tkcct.getThangNam());
            row.add(tkcct.getSoNgayVangCoPhep());
            row.add(tkcct.getSoNgayVangKhongPhep());
            row.add(tkcct.getSoNgayNghiOm());
            row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(tkcct.getLuongBiTru())));
            model.addRow(row);
        }
        jTable1.setModel(model);
    }
    
    public void showInfo(){
        BangChamCongBUS buscc = new BangChamCongBUS();
        if (dscc == null) {
            buscc.getBangChamCongs(0,"");
        }

        String ma = (String) cbMaNV.getSelectedItem();
        int thang = Integer.parseInt(cbThang.getSelectedItem()+"");
        int nam = Integer.parseInt(cbNam.getSelectedItem()+"");
        int vcp = 0;
        int vkp = 0;
        int om = 0;
        int sum = 0;
        for(BangChamCong cc : dscc)
            if(cc.getMaNV().equals(ma)&&(cc.getDate().getMonth()+1)==thang&&Integer.parseInt(sdf.format(cc.getDate()))==nam){
                switch(cc.getTrangThai()){
                    case "Vắng có phép":
                        vcp+=1;
                        break;
                    case "Vắng không phép":
                        vkp+=1;
                        break;
                    case "Ốm":
                        om+=1;
                        break;
                    default:
                        break;
                }
            }
        
        txVCP.setText(vcp+"");
        txVKP.setText(vkp+"");
        txOm.setText(om+"");
        if(om>5)
            sum+=5000;
        if(vcp>2)
            sum+=((vcp-2)*50000);
        sum += vkp*100000;
        txTienTru.setText(String.format(Locale.GERMAN, "%,d", sum));
    }
    private void cbMaNVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaNVItemStateChanged
        if(cbThang.getSelectedIndex()!=0&&cbNam.getSelectedIndex()!=0)
        showInfo();
    }//GEN-LAST:event_cbMaNVItemStateChanged

    private void cbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbThangItemStateChanged
        if(cbMaNV.getSelectedIndex()!=0&&cbNam.getSelectedIndex()!=0)
        showInfo();
    }//GEN-LAST:event_cbThangItemStateChanged

    private void cbNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNamItemStateChanged
        if(cbMaNV.getSelectedIndex()!=0&&cbThang.getSelectedIndex()!=0)
        showInfo();
    }//GEN-LAST:event_cbNamItemStateChanged

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if(cbMaNV.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Chưa chọn mã nhân viên!");
            cbMaNV.requestFocus(true);
            return;
        }

        if(cbThang.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Chưa chọn tháng!");
            cbMaNV.requestFocus(true);
            return;
        }

        if(cbNam.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Chưa chọn năm!");
            cbMaNV.requestFocus(true);
            return;
        }

        TongKetChamCongThang tkcct = new TongKetChamCongThang();

        if (!bus.checkPK(cbMaNV.getSelectedItem() + "", cbThang.getSelectedItem()+" "+cbNam.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Thông tin bị trùng");
            return;
        }

        tkcct.setMaNV(cbMaNV.getSelectedItem() + "");
        tkcct.setThangNam(cbThang.getSelectedItem()+"-"+cbNam.getSelectedItem());
        tkcct.setSoNgayVangCoPhep(txVCP.getText());
        tkcct.setSoNgayVangKhongPhep(txVKP.getText());
        tkcct.setSoNgayNghiOm(txOm.getText());
        tkcct.setLuongBiTru(txTienTru.getText().replaceAll("\\.", ""));
        bus.themTKCCT(tkcct);

        Vector row = new Vector();
        row.add(tkcct.getMaNV());
        row.add(tkcct.getThangNam());
        row.add(tkcct.getSoNgayVangCoPhep());
        row.add(tkcct.getSoNgayVangKhongPhep());
        row.add(tkcct.getSoNgayNghiOm());
        row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(tkcct.getLuongBiTru())));
        model.addRow(row);
        jTable1.setModel(model);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int i = jTable1.getSelectedRow();

        if (i >= 0) {
            if (!bus.checkPK(cbMaNV.getSelectedItem() + "", cbThang.getSelectedItem()+"-"+cbNam.getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Thông tin bị trùng");
                return;
            }
            TongKetChamCongThang tkcct = new TongKetChamCongThang();
            tkcct.setMaNV(cbMaNV.getSelectedItem() + "");
            tkcct.setThangNam(cbThang.getSelectedItem()+"-"+cbNam.getSelectedItem());
            tkcct.setSoNgayVangCoPhep(txVCP.getText());
            tkcct.setSoNgayVangKhongPhep(txVKP.getText());
            tkcct.setSoNgayNghiOm(txOm.getText());
            tkcct.setLuongBiTru(txTienTru.getText().replaceAll("\\.", ""));
            bus.suaTKCCT(tkcct);

            model.setValueAt(tkcct.getMaNV(), i, 0);
            model.setValueAt(tkcct.getThangNam(), i, 1);
            model.setValueAt(tkcct.getSoNgayVangCoPhep(), i, 2);
            model.setValueAt(tkcct.getSoNgayVangKhongPhep(), i, 3);
            model.setValueAt(tkcct.getSoNgayNghiOm(), i, 4);
            model.setValueAt(String.format(Locale.GERMAN, "%,d", Integer.parseInt(tkcct.getLuongBiTru())), i, 5);
            jTable1.setModel(model);
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int i = jTable1.getSelectedRow();
        if (i >= 0) {
            bus.xoaTKCCT(i);
            model.removeRow(i);
            jTable1.setModel(model);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoiActionPerformed
        jTable1.clearSelection();
        cbMaNV.setSelectedIndex(0);
        txTienTru.setText("");
        cbNam.setSelectedIndex(0);
        cbThang.setSelectedIndex(0);
        txVCP.setText("");
        txOm.setText("");
        txVKP.setText("");
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        ganDS(dstkcct);
    }//GEN-LAST:event_btMoiActionPerformed

    private void cbTimKiemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTimKiemItemStateChanged
        int n = cbTimKiem.getSelectedIndex();
        switch (n){
            case 1 :
            case 3 :
                jPanel7.setVisible(true);
                jPanel8.setVisible(false);
                jTextField2.setText("");
                break;

            case 2 :
                jPanel8.setVisible(false);
                jPanel7.setVisible(true);
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                break;

            default :
                break;
        }
    }//GEN-LAST:event_cbTimKiemItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jComboBox1.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "chưa điền đủ thông tin");
            return;
        }
        ArrayList<TongKetChamCongThang> kq;
        String temp = jComboBox1.getSelectedItem()+"-"+jComboBox2.getSelectedItem();
        kq=bus.timKiem1(2,temp);
        if(kq.isEmpty())
            JOptionPane.showMessageDialog(null, "Không có ai tăng ca trong ngày đó");
        ganDS(kq);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n=cbTimKiem.getSelectedIndex();
        ArrayList<TongKetChamCongThang> kq;
        switch (n){
            case 1 :
                String temp = jTextField2.getText();
                kq=bus.timKiem1(1,temp);
                if(kq.isEmpty())
                    JOptionPane.showMessageDialog(null, "Không có mã nhân viên như vậy");
                ganDS(kq);
                break;

            case 3 :
                temp = jTextField2.getText();
                kq=bus.timKiem1(3,temp);
                if(kq.isEmpty())
                    JOptionPane.showMessageDialog(null, "Không có ai có lương bị trừ như vậy ");
                ganDS(kq);
                break;
            
            default :
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        if (i >= 0) {
            TongKetChamCongThang tkcct;
            tkcct = dstkcct.get(i);
            cbMaNV.setSelectedItem(tkcct.getMaNV());
            String s[] = tkcct.getThangNam().split("-");
            cbThang.setSelectedItem(s[0]);
            cbNam.setSelectedItem(s[1]);
            txVCP.setText(tkcct.getSoNgayVangCoPhep());
            txVKP.setText(tkcct.getSoNgayVangKhongPhep());
            txOm.setText(tkcct.getSoNgayNghiOm());
            txTienTru.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(tkcct.getLuongBiTru())));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    TongKetChamCongThangBUS bus = new TongKetChamCongThangBUS();
    DefaultTableModel model = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMoi;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbMaNV;
    private javax.swing.JComboBox<String> cbNam;
    private javax.swing.JComboBox<String> cbThang;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txOm;
    private javax.swing.JTextField txTienTru;
    private javax.swing.JTextField txVCP;
    private javax.swing.JTextField txVKP;
    // End of variables declaration//GEN-END:variables
}
