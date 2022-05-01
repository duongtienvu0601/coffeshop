package quanly;

import DAO.NhanVienDAO;
import Helper.DateHelper;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Model.NhanVien;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class NhanVienJFrame extends javax.swing.JFrame {

    public NhanVienJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        load1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNgayLam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        lblthongbao = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblHinh = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        cboViTri = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Hồ sơ nhân viên");

        txtMaNV.setBackground(new java.awt.Color(108, 122, 137));
        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(228, 241, 254));

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Mật khẩu", "Tên", "Hình", "CMND", "Đỉa chỉ", "Điện thoại", "Ngày sinh", "Ngày vào làm", "Vai Trò", "Vị Trí"
            }
        ));
        tblGridView.setInheritsPopupMenu(true);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Cập nhật thông tin nhân viên");

        jLabel1.setText("*Mã Nhân Viên");

        jLabel6.setText("*Số Điện Thoại:");

        txtDienThoai.setBackground(new java.awt.Color(108, 122, 137));
        txtDienThoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDienThoai.setForeground(new java.awt.Color(228, 241, 254));

        jLabel7.setText("Ngày Vào Làm");

        txtNgayLam.setBackground(new java.awt.Color(108, 122, 137));
        txtNgayLam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayLam.setForeground(new java.awt.Color(228, 241, 254));

        jLabel8.setText("Số CMND");

        txtCMND.setBackground(new java.awt.Color(108, 122, 137));
        txtCMND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCMND.setForeground(new java.awt.Color(228, 241, 254));

        lblthongbao.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblthongbao.setForeground(java.awt.Color.green);
        lblthongbao.setText("* Mã nhân viên là tên đăng nhập hệ thống.");
        lblthongbao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblthongbao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setText("Mật Khẩu Truy Cập");

        txtMatKhau.setBackground(new java.awt.Color(108, 122, 137));
        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(228, 241, 254));

        jLabel11.setText("*Tên Nhân Viên");

        txtTenNV.setBackground(new java.awt.Color(108, 122, 137));
        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenNV.setForeground(new java.awt.Color(228, 241, 254));

        jLabel12.setText("Ngày Sinh");

        txtNgaySinh.setBackground(new java.awt.Color(108, 122, 137));
        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgaySinh.setForeground(new java.awt.Color(228, 241, 254));

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel13.setText("*Địa Chỉ:");

        txtDiaChi.setBackground(new java.awt.Color(108, 122, 137));
        txtDiaChi.setColumns(20);
        txtDiaChi.setForeground(new java.awt.Color(228, 241, 254));
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        jLabel14.setText("Vị Trí Công Việc:");

        cboViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu Ngân", "Phục Vụ" }));

        btnClear.setBackground(new java.awt.Color(34, 167, 240));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Tạo Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(242, 38, 19));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(34, 167, 240));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(34, 167, 240));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(243, 243, 243)
                        .addComponent(lblthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(cboViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnUpdate)
                        .addGap(44, 44, 44)
                        .addComponent(btnClear)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(44, 44, 44)
                                .addComponent(txtNgayLam, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblthongbao)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNgayLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manager");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel3.setText("Trở về");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(585, 585, 585)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jLabelClose))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1376, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked
    Boolean ch = false;

    void check() {
        if (txtMaNV.getText().equals("")) {
            alert("Xin lỗi. Bạn không được bỏ trống Mã nhân viên.");
        } else if (txtCMND.getText().length() > 9) {
            alert("Chứng minh thư chỉ được nhập đúng 9 chữ số");
        } else {
            ch = true;
        }
    }
    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index = tblGridView.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                edit();
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    //load lên form nhân viên
    int index = 0;
    NhanVienDAO dao = new NhanVienDAO();
    String itemliscbo = "";

    void load1() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();

        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.select();
            for (NhanVien nv : list) {
                if (nv.getVaiTro() == true) {

                } else {
                    Object[] row = {
                        nv.getMaNV(),
                        nv.getPassword(),
                        nv.getTenNV(),
                        nv.getHinh(),
                        nv.getCMND(),
                        nv.getDiaChi(),
                        nv.getDienThoai(),
                        nv.getNgaySinh(),
                        nv.getNgayVaoLam(),
                        nv.getVaiTro() ? "Quản Lý" : "Nhân Viên",
                        nv.getViTri() ? "Thu Ngân" : "Phục Vụ",};
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            alert("Lỗi truy vấn dữ liệu!");
        }
    }

    void selectImage() {
        JFileChooser FileChooser = new JFileChooser();
        if (FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File file = FileChooser.getSelectedFile();
            if (ShareHelper.saveLogo(file)) {
                // Hiển thị hình lên form

                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("logos", file.getName()));
                    Image dimg = img.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(),
                            Image.SCALE_SMOOTH);
                    ImageIcon imageIcon = new ImageIcon(dimg);
                    lblHinh.setIcon(imageIcon);
                    lblHinh.setToolTipText(file.getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    //load lên text filed
    void edit() {
        try {
            String manv = (String) tblGridView.getValueAt(this.index, 0);
            NhanVien model = dao.findById(manv);
            if (model != null) {
                this.setModel(model);
            }
        } catch (Exception e) {
            alert("Lỗi truy vấn dữ liệu!");
        }
    }

    //Lấy dữ liệu từ bảng ra text filed
    void setModel(NhanVien model) {
        txtMaNV.setText(model.getMaNV());
        txtTenNV.setText(model.getTenNV());
        txtMatKhau.setText(model.getPassword());
        txtCMND.setText(model.getCMND());
        txtDiaChi.setText(model.getDiaChi());
        if (model.getViTri() == false) {
            cboViTri.setSelectedItem("Phục Vụ");
        } else {
            cboViTri.setSelectedItem("Thu Ngân");
        }
        txtDienThoai.setText(model.getDienThoai());
        txtNgaySinh.setText(DateHelper.toString(model.getNgaySinh()));
        txtNgayLam.setText(DateHelper.toString(model.getNgayVaoLam()));
        if (model.getHinh() != null) {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("logos", model.getHinh()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            lblHinh.setIcon(imageIcon);
        } else {
            lblHinh.setIcon(null);
        }
    }

    //Thêm nhân viên
    void insert() {
        NhanVien model = getModel();
        try {
            dao.insert(model);
            this.load1();
            alert("Thêm Nhân Viên Thành Công!");
            clear();
        } catch (Exception e) {
            alert("Mã Nhân Viên Đã Có! Hãy Dùng Mã Khác!");
        }
    }

    NhanVien getModel() {
        NhanVien model = new NhanVien();
        model.setMaNV(txtMaNV.getText());
        model.setPassword(txtMatKhau.getText());
        model.setTenNV(txtTenNV.getText());
        model.setHinh(lblHinh.getToolTipText());
        model.setCMND(txtCMND.getText());
        model.setDiaChi(txtDiaChi.getText());
        model.setDienThoai(txtDienThoai.getText());
        model.setNgaySinh(DateHelper.toDate(txtNgaySinh.getText()));
        model.setNgayVaoLam(DateHelper.toDate(txtNgayLam.getText()));
        boolean Vitri;
        String item = (String) cboViTri.getSelectedItem();
        if (item.equals("Thu Ngân")) {
            Vitri = true;
        } else {
            Vitri = false;
        }
        model.setViTri(Vitri);
        model.setVaiTro(false);
        return model;
    }
    //Xóa Nhân viên
    void clear() {

        txtMaNV.setText("");
        txtMatKhau.setText("");
        txtTenNV.setText("");
        txtCMND.setText("");
        lblHinh.setText("");
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtNgaySinh.setText("");
        txtNgayLam.setText("");
        cboViTri.setSelectedItem("Phục Vụ");
        lblHinh.setIcon(null);
        lblthongbao.setText("* Mã nhân viên là tên đăng nhập hệ thống.");
    }

    void delete() {
        if (DialogHelper.confirm(lblthongbao, "Bạn thực sự muốn xóa nhân viên này?")) {
            String manv = txtMaNV.getText();
            try {
                dao.delete(manv);
                this.load1();
                clear();
                alert("Cập Nhật Thành Công");

            } catch (Exception e) {
                alert("Cập Nhật Thất Bại");

            }
        }
    }
    //Cập nhật Nhân Viên
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

    void update() {
        NhanVien model = getModel();
        try {
            dao.update(model);
            this.load1();
            alert("Cập nhật thành công.");
        } catch (Exception e) {

            alert("Cập Nhật Thất Bại");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        selectImage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        check();
        if (ch == true) {
            insert();
        }
        ch = false;        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        check();
        if (ch == true) {
            update();
        }
        ch = false;      
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        MainJFrame sp = new MainJFrame();
        sp.setVisible(true);
        sp.pack();
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboViTri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblthongbao;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgayLam;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
