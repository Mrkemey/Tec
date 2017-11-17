/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import proyectos_tec.paquete2.Modulo1;
/**
 *
 * @author jmanu
 */
public class Facil {
    public static void main(String[] args) {
        int n=Integer.parseInt(showInputDialog("Ingrese un numero"));
        int m=Integer.parseInt(showInputDialog("Ingrese otro numero"));
        showMessageDialog(null,difCuadrados(n,m));
    }
    public static int difCuadrados(int a,int b){
        int d=0;
        if (a<b) {
            int temp=a;
            a=b;
            b=temp;
        }
        d=(a*(a))-(b*(b));
       return d;
    }
    public static int difCuadrados2(int a,int b){
       return Math.abs(a*a-b*b);
    }
}
