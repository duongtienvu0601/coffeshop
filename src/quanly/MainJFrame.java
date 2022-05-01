package quanly;

import Helper.ShareHelper;
import Model.NhanVien;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar.Separator;
import quanly.Doimatkhau;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        checkdangnhap();
    }

    void checkdangnhap() {
        if (!ShareHelper.authenticated()) {
            jPanel3.removeAll();
            jPanel3.setBackground(new java.awt.Color(44, 62, 80));
            cdn.setSize(1368, 780);
            setLocationRelativeTo(null);
            jPanel3.add(jPanel1);
            jPanel3.add(cdn);
            jPanel3.repaint();
            jPanel3.validate();
            lblheadder.setText("VUI LÒNG ĐĂNG NHẬP");
            loadhinhlblwellcom();
        } else {
            jPanel3.removeAll();
            jPanel3.setBackground(new java.awt.Color(44, 62, 80));
            jPanel3.add(jPanel1);
            lblheadder.setText("HOME");
            jPanel3.add(jPanel4);
            jPanel3.repaint();
            jPanel3.validate();
            main();
        }
    }

    void monhanvien() {
        NhanVienJFrame thongtin = new NhanVienJFrame();
        thongtin.setVisible(true);
        thongtin.pack();
        thongtin.setLocationRelativeTo(null);
        thongtin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    void loadhinhlblwellcom() {
        loadhinhlblwellcom2();
        loadhinhlblwellcom3();
        loadhinhlblwellcom4();
        loadhinhlblwellcom5();
        loadhinhlblwellcom6();
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "dau.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblwelcome.getWidth(), lblwelcome.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblwelcome.setIcon(imageIcon);
    }

    void loadhinhlblwellcom2() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "duoi.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblduoi.getWidth(), lblduoi.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblduoi.setIcon(imageIcon);
    }

    void loadhinhlblwellcom3() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "trai1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblduoi1.getWidth(), lblduoi1.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblduoi1.setIcon(imageIcon);
    }

    void loadhinhlblwellcom4() {
        lbldangnhap.setText(null);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "lbldangnhap.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lbldangnhap.getWidth(), lbldangnhap.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lbldangnhap.setIcon(imageIcon);
    }

    void loadhinhlblwellcom5() {
        BufferedImage img = null;
        loadhinhlblwellcom7();
        lblphai.setText(null);
        try {
            img = ImageIO.read(new File("logos", "phai.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblphai.getWidth(), lblphai.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblphai.setIcon(imageIcon);
    }

    void loadhinhlblwellcom7() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "giua.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblgiua.getWidth(), lblgiua.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblgiua.setIcon(imageIcon);
    }

    void loadhinhlblwellcom6() {
        lblthongtin.setText(null);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "lblthongtin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblthongtin.getWidth(), lblthongtin.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblthongtin.setIcon(imageIcon);
    }

    void main() {
        loadhinhlblnhanvien();
        loadhinhlblsanpham();
        loadhinhlblthongke();
        loadhinhlblthongtin();
        loadhinhlblkhonggianquan();
        loadhinhlblPOSbanhang();
    }

    void loadhinhlblPOSbanhang() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "Post.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblThucDon.getWidth(), lblThucDon.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblThucDon.setIcon(imageIcon);
    }

    void loadhinhlblkhonggianquan() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "Loft.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblKhoHang.getWidth(), lblKhoHang.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblKhoHang.setIcon(imageIcon);
    }

    void loadhinhlblthongtin() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "thongtin.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblThongTin.getWidth(), lblThongTin.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblThongTin.setIcon(imageIcon);
    }

    void loadhinhlblthongke() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "thongke.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblThongKe.getWidth(), lblThongKe.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblThongKe.setIcon(imageIcon);
    }

    void loadhinhlblsanpham() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "125-fall-in-love.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblSanPham.getWidth(), lblSanPham.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblSanPham.setIcon(imageIcon);
    }

    void loadhinhlblnhanvien() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logos", "employs.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblNhanVien.getWidth(), lblNhanVien.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblNhanVien.setIcon(imageIcon);
    }

    // Xử lý code
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

//    void LoadMainJFrame(){
//        if (ShareHelper.authenticated()) {
//            if (ShareHelper.USER.getVaiTro()==true) {
//                tksp = new ThongKeJFrame(index);
//                tksp.setVisible(true);
//            } else {
//                tksp.dispose();
//                tksp = new ThongKeJFrame(index);
//                tksp.setVisible(true);
//            }
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        lblheadder = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jpannhanvien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblThucDon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblKhoHang = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblThongTin = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btndmk = new javax.swing.JButton();
        btndx = new javax.swing.JButton();
        bntph = new javax.swing.JButton();
        cdn = new javax.swing.JPanel();
        lblwelcome = new javax.swing.JLabel();
        lblduoi = new javax.swing.JLabel();
        lblduoi1 = new javax.swing.JLabel();
        lblgiua = new javax.swing.JLabel();
        lblphai = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbldangnhap = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblthongtin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));

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

        lblheadder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblheadder.setForeground(new java.awt.Color(255, 255, 255));
        lblheadder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblheadder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblheadder, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(lblheadder, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabelClose)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 700));

        jpannhanvien.setBackground(new java.awt.Color(44, 62, 80));
        jpannhanvien.setForeground(new java.awt.Color(204, 0, 0));

        lblNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNhanVien.setMaximumSize(new java.awt.Dimension(267, 160));
        lblNhanVien.setMinimumSize(new java.awt.Dimension(267, 160));
        lblNhanVien.setPreferredSize(new java.awt.Dimension(267, 160));
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jpannhanvienLayout = new javax.swing.GroupLayout(jpannhanvien);
        jpannhanvien.setLayout(jpannhanvienLayout);
        jpannhanvienLayout.setHorizontalGroup(
            jpannhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannhanvienLayout.createSequentialGroup()
                .addGroup(jpannhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpannhanvienLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(jpannhanvienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpannhanvienLayout.setVerticalGroup(
            jpannhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(279, 172));

        lblSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("SẢN PHẨM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(279, 172));

        lblThucDon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblThucDon.setPreferredSize(new java.awt.Dimension(267, 160));
        lblThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThucDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThucDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThucDonMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("    BÁN HÀNG");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(59, 59, 59))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(44, 62, 80));
        jPanel7.setPreferredSize(new java.awt.Dimension(279, 172));

        lblKhoHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhoHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhoHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhoHangMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("KHÔNG GIAN QUÁN");
        jLabel11.setMaximumSize(new java.awt.Dimension(141, 29));
        jLabel11.setMinimumSize(new java.awt.Dimension(141, 29));
        jLabel11.setPreferredSize(new java.awt.Dimension(141, 29));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblKhoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));
        jPanel8.setPreferredSize(new java.awt.Dimension(279, 172));

        lblThongKe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongKeMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("THỐNG KÊ");
        jLabel13.setMaximumSize(new java.awt.Dimension(141, 29));
        jLabel13.setPreferredSize(new java.awt.Dimension(141, 29));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(44, 62, 80));
        jPanel9.setPreferredSize(new java.awt.Dimension(279, 172));

        lblThongTin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongTinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongTinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongTinMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("THÔNG TIN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jToolBar1.setBackground(new java.awt.Color(51, 51, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btndmk.setBackground(new java.awt.Color(34, 167, 240));
        btndmk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndmk.setForeground(new java.awt.Color(255, 255, 255));
        btndmk.setText("Đổi Mật Khẩu");
        btndmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndmkActionPerformed(evt);
            }
        });
        jToolBar1.add(btndmk);

        btndx.setBackground(new java.awt.Color(34, 167, 240));
        btndx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndx.setForeground(new java.awt.Color(255, 255, 255));
        btndx.setText("Đăng Xuất");
        btndx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndxActionPerformed(evt);
            }
        });
        jToolBar1.add(btndx);

        bntph.setBackground(new java.awt.Color(34, 167, 240));
        bntph.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntph.setForeground(new java.awt.Color(255, 255, 255));
        bntph.setText("Phản Hồi");
        bntph.setFocusable(false);
        bntph.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntph.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntphActionPerformed(evt);
            }
        });
        jToolBar1.add(bntph);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jpannhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(142, 142, 142)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpannhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        cdn.setPreferredSize(new java.awt.Dimension(1366, 700));

        lblwelcome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblwelcome.setMaximumSize(new java.awt.Dimension(267, 160));
        lblwelcome.setMinimumSize(new java.awt.Dimension(267, 160));
        lblwelcome.setPreferredSize(new java.awt.Dimension(267, 160));
        lblwelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblwelcomeMouseClicked(evt);
            }
        });

        lblduoi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblduoi1.setText("jLabel1");
        lblduoi1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblgiua.setText("jLabel1");
        lblgiua.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblphai.setText("jLabel2");
        lblphai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel10.setBackground(new java.awt.Color(44, 62, 80));

        lbldangnhap.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbldangnhap.setForeground(new java.awt.Color(0, 255, 0));
        lbldangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldangnhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldangnhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldangnhapMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbldangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbldangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(44, 62, 80));

        lblthongtin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(0, 255, 0));
        lblthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthongtin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblthongtinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblthongtinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblthongtin, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblthongtin, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cdnLayout = new javax.swing.GroupLayout(cdn);
        cdn.setLayout(cdnLayout);
        cdnLayout.setHorizontalGroup(
            cdnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdnLayout.createSequentialGroup()
                .addGroup(cdnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblduoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cdnLayout.createSequentialGroup()
                        .addComponent(lblduoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblphai, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cdnLayout.setVerticalGroup(
            cdnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cdnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblduoi1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lblphai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblgiua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblduoi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cdn, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(cdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn thoát");
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
       
        SanPhamJFrame sp = new SanPhamJFrame();
        sp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThucDonMouseClicked
        
        FormBan td = new FormBan();
        td.setVisible(true);
        td.pack();
        td.setLocationRelativeTo(null);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblThucDonMouseClicked

    private void lblKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhoHangMouseClicked
        
        quanlytable kho = new quanlytable();
        kho.setVisible(true);
        kho.pack();
        kho.setLocationRelativeTo(null);
        kho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblKhoHangMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
       
        thongke thongke = new thongke();
        thongke.setVisible(true);
        thongke.pack();
        thongke.setLocationRelativeTo(null);
        thongke.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongTinMouseClicked
        
        MainJFrame thongtin = new MainJFrame();
        thongtin.setVisible(true);
        thongtin.pack();
        thongtin.setLocationRelativeTo(null);
        thongtin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblThongTinMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        if (ShareHelper.USER == null) {
            alert("Vui lòng đăng nhập");
        } else if (ShareHelper.USER.getVaiTro() == true) {
            monhanvien();
        } else if (ShareHelper.USER.getVaiTro() == false) {
            alert("Chỉ có admin mới có thể sử dụng");
        }
       
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblwelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblwelcomeMouseClicked
        
    }//GEN-LAST:event_lblwelcomeMouseClicked

    private void lbldangnhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangnhapMouseEntered
        lbldangnhap.setIcon(null);
        lbldangnhap.setText("ĐĂNG NHẬP");
    }//GEN-LAST:event_lbldangnhapMouseEntered

    private void lbldangnhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangnhapMouseExited
        
        loadhinhlblwellcom4();
    }//GEN-LAST:event_lbldangnhapMouseExited

    private void lblthongtinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblthongtinMouseEntered
        lblthongtin.setIcon(null);
        lblthongtin.setText("THÔNG TIN");  
    }//GEN-LAST:event_lblthongtinMouseEntered

    private void lblthongtinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblthongtinMouseExited
        loadhinhlblwellcom6();     
    }//GEN-LAST:event_lblthongtinMouseExited

    private void lbldangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangnhapMouseClicked
        LoginForm sp = new LoginForm();
        sp.setVisible(true);
        sp.pack();
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();         
    }//GEN-LAST:event_lbldangnhapMouseClicked

    private void lblNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseEntered

        lblNhanVien.setLayout(new BorderLayout(10, 10));
        lblNhanVien.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));

    }//GEN-LAST:event_lblNhanVienMouseEntered

    private void lblNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseExited
        lblNhanVien.setLayout(null);
        lblNhanVien.setBorder(null);         
    }//GEN-LAST:event_lblNhanVienMouseExited

    private void btndmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndmkActionPerformed
        Doimatkhau dmk = new Doimatkhau();
        dmk.setVisible(true);
        //dmk.setLocation(null);
        //this.dispose();
    }//GEN-LAST:event_btndmkActionPerformed

    private void btndxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndxActionPerformed
        ShareHelper.logoff();
        if(!ShareHelper.authenticated()){
           LoginForm lg = new LoginForm();
                lg.setVisible(true);
                this.dispose();
        }
        //System.exit(0);
    }//GEN-LAST:event_btndxActionPerformed

    private void bntphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntphActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Hiện không có thông báo gì");
    }//GEN-LAST:event_bntphActionPerformed

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        lblSanPham.setLayout(new BorderLayout(10, 10));
        lblSanPham.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));
        
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        lblSanPham.setLayout(null);
        lblSanPham.setBorder(null);

    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseEntered
        lblThongKe.setLayout(new BorderLayout(10, 10));
        lblThongKe.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));        
    }//GEN-LAST:event_lblThongKeMouseEntered

    private void lblKhoHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhoHangMouseEntered
        lblKhoHang.setLayout(new BorderLayout(10, 10));
        lblKhoHang.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));        
    }//GEN-LAST:event_lblKhoHangMouseEntered

    private void lblThucDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThucDonMouseEntered
        lblThucDon.setLayout(new BorderLayout(10, 10));
        lblThucDon.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));       
    }//GEN-LAST:event_lblThucDonMouseEntered

    private void lblThongTinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongTinMouseEntered
        lblThongTin.setLayout(new BorderLayout(10, 10));
        lblThongTin.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));        
    }//GEN-LAST:event_lblThongTinMouseEntered

    private void lblThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseExited
        lblThongKe.setLayout(null);
        lblThongKe.setBorder(null);        
    }//GEN-LAST:event_lblThongKeMouseExited

    private void lblThongTinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongTinMouseExited
        lblThongTin.setLayout(null);
        lblThongTin.setBorder(null);        
    }//GEN-LAST:event_lblThongTinMouseExited

    private void lblKhoHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhoHangMouseExited
        lblKhoHang.setLayout(null);
        lblKhoHang.setBorder(null);        
    }//GEN-LAST:event_lblKhoHangMouseExited

    private void lblThucDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThucDonMouseExited
        lblThucDon.setLayout(null);
        lblThucDon.setBorder(null);        
    }//GEN-LAST:event_lblThucDonMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntph;
    private javax.swing.JButton btndmk;
    private javax.swing.JButton btndx;
    private javax.swing.JPanel cdn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel jpannhanvien;
    private javax.swing.JLabel lblKhoHang;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JLabel lblThucDon;
    private javax.swing.JLabel lbldangnhap;
    private javax.swing.JLabel lblduoi;
    private javax.swing.JLabel lblduoi1;
    private javax.swing.JLabel lblgiua;
    private javax.swing.JLabel lblheadder;
    private javax.swing.JLabel lblphai;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JLabel lblwelcome;
    // End of variables declaration//GEN-END:variables

    private void menuBar(MainJFrame aThis) {
        JMenuBar bar = new JMenuBar();
        JMenu File = new JMenu("Tùy Chọn");
        Separator sep = new Separator();
        JMenuItem item = new JMenuItem("Đăng Nhập", new ImageIcon("src/icon/lock.png"));
        JMenuItem item1 = new JMenuItem("Đổi mật khẩu", new ImageIcon("src/icon/key.png"));
        JMenuItem item2 = new JMenuItem("Thoát", new ImageIcon("src/icon/sign-out-option.png"));
        File.add(item);
        File.add(item1);
        File.add(sep);
        File.add(item2);
        bar.setSize(1366, 25);
        bar.add(File);

        jPanel4.add(bar);
        jPanel4.repaint();

        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginForm lg = new LoginForm();
                lg.setVisible(true);
                aThis.dispose();

            }
        });
    }

}
