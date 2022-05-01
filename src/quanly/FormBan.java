package quanly;

import DAO.BanDAO;
import DAO.HDCTDAO;
import DAO.HoaDonDAO;
import DAO.KhuvucDAO;
import DAO.LoaiMonDAO_ORDER;
import DAO.MonDAO_ORDER;
import Helper.DateHelper;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Model.Ban;
import Model.HDCT;
import Model.HoaDon;
import Model.Khuvuc;
import Model.LoaiMon;
import Model.Mon;
import java.awt.Color;
import java.awt.Desktop;
import static java.awt.Frame.DEFAULT_CURSOR;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class FormBan extends javax.swing.JFrame {

    public FormBan() {
        initComponents();
        loadtablbanorder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btndatban = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Menuorder = new javax.swing.JPanel();
        tabs2 = new javax.swing.JTabbedPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnorder = new javax.swing.JButton();
        lblten = new javax.swing.JTextField();
        lblgia = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmahoadon = new javax.swing.JTextField();
        txtban = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtmaban = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblchitietban = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbltongtien = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtgio = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnxembill = new javax.swing.JButton();
        btnthanhtoan = new javax.swing.JButton();
        btnchuyenban = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(44, 62, 80));
        jPanel13.setForeground(new java.awt.Color(44, 62, 80));
        jPanel13.setPreferredSize(new java.awt.Dimension(1370, 780));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(248, 148, 6));
        jPanel3.setPreferredSize(new java.awt.Dimension(1368, 780));

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("<---Trở lại ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản lý bán hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(455, 455, 455)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClose))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(482, 671));
        jPanel2.setMinimumSize(new java.awt.Dimension(482, 671));

        tab.setBackground(new java.awt.Color(44, 62, 80));
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab.setMaximumSize(new java.awt.Dimension(32767, 548));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Thông tin bàn");

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

        jButton3.setBackground(new java.awt.Color(34, 167, 240));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        btndatban.setBackground(new java.awt.Color(34, 167, 240));
        btndatban.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndatban.setForeground(new java.awt.Color(255, 255, 255));
        btndatban.setText("Đặt bàn");
        btndatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatbanActionPerformed(evt);
            }
        });
        jPanel4.add(btndatban);

        jButton4.setBackground(new java.awt.Color(34, 167, 240));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Làm mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);

        jButton7.setBackground(new java.awt.Color(34, 167, 240));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Page Facebook Hỗ Trợ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menuorder.setBackground(new java.awt.Color(44, 62, 80));
        Menuorder.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabs2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Loại sản phẩm");

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

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Mô tả sản phẩm");

        lblHinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHinh.setForeground(new java.awt.Color(236, 240, 241));

        jPanel9.setBackground(new java.awt.Color(44, 62, 80));

        btnorder.setBackground(new java.awt.Color(34, 167, 240));
        btnorder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnorder.setForeground(new java.awt.Color(255, 255, 255));
        btnorder.setText("ODER");
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });

        lblgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblgiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblten, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnorder)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(lblgia))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Tìm nhanh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(2, 2, 2))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuorderLayout = new javax.swing.GroupLayout(Menuorder);
        Menuorder.setLayout(MenuorderLayout);
        MenuorderLayout.setHorizontalGroup(
            MenuorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuorderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addComponent(tabs2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuorderLayout.setVerticalGroup(
            MenuorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(tabs2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(44, 62, 80));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 524));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Mã hóa đơn:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Đang Chọn :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Ngày");

        txtmahoadon.setBackground(new java.awt.Color(108, 122, 137));
        txtmahoadon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmahoadon.setForeground(new java.awt.Color(228, 241, 254));
        txtmahoadon.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtmahoadonInputMethodTextChanged(evt);
            }
        });

        txtban.setBackground(new java.awt.Color(108, 122, 137));
        txtban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtban.setForeground(new java.awt.Color(228, 241, 254));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Mã Bàn :");

        txtmaban.setBackground(new java.awt.Color(108, 122, 137));
        txtmaban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmaban.setForeground(new java.awt.Color(228, 241, 254));

        txtNgay.setBackground(new java.awt.Color(108, 122, 137));
        txtNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgay.setForeground(new java.awt.Color(228, 241, 254));

        tblchitietban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ HDCT", "MÃ MÓN", "TÊN MÓN", "GIÁ TIỀN", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        tblchitietban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchitietbanMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblchitietban);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("DANH SÁCH ORDER SẢN PHẨM");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Tổng tiền:");

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltongtien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltongtien.setForeground(java.awt.Color.red);
        lbltongtien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltongtien.setText("0");
        lbltongtien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltongtien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Vnđ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(236, 240, 241));
        jLabel16.setText("Giờ");

        txtgio.setBackground(new java.awt.Color(108, 122, 137));
        txtgio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtgio.setForeground(new java.awt.Color(228, 241, 254));

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));

        btnxembill.setBackground(new java.awt.Color(34, 167, 240));
        btnxembill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnxembill.setForeground(new java.awt.Color(255, 255, 255));
        btnxembill.setText("Xem bill");
        btnxembill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxembillActionPerformed(evt);
            }
        });

        btnthanhtoan.setBackground(new java.awt.Color(34, 167, 240));
        btnthanhtoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnthanhtoan.setForeground(new java.awt.Color(255, 255, 255));
        btnthanhtoan.setText("Thanh toán");
        btnthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthanhtoanActionPerformed(evt);
            }
        });

        btnchuyenban.setBackground(new java.awt.Color(34, 167, 240));
        btnchuyenban.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnchuyenban.setForeground(new java.awt.Color(255, 255, 255));
        btnchuyenban.setText("Chuyển bàn - Ghép bàn");
        btnchuyenban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyenbanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(btnchuyenban)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxembill, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchuyenban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxembill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmaban, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNgay)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(txtgio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtban, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtmaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(txtgio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Menuorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menuorder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1384, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int dong;

    void editMenu() {
        try {
            String manv = (String) tblOrder.getValueAt(this.dong, 0);
            Mon model = mondao1.findById(manv);
            if (model != null) {
                this.setModelMonorder(model);
            }
        } catch (Exception e) {

        }
    }

    HDCT getModelHDCT(String mamon) {
        int Soluong = 1;
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        List<HDCT> hd = hdao.select();
        int Mahdct = (hd.size()) + 1;
        String Mahdstr = "K" + Mahdct + "O" + day + month + year + hour + minute + second;
        cthd.setMaCTHD(Mahdstr);
        cthd.setMaHD_FK(MaHD.getName());
        cthd.setDonGia(Double.parseDouble(lblgia.getText()));
        cthd.setSoLuong(Soluong);
        cthd.setMaMon_FK(mamon);
        return cthd;
    }

    void setModelMonorder(Mon model) {
        lblHinh.setText(model.getTenMon());
        lblten.setText(model.getTenMon());
        lblten.setName(model.getMaMon());
        lblgia.setText("" + model.getGia());
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
        checksanpham();
        getModelHDCT(model.getMaMon());

    }
    HDCT cthd = new HDCT();
    void checksanpham() {
        HDCTDAO daohd = new HDCTDAO();
        try {
            List<HDCT> hd = daohd.check(txtmahoadon.getText(), lblten.getName());
            if (hd.size() >= 1) {
                btnorder.setEnabled(false);
            } else if (hd.size() <= 0) {
                btnorder.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println("lỗi" + txtmahoadon.getText());
        }
    }

    void loadHDCT() {
        DefaultTableModel model = (DefaultTableModel) tblchitietban.getModel();
        model.setRowCount(0);
        double Tongtien = 0;
        lbltongtien.setText(null);
        try {
            List<HDCT> list = hdao.select1(MaHD.getName());
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
                Tongtien += (nv.getDonGia() * nv.getSoLuong());
                model.addRow(row);
            }
            String tt = String.valueOf(Tongtien);
            String tt2 = tt.replace(".0", "");
            lbltongtien.setText(tt2);
        } catch (Exception e) {
            alert("Lỗi truy vấn dữ liệu!");
        }
    }
    trogiupban helpp;
    void trogiupban() {
        helpp = new trogiupban();
    }

    void lolcapnhat() {
        jPanel13.removeAll();
        jPanel13.add(jPanel3);
        jPanel13.repaint();
        jPanel13.revalidate();
    }

    void lolhome() {
        jPanel13.removeAll();
        jPanel13.add(jPanel3);
        jPanel13.repaint();
        jPanel13.revalidate();
    }

    void deleteorrder() {
        String mahdct = (String) tblchitietban.getValueAt(keyma, 0);
        try {
            hdct.delete(mahdct);
            alert("Xóa Sản Phẩm Thành Công");
            loadHDCT();
            lolhome();

        } catch (Exception e) {
            alert("Thao Tác Thất Bại");
            lolhome();
        }
    }
    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
//      jpancapnhat.setVisible(false);
//      lolhome();        
    }//GEN-LAST:event_jPanel13MouseClicked
    Odermon suamon;
    private void tblchitietbanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchitietbanMouseClicked
        int golfkey = tblchitietban.rowAtPoint(evt.getPoint());
        keyma = tblchitietban.rowAtPoint(evt.getPoint());
        String mahdct = (String) tblchitietban.getValueAt(golfkey, 0);
        String mamon = (String) tblchitietban.getValueAt(golfkey, 1);
        String tenmon = (String) tblchitietban.getValueAt(golfkey, 2);
        double giatien = (double) tblchitietban.getValueAt(golfkey, 3);
        int soluong = (int) tblchitietban.getValueAt(golfkey, 4);
        String mahd = txtmahoadon.getText();

        if (suamon != null) {
            suamon.dispose();
            suamon = new Odermon(this, mahdct, mamon, tenmon, giatien, soluong, mahd);
            suamon.setVisible(true);
        } else {
            suamon = new Odermon(this, mahdct, mamon, tenmon, giatien, soluong, mahd);
            suamon.setVisible(true);
        }
//        txttensp.setText(tenmon);
//        txtsoluongsp.setText(""+soluong);
//        txtgiasp.setText(""+giatien);
//        jpancapnhat.setVisible(true);
//        setLocationRelativeTo(null);
//        jPanel13.removeAll();
//        jPanel13.add(jpancapnhat);       
//        jPanel13.repaint();
//        jPanel13.revalidate();
    }//GEN-LAST:event_tblchitietbanMouseClicked

    private void txtmahoadonInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtmahoadonInputMethodTextChanged

    }//GEN-LAST:event_txtmahoadonInputMethodTextChanged

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        inserthdct();
        
    }//GEN-LAST:event_btnorderActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        if (evt.getClickCount() == 1) {
            this.dong = tblOrder.rowAtPoint(evt.getPoint());
            if (this.dong >= 0) {
                editMenu();
            }
        }            
    }//GEN-LAST:event_tblOrderMouseClicked

    private void tabs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabs2MouseClicked
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
    }//GEN-LAST:event_tabs2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadlaiban();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btndatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatbanActionPerformed
        insertHD();
        if (db == true) {
            btndatban.setEnabled(false);
            loadlaiban();
        }
    }//GEN-LAST:event_btndatbanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        trogiupban helpp = new trogiupban();
        helpp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void btnxembillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxembillActionPerformed
        ghihoadon();

    }//GEN-LAST:event_btnxembillActionPerformed

    private void btnthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthanhtoanActionPerformed
        updatehdon();
    }//GEN-LAST:event_btnthanhtoanActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        MainJFrame sp = new MainJFrame();
        sp.setVisible(true);
        sp.pack();
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    Chuyenban chuyen;
    private void btnchuyenbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyenbanActionPerformed
        String tenban = txtban.getText();
        String mahd = txtmahoadon.getText();
        String maban = txtmaban.getText();
        if (chuyen != null) {
            chuyen.dispose();
            chuyen = new Chuyenban(this, tenban, mahd, maban);
        } else {
            chuyen = new Chuyenban(this, tenban, mahd, maban);
        }
        chuyen.setVisible(true);
    }//GEN-LAST:event_btnchuyenbanActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /*try {
            Desktop.getDesktop().browse(new File("hotro.html").toURI());
        } catch (IOException ex) {
            alert("Không tìm thấy file hướng dẫn!");
            System.out.println(ex);
        }*/        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void lblgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblgiaActionPerformed
        
    }//GEN-LAST:event_lblgiaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        seacrch();
    }//GEN-LAST:event_jButton6ActionPerformed

    void seacrch() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        String ten = txtsearch.getText();
        List<Mon> monne = mondao1.selectByKeyword(ten);
        for (Mon mone : monne) {
            Object[] row = {
                mone.getMaMon(), mone.getTenMon(), mone.getGia()
            };
            model.addRow(row);
        }
    }
    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        seacrch();
    }//GEN-LAST:event_txtsearchKeyPressed
    void updatehdon() {
        DefaultTableModel model1 = (DefaultTableModel) tblchitietban.getModel();
        HoaDon model = getModelhoadon();
        try {
            HDdao1.update(model);
            btndatban.setEnabled(true);
            loadlaiban();
            alert("Đã Thanh Toán");
            Menuorder.setVisible(false);
            model1.setRowCount(0);
            double Tongtien = 0;
            lbltongtien.setText(null);
            try {
                List<HDCT> list = hdao.select1("TRỐNG");
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
                    Tongtien += (nv.getDonGia() * nv.getSoLuong());

                    model1.addRow(row);
                }
                String tt = String.valueOf(Tongtien);
                String tt2 = tt.replace(".0", "");
                lbltongtien.setText(tt2);
            } catch (Exception e) {
                alert("Lỗi truy vấn dữ liệu!");
            }
        } catch (Exception e) {
            alert("Lỗi!");
            e.printStackTrace();
            btndatban.setEnabled(false);
        }
    }

    void inserthdct() {
        try {
            if (cthd != null) {
                hdao.insert(cthd);
            } else {
                alert("Chưa chọn sản phẩm");
                return;
            }
            alert("Đã thêm!");
            this.loadHDCT();
            checksanpham();

        } catch (Exception e) {
            alert("Mã hóa đơn trống! hãy chọn lại bàn.");
            System.out.println(e);
        }
    }
    int keyma;
    HoaDon getModelhoadon() {
        try {
            String mahd = txtmahoadon.getText();
            HoaDon model = new HoaDon();
            model.setMaban(txtmaban.getText());
            //model.setManv(ShareHelper.USER.getMaNV());
            model.setManv(ShareHelper.USER.getMaNV());
            model.setMahd(mahd);
            model.setNgaylap(DateHelper.toDate(txtNgay.getText()));
            model.setTrangthai(false);
            model.setTongtien(Float.parseFloat(lbltongtien.getText()));
            return model;
        } catch (Exception e) {

        }
        return null;
    }

    HDCTDAO hdct = new HDCTDAO();
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

    void ghihoadon() {
        FileOutputStream fop = null;
        String thongtinchi = "__________________________________________________\r\n"
                + "Tên Món            Số lượng            Thành Tiền\r\n"
                + "--------------------------------------------------\r\n";
        DefaultTableModel model = (DefaultTableModel) tblchitietban.getModel();
        int a = model.getRowCount();
        for (int i = 0; i < a; i++) {
            String ten = (String) model.getValueAt(i, 2);
            if (ten.length() < 45) {
                for (int u = ten.length(); u < 45 - ten.length(); u++) {
                    ten += " ";
                }
            }
            Double gia = (Double) model.getValueAt(i, 3);
            int soluong = (int) model.getValueAt(i, 4);
            double thanhtien = (double) model.getValueAt(i, 5);
            thongtinchi += ten + "" + soluong + "                " + thanhtien + "\r\n";
            ;
        }
        File file;
        String content = "                HÓA ĐƠN THANH TOÁN\r\n"
                + "Ngày: " + txtNgay.getText() + "                  "
                + "Giờ: " + txtgio.getText() + "\r\n"
                + "Mã Hóa Đơn: " + txtmahoadon.getText() + " "
                + "Tiếp nhận: " + txtban.getText() + "\r\n"
                + "Nv Thu Ngân: " + ShareHelper.USER.getTenNV() + "\r\n"
                + "--------------------------------------------------\r\n"
                + "               THÔNG TIN THANH TOÁN\r\n"
                + thongtinchi + "\r\n" + ""
                + "Tổng Tiền: " + lbltongtien.getText() + " đồng."
                + "\r\n"
                + "-----------------CẢM ƠN QUÝ KHÁCH-----------------";
        try {

            file = new File("HOADON.txt");
            fop = new FileOutputStream(file);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            // get the content in bytes
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Desktop.getDesktop().browse(new File("HOADON.txt").toURI());
        } catch (IOException ex) {
            alert("Không tìm thấy file hướng dẫn!");
            System.out.println(ex);
        }
    }

//Load thông tin bàn và danh mục sản phẩm
    void loadtablbanorder() {
        btnchuyenban.setEnabled(false);
        btnxembill.setEnabled(false);
        btnthanhtoan.setEnabled(false);
        btnorder.setEnabled(false);
        txtNgay.setEnabled(false);
        txtgio.setEnabled(false);
        txtmaban.setEnabled(false);
        txtmahoadon.setEnabled(false);
        txtban.setEnabled(false);
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            public void actionPerformed(ActionEvent e) {
                txtgio.setText(format.format(new Date()));
                txtNgay.setText(date.format(new Date()));
            }
        }).start();
        btnorder.setEnabled(false);
        List<String> abc = new ArrayList<>();
        List<Ban> list = bandao1.select();
        try {
            List<Khuvuc> list1 = kvd1.select();
            List<LoaiMon> listloaimon = lmdaood.select();
            for (LoaiMon lm : listloaimon) {
                jplm = new JPanel();
                jplm.setName(lm.getTenLoaiMon());
                jplm.setBackground(new java.awt.Color(255, 255, 255));
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
                //listjp.get(i).setBackground(new java.awt.Color(255, 255, 255));
                listjp.get(i).setBackground(Color.DARK_GRAY);
                tab.add(listjp.get(i));
                tab.repaint();
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
        listlabel.removeAll(listlabel);
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
    Label MaHD = new Label();

    private void loadban(String maKV, String maBan1, JButton button) {
        Khuvuc model = kvd1.findById(maKV);
        lbltongtien.setText("0");
        txtban.setText(button.getText());
        txtmahoadon.setText("TRỐNG");
        Menuorder.setVisible(false);
        btndatban.setEnabled(true);
        btnorder.setEnabled(false);
        MaHD.setName(null);
        txtmaban.setText(maBan1);
        btnchuyenban.setEnabled(false);
        btnxembill.setEnabled(false);
        btnthanhtoan.setEnabled(false);
        for (int i = 0; i < listlabel.size(); i++) {
            String TTTT = listlabel.get(i).getName();
            String TTTT2 = button.getName();
            String[] XXXX2 = TTTT2.split("-");
            String[] XXXX = TTTT.split("-");
            String mabanbutton = XXXX2[1];
            String mabanlabel = XXXX[0];
            if (mabanlabel.equals(mabanbutton)) {
                MaHD.setName(XXXX[1]);
                txtmahoadon.setText(XXXX[1]);
                Menuorder.setVisible(true);
                btndatban.setEnabled(false);
                btnchuyenban.setEnabled(true);
                btnxembill.setEnabled(true);
                btnthanhtoan.setEnabled(true);
                this.loadHDCT();
            }
        }
        if (txtmahoadon.getText().equals("TRỐNG")) {
            MaHD.setText(null);
        } else {
            MaHD.setText(txtmahoadon.getText());
        }
        this.loadHDCT();
    }

    void closemenuorder(Boolean x) {
        txtmahoadon.setText("TRỐNG");
        Menuorder.setVisible(x);
    }
    help tb;

    void alert(String loi) {
        if (tb != null) {
            tb.setVisible(false);
            tb = new help(loi);
            tb.setVisible(true);
        } else {
            tb = new help(loi);
            tb.setVisible(true);
        }
    }
    boolean db = false;

    void insertHD() {
        HoaDon model = getModelHD();
        try {
            HDdao1.insert(model);
            btndatban.setEnabled(false);
            alert("Đặt bàn thành công!");
            db = true;
        } catch (Exception e) {
            db = false;
            alert("Bạn chưa chọn bàn!");
            btndatban.setEnabled(true);
        }
    }

    HoaDon getModelHD() {
        List<HoaDon> hd = HDdao1.select1();
        int mahd = (hd.size()) + 1;
        String Mahdstr = "HD" + mahd;
        HoaDon model = new HoaDon();
        model.setMahd(Mahdstr);
        model.setMaban(txtmaban.getText());
        model.setTrangthai(true);
        return model;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menuorder;
    private javax.swing.JButton btnchuyenban;
    private javax.swing.JButton btndatban;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.JButton btnxembill;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTextField lblgia;
    private javax.swing.JTextField lblten;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTabbedPane tabs2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblchitietban;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtban;
    private javax.swing.JTextField txtgio;
    private javax.swing.JTextField txtmaban;
    private javax.swing.JTextField txtmahoadon;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
