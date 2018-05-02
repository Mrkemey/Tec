package Tecmail;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class VentAlum extends javax.swing.JFrame {

    /**
     * Creates new form VentAlum
     */
    public VentAlum() {
        initComponents();
        modelo=(DefaultTableModel) tblAlumno.getModel();       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNc = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtAP = new javax.swing.JTextField();
        txtAM = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        btnTodos = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnConf = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Num.Control");

        jLabel2.setText("Nombre(s):");

        jLabel3.setText("A. Paterno:");

        jLabel4.setText("A. Materno:");

        txtNc.setEditable(false);
        txtNc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNcKeyTyped(evt);
            }
        });

        txtNombres.setEditable(false);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtAP.setEditable(false);
        txtAP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPKeyTyped(evt);
            }
        });

        txtAM.setEditable(false);
        txtAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAMKeyTyped(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Correo Electronico:");

        txtEmail.setEditable(false);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. CONTROL", "NOMBRE(S)", "A. PATERNO", "A. MATERNO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(tblAlumno);

        btnTodos.setText("Mostrar");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnMod.setText("Modificar");
        btnMod.setEnabled(false);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnConf.setText("Confirmar");
        btnConf.setEnabled(false);
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });

        btnElim.setText("Eliminar");
        btnElim.setEnabled(false);
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAP)
                                        .addComponent(txtNc)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMod)
                                .addGap(235, 235, 235)
                                .addComponent(btnConf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnElim))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnNuevo)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnGuardar)
                                    .addGap(235, 235, 235)
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodos)
                    .addComponent(btnMod)
                    .addComponent(btnConf)
                    .addComponent(btnElim))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Funciones">
    private void clearField() {
        txtNc.setText("");
        txtNombres.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtEmail.setText("");
    }

    private void cField() {
        if (txtNc.isEditable()) {
            txtNc.setEditable(false);
        } else {
            txtNc.setEditable(true);
        }
        if (txtNombres.isEditable()) {
            txtNombres.setEditable(false);
        } else {
            txtNombres.setEditable(true);
        }
        if (txtAP.isEditable()) {
            txtAP.setEditable(false);
        } else {
            txtAP.setEditable(true);
        }
        if (txtAM.isEditable()) {
            txtAM.setEditable(false);
        } else {
            txtAM.setEditable(true);
        }
    }

    private void cButton() {
        if (btnNuevo.isEnabled()) {
            btnNuevo.setEnabled(false);
        } else {
            btnNuevo.setEnabled(true);
        }
        if (btnGuardar.isEnabled()) {
            btnGuardar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }
        if (btnCancelar.isEnabled()) {
            btnCancelar.setEnabled(false);
        } else {
            btnCancelar.setEnabled(true);
        }
        if (btnBuscar.isEnabled()) {
            btnBuscar.setEnabled(false);
        } else {
            btnBuscar.setEnabled(true);
        }

    }

    public void esBla() {
        if (txtNc.getText().equals("")) {
            txtNc.requestFocus();
            throw new E_mailExecption("Espacio en blanco");
        } else {
            if (txtNombres.getText().equals("")) {
                txtNombres.requestFocus();
                throw new E_mailExecption("Espacio en blanco");
            } else {
                if (txtAP.getText().equals("")) {
                    txtAP.requestFocus();
                    throw new E_mailExecption("Espacio en blanco");
                } else {
                    if (txtAM.getText().equals("")) {
                        txtAM.requestFocus();
                        throw new E_mailExecption("Espacio en blanco");
                    }
                }
            }
        }
    }

    private void llenarCampos(Alumno a) {
        this.txtNc.setText(a.getNc());
        this.txtNombres.setText(a.getNombres());
        this.txtAP.setText(a.getApaterno());
        this.txtAM.setText(a.getAmaterno());
        this.txtEmail.setText(a.getEmail());
    }

    public boolean espBla_boolean() {
        if (txtNc.getText().equals("")) {
            txtNc.requestFocus();
            throw new E_mailExecption("Espacio en blanco");
        } else {
            if (txtNombres.getText().equals("")) {
                txtNombres.requestFocus();
                throw new E_mailExecption("Espacio en blanco");
            } else {
                if (txtAP.getText().equals("")) {
                    txtAP.requestFocus();
                    throw new E_mailExecption("Espacio en blanco");
                } else {
                    if (txtAM.getText().equals("")) {
                        txtAM.requestFocus();
                        throw new E_mailExecption("Espacio en blanco");
                    }
                }
            }
        }
        return true;
    }

    private void tblReload() {
        FileInputStream fb;
        modelo.setRowCount(0);
        if (btnConf.isEnabled() != true) {
            btnMod.setEnabled(true);
        } else {
            cBtn_tbl();
        }
        tblAlumno.setEnabled(true);
        try {
            fb = new FileInputStream(Alumno.File);
            java.io.DataInputStream fdr = new java.io.DataInputStream(fb);
            Object O[] = new Object[5];
            while (true) {
                O[0] = fdr.readUTF();
                O[1] = fdr.readUTF();
                O[2] = fdr.readUTF();
                O[3] = fdr.readUTF();
                O[4] = fdr.readUTF();
                modelo.addRow(O);
            }

        } // <editor-fold defaultstate="collapsed" desc="Catches">
        catch (EOFException ex) {
            //editar, eliminar.
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        // </editor-fold >
    }

    private void editFalse() {
        txtNc.setEditable(false);
        txtNombres.setEditable(false);
        txtAP.setEditable(false);
        txtAM.setEditable(false);
    }

    private void cBtn_tbl() {
        if (btnMod.isEnabled()) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }
        if (btnConf.isEnabled()) {
            btnConf.setEnabled(false);
        } else {
            btnConf.setEnabled(true);
        }
        if (btnElim.isEnabled()) {
            btnElim.setEnabled(false);
        } else {
            btnElim.setEnabled(true);
        }
    }

    public void reload() {
        for (int i = 0; i < tblAlumno.getRowCount(); i++) {
            FileOutputStream writer;
            try {
                writer = new FileOutputStream(Alumno.File, false);
                writer.write(("").getBytes());
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Objetos">
    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (!btnConf.isEnabled()) {
            clearField();
            cField();
            cButton();
            txtNc.requestFocus();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            esBla();
        } catch (E_mailExecption e) {
            showMessageDialog(rootPane, e.getMessage());
            return;
        }
        Alumno a = new Alumno(txtNc.getText(), txtNombres.getText(), txtAP.getText(), txtAM.getText());
        a.save();
        clearField();
        cButton();
        cField();
        txtNc.requestFocus();

    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nc = showInputDialog(this, "Número de control a buscar");
        Alumno a = new Alumno();
        a.search(nc);
        llenarCampos(a);
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void txtNcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNcKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != '\b')) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNcKeyTyped
    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped
    private void txtAPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAPKeyTyped
    private void txtAMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAMKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAMKeyTyped
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        tblReload();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        int a = tblAlumno.getSelectedRow();
        if (tblAlumno.getSelectedRow() >= 0) {
            tblAlumno.setEnabled(false);
            cBtn_tbl();
            txtNc.setEditable(true);
            txtNombres.setEditable(true);
            txtAP.setEditable(true);
            txtAM.setEditable(true);
            txtNc.setText(tblAlumno.getValueAt(a, 0).toString());
            txtNombres.setText(tblAlumno.getValueAt(a, 1).toString());
            txtAP.setText(tblAlumno.getValueAt(a, 2).toString());
            txtAM.setText(tblAlumno.getValueAt(a, 3).toString());
            txtEmail.setText("");

        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed
        // TODO add your handling code here:
        int a = tblAlumno.getSelectedRow();
        cBtn_tbl();
        if (espBla_boolean() == true) {
            Object O[] = new Object[5];
            O[0] = txtNc.getText();
            O[1] = txtNombres.getText();
            O[2] = txtAP.getText();
            O[3] = txtAM.getText();
            O[4] = tblAlumno.getValueAt(a, 4).toString();
            modelo.removeRow(a);
            modelo.insertRow(a, O);
            reload();
            for (int i = 0; i < tblAlumno.getRowCount(); i++) {
                Alumno b = new Alumno(tblAlumno.getValueAt(i, 0).toString(),
                        tblAlumno.getValueAt(i, 1).toString(),
                        tblAlumno.getValueAt(i, 2).toString(),
                        tblAlumno.getValueAt(i, 3).toString());
                b.save();
            }
            tblAlumno.setEnabled(true);
        }
        clearField();
        tblReload();
        editFalse();
    }//GEN-LAST:event_btnConfActionPerformed
    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        // TODO add your handling code here:
        int a = tblAlumno.getSelectedRow();
        cBtn_tbl();
        modelo.removeRow(a);
        reload();
        for (int i = 0; i < tblAlumno.getRowCount(); i++) {
            Alumno b = new Alumno(tblAlumno.getValueAt(i, 0).toString(),
                    tblAlumno.getValueAt(i, 1).toString(),
                    tblAlumno.getValueAt(i, 2).toString(),
                    tblAlumno.getValueAt(i, 3).toString());
            b.save();
        }
        tblAlumno.setEnabled(true);
        clearField();
        editFalse();
        tblReload();
    }//GEN-LAST:event_btnElimActionPerformed
    // </editor-fold>
    
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
            java.util.logging.Logger.getLogger(VentAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentAlum().setVisible(true);
            }
        });
    }
    private DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConf;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNc;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
