/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

//import static com.sun.webkit.event.WCKeyEvent.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Ventana extends JFrame implements ActionListener{
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnAceptar;
    private JButton btnSalir;
    public Ventana(){
        super("Mi Primer Ventana");
        Container c=getContentPane();
        setLayout(new FlowLayout());
        lblNombre=new JLabel("Nombre");
        c.add(lblNombre);
        txtNombre=new JTextField(20);
        c.add(txtNombre);
        
        btnAceptar=new JButton("Aceptar");
        c.add(btnAceptar);
        

        btnSalir=new JButton("Salir");
        c.add(btnSalir);
        btnSalir.addActionListener(this);
        Manejador m=new Manejador();
        txtNombre.addKeyListener(m);
        btnAceptar.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                    showMessageDialog(null, "Hola "+txtNombre.getText());
                } else {
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });   
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")) {
            showMessageDialog(this, "Hola "+txtNombre.getText());
        }else{
            System.exit(0);
        }
    }
    class Manejador implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                btnAceptar.requestFocus();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    }
    public static void main(String[] args) {
        Ventana v=new Ventana();
    }
}
