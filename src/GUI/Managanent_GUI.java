/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Admin
 */
public class Managanent_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Managanent_GUI
     */
    public Managanent_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("General Management");

        this.txt_quyen.setText(Login_GUI.chucvu_User);
        this.txt_quyen.setHorizontalAlignment(SwingConstants.CENTER);
        this.txt_quyen.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_NhanVien = new javax.swing.JButton();
        btn_CongNo = new javax.swing.JButton();
        btn_KhauPhanAn = new javax.swing.JButton();
        btn_DiemDanh = new javax.swing.JButton();
        btn_dangXuat = new javax.swing.JButton();
        txt_quyen = new javax.swing.JTextField();
        btn_chat = new javax.swing.JButton();
        btn_move_kysohoadon = new javax.swing.JButton();
        btn_TaoDeThi = new javax.swing.JButton();
        btn_move_xacminhchuky = new javax.swing.JButton();
        btn_thiOnline = new javax.swing.JButton();
        btn_move_taokhoakyso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Chung");

        btn_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Account_50px.png"))); // NOI18N
        btn_NhanVien.setText("Quản lý nhân viên");
        btn_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVienActionPerformed(evt);
            }
        });

        btn_CongNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_CongNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-money-bag-50.png"))); // NOI18N
        btn_CongNo.setText("Công Nợ");
        btn_CongNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CongNoActionPerformed(evt);
            }
        });

        btn_KhauPhanAn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_KhauPhanAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-restaurant-menu-50.png"))); // NOI18N
        btn_KhauPhanAn.setText("Khẩu Phần Ăn");
        btn_KhauPhanAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KhauPhanAnActionPerformed(evt);
            }
        });

        btn_DiemDanh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_DiemDanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafe.png"))); // NOI18N
        btn_DiemDanh.setText("Điểm Danh");
        btn_DiemDanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DiemDanhActionPerformed(evt);
            }
        });

        btn_dangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_dangXuat.setText("Đăng xuất");
        btn_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangXuatActionPerformed(evt);
            }
        });

        txt_quyen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_quyen.setForeground(new java.awt.Color(255, 0, 51));

        btn_chat.setText("LIÊN HỆ - PHẢN HỒI");
        btn_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chatActionPerformed(evt);
            }
        });

        btn_move_kysohoadon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_move_kysohoadon.setText("KÝ SỐ");
        btn_move_kysohoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_move_kysohoadonActionPerformed(evt);
            }
        });

        btn_TaoDeThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TaoDeThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-restaurant-menu-50.png"))); // NOI18N
        btn_TaoDeThi.setText("Tạo Đề Thi");
        btn_TaoDeThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoDeThiActionPerformed(evt);
            }
        });

        btn_move_xacminhchuky.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_move_xacminhchuky.setText("XÁC MINH CHỮ KÝ");
        btn_move_xacminhchuky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_move_xacminhchukyActionPerformed(evt);
            }
        });

        btn_thiOnline.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_thiOnline.setText("Thi Online");
        btn_thiOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thiOnlineActionPerformed(evt);
            }
        });

        btn_move_taokhoakyso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_move_taokhoakyso.setText("TẠO KHOÁ KÝ SỐ");
        btn_move_taokhoakyso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_move_taokhoakysoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_dangXuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_DiemDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_KhauPhanAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_CongNo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_thiOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_TaoDeThi, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_move_xacminhchuky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_move_kysohoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_move_taokhoakyso, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_dangXuat)))
                .addGap(12, 12, 12)
                .addComponent(btn_chat)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_DiemDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_KhauPhanAn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_thiOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_CongNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_TaoDeThi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_move_taokhoakyso)
                                .addGap(15, 15, 15)
                                .addComponent(btn_move_kysohoadon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_move_xacminhchuky)
                                .addGap(7, 7, 7)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVienActionPerformed
        // TODO add your handling code here:        
        this.txt_quyen.setText(Login_GUI.chucvu_User);
        NhanVien_GUI ui_nhanvien = new NhanVien_GUI();
        ui_nhanvien.setVisible(true);
        dispose();
//        String tenchucvu = txt_quyen.getText();
//        if ("Quan Tri He Thong".equals(tenchucvu)) {
//            NhanVien_GUI ui_nhanvien = new NhanVien_GUI();
//            ui_nhanvien.setVisible(true);
//            dispose();
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để coi thông tin này");
//        }
    }//GEN-LAST:event_btn_NhanVienActionPerformed

    private void btn_CongNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CongNoActionPerformed
        this.txt_quyen.setText(Login_GUI.chucvu_User);

        String tenchucvu = txt_quyen.getText();
        if ("Nhan Vien Thu Ngan".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu)) {
            CongNo_GUI ui_congno = new CongNo_GUI();
            ui_congno.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để coi thông tin này");
        }
    }//GEN-LAST:event_btn_CongNoActionPerformed

    private void btn_KhauPhanAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KhauPhanAnActionPerformed
        // TODO add your handling code here:
        this.txt_quyen.setText(Login_GUI.chucvu_User);
        String tenchucvu = txt_quyen.getText();

        String kitu_User = Login_GUI.kitu_User;
        System.out.println("Chuc vu: " + kitu_User);
        if ("Quan Ly".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu) || "HS".equals(kitu_User)) {
            if ("Quan Ly".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu)) {
                frm_QuanLi_KPA QuanLi = new frm_QuanLi_KPA();
                QuanLi.setVisible(true);
                dispose();
            }
            if ("HS".equals(kitu_User)) {
                frm_HocSinh_KPA HocSinh_KPA = new frm_HocSinh_KPA();
                HocSinh_KPA.setVisible(true);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để coi thông tin này");
        }
    }//GEN-LAST:event_btn_KhauPhanAnActionPerformed

    private void btn_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangXuatActionPerformed
        // TODO add your handling code here:
//        Login_GUI qldn = new Login_GUI();
//        qldn.setVisible(true);
//        dispose();
        System.exit(0);
    }//GEN-LAST:event_btn_dangXuatActionPerformed

    private void btn_DiemDanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DiemDanhActionPerformed
        this.txt_quyen.setText(Login_GUI.chucvu_User);

        String tenchucvu = txt_quyen.getText();
        if ("Giao Vien".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu)) {
            frm_DiemDanh ui_diemdanh = new frm_DiemDanh();
            ui_diemdanh.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để coi thông tin này");
        }
    }//GEN-LAST:event_btn_DiemDanhActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        // TODO add your handling code here:
        chat_gui_nth Chat = new chat_gui_nth();
        Chat.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_chatActionPerformed

    private void btn_move_kysohoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_move_kysohoadonActionPerformed
        // TODO add your handling code here:       
        this.txt_quyen.setText(Login_GUI.chucvu_User);

        String tenchucvu = txt_quyen.getText();
        if ("Nhan Vien Thu Ngan".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu)) {
            v4_KySo ky = new v4_KySo();
            ky.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để thực thi chức năng này");
        }
    }//GEN-LAST:event_btn_move_kysohoadonActionPerformed

    private void btn_TaoDeThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoDeThiActionPerformed
        // TODO add your handling code here:        
        this.txt_quyen.setText(Login_GUI.chucvu_User);

        String tenchucvu = txt_quyen.getText();
        if ("Giao Vien".equals(tenchucvu) || "Quan Tri He Thong".equals(tenchucvu)) {
            frm_TaoDeThi tao_dethi = new frm_TaoDeThi();
            tao_dethi.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để thực thi chức năng này");
        }
    }//GEN-LAST:event_btn_TaoDeThiActionPerformed

    private void btn_move_xacminhchukyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_move_xacminhchukyActionPerformed
        // TODO add your handling code here:
        v4_XacMinh xm = new v4_XacMinh();
        xm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_move_xacminhchukyActionPerformed

    private void btn_thiOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thiOnlineActionPerformed
        // TODO add your handling code here:
        ThongTinThiOnline_GUI thiOnline = new ThongTinThiOnline_GUI();
        thiOnline.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_thiOnlineActionPerformed

    private void btn_move_taokhoakysoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_move_taokhoakysoActionPerformed
        // TODO add your handling code here:
        this.txt_quyen.setText(Login_GUI.chucvu_User);

        String tenchucvu = txt_quyen.getText();
        if ("Quan Tri He Thong".equals(tenchucvu)) {
            v4_TaoKhoa taokhoa = new v4_TaoKhoa();
            taokhoa.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn không đủ quyền hạn để thực thi chức năng này");
        }
    }//GEN-LAST:event_btn_move_taokhoakysoActionPerformed

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
            java.util.logging.Logger.getLogger(Managanent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managanent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managanent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managanent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managanent_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CongNo;
    private javax.swing.JButton btn_DiemDanh;
    private javax.swing.JButton btn_KhauPhanAn;
    private javax.swing.JButton btn_NhanVien;
    private javax.swing.JButton btn_TaoDeThi;
    private javax.swing.JButton btn_chat;
    private javax.swing.JButton btn_dangXuat;
    private javax.swing.JButton btn_move_kysohoadon;
    private javax.swing.JButton btn_move_taokhoakyso;
    private javax.swing.JButton btn_move_xacminhchuky;
    private javax.swing.JButton btn_thiOnline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_quyen;
    // End of variables declaration//GEN-END:variables
}
