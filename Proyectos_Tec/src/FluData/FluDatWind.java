package FluData;


import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;


public class FluDatWind extends javax.swing.JFrame 
{
public Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
    public FluDatWind() 
    {
        initComponents();
        this.setTitle("Sin título: Nuevo Doc");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        ventanaColores = new javax.swing.JDialog();
        colores = new javax.swing.JColorChooser();
        dBuscar = new javax.swing.JDialog();
        lblBuscar = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        rbtnArriba = new javax.swing.JRadioButton();
        rbtnAbajo = new javax.swing.JRadioButton();
        chBCoinci = new javax.swing.JCheckBox();
        txtSearch = new javax.swing.JTextField();
        dReemplazar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchR = new javax.swing.JTextField();
        txtReplace = new javax.swing.JTextField();
        chRCoincidir = new javax.swing.JCheckBox();
        btnSNext = new javax.swing.JButton();
        btnRepl = new javax.swing.JButton();
        btnReplAll = new javax.swing.JButton();
        btnRCan = new javax.swing.JButton();
        radioGrup = new javax.swing.ButtonGroup();
        jDFormato = new javax.swing.JDialog();
        cmbLetra = new javax.swing.JComboBox<>();
        cmbForm = new javax.swing.JComboBox<>();
        cmbTam = new javax.swing.JComboBox<>();
        btnForAcep = new javax.swing.JButton();
        btnForCan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnNuevo = new javax.swing.JMenuItem();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnGuardarC = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCopiar = new javax.swing.JMenuItem();
        btnCortar = new javax.swing.JMenuItem();
        btnPegar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnBuscar = new javax.swing.JMenuItem();
        btnRem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnFuente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        btnMayus = new javax.swing.JMenuItem();
        bntMinus = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem16.setText("jMenuItem16");

        jMenuItem1.setText("jMenuItem1");

        jMenu8.setText("jMenu8");

        javax.swing.GroupLayout ventanaColoresLayout = new javax.swing.GroupLayout(ventanaColores.getContentPane());
        ventanaColores.getContentPane().setLayout(ventanaColoresLayout);
        ventanaColoresLayout.setHorizontalGroup(
            ventanaColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ventanaColoresLayout.setVerticalGroup(
            ventanaColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dBuscar.setTitle("Buscar");
        dBuscar.setAlwaysOnTop(true);
        dBuscar.setResizable(false);

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblBuscar.setText("Buscar: ");
        lblBuscar.setFocusable(false);

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnSiguiente.setText("Buscar Siguiente");
        btnSiguiente.setEnabled(false);
        btnSiguiente.setFocusable(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblDireccion.setText("Dirección");
        lblDireccion.setFocusable(false);

        radioGrup.add(rbtnArriba);
        rbtnArriba.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rbtnArriba.setText("Arriba");
        rbtnArriba.setFocusable(false);

        radioGrup.add(rbtnAbajo);
        rbtnAbajo.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rbtnAbajo.setSelected(true);
        rbtnAbajo.setText("Abajo");
        rbtnAbajo.setFocusable(false);

        chBCoinci.setText("Coincidir mayúsculas y minúsculas");
        chBCoinci.setFocusable(false);
        chBCoinci.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chBCoinciStateChanged(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout dBuscarLayout = new javax.swing.GroupLayout(dBuscar.getContentPane());
        dBuscar.getContentPane().setLayout(dBuscarLayout);
        dBuscarLayout.setHorizontalGroup(
            dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dBuscarLayout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dBuscarLayout.createSequentialGroup()
                        .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dBuscarLayout.createSequentialGroup()
                                .addComponent(chBCoinci)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnArriba))
                            .addComponent(lblDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnAbajo)))
                .addGap(10, 10, 10)
                .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        dBuscarLayout.setVerticalGroup(
            dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dBuscarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscar)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnArriba)
                    .addComponent(rbtnAbajo)
                    .addComponent(chBCoinci))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dReemplazar.setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Buscar:");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Reemplazar");
        jLabel2.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("por:");
        jLabel3.setFocusable(false);

        txtSearchR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchRKeyReleased(evt);
            }
        });

        txtReplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReplaceKeyReleased(evt);
            }
        });

        chRCoincidir.setText("Coincidir mayúsculas y minúsculas");
        chRCoincidir.setFocusable(false);
        chRCoincidir.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chRCoincidirStateChanged(evt);
            }
        });

        btnSNext.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnSNext.setText("Buscar Siguiente");
        btnSNext.setEnabled(false);
        btnSNext.setFocusable(false);
        btnSNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSNextActionPerformed(evt);
            }
        });

        btnRepl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRepl.setText("Reemplazar");
        btnRepl.setEnabled(false);
        btnRepl.setFocusable(false);
        btnRepl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplActionPerformed(evt);
            }
        });

        btnReplAll.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnReplAll.setText("Reemplazar todo");
        btnReplAll.setEnabled(false);
        btnReplAll.setFocusable(false);
        btnReplAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplAllActionPerformed(evt);
            }
        });

        btnRCan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRCan.setText("Cancelar");
        btnRCan.setFocusable(false);
        btnRCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dReemplazarLayout = new javax.swing.GroupLayout(dReemplazar.getContentPane());
        dReemplazar.getContentPane().setLayout(dReemplazarLayout);
        dReemplazarLayout.setHorizontalGroup(
            dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dReemplazarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dReemplazarLayout.createSequentialGroup()
                        .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtReplace)
                            .addComponent(txtSearchR, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addComponent(chRCoincidir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRCan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReplAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dReemplazarLayout.setVerticalGroup(
            dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dReemplazarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSNext))
                .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dReemplazarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRepl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReplAll))
                    .addGroup(dReemplazarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dReemplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRCan)
                    .addComponent(chRCoincidir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jDFormato.setTitle("Fuente");

        cmbLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Consolas", "Serif", "Tahoma", "Verdana" }));

        cmbForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Negrita", "Cursiva", " " }));

        cmbTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "18", "20" }));

        btnForAcep.setText("Aceptar");
        btnForAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForAcepActionPerformed(evt);
            }
        });

        btnForCan.setText("Cancelar");
        btnForCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForCanActionPerformed(evt);
            }
        });

        jLabel4.setText("Estilo de Fuente:");

        jLabel5.setText("Fuente:");

        jLabel6.setText("Tamaño");

        javax.swing.GroupLayout jDFormatoLayout = new javax.swing.GroupLayout(jDFormato.getContentPane());
        jDFormato.getContentPane().setLayout(jDFormatoLayout);
        jDFormatoLayout.setHorizontalGroup(
            jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDFormatoLayout.createSequentialGroup()
                .addGroup(jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDFormatoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDFormatoLayout.createSequentialGroup()
                                .addComponent(cmbLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDFormatoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6))))
                    .addGroup(jDFormatoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnForAcep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnForCan)))
                .addGap(25, 25, 25))
        );
        jDFormatoLayout.setVerticalGroup(
            jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDFormatoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jDFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForAcep)
                    .addComponent(btnForCan))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane2.setViewportView(txtNota);

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(btnNuevo);

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(btnAbrir);

        btnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(btnGuardar);

        btnGuardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnGuardarC.setText("Guardar Como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });
        jMenu1.add(btnGuardarC);
        jMenu1.add(jSeparator1);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(btnCopiar);

        btnCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        btnCortar.setText("Cortar");
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jMenu2.add(btnCortar);

        btnPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        btnPegar.setText("Pegar");
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        jMenu2.add(btnPegar);
        jMenu2.add(jSeparator2);

        btnBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jMenu2.add(btnBuscar);

        btnRem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnRem.setText("Remplazar");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });
        jMenu2.add(btnRem);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Formato");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnFuente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        btnFuente.setText("Fuente...");
        btnFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuenteActionPerformed(evt);
            }
        });
        jMenu4.add(btnFuente);
        jMenu4.add(jSeparator3);

        jMenu5.setText("Cambiar...");

        btnMayus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnMayus.setText("Mayusculas");
        btnMayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayusActionPerformed(evt);
            }
        });
        jMenu5.add(btnMayus);

        bntMinus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        bntMinus.setText("minúsculas");
        bntMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMinusActionPerformed(evt);
            }
        });
        jMenu5.add(bntMinus);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Acerca de");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem3.setText("Info");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        txtNota.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
       txtNota.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
       txtNota.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void bntMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMinusActionPerformed
        letras=txtNota.getText();
        txtNota.setText(letras.toLowerCase());
    }//GEN-LAST:event_bntMinusActionPerformed

    private void btnMayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayusActionPerformed
        letras=txtNota.getText();
        txtNota.setText(letras.toUpperCase());
    }//GEN-LAST:event_btnMayusActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int resp = showConfirmDialog(this, "Esta acción borrará todo el progreso, ¿Está seguro?", "Advertencia", YES_NO_OPTION, ERROR_MESSAGE);
        if(resp==0)
        {
            txtNota.setText(null);
            setTitle("Sin título:  Nuevo Doc");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        FileDialog fd= new FileDialog(FluDatWind.this,"Abrir",FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile()!=null)
        {
            nombredearchivo= fd.getDirectory()+fd.getFile();
            setTitle(nombredearchivo);
        }
        try 
        {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(nombredearchivo));
            StringBuilder sb=new StringBuilder();
            
            String linea=null;
            
            while((linea=reader.readLine())!=null)
            {
                sb.append(linea).append("\n");//this stopped the loop (taht means, separe the words in lines)
                txtNota.setText(sb.toString());//it is for foward the loop containts
            }
            reader.close();//when it finish, just close the reader
        } 
        catch (IOException e) 
        {
            showMessageDialog(this, "404 FileNotFound");//now, show this message if the archieve isn't found. 404 makes reference at the same error
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        FileDialog fd = new FileDialog(FluDatWind.this, "Guardar", FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getFile()!=null)
        {
            nombredearchivo=fd.getDirectory()+fd.getFile();
            setTitle(nombredearchivo);
            try 
            {
                FileWriter fw;
                fw = new FileWriter(nombredearchivo);
                fw.write(txtNota.getText());
                setTitle(nombredearchivo);
                fw.close();
            } 
            catch (IOException e) 
            {
                showMessageDialog(this, "404FileNotFound");
            }
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (nombredearchivo.equals("")) 
        {
            FileDialog fd = new FileDialog(FluDatWind.this, "Guardar", FileDialog.SAVE);
            fd.setVisible(true);
            if(fd.getFile()!=null)
            {
                nombredearchivo=fd.getDirectory()+fd.getFile()+".txt";
                setTitle(nombredearchivo);
                try 
                {
                    FileWriter fw;
                    fw = new FileWriter(nombredearchivo);
                    fw.write(txtNota.getText());
                    setTitle(nombredearchivo);
                    fw.close();
                } 
                catch (IOException e) 
                {
                    showMessageDialog(this, "404FileNotFound");
                }
            }
        }
        else{
            try {
                FileOutputStream fb=new FileOutputStream(nombredearchivo);
                DataOutputStream fdw=new DataOutputStream(fb);
                fdw.writeUTF(txtNota.getText());
                fdw.flush();
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        showMessageDialog(rootPane, "Hola Mundo");

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        dBuscar.setSize(475, 125);
        //Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        //dBuscar.setLocation((pantallaTamano.width/2)-(dBuscar.getWidth()/2), (pantallaTamano.height/2)-(dBuscar.getHeight()/2));
        if(txtSearch.getText().compareTo("") != 0)
        {
            btnSiguiente.setEnabled(true);
        }
        else
        {
            btnSiguiente.setEnabled(false);
        }
        dBuscar.show();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String txtUpper = txtNota.getText();
        String txtLower = txtNota.getText().toLowerCase();
        if(buscant == 1)
        {
            iBuscar = txtNota.getCaretPosition();
        }
        else
        {
            buscant = 1;
        }
        if(rbtnArriba.isSelected())
        {
            if(cBusca == 0)
            {
                if(iBuscar != 0)
                iBuscar = iBuscar-1;
                if(mayusOrmin)
                {
                    cBusca = txtUpper.indexOf(pBuscada, iBuscar);
                }
                else
                {
                    cBusca = txtLower.indexOf(pBuscada, iBuscar);
                }
            }
            if(iBuscar == 0)
            {
                int tempBuscar = 0;
                while(tempBuscar != -1)
                {
                    iBuscar = tempBuscar;
                    if(mayusOrmin)
                    {
                        tempBuscar = txtUpper.indexOf(pBuscada, tempBuscar+1);
                    }
                    else
                    {
                        tempBuscar = txtLower.indexOf(pBuscada, tempBuscar+1);
                    }
                    cBusca = iBuscar;
                }
            }
            else
            {
                int tempBuscar = 0;
                while(tempBuscar != -1)
                {
                    int aux;
                    if(mayusOrmin)
                    {
                        aux = txtUpper.indexOf(pBuscada, tempBuscar+1);
                    }
                    else
                    {
                        aux = txtLower.indexOf(pBuscada, tempBuscar+1);
                    }
                    if(aux == cBusca)
                    {
                        if(tempBuscar == 0)
                        {
                            iBuscar = -1;
                            tempBuscar = -1;
                            cBusca = 0;
                        }
                        else
                        {
                            iBuscar = tempBuscar;
                            tempBuscar = -1;
                            cBusca = iBuscar;
                        }
                    }
                    else
                    {
                        iBuscar = tempBuscar;
                        if(mayusOrmin)
                        {
                            tempBuscar = txtUpper.indexOf(pBuscada, tempBuscar+1);
                        }
                        else
                        {
                            tempBuscar = txtLower.indexOf(pBuscada, tempBuscar+1);
                        }
                    }
                }
            }
        }
        else
        {
            cBusca = 0;
            if(mayusOrmin)
            {
                iBuscar = txtUpper.indexOf(pBuscada, iBuscar);
            }
            else
            {
                iBuscar = txtLower.indexOf(pBuscada, iBuscar);
            }
        }
        if(iBuscar != -1)
        txtNota.select(iBuscar, iBuscar+pBuscada.length());
        else
        {
            if(!reemplazarTot)
            {
                dBuscar.setAlwaysOnTop(false);
                dReemplazar.setAlwaysOnTop(false);
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog (this, "No se encontró \""+pBuscada+"\"","Bloc de Notas",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                cBusca = 0;
                iBuscar=0;
                txtNota.select(0, 0);
            }
        }
        dBuscar.setAlwaysOnTop(true);
        dReemplazar.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dBuscar.hide();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void chBCoinciStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chBCoinciStateChanged
        mayusOrmin = chBCoinci.isSelected();
    }//GEN-LAST:event_chBCoinciStateChanged

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        pBuscada = txtSearch.getText();
        txtSearchR.setText(pBuscada);
        if(pBuscada.compareTo("") == 0)
            btnSiguiente.setEnabled(false);
        else{
            btnSiguiente.setEnabled(true);
        }
        if(pBuscada.compareTo("") == 0)
        {
            if(txtNota.getText().compareTo("") == 0)
                btnSiguiente.setEnabled(false);
            else{
                btnSiguiente.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchRKeyReleased
        pBuscada = txtSearchR.getText();
        txtSearch.setText(pBuscada);
        if(pBuscada.compareTo("") == 0)
        {
            btnSNext.setEnabled(false);
            btnRepl.setEnabled(false);
            btnReplAll.setEnabled(false);
        }
        else
        {
            btnSNext.setEnabled(true);
            btnRepl.setEnabled(true);
            btnReplAll.setEnabled(true);
        }
        if(pBuscada.compareTo("") != 0)
        {
            if(txtNota.getText().compareTo("") == 0){
                btnSiguiente.setEnabled(false);
            }
            else{
                btnSiguiente.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtSearchRKeyReleased

    private void txtReplaceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReplaceKeyReleased
        reemplazar = txtReplace.getText();
    }//GEN-LAST:event_txtReplaceKeyReleased

    private void chRCoincidirStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chRCoincidirStateChanged
        mayusOrmin = chRCoincidir.isSelected();
    }//GEN-LAST:event_chRCoincidirStateChanged

    private void btnSNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSNextActionPerformed
        btnSiguienteActionPerformed(evt);
    }//GEN-LAST:event_btnSNextActionPerformed

    private void btnReplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplActionPerformed
        btnSiguienteActionPerformed(evt);
        if(iBuscar != -1)
        {
            txtNota.setText(txtNota.getText().substring(0,iBuscar)+reemplazar+txtNota.getText().substring(iBuscar+pBuscada.length(),txtNota.getText().length()));
            txtNota.select(iBuscar, iBuscar+reemplazar.length());
        }
    }//GEN-LAST:event_btnReplActionPerformed

    private void btnReplAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplAllActionPerformed
        reemplazarTot = true;
        iBuscar = 0;
        boolean arriba = rbtnArriba.isSelected();
        rbtnAbajo.setEnabled(true);
        buscant = 0;
        while(iBuscar != -1)
        {
            btnSiguienteActionPerformed(evt);
            if(iBuscar != -1)
            {
                txtNota.setText(txtNota.getText().substring(0,iBuscar)+reemplazar+txtNota.getText().substring(iBuscar+pBuscada.length(),txtNota.getText().length()));
                txtNota.select(iBuscar, iBuscar+reemplazar.length());
            }
        }
        if (arriba)
        {
            rbtnArriba.setEnabled(true);
        }
        reemplazarTot = false;
    }//GEN-LAST:event_btnReplAllActionPerformed

    private void btnRCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCanActionPerformed
        dReemplazar.hide();
    }//GEN-LAST:event_btnRCanActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        // TODO add your handling code here:
        dReemplazar.setSize(475, 180);
//        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
//        dReemplazar.setLocation((pantallaTamano.width/2)-(dReemplazar.getWidth()/2), (pantallaTamano.height/2)-(dReemplazar.getHeight()/2));
        dReemplazar.show();
    }//GEN-LAST:event_btnRemActionPerformed

    private void btnFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuenteActionPerformed
        // TODO add your handling code here:
        jDFormato.setSize(400, 150);
        //Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        //jDFormato.setLocation((pantallaTamano.width/2)-(jDFormato.getWidth()/2), (pantallaTamano.height/2)-(jDFormato.getHeight()/2));
        if(txtNota.getText().compareTo("") != 0)
        {
            btnForAcep.setEnabled(true);
        }
        else
        {
            btnForAcep.setEnabled(false);
        }
        jDFormato.show();
    }//GEN-LAST:event_btnFuenteActionPerformed

    private void btnForAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForAcepActionPerformed
        // TODO add your handling code here:
        if (cmbLetra.getSelectedIndex() == 0) {
            tipodeletra="Arial";
        }else{
            if (cmbLetra.getSelectedIndex() == 1) {
                tipodeletra="Consolas";
            }else{
                if (cmbLetra.getSelectedIndex() == 2) {
                    tipodeletra="Serif";
                }else{
                    if (cmbLetra.getSelectedIndex() == 3) {
                        tipodeletra="Tahoma";
                    }else{
                        tipodeletra="Verdana";
                    }
                }
            }
        }
        if (cmbForm.getSelectedIndex() == 0) {
            formatoletra=Font.PLAIN;
        }else{
            if (cmbForm.getSelectedIndex() == 1) {
                formatoletra=Font.BOLD;
            }else{
                formatoletra=Font.ITALIC;
            }
        }
        if (cmbTam.getSelectedIndex() == 0) {
            tamaletra=12;
        }else{
            if (cmbTam.getSelectedIndex() == 1) {
                tamaletra=14;
            }else{
                if (cmbTam.getSelectedIndex() == 2) {
                    tamaletra=16;
                }else{
                    if (cmbTam.getSelectedIndex() == 3) {
                        tamaletra=18;
                    }else{
                        tamaletra=20;
                    }
                }
            }
        }
        txtNota.setFont(new Font(tipodeletra,formatoletra,tamaletra));
    }//GEN-LAST:event_btnForAcepActionPerformed

    private void btnForCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForCanActionPerformed
        // TODO add your handling code here:
        jDFormato.hide();
    }//GEN-LAST:event_btnForCanActionPerformed


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
            java.util.logging.Logger.getLogger(FluDatWind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FluDatWind().setVisible(true);
        });
    }
    
    public String tipodeletra="Arial";
    public String letras, nombredearchivo="";
    public int formatoletra=Font.PLAIN;
    public int tamaletra=12;
    public boolean sobreescribir=false;
    private int iBuscar = 0, buscant = 0, cBusca = 0;
    private String pBuscada = "";
    private boolean mayusOrmin = false;
    private boolean reemplazarTot = false;
    private String reemplazar = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bntMinus;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenuItem btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JMenuItem btnCopiar;
    private javax.swing.JMenuItem btnCortar;
    private javax.swing.JButton btnForAcep;
    private javax.swing.JButton btnForCan;
    private javax.swing.JMenuItem btnFuente;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnGuardarC;
    private javax.swing.JMenuItem btnMayus;
    private javax.swing.JMenuItem btnNuevo;
    private javax.swing.JMenuItem btnPegar;
    private javax.swing.JButton btnRCan;
    private javax.swing.JMenuItem btnRem;
    private javax.swing.JButton btnRepl;
    private javax.swing.JButton btnReplAll;
    private javax.swing.JButton btnSNext;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chBCoinci;
    private javax.swing.JCheckBox chRCoincidir;
    private javax.swing.JComboBox<String> cmbForm;
    private javax.swing.JComboBox<String> cmbLetra;
    private javax.swing.JComboBox<String> cmbTam;
    private javax.swing.JColorChooser colores;
    private javax.swing.JDialog dBuscar;
    private javax.swing.JDialog dReemplazar;
    private javax.swing.JDialog jDFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.ButtonGroup radioGrup;
    private javax.swing.JRadioButton rbtnAbajo;
    private javax.swing.JRadioButton rbtnArriba;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtReplace;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchR;
    private javax.swing.JDialog ventanaColores;
    // End of variables declaration//GEN-END:variables

    
}
