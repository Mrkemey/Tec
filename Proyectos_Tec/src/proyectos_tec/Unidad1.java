/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Unidad1 {

    /**
     * @param args the command line arguments
     */
    public static void iraBARoNO(){
        int e=Integer.parseInt(showInputDialog(null,"Ingrese su edad"));
        if (e>=18) {
            showMessageDialog(null, "Si puedes pasar al bar");           
        } else {
            showMessageDialog(null, "No puedes entrar");
        }
    }
    public static void dobledeN(){
      int n=Integer.parseInt(showInputDialog(null,"Numero entero"));
      int r=n*2;
      showMessageDialog(null,"El donble es: "+r);
    }
    public static void NombreNveces(){
        String nom=showInputDialog("Ingresa tu nombre");
        int n=Integer.parseInt(showInputDialog("Ingrese un numero"));
        String cad="";
        for (int i = 0; i < n; i++) {
            cad=cad+nom+"\n";
            
        }
        showMessageDialog(null, "Numero de veces:\n "+cad);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //iraBARoNO();
        NombreNveces();
    }
}
