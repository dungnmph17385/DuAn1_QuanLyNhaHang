/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.NhanVienDAO;
import Untils.Auth;
import Untils.MsgBox;
import Untils.Xpassword;
import java.awt.Color;

/**
 *
 * @author doanp
 */
public class IF_DoiMatKhau extends javax.swing.JInternalFrame {

    /**
     * Creates new form IF_DoiMatKhau
     */
    public IF_DoiMatKhau() {
        initComponents();
        init();
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
        jLabel2 = new javax.swing.JLabel();
        txtMatKhauHienTai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnDoi = new javax.swing.JButton();
        txtXacThuc = new javax.swing.JTextField();
        txtMatKhauMoi = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(241, 194, 50));
        jPanel1.setLayout(null);

        lblCapDo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCapDo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblCapDo);
        lblCapDo.setBounds(280, 183, 60, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("ĐỔI MẬT KHẨU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 279, 48);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mật khẩu hiện tại");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(55, 77, 150, 17);
        jPanel1.add(txtMatKhauHienTai);
        txtMatKhauHienTai.setBounds(55, 105, 296, 42);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu mới");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(55, 158, 130, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Xác nhận mật khẩu");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(55, 237, 140, 17);

        btnHuy.setBackground(new java.awt.Color(0, 51, 153));
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("HỦY");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(296, 318, 53, 23);

        btnDoi.setBackground(new java.awt.Color(0, 51, 153));
        btnDoi.setForeground(new java.awt.Color(255, 255, 255));
        btnDoi.setText("OK");
        btnDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoi);
        btnDoi.setBounds(226, 318, 60, 23);
        jPanel1.add(txtXacThuc);
        txtXacThuc.setBounds(55, 265, 296, 42);

        txtMatKhauMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhauMoiKeyReleased(evt);
            }
        });
        jPanel1.add(txtMatKhauMoi);
        txtMatKhauMoi.setBounds(55, 183, 296, 42);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (MsgBox.confirm(this, "Bạn có chắc chắc muốn thoát")) {
            dispose();
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiActionPerformed
        if (txtMatKhauHienTai.getText().trim() == "") {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu hiện tại!");
        } else if (txtMatKhauMoi.getText().trim() == "") {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu mới!");
        } else {
            doiMatKhau();
        }
    }//GEN-LAST:event_btnDoiActionPerformed

    private void txtMatKhauMoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauMoiKeyReleased
        checkLevelPass();
    }//GEN-LAST:event_txtMatKhauMoiKeyReleased
    void init() {
        setSize(394, 385);
        setTitle("ĐỔI MẬT KHẨU");
        setResizable(false);
        setDefaultCloseOperation(2);
        jPanel1.setBackground(new Color(Integer.parseInt(Auth.user.getMauNen(), 16)));
    }

    void checkLevelPass() {
        if (txtMatKhauMoi.getText().length() > 0) {
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

    boolean checkValidate() {
        if (txtMatKhauHienTai.getText().trim().length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu hiện tại!");
            txtMatKhauHienTai.requestFocus();
            return false;
        } else if (!txtMatKhauHienTai.getText().trim().equals(Auth.user.getMatKhau().trim())) {
            MsgBox.alert(this, "Mật khẩu hiện tại không chính xác!");
            txtMatKhauHienTai.requestFocus();
            return false;
        } else if (txtMatKhauMoi.getText().trim().length() == 0) {
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
        } else if (!txtMatKhauMoi.getText().trim().equals(txtXacThuc.getText().trim())) {
            MsgBox.alert(this, "Mật khẩu xác thực không chính xác!");
            txtXacThuc.requestFocus();
            return false;
        }
        return true;
    }

    void doiMatKhau() {
        if (checkValidate()) {
            Auth.user.setMatKhau(txtMatKhauMoi.getText().trim());
            new NhanVienDAO().update(Auth.user);
            MsgBox.alert(this, "Thay đổi mật khẩu thành công");
            resetForm();
            this.dispose();
        }
    }

    void resetForm() {
        txtMatKhauHienTai.setText("");
        txtMatKhauMoi.setText("");
        txtXacThuc.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoi;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCapDo;
    private javax.swing.JTextField txtMatKhauHienTai;
    private javax.swing.JTextField txtMatKhauMoi;
    private javax.swing.JTextField txtXacThuc;
    // End of variables declaration//GEN-END:variables
}
