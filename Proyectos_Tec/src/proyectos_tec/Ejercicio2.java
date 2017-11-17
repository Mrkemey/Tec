/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Ejercicio2 {
    public static String funcion(int a,int b){
        String s="";double y;
        if (a>b) {
            int temp=a;
            a=b;
            a=temp;
        }
        for (a = a; a <= b; a++) {
            
            y=2*(Math.pow(a, 2))+2-sqrt(a);
            System.out.println(y);
            s=s+"\n"+a+"    :   "+y;
        }
        return s;
    }
    public static void main(String[] args) {
        int a=Integer.parseInt(showInputDialog("Rango a"));
        int b=Integer.parseInt(showInputDialog("Rango b"));
        showMessageDialog(null, funcion(a, b));
    }
    
}
