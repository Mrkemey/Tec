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
public class Funciones {
    public static String decBinW(int n){
        String b="";
        while (n>0) {
            b=n%2+b;
            n=n/2;
        }
        return b;
    }
    public static String decOctW(int n){
        String b="";
        while (n>0) {
            b=n%8+b;
            n=n/8;
        }
        return b;
    }
    public static String separarCad(String cad){
        String b="";
        for (int i = 0; i < cad.length(); i++) {
            b=b+cad.substring(i,i+1)+"-";
            //b=b+cad.charAt(i)+"-";
        }
        b=b.substring(0,b.length()-1);
        return b;
    }
    public static void main(String[] args) {
//        int n=55;
//        String b=decBinW(n);
//        showMessageDialog(null, n+"="+b);
//------------------------------------------------
//       showMessageDialog(null, decBinW(55));
//------------------------------------------------
//        showMessageDialog(null, decOctW(55));
//        do {
//            int n=Integer.parseInt(showInputDialog("n"));
//            showMessageDialog(null, decBinW(n));
//        } while (showInputDialog("otro (s/n)").equals("s"));
//        do {
//            int n=Integer.parseInt(showInputDialog("n"));
//            showMessageDialog(null, decOctW(n));
//        } while (showInputDialog("otro (s/n)").equals("s"));
showMessageDialog(null, separarCad(showInputDialog("cadena")));
    }
}
