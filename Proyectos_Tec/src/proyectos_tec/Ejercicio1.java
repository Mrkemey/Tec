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
public class Ejercicio1 {
    public static void resta2Num(){
        int r;
        int n1=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
        int n2=Integer.parseInt(showInputDialog(null,"Ingrese otro numero"));
        if (n1>n2) {
            r=n1-n2;
        }else{
            r=n2-n1;
        }
        showMessageDialog(null, "El resultado es: "+r);
    }
    public static void main(String[] args) {
        resta2Num();
    }
}
