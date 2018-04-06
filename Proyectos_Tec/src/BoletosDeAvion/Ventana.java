package BoletosDeAvion;




import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        lblSal.setVisible(false);
        lblReg.setVisible(false);
        jDateRegreso.setVisible(false);
        jDateSalida.setVisible(false);
    }
    
    public void validarNombre()
    {
        int nombre;
        if(txtNom.getText().equals(""))
        {
            showMessageDialog(this, "Introduce el nombre del pasajero, por favor");
            txtNom.requestFocus();
            band=true;
            return;
        }
        else
        {
            try
            {
                nombre=Integer.parseInt(txtNom.getText());
                showMessageDialog(this, "Nombre no valido");
                txtNom.setText("");
                txtNom.requestFocus();
                band=true;
                return;
            }
            catch(java.lang.NumberFormatException e)
            {
                band=false;
            }
        }
    }
    
    public void validarEdad()
    {
        int age;
        if(txtEd.getText().equals(""))
        {
            showMessageDialog(this, "Introduce la edad del pasajero, por favor");
            txtEd.requestFocus();
            band=true;
            return;
        }
        else
        {
            try
            {
                age=Integer.parseInt(txtEd.getText());
                band=false;
                
            }
            catch(java.lang.NumberFormatException e)
            {
                showMessageDialog(this, "Edad no valida");
                txtEd.setText("");
                txtEd.requestFocus();
                band=true;
                return;
            }
        }
    }
    
    public void validarRbtn()
    {
        if(rbtnSen.isSelected())
        {
            lblSal.setVisible(true);
            jDateSalida.setVisible(true);
            jDateRegreso.setVisible(false);
            lblReg.setVisible(false);
            band=false;
            
        }
        else
        {
            if(rbtnRed.isSelected())
            {
                lblSal.setVisible(true);
                lblReg.setVisible(true);
                jDateSalida.setVisible(true);
                jDateRegreso.setVisible(true);
                band=false;
            }
            else
            {
                showMessageDialog(this, "Selecciona una opción de TIPO DE VUELO, por favor ");
                band=true;
            }
        }
    }
    
    
    public void validarPrecio()
    {
        int prec;
        if(txtPrec.getText().equals(""))
        {
            showMessageDialog(this, "Introduce el precio del boleto, por favor");
            txtPrec.requestFocus();
            band=true;
            return;
        }
        else
        {
            try
            {
                prec=Integer.parseInt(txtPrec.getText());
                precio=prec;
                band=false;
                
            }
            catch(java.lang.NumberFormatException e)
            {
                showMessageDialog(this, "Precio no valido");
                txtPrec.setText("");
                txtPrec.requestFocus();
                band=true;
                return;
            }
        }
    }
    public void validarFecha(){
        Date fechasal = jDateSalida.getDate();//Obetener el valor en el tipo de variable Date
        Date fechalleg = jDateRegreso.getDate();
        if (rbtnRed.isSelected()) {
            if(fechasal==null){
            showMessageDialog(this, "Introduce una fecha de salida correcta, por favor");
            jDateSalida.setDate(null);
            }else {
                if(fechalleg==null){
                    showMessageDialog(this, "Introduce una fecha de Regreso correcta, por favor");
                    jDateRegreso.setDate(null);

                }else {
                    if (fechasal.before(fechalleg)) {/*Si fecha de entrada es antes de fecha de salida regresa un true*/
                        //SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");//Formato de la fecha
                        //fe=formateador.format(fechasal);//Un tipo Date a String con el formato de arriba
                        //fa=formateador.format(fechalleg);//Igual

                    } else {
                        showMessageDialog(this, "Introduce una fecha de Regreso correcta, por favor");
                        jDateRegreso.setDate(null);

                    } 
                }     
            }
        } else {
            if(fechasal==null){
                showMessageDialog(this, "Introduce una fecha de Salida correcta, por favor");
                jDateSalida.setDate(null);

            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtnSen = new javax.swing.JRadioButton();
        rbtnRed = new javax.swing.JRadioButton();
        lblSal = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrec = new javax.swing.JTextField();
        txtCom = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTot = new javax.swing.JTextField();
        jDateRegreso = new com.toedter.calendar.JDateChooser();
        jDateSalida = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("EDAD");

        jLabel3.setText("TIPO DE VUELO");

        buttonGroup1.add(rbtnSen);
        rbtnSen.setText("SENCILLO");
        rbtnSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnRed);
        rbtnRed.setText("REDONDO");
        rbtnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRedActionPerformed(evt);
            }
        });

        lblSal.setText("SALIDA");

        lblReg.setText("REGRESO");

        jLabel6.setText("PRECIO");

        txtCom.setText("COMPRAR");
        txtCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComActionPerformed(evt);
            }
        });

        jLabel7.setText("TOTAL");

        jDateRegreso.setMinimumSize(new java.awt.Dimension(50, 20));

        jDateSalida.setMinimumSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCom)
                    .addComponent(rbtnRed)
                    .addComponent(rbtnSen)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(lblSal)
                            .addComponent(lblReg))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(txtEd, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(rbtnSen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnRed)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblReg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jDateRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(txtCom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComActionPerformed
        validarNombre();
        validarEdad();
        validarRbtn(); 
        validarPrecio();
        validarFecha();
        if (jDateSalida.getDate()!=null||jDateRegreso.getDate()!=null) {
            edad=Integer.parseInt(txtEd.getText());
            //precio=Integer.parseInt(txtPrec.getText());
            if(edad>=1&&edad<=3)
            {
                desc=(float) (precio*0.20);
                total=precio-desc;
            }
            else
            {
                if(edad>=65)
                {
                    desc=(float) (precio*0.30);
                    total=precio-desc;
                }
                else
                {
                    total=precio;
                }
            }
            txtTot.setText(total+"");
            txtTot.setEnabled(false);
            band=true;
        }
        
    }//GEN-LAST:event_txtComActionPerformed

    private void rbtnSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSenActionPerformed
        lblSal.setVisible(true);
        lblReg.setVisible(false);
        jDateSalida.setVisible(true);
        jDateRegreso.setVisible(false);
    }//GEN-LAST:event_rbtnSenActionPerformed

    private void rbtnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRedActionPerformed
        lblSal.setVisible(true);
        lblReg.setVisible(true);
        jDateSalida.setVisible(true);
        jDateRegreso.setVisible(true);
    }//GEN-LAST:event_rbtnRedActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private int precio,edad;
    private float total, desc;
    private boolean band=false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateRegreso;
    private com.toedter.calendar.JDateChooser jDateSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblSal;
    private javax.swing.JRadioButton rbtnRed;
    private javax.swing.JRadioButton rbtnSen;
    private javax.swing.JButton txtCom;
    private javax.swing.JTextField txtEd;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtTot;
    // End of variables declaration//GEN-END:variables
}
