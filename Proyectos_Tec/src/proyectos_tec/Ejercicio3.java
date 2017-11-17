package proyectos_tec;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Ejercicio3 {
    public static String ladosArea(int n){
        String b;
        b = "";
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= n; k++) {
                if(j*k==n){
                    b=j+"*"+k+"\n"+b;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        showMessageDialog(null, ladosArea(2000));
    }
}
