package FluObj;

//<editor-fold defaultstate="collapsed" desc="Librerias">
import com.bulenkov.darcula.DarculaLaf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class VentBook extends javax.swing.JFrame {

    public VentBook() {
        initComponents();
        modelo=(DefaultTableModel) tblLib.getModel();
    }
    
//<editor-fold defaultstate="collapsed" desc="Funciones de Datos & Objetos">
    private void tbl() throws FileNotFoundException, IOException {
        modelo.setRowCount(0);
        try (FileInputStream fb = new FileInputStream(Libro.fDir)) {
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
            System.out.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
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
        if (tblLib.getRowCount() > 0&&New==true) {
            btnMod.setEnabled(true);
        } else {
            btnMod.setEnabled(Mod);
        }
        btnDel.setEnabled(Mod);
        tblLib.setEnabled(New);
        tblLib.setFocusable(New);
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
        txtAut.setText(a.getAutor());
        txtEdit.setText(a.getEditorial());
        txtPr.setText("" + a.getPrecio());
    }
    public void clean() {
        try {
            Libro a = new Libro();
            java.io.FileOutputStream fb = new java.io.FileOutputStream(Libro.fDir, false);
            try (java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb)) {
                fow.writeObject(a);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }
    private void elim(){
        try {
            File archivo=new File(Libro.fDir);
            archivo.createNewFile();
            FileInputStream fb = new FileInputStream(Libro.fDir);
            fb.close();
            FileOutputStream fw = new FileOutputStream(Libro.fDir);
            fw.close();            
            archivo.delete();
            if (!archivo.exists()&&test==true) {
                System.out.println("Archivo Eliminado");
            }
            archivo.createNewFile();
            if (archivo.exists()&&test==true) {
                System.out.println("Archivo Nuevo creado");
            }           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void validISBN() throws LibroException{      
        try {
            tbl();
            int c = tblLib.getRowCount();
            for (int i = 0; i < c; i++) {
                System.out.println(tblLib.getValueAt(i, 0).toString() + tblLib.getRowCount());
                System.out.println(i + " " + (c - 1));
                if (!txtIsbn.getText().equals(tblLib.getValueAt(i, 0).toString()) && i == c - 1) {
                    Libro b = new Libro(txtIsbn.getText(), txtTit.getText(), txtAut.getText(), txtEdit.getText(), Float.parseFloat(txtPr.getText()));
                    b.guardar();
                }
                if (txtIsbn.getText().equals(tblLib.getValueAt(i, 0).toString())) {
                    modelo.setRowCount(0);
                    throw new LibroException("Ese Numero de control, ya ha sido registrado");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(VentBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void vISBN() throws LibroException{
        boolean a = true;
        for (int i = 0; i < tblLib.getRowCount(); i++) {
            if (txtIsbn.getText().equals(tblLib.getValueAt(i, 0).toString())) {
                a = false;
            }
            if (txtIsbn.getText().equals(tblLib.getValueAt(tblLib.getSelectedRow(), 0))) {
                a = true;
            }
            if (a == false) {
                throw new LibroException("Libro ya existe");
            }
        }
    }
    
//</editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnnew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        btnSe = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        getContentPane().setLayout(null);

        jSplitPane2.setContinuousLayout(true);
        jSplitPane2.setPreferredSize(new java.awt.Dimension(440, 62));

        jToolBar1.setFloatable(false);
        jToolBar1.setToolTipText("");
        jToolBar1.setPreferredSize(new java.awt.Dimension(260, 60));

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno.png"))); // NOI18N
        btnnew.setText("Agregar");
        btnnew.setFocusable(false);
        btnnew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnew.setPreferredSize(new java.awt.Dimension(120, 28));
        btnnew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnew);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno(3).png"))); // NOI18N
        btnSave.setText("Guardar");
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

        btnCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/boton-x.png"))); // NOI18N
        btnCan.setText("Cancelar");
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

        btnSe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno(4).png"))); // NOI18N
        btnSe.setText("Buscar");
        btnSe.setFocusable(false);
        btnSe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSe);

        jSplitPane2.setLeftComponent(jToolBar1);

        jToolBar2.setFloatable(false);
        jToolBar2.setAutoscrolls(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(184, 60));

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno(6).png"))); // NOI18N
        btnView.setText("Mostrar");
        btnView.setFocusable(false);
        btnView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jToolBar2.add(btnView);

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno(5).png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setEnabled(false);
        btnMod.setFocusable(false);
        btnMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMod.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jToolBar2.add(btnMod);

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Books/cuaderno(2).png"))); // NOI18N
        btnDel.setText("Eliminar");
        btnDel.setEnabled(false);
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDel);

        jSplitPane2.setRightComponent(jToolBar2);

        getContentPane().add(jSplitPane2);
        jSplitPane2.setBounds(0, 0, 516, 62);

        jLabel1.setText("ISBN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 72, 27, 16);

        jLabel2.setText("TITULO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 122, 41, 16);

        jLabel3.setText("AUTOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 164, 40, 16);

        jLabel4.setText("EDITORIAL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(37, 206, 60, 16);

        jLabel5.setText("PRECIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(37, 248, 43, 16);

        txtIsbn.setEditable(false);
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnKeyTyped(evt);
            }
        });
        getContentPane().add(txtIsbn);
        txtIsbn.setBounds(149, 68, 125, 24);

        txtTit.setEditable(false);
        getContentPane().add(txtTit);
        txtTit.setBounds(149, 118, 204, 24);

        txtAut.setEditable(false);
        txtAut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutKeyTyped(evt);
            }
        });
        getContentPane().add(txtAut);
        txtAut.setBounds(149, 160, 204, 24);

        txtEdit.setEditable(false);
        txtEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdit);
        txtEdit.setBounds(149, 202, 204, 24);

        txtPr.setEditable(false);
        txtPr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrKeyTyped(evt);
            }
        });
        getContentPane().add(txtPr);
        txtPr.setBounds(149, 244, 204, 24);

        tblLib.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "TITULO", "AUTOR", "EDITORIAL", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLib.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblLib.setEnabled(false);
        tblLib.setFocusable(false);
        tblLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLib);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 504, 141);

        jButton1.setText("Test: Borrar BD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 70, 117, 32);

        jButton2.setText("Test: Llenar BD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 100, 116, 32);

        jButton3.setText("Test: Llenar BD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 130, 116, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
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
    
    private void tblLibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int a = tblLib.getSelectedRow();
            txtIsbn.setText(tblLib.getValueAt(a, 0).toString());
            txtTit.setText(tblLib.getValueAt(a, 1).toString());
            txtAut.setText(tblLib.getValueAt(a, 2).toString());
            txtEdit.setText(tblLib.getValueAt(a, 3).toString());
            txtPr.setText(tblLib.getValueAt(a, 4).toString());
            defaultButt(false, true, true);
            bFields(true);

        }
    }//GEN-LAST:event_tblLibMouseClicked

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

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        try {
            // TODO add your handling code here:
            modelo.setRowCount(0);
            tbl();
            defaultButt(true,false,false);
            tblLib.setEnabled(true);
            bFields(false);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeActionPerformed
        String isbn=showInputDialog(this,"ISBN a buscar","",3);
        if ("".equals(isbn)) {
            showMessageDialog(this, "Escriba un ISBN");
            return;
        }else{
            search(isbn);
        }        
        bFields(true);
    }//GEN-LAST:event_btnSeActionPerformed
    private void search(String isbn){
       try {         
            tbl();  
            int c=tblLib.getRowCount();                    
            for (int i = 0; i < c; i++) {
                System.out.println(tblLib.getValueAt(i, 0).toString()+tblLib.getRowCount());
                System.out.println(i+" "+(c-1));
                if (!isbn.equals(tblLib.getValueAt(i, 0).toString()) && i==c-1) {
                    showMessageDialog(this, "No se encontro el Libro");                    
                }
                if (isbn.equals(tblLib.getValueAt(i, 0).toString())) {                    
                    tblLib.setRowSelectionInterval(i, i);
                    txtIsbn.setText(tblLib.getValueAt(i, 0).toString());
                    txtTit.setText(tblLib.getValueAt(i, 1).toString());  
                    txtAut.setText(tblLib.getValueAt(i, 2).toString());
                    txtEdit.setText(tblLib.getValueAt(i, 3).toString());
                    txtPr.setText(tblLib.getValueAt(i, 4).toString());
                    break;
                }
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        // TODO add your handling code here:
        tblLib.clearSelection();
        defaultButt(true,false,false);
        bFields(false);
        cField();
    }//GEN-LAST:event_btnCanActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        defaultButt(false,true,false);
        bFields(true);
        cField();
        txtIsbn.requestFocus();
    }//GEN-LAST:event_btnnewActionPerformed

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
            if (b.getPrecio()!=0) {
                b.guardar(Tipo);
            }           
            Tipo=true;
        }
        defaultButt(true,false,false);
        cField();
        bFields(false);
        tblLib.clearSelection();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (btnDel.isEnabled()) {
            try {
                vISBN();
                int a = tblLib.getSelectedRow();
                Object O[] = new Object[5];
                O[0] = txtIsbn.getText();
                O[1] = txtTit.getText();
                O[2] = txtAut.getText();
                O[3] = txtEdit.getText();
                O[4] = txtPr.getText();
                modelo.removeRow(a);
                modelo.insertRow(a, O);
                clean();
                elim();
                for (int i = 0; i < tblLib.getRowCount(); i++) {
                        if (tblLib.getValueAt(i, 0) != null) {
                        Libro b = new Libro(tblLib.getValueAt(i, 0).toString(),
                            tblLib.getValueAt(i, 1).toString(),
                            tblLib.getValueAt(i, 2).toString(),
                            tblLib.getValueAt(i, 3).toString(),
                            Float.parseFloat(tblLib.getValueAt(i, 4).toString())
                        );
                            if (b.getIsbn() != null) {
                            b.guardar();
                        }
                    }

                }
                cField();
                try {
                    modelo.setRowCount(0);
                    tbl();
                    defaultButt(true, false, false);
                    bFields(false);
                    tblLib.clearSelection();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } catch (LibroException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try {
                espaciosBlanco();
                validISBN();
                if(tblLib.getRowCount() > 0){
                    modelo.setRowCount(0);
                    tbl();
                }
            } catch (LibroException | IOException e) {
                showMessageDialog(rootPane, e.getMessage());
                return;
            }
            cField();
            defaultButt(true,false,false);
            bFields(false);
            tblLib.clearSelection();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        test=true;
        elim();
        test=false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        File origen = new File("Res" + Libro.fDir);
        File destino = new File(Libro.fDir);
        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();
            System.out.println("Archivo completo");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtIsbn.setText(((int)(Math.random()*1000))+random());
        txtTit.setText(random());
        txtAut.setText(random());
        txtEdit.setText(random());
        txtPr.setText(((int)(Math.random()*1000))+"");
    }//GEN-LAST:event_jButton3ActionPerformed
    public String random(){
        byte[] array = new byte[5]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("ISO-8859-1"));
        return generatedString;
    }
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
                    BasicLookAndFeel darcula = new DarculaLaf(); 
                    UIManager.setLookAndFeel(darcula); 
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentBook().setVisible(true);
            }
        });
    }
    boolean test=false;
    private final DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSe;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tblLib;
    private javax.swing.JTextField txtAut;
    private javax.swing.JTextField txtEdit;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPr;
    private javax.swing.JTextField txtTit;
    // End of variables declaration//GEN-END:variables
}
