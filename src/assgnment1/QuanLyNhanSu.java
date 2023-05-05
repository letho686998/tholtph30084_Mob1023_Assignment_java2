/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assgnment1;

import assgnment1.UHelper.Uheper;
import assgnment1.model.NhanVien;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class QuanLyNhanSu extends javax.swing.JFrame {

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    int index;

    public QuanLyNhanSu() {
        initComponents();
        setLocationRelativeTo(null);

        dongHo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTuoi = new javax.swing.JLabel();
        lblManhanvien = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        lblHovaten = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtManhanvien = new javax.swing.JTextField();
        txtHovaten = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrew = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblHienTai = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        lblTuoi.setText("Tuổi");

        lblManhanvien.setText("Mã nhân viên ");

        lblLuong.setText("Lương");

        lblHovaten.setText("Họ và tên");

        lblEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnFind)
                    .addComponent(btnOpen)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(204, 51, 255));
        lblDongHo.setText("10:22 AM");

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrew.setText("<<");
        btnPrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrewActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lblHienTai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHienTai.setForeground(new java.awt.Color(255, 0, 51));
        lblHienTai.setText("Record:1 of 10");

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ và tên", "Tuổi", "Email", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLuong)
                                    .addComponent(lblTuoi)
                                    .addComponent(lblHovaten)
                                    .addComponent(lblManhanvien)
                                    .addComponent(lblEmail))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHovaten)
                                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPrew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDongHo)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnPrew)
                            .addComponent(btnNext)
                            .addComponent(btnLast)
                            .addComponent(lblHienTai)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
    public void RemoveNhanVien() {
        try {
            if (listNhanVien.size() == 0) {
                JOptionPane.showMessageDialog(this, "Không còn dữ liệu để xóa");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            listNhanVien.remove(index);
            model.removeRow(index);

            if (listNhanVien.size() == 0) {
                clearForm();
            } else {
                if (listNhanVien.size() == index) {
                    index--;
                }
                showDetail();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi xóa dữ liệu ");
            e.printStackTrace();
        }
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtManhanvien.getText();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getManv().equalsIgnoreCase(id)) {
                index = i;
                RemoveNhanVien();
                clearForm();
                index = -1;
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên này");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        try {
            index = tblNhanVien.getSelectedRow();
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi click");
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            index = 0;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi di chuyển");
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            index = listNhanVien.size() - 1;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi di chuyển");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrewActionPerformed
        try {
            if (index > 0) {
                index--;
            }
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi di chuyển");
        }
    }//GEN-LAST:event_btnPrewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (index < listNhanVien.size() - 1) {
                index++;
            }
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi di chuyển");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtManhanvien.setText("");
        txtHovaten.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        // hiển thị vị trí hiện tại
        lblHienTai.setText("...");
        clearForm();
        index = -1;
        //tblNhanVien.clearSelection();// xoa vị trí đang chọ trên table

    }//GEN-LAST:event_btnNewActionPerformed
    public void addNhanVien() {
        try {
            //  Không để trống mã, không cho phép trùng mã nếu bổ sung mới.
//            if (txtManhanvien.getText().equalsIgnoreCase("")) {
//                JOptionPane.showMessageDialog(this, "Mã nhân viên không được trống");
//                txtManhanvien.requestFocus();
//                return;
//            }
            if (Uheper.checkRong(txtManhanvien, "Mã nhân viên không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtHovaten, "Họ tên không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtTuoi, "Tuổi không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtEmail, "Email không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtLuong, "Lương không được trống")) {
                return;
            }
            for (NhanVien nv : listNhanVien) {
//                if (nv.getManv().equalsIgnoreCase(txtManhanvien.getText())) {
//                    JOptionPane.showMessageDialog(this, "Trùng mã nhân viên, mời nhập mã khác");
//                    txtManhanvien.requestFocus();
//                    return;
//                }
                if (Uheper.checkTrungManv(txtManhanvien, "Trùng mã nhân viên, mời nhập mã khác", nv.getManv())) {
                    return;
                }
            }
//            int tuoi = Integer.parseInt(txtTuoi.getText());

            //o Tuổi phải từ 16 đến 55
//            if (tuoi < 16 || tuoi > 55) {
//                JOptionPane.showMessageDialog(this, "Tuổi phải nằm trong khoảng từ 16-55");
//                txtTuoi.requestFocus();
//                return;
//            }
            if (!Uheper.checkTuoi(txtTuoi, "Tuổi phải nằm trong khoảng từ 16-55")) {
                return;
            }
            double luong;
            try {
                luong = Double.parseDouble(txtLuong.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lương phải là số");
                return;
            }
            //o Lương phải trên 5 triệu

            if (luong < 5000000) {

                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 5 triệu");
                txtLuong.requestFocus();
                return;
            }
//            if (Uheper.checkLuong(txtLuong, "Lương phải lớn hơn 5 triệu")) {
//                return;
//            }
            //o Email phải đúng định dạng
            {
                if (Uheper.checkEmail(txtEmail, "Vui lòng nhập email đúng định dạng")) {
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Save dữ liệu thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Save");
            //e.printStackTrace();
        }
        String hoTen = txtHovaten.getText();
        String maNv = txtManhanvien.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        String email = txtEmail.getText();
        double luong = Double.parseDouble(txtLuong.getText());
        NhanVien nv = new NhanVien(maNv, hoTen, tuoi, email, luong);
        listNhanVien.add(nv);
        model.addRow(new Object[]{maNv, hoTen, tuoi, email, luong});
        index = listNhanVien.size() - 1;
        showDetail();
        clearForm();
    }

    public void updateNhanVien() {
        try {
            //  Không để trống mã, không cho phép trùng mã nếu bổ sung mới.
//            if (txtManhanvien.getText().equalsIgnoreCase("")) {
//                JOptionPane.showMessageDialog(this, "Mã nhân viên không được trống");
//                txtManhanvien.requestFocus();
//                return;
//            }
            if (Uheper.checkRong(txtManhanvien, "Mã nhân viên không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtHovaten, "Họ tên không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtTuoi, "Tuổi không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtEmail, "Email không được trống")) {
                return;
            }
            if (Uheper.checkRong(txtLuong, "Lương không được trống")) {
                return;
            }

            int tuoi = Integer.parseInt(txtTuoi.getText());
            //o Tuổi phải từ 16 đến 55
            if (tuoi < 16 || tuoi > 55) {
                JOptionPane.showMessageDialog(this, "Tuổi phải nằm trong khoảng từ 16-55");
                txtTuoi.requestFocus();
                return;
            }
            if (!Uheper.checkTuoi(txtTuoi, "Tuổi phải nằm trong khoảng từ 16-55")) {
                return;
            }

            //o Lương phải trên 5 triệu
            double luong = Double.parseDouble(txtLuong.getText());
            if (luong < 5000000) {
                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 5 triệu");
                txtLuong.requestFocus();
                return;
            }
            //o Email phải đúng định dạng
            if (Uheper.checkEmail(txtEmail, "Vui lòng nhập email đúng định dạng")) {
                return;
            }
            String hoTen = txtHovaten.getText();
            String maNv = txtManhanvien.getText();
            //int tuoi = Integer.parseInt(txtTuoi.getText());
            String email = txtEmail.getText();
            //double luong = Double.parseDouble(txtLuong.getText());
            NhanVien nv = new NhanVien(maNv, hoTen, tuoi, email, luong);
            index = tblNhanVien.getSelectedRow();
            //sửa vào list
            listNhanVien.set(index, nv);
            // thêm vào bảng
            model.setValueAt(maNv, index, 0);
            model.setValueAt(hoTen, index, 1);// giá trị của ô họ tên tại dòng đang đứng cột 0
            model.setValueAt(tuoi, index, 2);
            model.setValueAt(email, index, 3);
            model.setValueAt(luong, index, 4);

            //xử lý sau khi sửa
            showDetail();
            JOptionPane.showMessageDialog(this, "Update dữ liệu thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nút Update");
        }

    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (index == -1) {
            addNhanVien();
            return;
        } else {
            updateNhanVien();
        }

    }//GEN-LAST:event_btnSaveActionPerformed
    public void timNhanvien() {
        String id = txtManhanvien.getText();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getManv().equalsIgnoreCase(id)) {
                index = i;
                showDetail();
            }
        }

    }
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        timNhanvien();
        showDetail();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("txt.doc"));
            oos.writeObject(listNhanVien);
            oos.flush();
            oos.flush();
            oos.close();
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi file thành công");
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không");
            if (hoi == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ghi file thất bại");
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {
            listNhanVien.add(new NhanVien("001", "Lê Thị Hải", 30, "hailtph39972@gmail.com", 5000000));
            listNhanVien.add(new NhanVien("002", "Lê Thị Thùy", 25, "thuyltph19972@gmail.com", 4000000));
            listNhanVien.add(new NhanVien("003", "Lê Thị Thơ", 20, "tholtph18672@gmail.com", 7000000));
            model = (DefaultTableModel) tblNhanVien.getModel();
            fillToTable();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("txt.doc"));
            listNhanVien = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            ois.close();
            JOptionPane.showMessageDialog(this, "Đọc file thành công");
            if (listNhanVien.size() > 0) {
                index = 0;
                showDetail();
            } else if (listNhanVien.size() == 0) {
                clearForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi đọc file");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOpenActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHienTai;
    private javax.swing.JLabel lblHovaten;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblManhanvien;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHovaten;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManhanvien;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        model.setRowCount(0);
        for (NhanVien nv : listNhanVien) {
            model.addRow(new Object[]{nv.getManv(), nv.getHoTen(), nv.getTuoi(), nv.getEmail(), nv.getLuong()});
        }
    }

    private void showDetail() {
        NhanVien nv = listNhanVien.get(index);
        txtManhanvien.setText(nv.getManv());
        txtHovaten.setText(nv.getHoTen());
        txtTuoi.setText(nv.getTuoi() + "");
        txtEmail.setText(nv.getEmail());
        txtLuong.setText(nv.getLuong() + "");
        //Table chọn dòng vị trí
        tblNhanVien.setRowSelectionInterval(index, index);
        // hiển thị vị trí hiện tại
        lblHienTai.setText(index + 1 + "/" + listNhanVien.size());

    }

    private void clearForm() {
        txtManhanvien.setText("");
        txtHovaten.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        // hiển thị vị trí hiện tại
        lblHienTai.setText("");

    }

    private void dongHo() {
        Thread t = new Thread() {

            @Override
            public void run() {
                SimpleDateFormat spf = new SimpleDateFormat("hh:mm:ss aa");
                while (true) {
                    Date now = new Date();// tạo đói tượng của hệ thống
                    lblDongHo.setText(spf.format(now));// format lại theo mẫu =>hiển thị lên đồng hồ
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        };
        t.start();

    }
}
