package FluObj;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class VentanaLibro extends javax.swing.JFrame {

    public VentanaLibro() {
        initComponents();
        modelo=(DefaultTableModel) tblLib.getModel();
    }
         
    
    
     private void tbl() throws FileNotFoundException, IOException {
        modelo.setRowCount(0);
        FileInputStream fb = new FileInputStream(Libro.fDir);
        try {
            Libro O;
            while (fb.available() > 0) {
                java.io.ObjectInputStream ob = new java.io.ObjectInputStream(fb);
                O = (Libro) ob.readObject();
                Object l[] = new Object[5];
                l[0] = O.getIsbn();
                l[1] = O.getTitulo();
                l[2] = O.getAutor();
                l[3] = O.getEditorial();
                l[4] = O.getPrecio();
                modelo.addRow(l);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage() + "1");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage() + "2");
        } finally {
            fb.close();
        }
    }

    private void cField() {
        txtIsbn.setText("");
        txtAut.setText("");
        txtEdit.setText("");
        txtPr.setText("");
        txtTit.setText("");
    }

    private void bFields(boolean a) {
        txtIsbn.setEditable(a);
        txtAut.setEditable(a);
        txtEdit.setEditable(a);
        txtPr.setEditable(a);
        txtTit.setEditable(a);
    }

    private void defaultButt(boolean New, boolean Sav, boolean Mod) {
        btnnew.setEnabled(New);
        btnSave.setEnabled(Sav);
        btnSe.setEnabled(New);
        btnCan.setEnabled(Sav);
        if (tblLib.getRowCount() > 0) {
            btnMod.setEnabled(true);
        } else {
            btnMod.setEnabled(Mod);
        }
        btnDel.setEnabled(Mod);
        btnView.setEnabled(New);
    }

    public void espaciosBlanco() throws LibroException {
        if (txtIsbn.getText().equals("")) {
            txtIsbn.requestFocus();
            throw new LibroException("ESPACIO EN BLANCO");
        } else {
            if (txtTit.getText().equals("")) {
                txtTit.requestFocus();
                throw new LibroException("ESPACIO EN BLANCO");
            } else {
                if (txtAut.getText().equals("")) {
                    txtAut.requestFocus();
                    throw new LibroException("ESPACIO EN BLANCO");
                } else {
                    if (txtEdit.getText().equals("")) {
                        txtEdit.requestFocus();
                        throw new LibroException("ESPACIO EN BLANCO");
                    } else {
                        if (txtPr.getText().equals("")) {
                            txtPr.requestFocus();
                            throw new LibroException("ESPACIO EN BLANCO");
                        }
                    }
                }
            }
        }
    }

    private void fillFields(Libro a) {
            txtIsbn.setText(a.getIsbn());
            txtTit.setText(a.getTitulo());
            txtAut.setText(a.getAutor());;
            txtEdit.setText(a.getEditorial());
            txtPr.setText("" + a.getPrecio());
        }
    public void clean() {
        try {
            Libro a = new Libro();
            java.io.FileOutputStream fb = new java.io.FileOutputStream(Libro.fDir, false);
            java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb);
            fow.writeObject(a);
            fow.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }
    private void elim(){
        File archivo=new File(Libro.fDir);
            archivo.delete();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnnew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        btnSe = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtTit = new javax.swing.JTextField();
        txtAut = new javax.swing.JTextField();
        txtEdit = new javax.swing.JTextField();
        txtPr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLib = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnnew.setText("AGREGAR");
        btnnew.setFocusable(false);
        btnnew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnew);

        btnSave.setText("GUARDAR");
        btnSave.setEnabled(false);
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnCan.setText("CANCELAR");
        btnCan.setEnabled(false);
        btnCan.setFocusable(false);
        btnCan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCan);

        btnSe.setText("BUSCAR");
        btnSe.setFocusable(false);
        btnSe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSe);

        btnView.setText("MOSTRAR");
        btnView.setFocusable(false);
        btnView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnView);

        btnMod.setText("MODIFICAR");
        btnMod.setEnabled(false);
        btnMod.setFocusable(false);
        btnMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMod.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMod);

        btnDel.setText("ELIMINAR");
        btnDel.setEnabled(false);
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDel);

        jLabel1.setText("ISBN");

        jLabel2.setText("TITULO");

        jLabel3.setText("AUTOR");

        jLabel4.setText("EDITORIAL");

        jLabel5.setText("PRECIO");

        txtIsbn.setEditable(false);
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnKeyTyped(evt);
            }
        });

        txtTit.setEditable(false);

        txtAut.setEditable(false);
        txtAut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutKeyTyped(evt);
            }
        });

        txtEdit.setEditable(false);
        txtEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditKeyTyped(evt);
            }
        });

        txtPr.setEditable(false);
        txtPr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrKeyTyped(evt);
            }
        });

        tblLib.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "TITULO", "AUTOR", "EDITORIAL", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(tblLib);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTit)
                            .addComponent(txtAut, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtPr, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtEdit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        defaultButt(false,true,false);
        bFields(true);
        btnView.setEnabled(true);
        cField();
        txtIsbn.requestFocus();
    }//GEN-LAST:event_btnnewActionPerformed
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if (!btnDel.isEnabled()) {
            try {
                espaciosBlanco();
            } catch (LibroException e) {
                showMessageDialog(rootPane, e.getMessage());
                return;
            }
            System.out.println("a");
            Libro a = new Libro(txtIsbn.getText(), txtTit.getText(), txtAut.getText(), txtEdit.getText(), Float.parseFloat(txtPr.getText()));
            a.guardar();
            cField();
            defaultButt(true,false,false);
            bFields(false);
        } else {
            int a = tblLib.getSelectedRow();
            Object O[] = new Object[5];
            O[0] = txtIsbn.getText();
            O[1] = txtTit.getText();
            O[2] = txtAut.getText();
            O[3] = txtEdit.getText();
            O[4] = txtPr.getText();
            modelo.removeRow(a);
            modelo.insertRow(a, O);
            elim();
            for (int i = 0; i < tblLib.getRowCount(); i++) {
                Libro b = new Libro(tblLib.getValueAt(i, 0).toString(),
                                tblLib.getValueAt(i, 1).toString(),
                            tblLib.getValueAt(i, 2).toString(),
                        tblLib.getValueAt(i, 3).toString(), 
                    Float.parseFloat(tblLib.getValueAt(i, 4).toString())
                );
                b.guardar();
            }
            cField();
            try {
                tbl();
            
            defaultButt(true,false,false);
            bFields(false);
            } catch (IOException ex) {
                Logger.getLogger(VentanaLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeActionPerformed
        String isbn=showInputDialog(this,"ISBN a buscar","",3);
        if (isbn == null) {
            return;
        }
        Libro x = new Libro();
        x.buscar(isbn);
        for (int i = 0; i < tblLib.getRowCount(); i++) {
            if (isbn.equals(tblLib.getValueAt(i, 0).toString())) {
                tblLib.setRowSelectionInterval(i, i);
                break;
            }
        }
        fillFields(x);        
        if (x.getPrecio() == 0) {
            txtPr.setText("");
        }
        bFields(true);            
    }//GEN-LAST:event_btnSeActionPerformed

    private void txtIsbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != '\b')) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIsbnKeyTyped

    private void txtPrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != '\b')) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrKeyTyped

    private void txtAutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAutKeyTyped

    private void txtEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEditKeyTyped

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        int a = tblLib.getSelectedRow();
        if (tblLib.getSelectedRow() >= 0) {
            txtIsbn.setText(tblLib.getValueAt(a, 0).toString());
            txtTit.setText(tblLib.getValueAt(a, 1).toString());
            txtAut.setText(tblLib.getValueAt(a, 2).toString());
            txtEdit.setText(tblLib.getValueAt(a, 3).toString());
            txtPr.setText(tblLib.getValueAt(a, 4).toString());
            defaultButt(false,true,true);
            bFields(true);
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        // TODO add your handling code here:
        defaultButt(true,false,false);
        bFields(false);
        cField();
    }//GEN-LAST:event_btnCanActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        try {
            // TODO add your handling code here:
            modelo.setRowCount(0);
            tbl();
            defaultButt(true,false,false);
            tblLib.setEnabled(true);
            bFields(false);           
        } catch (IOException ex) {
            Logger.getLogger(VentanaLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed
    
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        boolean Tipo=false;
        int a = tblLib.getSelectedRow();
            modelo.removeRow(a);          
            clean();
            elim();
            for (int i = 0; i < tblLib.getRowCount(); i++) {
                Libro b = new Libro(tblLib.getValueAt(i, 0).toString(),
                                tblLib.getValueAt(i, 1).toString(),
                            tblLib.getValueAt(i, 2).toString(),
                        tblLib.getValueAt(i, 3).toString(), 
                    Float.parseFloat(tblLib.getValueAt(i, 4).toString())
                );
                b.guardar(Tipo);
                Tipo=true;
            }
        defaultButt(true,false,false);
        cField();
        bFields(false);
        
    }//GEN-LAST:event_btnDelActionPerformed
    
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
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaLibro().setVisible(true);
        });
    }
    
    private final boolean ModEdit=false;
    private final DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSe;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnnew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblLib;
    private javax.swing.JTextField txtAut;
    private javax.swing.JTextField txtEdit;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPr;
    private javax.swing.JTextField txtTit;
    // End of variables declaration//GEN-END:variables
}