/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Untils.MsgBox;
import Untils.Xpassword;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author doanp
 */
public class XacthucFrame extends javax.swing.JFrame {

    /**
     * Creates new form XacthucFrame
     */
    NhanVien nhanVien;

    public XacthucFrame(NhanVien nv) {
        setUndecorated(true);
        initComponents();
        nhanVien = nv;
        init();
    }

    void init() {
        setSize(800, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(2);
    }

    boolean checkValidate() {
        if (txtMatKhauMoi.getText().trim().length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu mới!");
            txtMatKhauMoi.requestFocus();
            return false;
        } else if (!(txtMatKhauMoi.getText().trim().length() >= 6 && txtMatKhauMoi.getText().trim().length() <= 8)) {
            MsgBox.alert(this, "Mật khẩu chứa từ 6 đến 8 kí tự!");
            return false;
        } else if (txtXacThuc.getText().trim().length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu xác thực!");
            txtXacThuc.requestFocus();
            return false;
        } else if (!txtXacThuc.getText().trim().equals(txtMatKhauMoi.getText().trim())) {
            MsgBox.alert(this, "Mật khẩu xác thực không trùng khớp!");
            txtXacThuc.requestFocus();
            return false;
        }
        return true;
    }

    void thayDoi() {
        if (checkValidate()) {
            nhanVien.setMatKhau(txtXacThuc.getText().trim());
            new NhanVienDAO().update(nhanVien);
            MsgBox.alert(this, "Thay đổi mật khẩu thành công");
            dispose();
        }
    }

    void checkLevelPass() {
        if (txtMatKhauMoi.getText().trim().length() > 0) {
            String level = Xpassword.checkLevelPass(txtMatKhauMoi.getText().trim());
            lblCapDo.setText(level);
            switch (level) {
                case "Yếu":
                    lblCapDo.setForeground(Color.red);
                    break;
                case "Trung bình":
                    lblCapDo.setForeground(new Color(255, 128, 0));
                    break;
                case "Khá mạnh":
                    lblCapDo.setForeground(Color.blue);
                    break;
                case "Mạnh":
                    lblCapDo.setForeground(new Color(0, 153, 0));
                    break;
                default:
                    break;
            }
        } else {
            txtMatKhauMoi.setText("");
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
        lblCapDo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtXacThuc = new javax.swing.JTextField();
        txtMatKhauMoi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThayDoi = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lblBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lblCapDo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCapDo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblCapDo);
        lblCapDo.setBounds(330, 180, 60, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 83, 148));
        jLabel1.setText("THAY ĐỔI MẬT KHẨU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 390, 70);

        txtXacThuc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXacThucFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtXacThucFocusLost(evt);
            }
        });
        txtXacThuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtXacThucKeyReleased(evt);
            }
        });
        jPanel1.add(txtXacThuc);
        txtXacThuc.setBounds(80, 250, 320, 30);

        txtMatKhauMoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauMoiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauMoiFocusLost(evt);
            }
        });
        txtMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauMoiActionPerformed(evt);
            }
        });
        txtMatKhauMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhauMoiKeyReleased(evt);
            }
        });
        jPanel1.add(txtMatKhauMoi);
        txtMatKhauMoi.setBounds(80, 180, 320, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu mới");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 150, 140, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Xác thực mật khẩu mới");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 220, 190, 22);

        btnThayDoi.setBackground(new java.awt.Color(8, 83, 148));
        btnThayDoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThayDoi.setForeground(new java.awt.Color(255, 255, 255));
        btnThayDoi.setText("Thay đổi");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnThayDoi);
        btnThayDoi.setBounds(240, 300, 100, 30);

        btnHuy.setBackground(new java.awt.Color(8, 83, 148));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("HUỶ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(120, 300, 100, 30);

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fpw.jpg"))); // NOI18N
        jPanel1.add(lblBG);
        lblBG.setBounds(0, 0, 800, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtXacThucFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXacThucFocusGained

    }//GEN-LAST:event_txtXacThucFocusGained

    private void txtXacThucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXacThucFocusLost

    }//GEN-LAST:event_txtXacThucFocusLost

    private void txtXacThucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXacThucKeyReleased

    }//GEN-LAST:event_txtXacThucKeyReleased

    private void txtMatKhauMoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoiFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiFocusGained

    private void txtMatKhauMoiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauMoiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiFocusLost

    private void txtMatKhauMoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauMoiKeyReleased
        checkLevelPass();
    }//GEN-LAST:event_txtMatKhauMoiKeyReleased

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        if (txtMatKhauMoi.getText().trim() == "") {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu mới!");
        } else if (txtXacThuc.getText().trim() == "") {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập xác nhận mật khẩu!");
        } else {
            thayDoi();
        }
    }//GEN-LAST:event_btnThayDoiActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (MsgBox.confirm(this, "Bạn có chắc chắn muốn thoát?")) {
            dispose();
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    private void txtMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiActionPerformed

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
            java.util.logging.Logger.getLogger(XacthucFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XacthucFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XacthucFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XacthucFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new XacthucFrame(new NhanVien()).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblCapDo;
    private javax.swing.JTextField txtMatKhauMoi;
    private javax.swing.JTextField txtXacThuc;
    // End of variables declaration//GEN-END:variables
}