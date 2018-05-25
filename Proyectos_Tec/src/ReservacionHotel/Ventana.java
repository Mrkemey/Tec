package ReservacionHotel;


import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

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
        modelo= (DefaultTableModel) tblNota.getModel();
    }
    
    public void validarHabitaciones()
    {
        int habs;
        if(txtNH.getText().equals("")||txtNH.getText().equals("0"))
        {
            showMessageDialog(this, "Introduce el número de habitaciones, por favor");
            txtNH.requestFocus();
            return;
        }
        else
        {
            try
            {
                habs=Integer.parseInt(txtNH.getText());
            }
            catch(java.lang.NumberFormatException e)
            {
                showMessageDialog(this, "Habitaciones no validas");
                txtNH.setText("");
                txtNH.requestFocus();
            }
        }
    }
    
    public void validarTipo()
    {
        if(cmbTipo.getSelectedIndex()==0)
        {
            showMessageDialog(this, "Selecciona un tipo de habitacion, por favor");
            cmbTipo.requestFocus();
            txtNH.setText("");// Hace petar al programa y no lo deja continuar
            return;//Innecesario
        }
        else
        {
            if(cmbTipo.getSelectedIndex()==1)
            {
                precio=100;
            }
            else
            {
                if(cmbTipo.getSelectedIndex()==2)
                {
                    precio=150;
                }
                else
                {
                    if(cmbTipo.getSelectedIndex()==3)
                    {
                        precio=250;
                    }
                    else
                    {
                        if(cmbTipo.getSelectedIndex()==4)
                        {
                            precio=350;
                        }
                    }
                }
            }
        }
    }

    public void validarFecha(){
        Date fechaentr = jDateEntrada.getDate();//Obetener el valor en el tipo de variable Date
        Date fechasal = jDateSalida.getDate();
        
        if(fechaentr==null){
            showMessageDialog(this, "Introduce una fecha correcta, por favor");                     
        }else {
             if (fechaentr.before(fechasal)) {/*Si fecha de entrada es antes de fecha de salida regresa un true*/
                SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");//Formato de la fecha
                fe=formateador.format(fechaentr);//Un tipo Date a String con el formato de arriba
                fa=formateador.format(fechasal);//Igual
                nd=(int)((fechasal.getTime()-fechaentr.getTime())/86400000/*Cantidad de milisegundos en un dia*/);
             } else {
                showMessageDialog(this, "Introduce una fecha correcta, por favor");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnRes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNota = new javax.swing.JTable();
        jDateEntrada = new com.toedter.calendar.JDateChooser();
        jDateSalida = new com.toedter.calendar.JDateChooser();

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

        jLabel1.setText("NUMERO DE HABITACIONES");

        jLabel2.setText("TIPO DE HABITACIÓN");

        jLabel3.setText("ENTRADA");

        jLabel4.setText("SALIDA");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA EL TIPO DE HABITACIÓN", "SENCILLA $100", "DOBLE $150", "JUNIOR $250", "MASTER $350", " " }));

        btnRes.setText("RESERVAR");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        tblNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTRADA", "SALIDA", "DÍAS", "NH", "PRECIO", "IMPORTE"
            }
        ));
        jScrollPane2.setViewportView(tblNota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNH, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnRes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnRes)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        validarFecha();
        validarHabitaciones();
        validarTipo();
        if (fe!=null||fa!=null) {//Que no sean valores nulos
            Object O[]= new Object[6];
            nh=Integer.parseInt(txtNH.getText());
            importe=nh*precio*nd;
            
            O[0]=fe+"";
            O[1]=fa+"";
            O[2]=nd+"";
            O[3]=nh+"";
            O[4]=precio+"";
            O[5]=importe+"";
            showMessageDialog(this,"La reservación ha sido registrada con exito");
            modelo.addRow(O);
            txtNH.setText("");
            jDateEntrada.setDate(null);//Valores null
            jDateSalida.setDate(null);
            fe=null;fa=null;
            cmbTipo.setSelectedIndex(0); 
            txtNH.requestFocus();
        }
            
    }//GEN-LAST:event_btnResActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private DefaultTableModel modelo;
    private int precio, importe, nd, nh;
    private String fe,fa;
    
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRes;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.toedter.calendar.JDateChooser jDateEntrada;
    private com.toedter.calendar.JDateChooser jDateSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblNota;
    private javax.swing.JTextField txtNH;
    // End of variables declaration//GEN-END:variables

}
