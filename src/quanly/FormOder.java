package quanly;

import DAO.BanDAO;
import DAO.HDCTDAO;
import DAO.HoaDonDAO;
import DAO.KhuvucDAO;
import DAO.LoaiMonDAO_ORDER;
import DAO.MonDAO_ORDER;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Model.Ban;
import Model.HDCT;
import Model.HoaDon;
import Model.Khuvuc;
import Model.LoaiMon;
import Model.Mon;
import java.awt.Color;
import java.awt.Event;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FormOder extends javax.swing.JFrame {

    public FormOder() {
        initComponents();
        loadtablbanorder();
        txtTenmonorder.setEnabled(false);
        txtso.setText("1");
        removethongtin();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        scollbar = new javax.swing.JScrollBar();
        pnlkhuvuc = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        tabs2 = new javax.swing.JTabbedPane();
        jpannutorder = new javax.swing.JPanel();
        jpoder = new javax.swing.JPanel();
        txtTenmonorder = new javax.swing.JTextField();
        tru = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        txtso = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbltrangthauchonban = new javax.swing.JLabel();
        lblmaban = new javax.swing.JLabel();
        btndatban = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        jpancha = new javax.swing.JPanel();
        jpancon = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblban4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblkhuvuv = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblchitietban = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTongtien = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlkhuvuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(java.awt.Color.green);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel6.setBackground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel5.setText("Bàn Khách Đang Trống");

        jLabel12.setText("Bàn Khách Đang Sử Dụng");

        jLabel15.setText("THÔNG TIN BÀN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlkhuvucLayout = new javax.swing.GroupLayout(pnlkhuvuc);
        pnlkhuvuc.setLayout(pnlkhuvucLayout);
        pnlkhuvucLayout.setHorizontalGroup(
            pnlkhuvucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlkhuvucLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlkhuvucLayout.setVerticalGroup(
            pnlkhuvucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlkhuvucLayout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pnlmenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Món", "Tên Món", "Giá Tiền"
            }
        ));
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        tabs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabs2MouseClicked(evt);
            }
        });

        txtTenmonorder.setDisabledTextColor(java.awt.Color.black);
        txtTenmonorder.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtTenmonorderInputMethodTextChanged(evt);
            }
        });

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        txtso.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtsoInputMethodTextChanged(evt);
            }
        });

        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jLabel14.setText("Hình");

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setMaximumSize(new java.awt.Dimension(164, 153));
        jPanel8.setMinimumSize(new java.awt.Dimension(164, 153));

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHinh.setMaximumSize(new java.awt.Dimension(236, 155));
        lblHinh.setMinimumSize(new java.awt.Dimension(236, 155));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jpoderLayout = new javax.swing.GroupLayout(jpoder);
        jpoder.setLayout(jpoderLayout);
        jpoderLayout.setHorizontalGroup(
            jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpoderLayout.createSequentialGroup()
                .addGroup(jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpoderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTenmonorder, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpoderLayout.createSequentialGroup()
                        .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpoderLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpoderLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jpoderLayout.setVerticalGroup(
            jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpoderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpoderLayout.createSequentialGroup()
                        .addComponent(txtTenmonorder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cong)
                            .addComponent(tru)
                            .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpoderLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpannutorderLayout = new javax.swing.GroupLayout(jpannutorder);
        jpannutorder.setLayout(jpannutorderLayout);
        jpannutorderLayout.setHorizontalGroup(
            jpannutorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannutorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpannutorderLayout.setVerticalGroup(
            jpannutorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannutorderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jpoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbltrangthauchonban.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltrangthauchonban.setForeground(new java.awt.Color(255, 0, 51));

        btndatban.setText("ĐẶT BÀN");
        btndatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatbanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltrangthauchonban)
                .addGap(48, 48, 48)
                .addComponent(btndatban)
                .addGap(90, 90, 90)
                .addComponent(lblmaban, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(lblmaban, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbltrangthauchonban, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btndatban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
        pnlmenu.setLayout(pnlmenuLayout);
        pnlmenuLayout.setHorizontalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpannutorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tabs2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlmenuLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlmenuLayout.setVerticalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmenuLayout.createSequentialGroup()
                .addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmenuLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabs2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpannutorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpancha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("THÔNG TIN BÀN");

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblban4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblban4.setForeground(new java.awt.Color(102, 102, 102));
        lblban4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Khu Vực:");

        tblchitietban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TÊN MÓN", "GIÁ TIỀN", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        jScrollPane8.setViewportView(tblchitietban);

        jButton17.setText("THANH TOÁN");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblTongtien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTongtien.setForeground(java.awt.Color.red);
        lblTongtien.setText("Tổng tiền: 0vnđ");
        lblTongtien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(lblTongtien)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setText("Chuyển Bàn");
        jPanel5.add(jButton3, java.awt.BorderLayout.PAGE_START);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox1, java.awt.BorderLayout.PAGE_END);

        jLabel17.setText("Tên Món");

        jLabel13.setText("Số Lượng");

        jLabel9.setText("Giá Tiền");

        jButton7.setText("Thay đổi");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanconLayout = new javax.swing.GroupLayout(jpancon);
        jpancon.setLayout(jpanconLayout);
        jpanconLayout.setHorizontalGroup(
            jpanconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanconLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanconLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpanconLayout.createSequentialGroup()
                        .addComponent(lblban4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblkhuvuv, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpanconLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel34)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanconLayout.setVerticalGroup(
            jpanconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblban4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblkhuvuv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanchaLayout = new javax.swing.GroupLayout(jpancha);
        jpancha.setLayout(jpanchaLayout);
        jpanchaLayout.setHorizontalGroup(
            jpanchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanchaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpancon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpanchaLayout.setVerticalGroup(
            jpanchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanchaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpancon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlkhuvuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlmenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlkhuvuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabs2MouseClicked
        txtso.setText("1");
        int i = tabs2.getSelectedIndex();
        DefaultTableModel tabe = (DefaultTableModel) tblOrder.getModel();
        tabe.setRowCount(0);
        String tenloaimon = tabs2.getTitleAt(i);
        LoaiMon mode = lmdaood.findByten(tenloaimon);
        if (mode != null) {
            List<Mon> listmonan = mondao1.findByIdLoaiMon(mode.getMaLoaiMon());
            for (Mon nv : listmonan) {
                Object[] row = {
                    nv.getMaMon(),
                    nv.getTenMon(),
                    nv.getGia(),
                    nv.getHinhanh()
                };
                tabe.addRow(row);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_tabs2MouseClicked
    HoaDon getModelHD() {
        List<HoaDon> hd = HDdao1.select1();
        int mahd = (hd.size()) + 1;
        String Mahdstr = "HD" + mahd;
        HoaDon model = new HoaDon();
        model.setMahd(Mahdstr);
        model.setMaban(lblmaban.getName());
        model.setTrangthai(true);
        return model;
    }
    boolean is;

    void insertHD() {
        HoaDon model = getModelHD();
        try {
            HDdao1.insert(model);
            btndatban.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Đặt bàn thành công!");
            loadlaiban();

        } catch (Exception e) {
            DialogHelper.alert(this, "Đã Xãy Ra Lỗi");
            btndatban.setEnabled(true);
        }
    }
    int dong;
    void setModelMonorder(Mon model) {
        txtTenmonorder.setText(model.getTenMon());
        if (model.getHinhanh() != null) {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("logos", model.getHinhanh()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            lblHinh.setIcon(imageIcon);
        } else {
            lblHinh.setIcon(null);
        }
    }

    void editMenu() {
        try {
            String manv = (String) tblOrder.getValueAt(this.dong, 0);
            Mon model = mondao1.findById(manv);
            if (model != null) {
                this.setModelMonorder(model);
                btnthem.setEnabled(true);
                getModelHDCT(model.getMaMon(), model.getGia());
            } else {
                btnthem.setEnabled(false);
            }
        } catch (Exception e) {

        }
    }
    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        if (evt.getClickCount() == 1) {
            this.dong = tblOrder.rowAtPoint(evt.getPoint());
            if (this.dong >= 0) {
                editMenu();
            }
        }            // TODO add your handling code here:
    }//GEN-LAST:event_tblOrderMouseClicked

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        String so = txtso.getText();
        int so1 = Integer.parseInt(so);
        String Soload = "" + (so1 + 1);
        txtso.setText(Soload);   // TODO add your handling code here:
    }//GEN-LAST:event_congActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        String so = txtso.getText();
        int so1 = Integer.parseInt(so);
        String Soload = "" + (so1 - 1);
        txtso.setText(Soload);
        // TODO add your handling code here:
    }//GEN-LAST:event_truActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        editMenu();
        inserthdct();        // TODO add your handling code here:
    }//GEN-LAST:event_btnthemActionPerformed

    private void txtTenmonorderInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtTenmonorderInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenmonorderInputMethodTextChanged

    private void txtsoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtsoInputMethodTextChanged
        editMenu();        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoInputMethodTextChanged

    private void btndatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatbanActionPerformed
        insertHD();
        for (int i = 0; i < buttonlist.size(); i++) {
            if (buttonlist.get(i).getText().equals(lbltrangthauchonban.getText())) {
                buttonlist.get(i).action(click(buttonlist.get(i)), i);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btndatbanActionPerformed

    HDCT cthd = new HDCT();

    void inserthdct() {
        try {
            if (cthd != null) {
                hdao.insert(cthd);
            } else {
                DialogHelper.alert(this, "Chưa chọn món order!");
                return;
            }
            DialogHelper.alert(this, "Thêm mới thành công!");
            this.loadHDCT();

        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi Trùng Khóa");
        }
    }

    void loadHDCT() {
        DefaultTableModel model = (DefaultTableModel) tblchitietban.getModel();
        model.setRowCount(0);
        double Tongtien = 0;
        lblTongtien.setText(null);
        try {
            List<HDCT> list = hdao.select1(MaHD.getName());
            for (HDCT nv : list) {
                List<Mon> tenmon = mondao1.findByIdMon(nv.getMaMon_FK());
                String tenthucpham = null;
                for (Mon mon : tenmon) {
                    tenthucpham = mon.getTenMon();
                }
                Object[] row = {
                    tenthucpham,
                    nv.getDonGia(),
                    nv.getSoLuong(), (nv.getDonGia() * nv.getSoLuong())
                };
                Tongtien += (nv.getDonGia() * nv.getSoLuong());
                lblTongtien.setText("Tổng tiền: " + Tongtien + "vnđ");
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    HDCT getModelHDCT(String mamon, double dongia) {
        int Soluong;
        Soluong = Integer.parseInt(txtso.getText());
        if (MaHD.getName().equals(null)) {
            JOptionPane.showMessageDialog(this, "Chưa chọn bàn order!");
            return cthd = null;
        } else {
            List<HDCT> hd = hdao.select();
            int Mahdct = (hd.size()) + 1;
            String Mahdstr = "HDCT" + Mahdct;

            cthd.setMaCTHD(Mahdstr);
            cthd.setMaHD_FK(MaHD.getName());
            cthd.setDonGia(dongia);
            cthd.setSoLuong(Soluong);
            cthd.setMaMon_FK(mamon);
            return cthd;
        }

    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOder().setVisible(true);
            }
        });
    }
    
    MonDAO_ORDER mondao1 = new MonDAO_ORDER();
    BanDAO bandao1 = new BanDAO();
    HoaDonDAO HDdao1 = new HoaDonDAO();
    KhuvucDAO kvd1 = new KhuvucDAO();
    HDCTDAO hdao = new HDCTDAO();
    LoaiMonDAO_ORDER lmdaood = new LoaiMonDAO_ORDER();
    JPanel jps;
    JPanel jplm;
    Label lblnew;
    List<Label> listlabel = new ArrayList<Label>();
    List<JPanel> listjp = new ArrayList<JPanel>();
    List<JButton> buttonlist = new ArrayList<JButton>();
    List<JPanel> jpanlmlist = new ArrayList<JPanel>();

    void removethongtin() {
        pnlmenu.remove(jpannutorder);
        pnlmenu.add(jPanel10);
        pnlmenu.repaint();
        pnlmenu.revalidate();
        jpancha.setVisible(false);
        if (lbltrangthauchonban.getText().equals("")) {
            btndatban.setEnabled(false);
        } else {
            btndatban.setEnabled(true);
        }
    }

    void thongtinban() {
        jpancha.setVisible(true);
        pnlmenu.remove(jPanel10);
        pnlmenu.add(jpannutorder);
        pnlmenu.repaint();
        pnlmenu.revalidate();
    }

    void loadlaiban() {
        int u = 0;
        List<Ban> listban = bandao1.select();
        List<Khuvuc> listkv = kvd1.select();
        for (Khuvuc kv : listkv) {
            for (Ban nv1 : listban) {
                for (int i = 0; i < listjp.size(); i++) {
                    if (kv.getMaKhuVuc().equals(listjp.get(i).getName())) {
                        for (int a = 0; a < buttonlist.size(); a++) {
                            String keycode = buttonlist.get(a).getName();
                            String[] keycode2 = keycode.split("-");
                            if (keycode2[0].equals(nv1.getMaBan())) {
                                listjp.get(i).remove(buttonlist.get(a));
                                tab.remove(listjp.get(i));
                            }
                        }
                    }
                    tab.remove(listjp.get(i));
                }
            }
            tabs2.removeAll();
        }
        listjp.removeAll(listjp);
        buttonlist.removeAll(buttonlist);
        loadtablbanorder();

    }

    void datban(JButton button) {
        listlabel.remove(listlabel);
        List<HoaDon> hd = HDdao1.select();
        String key = button.getName();
        String[] key2 = key.split("-");
        for (HoaDon hd11 : hd) {
            if (hd11.getMaban() == null) {

            } else {
                if (hd11.getMaban().equals(key2[1])) {
                    lblnew = new Label();
                    lblnew.setName(hd11.getMaban() + "-" + hd11.getMahd());
                    listlabel.add(lblnew);
                    button.setBackground(Color.red);
                    button.setForeground(Color.yellow);
                } else {

                }
            }
        }
    }

    void loadtablbanorder() {
        btnthem.setEnabled(false);
        List<String> abc = new ArrayList<>();
        List<Ban> list = bandao1.select();
        try {
            List<Khuvuc> list1 = kvd1.select();
            List<LoaiMon> listloaimon = lmdaood.select();
            for (LoaiMon lm : listloaimon) {
                jplm = new JPanel();
                jplm.setName(lm.getTenLoaiMon());
                jpanlmlist.add(jplm);
                tabs2.add(jplm);
            }
            for (Khuvuc nv : list1) {
                jps = new JPanel();
                jps.setSize(362, DEFAULT_CURSOR);
                jps.setName(nv.getTenKhuVuc());
                listjp.add(jps);
                abc.add(nv.getTenKhuVuc() + "-" + nv.getMaKhuVuc());
            }
            for (Ban nv : list) {
                JButton button = new JButton();
                button.setText(nv.getTenBan());
                button.setIcon(ShareHelper.readLogo("admin.png"));
                button.setName(nv.getMaKV() + "-" + nv.getMaBan());
                button.setBackground(Color.green);
                button.setSize(100, 100);
                buttonlist.add(button);
                datban(button);
                button.addActionListener((ae) -> {
                    loadban(nv.getMaKV(), nv.getMaBan(), button);
                });
            }

            for (int i = 0; i < listjp.size(); i++) {
                String[] key = abc.get(i).split("-");
                if (key[0].equals(listjp.get(i).getName())) {
                    for (int a = 0; a < buttonlist.size(); a++) {
                        String keycode = buttonlist.get(a).getName();
                        String[] keycode2 = keycode.split("-");
                        if (keycode2[0].equals(key[1])) {
                            listjp.get(i).add(buttonlist.get(a));
                            tab.add(listjp.get(i));
                        }
                    }
                }
                tab.add(listjp.get(i));
            }
            DefaultTableModel tabe = (DefaultTableModel) tblOrder.getModel();
            tabe.setRowCount(0);
            String tenloaimon = tabs2.getTitleAt(0);
            LoaiMon mode = lmdaood.findByten(tenloaimon);
            if (mode != null) {
                List<Mon> listmonan = mondao1.findByIdLoaiMon(mode.getMaLoaiMon());
                for (Mon nv : listmonan) {
                    Object[] row = {
                        nv.getMaMon(),
                        nv.getTenMon(),
                        nv.getGia(),};
                    tabe.addRow(row);
                }
            }

        } catch (Exception e) {
            DialogHelper.alert(this, "" + e);
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndatban;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton cong;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jpancha;
    private javax.swing.JPanel jpancon;
    private javax.swing.JPanel jpannutorder;
    private javax.swing.JPanel jpoder;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblTongtien;
    private javax.swing.JLabel lblban4;
    private javax.swing.JLabel lblkhuvuv;
    private javax.swing.JLabel lblmaban;
    private javax.swing.JLabel lbltrangthauchonban;
    private javax.swing.JPanel pnlkhuvuc;
    private javax.swing.JPanel pnlmenu;
    private javax.swing.JScrollBar scollbar;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTabbedPane tabs2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblchitietban;
    private javax.swing.JButton tru;
    private javax.swing.JTextField txtTenmonorder;
    private javax.swing.JTextField txtso;
    // End of variables declaration//GEN-END:variables
    Label MaHD = new Label();

    private void loadban(String maKV, String maBan1, JButton button) {
        lblban4.setText((button.getText()));
        lblmaban.setName(maBan1);
        lbltrangthauchonban.setText(button.getText());
        lblTongtien.setText(null);
        Khuvuc model = kvd1.findById(maKV);

        if (model != null) {
            lblkhuvuv.setText(model.getTenKhuVuc());
        }

        if (button.getBackground() == Color.red) {
            thongtinban();
            loadHDCT();

        }
        
        if (button.getBackground() == Color.green) {
            removethongtin();
        }

        MaHD.setName(null);
        for (int i = 0; i < listlabel.size(); i++) {
            String TTTT = listlabel.get(i).getName();
            String TTTT2 = button.getName();
            String[] XXXX2 = TTTT2.split("-");
            String[] XXXX = TTTT.split("-");
            String mabanbutton = XXXX2[1];
            String mabanlabel = XXXX[0];
            if (mabanlabel.equals(mabanbutton)) {
                MaHD.setName(XXXX[1]);
                loadHDCT();
            }
        }

    }

    private Event click(JButton get) {
        MaHD.setName(null);
        for (int i = 0; i < listlabel.size(); i++) {
            String TTTT = listlabel.get(i).getName();
            String TTTT2 = get.getName();
            String[] XXXX2 = TTTT2.split("-");
            String[] XXXX = TTTT.split("-");
            String mabanbutton = XXXX2[1];
            String mabanlabel = XXXX[0];
            if (mabanlabel.equals(mabanbutton)) {
                MaHD.setName(XXXX[1]);
            }
        }
        this.loadlaiban();
        this.loadHDCT();
        get.setVisible(true);
        return null;
    }
}
