/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curp;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author jmanu
 */
public class VentCurp extends javax.swing.JFrame {

    /**
     * Creates new form VentCurp
     */
    public VentCurp() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPat = new javax.swing.JTextField();
        txtMat = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        dateNac = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cboxEnti = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        btnGen = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rbtnHom = new javax.swing.JRadioButton();
        rbtnMuj = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paterno");

        jLabel2.setText("A. Materno");

        jLabel3.setText("Nombres");

        jLabel4.setText("Fecha Nac.");

        dateNac.setDateFormatString("dd/MM/yyyy");
        dateNac.setMinimumSize(new java.awt.Dimension(50, 35));
        dateNac.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel6.setText("Sexo");

        cboxEnti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado", "Nayarit", "Jalisco", "Mexico", "Michoacan" }));

        jLabel7.setText("Curp");

        txtCurp.setEditable(false);

        btnGen.setText("Generar");
        btnGen.setPreferredSize(new java.awt.Dimension(80, 32));
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });

        btnSal.setText("Salir");
        btnSal.setMinimumSize(new java.awt.Dimension(80, 32));
        btnSal.setPreferredSize(new java.awt.Dimension(60, 32));

        jLabel8.setText("Entidad Fed.");

        buttonGroup1.add(rbtnHom);
        rbtnHom.setText("Hombre");
        rbtnHom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHomActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnMuj);
        rbtnMuj.setText("Mujer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(32, 32, 32)
                            .addComponent(rbtnHom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbtnMuj))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cboxEnti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dateNac, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtCurp)
                                        .addComponent(txtMat)
                                        .addComponent(txtNom)
                                        .addComponent(txtPat))))
                            .addGap(3, 3, 3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtnHom)
                    .addComponent(rbtnMuj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboxEnti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String getpLpV(String cad)throws CurpException{
        cad=cad.toUpperCase();
        String pl="",voc="AEIOU";
        if (cad.equals("")){
            throw new CurpException("Llene los datos");   
        }
        pl=cad.substring(0,1);
        for (int i = 1; i < cad.length(); i++) {
            if (voc.contains(cad.substring(i,i+1))) {
                pl=pl+cad.substring(i, i+1);
                break;
            }            
        }
        return pl;
    }
    public String getsL(String cad)throws CurpException{
        cad=cad.toUpperCase();
        String pl="",voc="AEIOU";
        if (cad.equals("")){
            throw new CurpException("Llene los datos");   
        }
        for (int i = 1; i < cad.length(); i++) {
            if (!voc.contains(cad.substring(i,i+1))) {
                pl=pl+cad.substring(i, i+1);
                break;
            }            
        }
        return pl;
    }
    public String cambCad(String cad){
        String pa[]={"PENE","PUTO","PUTA","LOCO","CACA"};
        for (String ver : pa) {
            if (cad.equals(ver)) {
                cad=cad.substring(0, 1)+"X"+cad.substring(2, 4);
            }   
        }
        return cad;
    }
    public String getpL(String cad)throws CurpException{
        cad=cad.toUpperCase();
        String pl="";
        if (cad.equals("")){
            throw new CurpException("Llene los datos");   
        }
        pl=cad.substring(0,1);
        return pl;
    }
    public String valFecha()throws CurpException{        
        if(dateNac==null){
            throw new CurpException("Selecciona Fecha de Nacimiento");
        }
        else{
            dia=Integer.toString(dateNac.getCalendar().get(Calendar.DAY_OF_MONTH));
            int com=Integer.parseInt(dia);
            if(com>=1&&com<=9){
                dia="0"+dia;
            }
            mes=Integer.toString(dateNac.getCalendar().get(Calendar.MONTH)+1);
            int com2=Integer.parseInt(mes);
            if(com2>=1&&com2<=9){
                mes="0"+mes;
            }
            año=Integer.toString(dateNac.getCalendar().get(Calendar.YEAR));
            año=año.substring(2,4);
            return fecha=año+mes+dia;
        }       
    }
    public String getEdo()throws CurpException{
        String A;
        if(cboxEnti.getSelectedIndex()!=0){
            if (cboxEnti.getSelectedIndex()==1) {
                A="NT";
            } else {
                if (cboxEnti.getSelectedIndex()==2) {
                    A="JL";
                } else {
                    if (cboxEnti.getSelectedIndex()==3) {
                        A="MX";
                    } else {
                        A="MC";
                    }
                }
            }
            return A;
        }
        else{
            throw new CurpException("Selecciona Estado");
        }
    }
    public String sexo()throws CurpException{
        if (rbtnHom.isSelected()) {
            return "H";
        } else {
            if (rbtnMuj.isSelected()) {
                return "M";
            } else {
                throw new CurpException("Selecciona Sexo");
            }
        }    
    }
    private String genCurp()throws CurpException{
        String Curp;
        try {
            Curp=getpLpV(txtPat.getText());
            Curp=Curp+getpL(txtMat.getText())+getpL(txtNom.getText());
            Curp=cambCad(Curp);
            Curp=Curp+valFecha();        
            Curp=Curp+sexo();
            Curp=Curp+getEdo();
            Curp=Curp+getsL(txtPat.getText())+getsL(txtMat.getText())+getsL(txtNom.getText());
            Curp=Curp+"00";
            if (Curp.length()==18) {
              return Curp;  
            }            
        } catch (CurpException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        return "";       
    }
    private void rbtnHomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnHomActionPerformed
    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
        try {
            txtCurp.setText(genCurp());
            
        } catch (CurpException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnGenActionPerformed

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
            java.util.logging.Logger.getLogger(VentCurp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentCurp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentCurp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentCurp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentCurp().setVisible(true);
            }
        });
    }
    
    public String dia="", mes="", año="", fecha="", s="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGen;
    private javax.swing.JButton btnSal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxEnti;
    private com.toedter.calendar.JDateChooser dateNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbtnHom;
    private javax.swing.JRadioButton rbtnMuj;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPat;
    // End of variables declaration//GEN-END:variables
}
