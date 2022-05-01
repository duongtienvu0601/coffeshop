package quanly;

import DAO.LoaiMonDAO;
import DAO.ThucDonDAO;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Model.LoaiMon;
import Model.ThucDon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class SanPhamJFrame extends javax.swing.JFrame {

    public SanPhamJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        loadlist();
        loadtablemon();
        loadhinhlblbanner();
    }
    //LOAD DANH MỤC LOẠI MÓN LÊN LIST
    LoaiMonDAO lmdao = new LoaiMonDAO();
    ThucDonDAO dao = new ThucDonDAO();
    int index = 0;
    String itemlistcbo = "";

    void loadhinhlblbanner() {
        loadhinhlblguita();
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "bannercf.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblbanner.getWidth(), lblbanner.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblbanner.setIcon(imageIcon);
    }

    void loadhinhlblguita() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "guita.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblguita.getWidth(), lblguita.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblguita.setIcon(imageIcon);
    }

    void loadlist() {
        DefaultListModel model = new DefaultListModel();
        try {
            itemlistcbo = "";
            List<LoaiMon> list = lmdao.select();
            cboDMM.removeAllItems();
            for (LoaiMon nv : list) {
                model.addElement(nv.getTenLoaiMon() + "                                                           -" + nv.getMaLoaiMon());
                cboDMM.addItem(nv.getTenLoaiMon() + "                                                           -" + nv.getMaLoaiMon());
                itemlistcbo += nv.getTenLoaiMon() + "                                                           -" + nv.getMaLoaiMon() + "chiakey";
            }
            listmon.setModel(model);
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void editlistmon() {
        String manv = (String) listmon.getSelectedValue();

        String[] key = manv.split("-");
        DefaultTableModel modelbang = (DefaultTableModel) tblMon.getModel();
        modelbang.setRowCount(0);
        try {

            LoaiMon model = lmdao.findById(key[1]);
            if (model != null) {
                this.setModellistmon(model);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        try {

            List<ThucDon> list = td.findByIdThucDon(key[1]);
            for (ThucDon nv : list) {
                Object[] row = {
                    nv.getMaMon(),
                    nv.getTenMon(),
                    nv.getGia(),
                    nv.getMaLoaiMon(),
                    nv.getHinh()
                };
                modelbang.addRow(row);

            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
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

    void setModellistmon(LoaiMon model) {
        txtMaLM.setText(model.getMaLoaiMon());
        txtTenLoaiMon.setText(model.getTenLoaiMon());

    }
//Thêm Danh Mục Thực Đơn

    void insertDMM() {
        LoaiMon model = getModelLoaiMon();

        try {
            lmdao.insert(model);
            this.loadlist();
            alert("Thêm mới thành công!");
            clear();

        } catch (Exception e) {
            alert("Mã Món Này Đã Có! Hãy Dùng Mã Khác!");

        }
    }

    //Sửa Danh Mục Thực Đơn
    void updateDMM() {
        LoaiMon model = getModelLoaiMon();

        try {
            lmdao.update(model);
            this.loadlist();
            alert("Cập nhật thành công!");
            clear();

        } catch (Exception e) {
            alert("Cập nhật thất bại");

        }
    }

    //Xóa Danh Mục Thực Đơn
    void deleteDMM() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa loại món này?")) {
            String manv = txtMaLM.getText();
            try {
                lmdao.delete(manv);
                this.loadlist();
                alert("Xóa thành công!");
                clear();

            } catch (Exception e) {
                alert("Xóa Thất bại.");
            }
        }
    }

    LoaiMon getModelLoaiMon() {
        LoaiMon model = new LoaiMon();
        model.setMaLoaiMon(txtMaLM.getText());
        model.setTenLoaiMon(txtTenLoaiMon.getText());
        return model;

    }
    //LOAD MÓN LÊN BẢNG
    ThucDonDAO td = new ThucDonDAO();

    void loadtablemon() {
        DefaultTableModel model = (DefaultTableModel) tblMon.getModel();
        model.setRowCount(0);
        try {
            List<ThucDon> list = td.select();
            for (ThucDon nv : list) {
                String hinh = "";
                if (nv.getHinh().equals("")) {
                    hinh = "Không có hình";
                } else {
                    hinh = "Đã có hình";
                }
                Object[] row = {
                    nv.getMaMon(),
                    nv.getTenMon(),
                    nv.getGia(),
                    nv.getMaLoaiMon(),
                    hinh
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            alert("Lỗi truy vấn dữ liệu!");
        }
    }

    void setModelThucDon(ThucDon model) {

        double dongia = model.getGia();
        String don = String.valueOf(dongia);
        txtTenMon.setText(model.getTenMon());
        txtMaMon.setText(model.getMaMon());
        txtDonGia.setText(don);
        if (model.getHinh() != null) {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("logos", model.getHinh()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            lblHinh.setIcon(imageIcon);
            lblHinh.setToolTipText(model.getHinh());
        } else {
            lblHinh.setIcon(null);
        }
        String[] key = itemlistcbo.split("chiakey");
        for (int i = 0; i < key.length; i++) {
            if (key[i].indexOf(model.getMaLoaiMon()) != -1) {
                cboDMM.setSelectedItem(key[i]);
            }
        }

    }

    ThucDon getModelThucDon() {
        ThucDon model = new ThucDon();
        String key = (String) cboDMM.getSelectedItem();
        String[] keys = key.split("-");
        model.setMaMon(txtMaMon.getText());
        model.setTenMon(txtTenMon.getText());
        model.setHinh(lblHinh.getToolTipText());
        model.setGia(Float.valueOf(txtDonGia.getText()));
        model.setMaLoaiMon(keys[1]);
        return model;

    }
    //Thêm Thực Đơn

    void insertmon() {
        ThucDon model = getModelThucDon();
        try {
            td.insert(model);
            this.loadtablemon();
            alert("Thêm mới thành công!");
            clear();
        } catch (Exception e) {
            alert("Mã Món Này Đã Có, Vui Lòng Nhập Mã Khác!");

        }
    }

    //Chỉnh sửa Thực Đơn
    void updateMon() {
        ThucDon model = getModelThucDon();

        try {
            td.update(model);
            this.loadtablemon();
            alert("Cập nhật thành công!");
            clear();

        } catch (Exception e) {
            alert("Cập nhật thất bại");

        }
    }

    //Xóa Món
    void deleteMon() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa món này?")) {
            String manv = txtMaMon.getText();
            try {
                td.delete(manv);
                this.loadtablemon();
                alert("Xóa thành công!");
                clear();

            } catch (Exception e) {
                alert("Xóa Thất bại.");
            }
        }
    }

    void editMon() {
        try {
            String manv = (String) tblMon.getValueAt(this.index, 0);
            ThucDon model = td.findById(manv);
            if (model != null) {
                this.setModelThucDon(model);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        txtMaMon.setText("");
        cboDMM.setSelectedIndex(0);
        txtTenMon.setText("");
        txtDonGia.setText("");

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelThucdon = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listmon = new javax.swing.JList<>();
        txtMaLM = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTenLoaiMon = new javax.swing.JTextField();
        btnInsert1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        lblguita = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMon = new javax.swing.JTable();
        txtTenMon = new javax.swing.JTextField();
        txtMaMon = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        cboDMM = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        btnUpImages = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblbanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 52));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sản phẩm");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("<---Trở lại");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(559, 559, 559)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose))
                .addGap(745, 745, 745))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 710));

        PanelThucdon.setBackground(new java.awt.Color(248, 148, 6));

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH MỤC LOẠI MÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(204, 102, 0))); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listmon.setBackground(new java.awt.Color(102, 51, 0));
        listmon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        listmon.setForeground(java.awt.Color.white);
        listmon.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        listmon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listmonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listmon);

        jLabel22.setText("Mã Loại Món");

        jLabel23.setText("Tên Loại Món");

        btnInsert1.setBackground(new java.awt.Color(34, 167, 240));
        btnInsert1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert1.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert1.setText("Thêm");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        btnUpdate1.setBackground(new java.awt.Color(34, 167, 240));
        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Sửa");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(242, 38, 19));
        btnDelete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Xóa");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        lblguita.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnInsert1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMaLM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblguita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(lblguita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMaLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtTenLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert1)
                    .addComponent(btnUpdate1)
                    .addComponent(btnDelete1))
                .addGap(15, 15, 15))
        );

        jPanel7.setBackground(new java.awt.Color(44, 62, 80));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SẢN PHẨM-MÓN ĂN-NƯỚC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 0, 51));

        tblMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Món", "Tên Món", "Đơn Giá", "Mã Loại Món", "Thông Tin Hình"
            }
        ));
        tblMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblMon);

        jLabel26.setText("Danh mục:");

        jLabel27.setText("Mã Món:");

        jLabel24.setText("Tên Món:");

        jLabel28.setText("Đơn giá:");

        cboDMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInsert.setBackground(new java.awt.Color(34, 167, 240));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

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

        btnUpdate.setBackground(new java.awt.Color(34, 167, 240));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnUpImages.setBackground(new java.awt.Color(34, 167, 240));
        btnUpImages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpImages.setForeground(new java.awt.Color(255, 255, 255));
        btnUpImages.setText("Chọn Ảnh");
        btnUpImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpImagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpImages, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnUpImages, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenMon)
                                    .addComponent(txtDonGia)
                                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboDMM, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cboDMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(lblbanner, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblbanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelThucdonLayout = new javax.swing.GroupLayout(PanelThucdon);
        PanelThucdon.setLayout(PanelThucdonLayout);
        PanelThucdonLayout.setHorizontalGroup(
            PanelThucdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThucdonLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelThucdonLayout.setVerticalGroup(
            PanelThucdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelThucdonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelThucdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(PanelThucdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PanelThucdon, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnUpImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpImagesActionPerformed
        // TODO add your handling code here:
        selectImage();
    }//GEN-LAST:event_btnUpImagesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");
        } else if (ShareHelper.USER.getVaiTro() == true) {
            checkdau();
            if (ch == true) {
                alert("Vui lòng không nhập ký tự \"-\" vào mục tên");
            } else {
                updateMon();
            }
        } else if (ShareHelper.USER.getVaiTro() == false) {
            alert("Chỉ có admin mới có thể sử dụng");
        }
        ch = false;         // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
        loadlist();
        loadtablemon();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");

        } else if (ShareHelper.USER.getVaiTro() == true || ShareHelper.USER.getViTri() == true) {
            checkdau();
            if (ch == true) {
                alert("Vui lòng không nhập ký tự \"-\" vào mục tên");
            } else {
                insertmon();
            }
        } else {
            alert("Bạn không đủ quyền để thêm mới!");
        }
        ch = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonMouseClicked
        if (evt.getClickCount() == 1) {
            this.index = tblMon.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                editMon();
            }
        }                // TODO add your handling code here:
    }//GEN-LAST:event_tblMonMouseClicked

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");
        } else if (ShareHelper.USER.getVaiTro() == true) {
            if (ch == true) {
                alert("Vui lòng không nhập ký tự \"-\" vào mục tên");
            } else {
                updateDMM();
            }
        } else if (ShareHelper.USER.getVaiTro() == false) {
            alert("Chỉ có admin mới có thể sử dụng");
        }
        ch = false;   // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1ActionPerformed
    boolean ch = false;

    void checkdau() {
        String ten = txtTenLoaiMon.getText();
        String tenkv = txtTenMon.getText();
        if (ten.length() > 0) {
            for (int i = 0; i < ten.length(); i++) {
                if (ten.substring(i, i + 1).equals("-")) {
                    ch = true;
                }

            }
        }
        if (tenkv.length() > 0) {
            for (int i = 0; i < tenkv.length(); i++) {
                if (tenkv.substring(i, i + 1).equals("-")) {
                    ch = true;
                }

            }
        }
    }
    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");

        } else if (ShareHelper.USER.getVaiTro() == true || ShareHelper.USER.getViTri() == true) {
            checkdau();
            if (ch == true) {
                alert("Vui lòng không nhập ký tự \"-\" vào mục tên");
            } else {
                insertDMM();
            }

        } else {
            alert("Bạn không đủ quyền để thêm mới!");
        }
        ch = false;
// TODO add your handling code here:
    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void listmonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listmonMouseClicked

        editlistmon();

        // TODO add your handling code here:
    }//GEN-LAST:event_listmonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        MainJFrame sp = new MainJFrame();
        sp.setVisible(true);
        sp.pack();
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");
        } else if (ShareHelper.USER.getVaiTro() == true) {
            deleteDMM();
        } else if (ShareHelper.USER.getVaiTro() == false) {
            alert("Chỉ có admin mới có thể sử dụng");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");
        } else if (ShareHelper.USER.getVaiTro() == true) {
            deleteMon();
        } else if (ShareHelper.USER.getVaiTro() == false) {
            alert("Chỉ có admin mới có thể sử dụng");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThucdon;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnUpImages;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cboDMM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblbanner;
    private javax.swing.JLabel lblguita;
    private javax.swing.JList<String> listmon;
    private javax.swing.JTable tblMon;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaLM;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtTenLoaiMon;
    private javax.swing.JTextField txtTenMon;
    // End of variables declaration//GEN-END:variables

}
