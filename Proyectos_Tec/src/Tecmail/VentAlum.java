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
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

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

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo-usuario.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar (1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelar);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar-en-carpeta.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        jLabel6.setText("|");
        jToolBar1.add(jLabel6);

        btnTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver-simbolo-de-ojo-de-interfaz.png"))); // NOI18N
        btnTodos.setText("Mostrar");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTodos);

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setEnabled(false);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMod);

        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton-quitar-redondeado.png"))); // NOI18N
        btnElim.setText("Eliminar");
        btnElim.setEnabled(false);
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });
        jToolBar1.add(btnElim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Funciones">
    //-----------------------------------------------------------------------------------
    private boolean valNc(){
        boolean a=true;
        for (int i = 0; i < tblAlumno.getRowCount(); i++) {
            if (txtNc.getText().equals(tblAlumno.getValueAt(i, 0).toString())) {
                a=false;
            }
        }
        if (txtNc.getText().equals(tblAlumno.getValueAt(tblAlumno.getSelectedRow(), 0))) {
            a=true;
        }
        return a;
    }
    public void valiNC()throws E_mailExecption{
        Alumno a= new Alumno(txtNc.getText(), "", "", "");
        if (!a.sea(txtNc.getText())) {
            Alumno b = new Alumno(txtNc.getText(), txtNombres.getText(), txtAP.getText(), txtAM.getText());
            b.save();           
        }else{
            throw new E_mailExecption("Ese Numero de control, ya a sido registrado");
        }
    }
    private void clearField() {
        txtNc.setText("");
        txtNombres.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtEmail.setText("");
    }
    private void changeField() {
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
    private void cBtn() {
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
    public void whiSp() {
        if (txtNc.getText().equals("")) {
            txtNc.requestFocus();
            throw new E_mailExecption("Escriba el Num. Control");
        } else {
            if (txtNombres.getText().equals("")) {
                txtNombres.requestFocus();
                throw new E_mailExecption("Escriba el Nombre");
            } else {
                if (txtAP.getText().equals("")) {
                    txtAP.requestFocus();
                    throw new E_mailExecption("Escriba el Apellido Paterno");
                } else {
                    if (txtAM.getText().equals("")) {
                        txtAM.requestFocus();
                        throw new E_mailExecption("Escriba el Apellido Materno");
                    }
                }
            }
        }
    }
    private void fillField(Alumno a) {
        this.txtNc.setText(a.getNc());
        this.txtNombres.setText(a.getNombres());
        this.txtAP.setText(a.getApaterno());
        this.txtAM.setText(a.getAmaterno());
        this.txtEmail.setText(a.getEmail());
    }
    public boolean whiSp_boolean() {
        if (txtNc.getText().equals("")) {
            txtNc.requestFocus();
        } else {
            if (txtNombres.getText().equals("")) {
                txtNombres.requestFocus();
            } else {
                if (txtAP.getText().equals("")) {
                    txtAP.requestFocus();
                } else {
                    if (txtAM.getText().equals("")) {
                        txtAM.requestFocus();                        
                    }
                }
            }
        }
        return true;
    }
    private void reloadTbl() {
        if (!btnGuardar.isEnabled()) {
         FileInputStream fb;
        modelo.setRowCount(0);
            if (!Edit) {
                btnMod.setEnabled(true);
            } else {
                changeButton_tbl();
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
        } else {
            if (!Edit) {
                showMessageDialog(rootPane, "Termine de guardar o cancele la accion");
            }
            
        }
        
    }
    private void editDisable() {
        txtNc.setEditable(false);
        txtNombres.setEditable(false);
        txtAP.setEditable(false);
        txtAM.setEditable(false);
    }
    private void changeButton_tbl() {
        if (btnMod.isEnabled()) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }        
        if (btnElim.isEnabled()) {
            btnElim.setEnabled(false);
        } else {
            btnElim.setEnabled(true);
        }
    }
    public void reloadData() {
        for (int i = -1; i < tblAlumno.getRowCount(); i++) {
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
    //-----------------------------------------------------------------------------------
    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (!Edit) {
            clearField();
            changeField();
            cBtn();
            txtNc.requestFocus();
            btnMod.setEnabled(false);           
            btnElim.setEnabled(false);
            tblAlumno.setEnabled(false);
            btnMod.setEnabled(false);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Edit) {
            int a = tblAlumno.getSelectedRow();        
            if (whiSp_boolean()) {
                if (valNc()) {
                    Object O[] = new Object[5];
                    O[0] = txtNc.getText();
                    O[1] = txtNombres.getText();
                    O[2] = txtAP.getText();
                    O[3] = txtAM.getText();
                    O[4] = tblAlumno.getValueAt(a, 4).toString();
                    modelo.removeRow(a);
                    modelo.insertRow(a, O);
                    reloadData();
                    for (int i = 0; i < tblAlumno.getRowCount(); i++) {
                        Alumno b = new Alumno(tblAlumno.getValueAt(i, 0).toString(),
                                tblAlumno.getValueAt(i, 1).toString(),
                                tblAlumno.getValueAt(i, 2).toString(),
                                tblAlumno.getValueAt(i, 3).toString());
                        b.save();
                    }
                    changeButton_tbl();
                    tblAlumno.setEnabled(true);
                    clearField();
                    reloadTbl();
                    editDisable();
                    Edit=false;
                    btnGuardar.setEnabled(Edit);
                    btnCancelar.setEnabled(Edit);
                } else {
                    showMessageDialog(this, "Ese Numero de control, ya a sido registrado");
                }                           
            }else{
                showMessageDialog(this, "Hay espacios en blanco");
            }
        } else {
            try {
            whiSp();
            } catch (E_mailExecption e) {
                showMessageDialog(rootPane, e.getMessage());
                return;
            }
            try {
               valiNC();
               clearField();
                cBtn();
                changeField();
                txtNc.requestFocus();
            } catch (E_mailExecption e) {
                showMessageDialog(rootPane, e.getMessage());
            } 
        }
                     
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nc = showInputDialog(this, "Número de control a buscar");
        if (nc!=null) {
         reloadTbl();
        Alumno a = new Alumno();
        a.search(nc);
        for (int i = 0; i < tblAlumno.getRowCount(); i++) {
            if (nc.equals(tblAlumno.getValueAt(i, 0).toString())) {
                tblAlumno.setRowSelectionInterval(i, i);
            }
        }     
        fillField(a);   
        }       
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
        reloadTbl();
    }//GEN-LAST:event_btnTodosActionPerformed
    private boolean Edit=false;
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:     
        int a = tblAlumno.getSelectedRow();
        if (tblAlumno.getSelectedRow() >= 0) {
            Edit=true;
            btnGuardar.setEnabled(true);
            btnCancelar.setEnabled(Edit);
            tblAlumno.setEnabled(false);
            changeButton_tbl();
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
    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        // TODO add your handling code here:
        int a = tblAlumno.getSelectedRow();
        changeButton_tbl();
        modelo.removeRow(a);
        reloadData();
        for (int i = 0; i < tblAlumno.getRowCount(); i++) {
            Alumno b = new Alumno(tblAlumno.getValueAt(i, 0).toString(),
                    tblAlumno.getValueAt(i, 1).toString(),
                    tblAlumno.getValueAt(i, 2).toString(),
                    tblAlumno.getValueAt(i, 3).toString());
            b.save();
        }
        tblAlumno.setEnabled(true);
        clearField();
        editDisable();
        reloadTbl();
        Edit=false;
        btnGuardar.setEnabled(Edit);
        btnCancelar.setEnabled(Edit);
    }//GEN-LAST:event_btnElimActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:;
        if (!Edit) {
            clearField();
            changeField();
            cBtn();
        }else{
            tblAlumno.setEnabled(true);
            clearField();
            editDisable();
            reloadTbl();
            Edit=false;
            btnGuardar.setEnabled(Edit);
            btnElim.setEnabled(Edit);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyTyped
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentAlum().setVisible(true);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variables">
    private final DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNc;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
