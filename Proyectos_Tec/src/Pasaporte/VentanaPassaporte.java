package Pasaporte;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class VentanaPassaporte extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPassaporte
     */
    public VentanaPassaporte() {
        initComponents();
        txtNP.setEnabled(false);
        jLabel9.setVisible(false);
        rbtnPri.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbEnt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        rbtnPri = new javax.swing.JRadioButton();
        rbtnReno = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEma = new javax.swing.JTextField();
        btnCita = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TIPO DE CITA");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CITA", "PERSONAL", "FAMILIAR" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel2.setText("NÚM. DE PERSONAS");

        txtNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPKeyTyped(evt);
            }
        });

        jLabel3.setText("ENTIDAD CITA");

        cmbEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE ESTADO", "NAYARIT", "JALISCO", "ESTADO DE MÉXICO", "MICHOACAN" }));
        cmbEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntActionPerformed(evt);
            }
        });

        jLabel4.setText("CIUDAD CITA");

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR CIUDAD" }));

        buttonGroup1.add(rbtnPri);
        rbtnPri.setText("PRIMERA");

        buttonGroup1.add(rbtnReno);
        rbtnReno.setText("RENOVACION");

        jLabel5.setText("FECHA");

        jLabel6.setText("NOMBRE");

        jLabel7.setText("APELLIDOS");

        jLabel8.setText("EMAIL");

        btnCita.setText("HACER CITA");
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });

        btnSal.setText("SALIR");
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabel9.setText("Máximo 5 personas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSal)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(cmbEnt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApe)
                            .addComponent(txtEma)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbtnPri)
                        .addGap(44, 44, 44)
                        .addComponent(rbtnReno)
                        .addGap(48, 48, 48)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPri)
                    .addComponent(rbtnReno))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCita)
                    .addComponent(btnSal))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarTipoCita() throws CitaException{
        if(cmbTipo.getSelectedIndex()==0){
            throw new CitaException("Selecciona el tipo de cita");
        }
    }
    public void validarPersona() throws CitaException{
        //int np=Integer.parseInt(txtNP.)		
   }
    public void validE_mail(boolean val)throws CitaException{
         if (val) {
            
        } else {
             throw new CitaException("Correo incorrecto");
        }     
    }
    private final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    /*
        Formato de Email
    

        Comienzo del patrón
        ^

        Caracteres por los que puede comenzar la dirección del correo electrónico
        [_A-Za-z0-9-\\+]+

        Caracteres opcionales.
        (\\.[_A-Za-z0-9-]+)*

        La dirección de correo debe contener el símbolo @
        @

        El nombre del dominio del correo debe comenzar por estos caracteres
        [A-Za-z0-9-]+

        El primer dominio de nivel superior o TLD debe de comenzar por punto seguido por los caracteres resaltados
        (\\.[A-Za-z0-9]+)*

        El primer nivel TLD puede ir seguido opcionalmente por un segundo nivel TLD que debe ser de tener 2 o más caracteres
        (\\.[A-Za-z]{2,})$;


    
    */
    public boolean validateEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();//retorna si se cumple el Pattern(patron)
 
    }
    public void validEnti()throws CitaException{
        if(cmbEnt.getSelectedIndex()==0){
            throw new CitaException("Selecciona Estado");
        }
        if (cmbCiudad.getSelectedIndex()==0) {
            throw new CitaException("Selecciona Ciudad");    
        }
    }
    public void validFecha(){
        if(jdcFecha.getDate()==null){
            throw new CitaException("Selecciona Fecha Valida");
        }
    }
    public void validtxtField(String cad)throws CitaException{
        cad=cad.toUpperCase();
        if (cad.equals(" ")||cad.isEmpty()){
            throw new CitaException("Llene los datos");   
        }
    }

    private void cmbEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntActionPerformed
        if(cmbEnt.getSelectedIndex()==0){
            return;
        }
        if(cmbEnt.getSelectedIndex()==1){
            cmbCiudad.removeAllItems();
            cmbCiudad.addItem("SELECCIONA UNA CIUDAD");
            cmbCiudad.addItem("TEPIC");
            cmbCiudad.addItem("BAHIA DE BANDERAS");
        }
        else{
            if(cmbEnt.getSelectedIndex()==2){
                cmbCiudad.removeAllItems();
                cmbCiudad.addItem("SELECCIONA UNA CIUDAD");
                cmbCiudad.addItem("GUADALAJARA");
                cmbCiudad.addItem("TEQUILA");
            }
            else{
                if(cmbEnt.getSelectedIndex()==3){
                    cmbCiudad.removeAllItems();
                    cmbCiudad.addItem("SELECCIONA UNA CIUDAD");
                    cmbCiudad.addItem("TOLUCA");
                }
                else{
                    if(cmbEnt.getSelectedIndex()==4){
                        cmbCiudad.removeAllItems();
                        cmbCiudad.addItem("SELECCIONA UNA CIUDAD");
                        cmbCiudad.addItem("MORELIA");
                        cmbCiudad.addItem("PUERTO");
                    }
                }
            }
        }
    }//GEN-LAST:event_cmbEntActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed

    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalActionPerformed

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if(cmbTipo.getSelectedIndex()==2){
            txtNP.setEnabled(true);
            jLabel9.setVisible(true);           
        }
        else{
            txtNP.setEnabled(false);
            jLabel9.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        try{
            validarTipoCita();
            validEnti();
            validFecha();
            validtxtField(txtNombre.getText());
            validtxtField(txtApe.getText());
            validtxtField(txtNombre.getText());
            validE_mail(validateEmail(txtEma.getText()));//Lo que hace el "validE_mail" pide un booleano si cae en falso
            //manda una excepcion de lo contrario la deja pasar; "validateEmail" recibe un string y retorna un boleano
        }
        catch (CitaException e){
            showMessageDialog(rootPane,e.getMessage());
            cmbTipo.requestFocus();
        }
        
    }//GEN-LAST:event_btnCitaActionPerformed

    private void txtNPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyTyped
        char c=evt.getKeyChar(); 
//        if(((c<'0')||(c>'9'))&&(c!='\b')){
//            evt.consume();
//        }
        
        if(!Character.isDigit(c)){ 
            getToolkit().beep();
            evt.consume();
            throw new CitaException("SOLO NÚMEROS"); 
        } 
    }//GEN-LAST:event_txtNPKeyTyped
    
    private void np(){
        int np=Integer.parseInt(txtNP.getText());
        if(np<2){
            txtNP.setText("");
            throw new CitaException("CITAS FAMILIARES: MAYOR DE 1");    
        }
        if(np>5){
            txtNP.setText("");
            throw new CitaException("CITAS FAMILIARES: MAXIMO 5 PERSONAS");
        }
    }
    
    private void txtNPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyReleased
        // TODO add your handling code here:
        np();
    }//GEN-LAST:event_txtNPKeyReleased
  
    private void txtNPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyPressed
        // TODO add your handling code here:
        np();
    }//GEN-LAST:event_txtNPKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPassaporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPassaporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPassaporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPassaporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPassaporte().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnSal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbEnt;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton rbtnPri;
    private javax.swing.JRadioButton rbtnReno;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtEma;
    private javax.swing.JTextField txtNP;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
