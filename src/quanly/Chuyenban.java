package quanly;

import DAO.BanDAO;
import DAO.HDCTDAO;
import DAO.HoaDonDAO;
import DAO.MonDAO_ORDER;
import DAO.NhanVienDAO;
import Helper.ShareHelper;
import Model.Ban;
import Model.HDCT;
import Model.HoaDon;
import Model.Mon;
import Model.NhanVien;
import java.awt.Label;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Chuyenban extends javax.swing.JFrame {

    public Chuyenban() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    help al;
    BanDAO bandao1 = new BanDAO();
    FormBan aThis;

    Chuyenban(FormBan aThis, String tenban, String mahd, String maban) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtbanchon.setText(tenban);
        txtmabanchon.setText(maban);
        txtmahd.setText(mahd);
        loadbancbo();
        this.aThis = aThis;
        txtbanchon.setEnabled(false);
        txtmabanchon.setEnabled(false);
        txtmahd.setEnabled(false);
        txtmahdbanchyen.setEnabled(false);
        txttk3.setEnabled(false);
        if (txtmahd.getText().equals(txtmahdbanchyen.getText())) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }
    }

    void loadbancbo() {
        List<HoaDon> li = HDdao1.select();
        List<Ban> list = bandao1.select();
        cboban.removeAllItems();
        txtsoluong.setForeground(new java.awt.Color(228, 241, 254));
        txtsoluong.setBackground(new java.awt.Color(108, 122, 137));
        for (HoaDon hd : li) {
            Ban abc = bandao1.findById(hd.getMaban());
            cboban.addItem(abc.getTenBan() + "           /" + abc.getMaBan());
        }
        loadHDCT();
        cboban.removeItem(txtbanchon.getText() + "           /" + txtmabanchon.getText());
    }
    HDCTDAO hdao = new HDCTDAO();
    MonDAO_ORDER mondao1 = new MonDAO_ORDER();

    void loadHDCT() {
        String key = (String) cboban.getSelectedItem();
        if (key == null) {
            
        } else {
            String[] keys = key.split("/");
            List<HoaDon> hd = HDdao1.selectmaban(keys[1]);
            for (HoaDon nv : hd) {
                System.out.println("mã hd: " + nv.getMahd());
                txtmahdbanchyen.setText(nv.getMahd());
            }
            if (hd.size() == 0) {
                txtmahdbanchyen.setText("TRỐNG");
            }
            try {
                DefaultTableModel model = (DefaultTableModel) tblchitetban2.getModel();
                model.setRowCount(0);
                List<HDCT> list = hdao.select1(txtmahdbanchyen.getText());
                for (HDCT nv : list) {
                    List<Mon> tenmon = mondao1.findByIdMon(nv.getMaMon_FK());
                    String tenthucpham = null;
                    for (Mon mon : tenmon) {
                        tenthucpham = mon.getTenMon();
                    }
                    Object[] row = {
                        nv.getMaCTHD(),
                        nv.getMaMon_FK(),
                        tenthucpham,
                        nv.getDonGia(),
                        nv.getSoLuong(), (nv.getDonGia() * nv.getSoLuong())
                    };
                    model.addRow(row);
                }
            } catch (Exception e) {
                alert("Lỗi truy vấn dữ liệu!");
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) tblchitetban.getModel();
        model.setRowCount(0);
        double Tongtien = 0;
        try {
            List<HDCT> list = hdao.select1(txtmahd.getText());
            for (HDCT nv : list) {
                List<Mon> tenmon = mondao1.findByIdMon(nv.getMaMon_FK());
                String tenthucpham = null;
                for (Mon mon : tenmon) {
                    tenthucpham = mon.getTenMon();
                }
                Object[] row = {
                    nv.getMaCTHD(),
                    nv.getMaMon_FK(),
                    tenthucpham,
                    nv.getDonGia(),
                    nv.getSoLuong(), (nv.getDonGia() * nv.getSoLuong())
                };
                model.addRow(row);
            }
            String tt = String.valueOf(Tongtien);
            String tt2 = tt.replace(".0", "");

        } catch (Exception e) {
            alert("Lỗi truy vấn dữ liệu!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbanchon = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtmabanchon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmahdbanchyen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboban = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblchitetban = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttk3 = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblchitetban2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtmahd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Chuyển - Ghép Bàn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(399, 399, 399))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Bàn đang chọn");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Mã bàn");

        txtbanchon.setBackground(new java.awt.Color(108, 122, 137));
        txtbanchon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbanchon.setForeground(new java.awt.Color(228, 241, 254));

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ĐÓNG GiAO DIỆN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtmabanchon.setBackground(new java.awt.Color(108, 122, 137));
        txtmabanchon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmabanchon.setForeground(new java.awt.Color(228, 241, 254));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Chuyển-Ghép");

        txtmahdbanchyen.setBackground(new java.awt.Color(108, 122, 137));
        txtmahdbanchyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmahdbanchyen.setForeground(new java.awt.Color(228, 241, 254));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Mã hóa đơn bàn chuyển");

        cboban.setBackground(new java.awt.Color(44, 62, 80));
        cboban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboban.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemchange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        btn1.setBackground(new java.awt.Color(34, 167, 240));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText(">");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(34, 167, 240));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText(">>");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        tblchitetban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã Món", "Tên Món", "Giá", "Số Lượng"
            }
        ));
        tblchitetban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchitetbanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblchitetban);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Món");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Số Lượng Chuyển");

        txttk3.setBackground(new java.awt.Color(108, 122, 137));
        txttk3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttk3.setForeground(new java.awt.Color(228, 241, 254));

        tblchitetban2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã Món", "Tên Món", "Giá", "Số Lượng"
            }
        ));
        tblchitetban2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchitetban2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblchitetban2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttk3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(561, 561, 561))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 78, Short.MAX_VALUE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Mã Hóa Đơn");

        txtmahd.setBackground(new java.awt.Color(108, 122, 137));
        txtmahd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmahd.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmabanchon)
                                    .addComponent(txtbanchon, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmahdbanchyen)
                            .addComponent(cboban, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmahdbanchyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtbanchon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmabanchon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int dong = 0;
    List<HDCT> bang2 = new ArrayList<HDCT>();
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int soluongchuyen = (int) txtsoluong.getValue();
        if (soluongchuyen == 0) {
            alert("Vui lòng chọn sản phẩm cần chuyển!");
        } else {
            bang2.removeAll(bang2);
            LocalDateTime now = LocalDateTime.now();
            int year = now.getYear();
            int month = now.getMonthValue();
            int day = now.getDayOfMonth();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            DefaultTableModel model = (DefaultTableModel) tblchitetban2.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tblchitetban.getModel();
//          int sodongbang2= model.getRowCount();         
//          System.out.println("sodongbang2 "+sodongbang2);
            if (soluongchuyen < 0) {
                alert("Bạn không thể chuyển bằng cách trừ sản phẩm");
            } else {
                int soluongbang = (int) model2.getValueAt(dong, 4);
                List<HDCT> list = hdao.check(txtmahdbanchyen.getText(), (String) model2.getValueAt(dong, 1));
                if (list.size() == 0) {
                    if (soluongbang > soluongchuyen) {
                        HDCT newup = new HDCT();
                        newup.setMaCTHD((String) model2.getValueAt(dong, 0));
                        newup.setMaHD_FK(txtmahd.getText());
                        newup.setMaMon_FK((String) model2.getValueAt(dong, 1));
                        newup.setSoLuong(soluongbang - soluongchuyen);
                        newup.setDonGia((double) model2.getValueAt(dong, 3));
                        hdao.update(newup);
                        HDCT newup2 = new HDCT();
                        newup2.setMaCTHD("" + day + month + year + hour + minute + second);
                        newup2.setMaHD_FK(txtmahdbanchyen.getText());
                        newup2.setMaMon_FK((String) model2.getValueAt(dong, 1));
                        newup2.setSoLuong(soluongchuyen);
                        newup2.setDonGia((double) model2.getValueAt(dong, 3));
                        hdao.insert(newup2);
                    } else if (soluongchuyen > soluongbang) {
                        alert("Số lượng chuyển không chính xác!");
                    } else if (soluongbang == soluongchuyen) {
                        HDCT newup = new HDCT();
                        newup.setMaCTHD((String) model2.getValueAt(dong, 0));
                        newup.setMaHD_FK(txtmahdbanchyen.getText());
                        newup.setMaMon_FK((String) model2.getValueAt(dong, 1));
                        newup.setSoLuong(soluongchuyen);
                        newup.setDonGia((double) model2.getValueAt(dong, 3));
                        hdao.update(newup);
                    }
                } else {
                    if (soluongbang > soluongchuyen) {
                        HDCT newup = new HDCT();
                        newup.setMaCTHD((String) model2.getValueAt(dong, 0));
                        newup.setMaHD_FK(txtmahd.getText());
                        newup.setMaMon_FK((String) model2.getValueAt(dong, 1));
                        newup.setSoLuong(soluongbang - soluongchuyen);
                        newup.setDonGia((double) model2.getValueAt(dong, 3));
                        hdao.update(newup);
                        for (HDCT hd : list) {
                            HDCT newup2 = new HDCT();
                            newup2.setMaCTHD(hd.getMaCTHD());
                            newup2.setMaHD_FK(hd.getMaHD_FK());
                            newup2.setMaMon_FK(hd.getMaMon_FK());
                            newup2.setSoLuong(hd.getSoLuong() + soluongchuyen);
                            newup2.setDonGia(hd.getDonGia());
                            hdao.update(newup2);
                        }
                    } else if (soluongbang == soluongchuyen) {
                        for (HDCT hd : list) {
                            HDCT newup2 = new HDCT();
                            newup2.setMaCTHD(hd.getMaCTHD());
                            newup2.setMaHD_FK(hd.getMaHD_FK());
                            newup2.setMaMon_FK(hd.getMaMon_FK());
                            newup2.setSoLuong(hd.getSoLuong() + soluongchuyen);
                            newup2.setDonGia(hd.getDonGia());
                            hdao.update(newup2);
                        }
                        hdao.delete((String) model2.getValueAt(dong, 0));
                    } else if (soluongbang < soluongchuyen) {
                        alert("Số lượng chuyển không chính xác!");
                    }
                }
            }
            this.loadHDCT();
        }
        aThis.loadlaiban();
        aThis.loadHDCT();

//        for(int i=0;i<sodongbang2;i++){
//            HDCT newup=new HDCT();
//            newup.setMaCTHD((String) model.getValueAt(i, 0));
//            newup.setMaHD_FK(txtmahdbanchyen.getText());
//            newup.setMaMon_FK((String) model.getValueAt(i, 1));
//            newup.setSoLuong((int) model.getValueAt(i, 4));
//            newup.setDonGia((double) model.getValueAt(i, 3));
//            bang2.add(newup);
//        }
//        for(HDCT ba:bang2){
//            if(ba.getMaMon_FK().equals((String) model2.getValueAt(dong, 1))){
//                if(soluongbang>soluongchuyen){
//                     HDCT newup=new HDCT();
//                     newup.setMaCTHD(""+day+month+year+hour+minute+second);
//                     newup.setMaHD_FK(txtmahdbanchyen.getText());
//                     newup.setMaMon_FK((String) model2.getValueAt(dong, 1));
//                     newup.setSoLuong(soluongchuyen);
//                     newup.setDonGia((double) model2.getValueAt(dong, 3));
//                     hdao.update(newup);
//                }else{
//                    alert("Số cần chuyển nhiều hơn số lượng trong bàn có!");
//                }
//            }else{
//                System.out.println("Không trùng"+(String) model2.getValueAt(dong, 1));
//            }
//            this.loadHDCT();
//        }
//String mamon=(String) model.getValueAt(dong, 0);        
//        int soluongchuyen=(int) txtsoluong.getValue();
//        int soluongbang=(int)model.getValueAt(dong, 4);
//        
//        List<HDCT> list = hdao.check(txtmahdbanchyen.getText(),mamon);
//        System.out.println("size"+list.size());
//if(list.size()==0){
//    if(soluongchuyen<soluongbang){
// HDCT newup=new HDCT();
//     newup.setDonGia((double)model.getValueAt(dong, 3));
//     newup.setMaCTHD(""+day+month+year+hour+minute+second);
//     newup.setMaHD_FK(txtmahdbanchyen.getText());
//     newup.setSoLuong(soluongchuyen);
//     newup.setMaMon_FK((String)model.getValueAt(dong, 1));
//     hdao.insert(newup);
//     hdao.updatekey(txtmahd.getText(),(String)model.getValueAt(dong, 0), (soluongbang-soluongchuyen));
//    }else if(soluongchuyen==soluongbang){
//     HDCT newup=new HDCT();
//     newup.setDonGia((double)model.getValueAt(dong, 3));
//     newup.setMaCTHD((String)model.getValueAt(dong, 0));
//     newup.setMaHD_FK(txtmahdbanchyen.getText());
//     newup.setSoLuong(soluongchuyen);
//     newup.setMaMon_FK((String)model.getValueAt(dong, 1));
//     hdao.update(newup);
//         
//    }
//    
//}this.loadHDCT();
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    List<HDCT> bang1 = new ArrayList<HDCT>();

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblchitetban.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblchitetban2.getModel();
        int row = model.getRowCount();
        int row2 = model2.getRowCount();
        bang1.removeAll(bang1);
        for (int i = 0; i < row; i++) {
            HDCT dong1 = new HDCT();
            dong1.setMaCTHD((String) model.getValueAt(i, 0));
            dong1.setMaMon_FK((String) model.getValueAt(i, 1));
            dong1.setMaHD_FK(txtmahd.getText());
            dong1.setDonGia((double) model.getValueAt(i, 3));
            dong1.setSoLuong((int) model.getValueAt(i, 4));
            bang1.add(dong1);
            System.out.println("Size" + bang1.size());
        }

        for (int i = 0; i < bang1.size(); i++) {
            List<HDCT> list = hdao.check(txtmahdbanchyen.getText(), bang1.get(i).getMaMon_FK());
            if (list.size() == 0) {
                HDCT newup = new HDCT();
                newup.setDonGia(bang1.get(i).getDonGia());
                newup.setMaCTHD(bang1.get(i).getMaCTHD());
                newup.setMaHD_FK(txtmahdbanchyen.getText());
                newup.setSoLuong(bang1.get(i).getSoLuong());
                newup.setMaMon_FK(bang1.get(i).getMaMon_FK());
                hdao.update(newup);
                this.loadHDCT();
            } else {
                System.out.println("sptrung" + bang1.get(i).getMaMon_FK());
                for (HDCT hdct : list) {
                    System.out.println("list" + hdct.getMaMon_FK());
                    HDCT newup = new HDCT();
                    newup.setDonGia(hdct.getDonGia());
                    newup.setMaCTHD(hdct.getMaCTHD());
                    newup.setMaHD_FK(txtmahdbanchyen.getText());
                    newup.setSoLuong(bang1.get(i).getSoLuong() + hdct.getSoLuong());
                    newup.setMaMon_FK(hdct.getMaMon_FK());
                    hdao.update(newup);
                    hdao.delete(bang1.get(i).getMaCTHD());
                    this.loadHDCT();
                }
            }
            HDdao1.updateoffhd(txtmabanchon.getText(), txtmahd.getText());
            aThis.loadlaiban();
            aThis.loadHDCT();
            aThis.closemenuorder(false);
        }

//for(int i=0;i<row2;i++){
//  HDCT dong2=new HDCT();
//  dong2.setMaCTHD((String) model2.getValueAt(i, 0));
//  dong2.setMaMon_FK((String) model2.getValueAt(i, 1));
//  dong2.setMaHD_FK(txtmahdbanchyen.getText());
//  dong2.setDonGia((double) model2.getValueAt(i,3));
//  dong2.setSoLuong((int)model2.getValueAt(i,4));
//  bang2.add(dong2);
//    System.out.println("Size"+bang2.size());
//}
        String a = "";
        String b = "";
//if(bang1.size()>bang2.size()){
//     for(HDCT hdct2:bang2){
//    for(HDCT hdct1:bang1){
//  if(hdct2.getMaMon_FK().equals(hdct1.getMaMon_FK())){
//     
//      a+="Trùng";
//  }else{
//      
//        b+="Không Trùng";
//}
// 
//}
//}
//}System.out.println(b);
        //System.out.println(a);

    }//GEN-LAST:event_btn2ActionPerformed
    String tenmon;
    int soluong;
    private void tblchitetbanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchitetbanMouseClicked
        tenmon = "";
        soluong = 0;
        dong = 0;
        dong = tblchitetban.rowAtPoint(evt.getPoint());
        int keyma = tblchitetban.rowAtPoint(evt.getPoint());
        tenmon = (String) tblchitetban.getValueAt(keyma, 2);
        soluong = (int) tblchitetban.getValueAt(keyma, 4);
        txtsoluong.setValue(soluong);
        txttk3.setText(tenmon);
    }//GEN-LAST:event_tblchitetbanMouseClicked

    private void itemchange(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemchange
        loadHDCT();        
    }//GEN-LAST:event_itemchange

    private void tblchitetban2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchitetban2MouseClicked
        
    }//GEN-LAST:event_tblchitetban2MouseClicked
    HoaDonDAO HDdao1 = new HoaDonDAO();

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chuyenban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chuyenban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chuyenban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chuyenban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chuyenban().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> cboban;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblchitetban;
    private javax.swing.JTable tblchitetban2;
    private javax.swing.JTextField txtbanchon;
    private javax.swing.JTextField txtmabanchon;
    private javax.swing.JTextField txtmahd;
    private javax.swing.JTextField txtmahdbanchyen;
    private javax.swing.JSpinner txtsoluong;
    private javax.swing.JTextField txttk3;
    // End of variables declaration//GEN-END:variables

    private void alert(String loi) {
        if (al != null) {
            al.dispose();
            al = new help(loi);
        } else {
            al = new help(loi);
        }
        al.setVisible(true);
    }
}
