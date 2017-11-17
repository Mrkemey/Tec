/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;
import static javax.swing.JOptionPane.*;
import static proyectos_tec.paquete2.Modulo1.*;
import static java.util.Calendar.*;

/**
 *
 * @author jmanu
 */
public class RepasoU2 {
    public static String dec8Bits(int n){
        String b=new String();
        if(n<0&&n>255){
            return "Error";
        }
        while (n>0) {
            b=n%2+b;
            n=n/2;
        }while (b.length()<8) {
           b="0"+b;
        }  
        return b;
    }
    public static void cadBin(){
        String cad=showInputDialog("cad");
        String cb="";
        for (int i = 0; i < cad.length(); i++) {
            cb=cb+" "+dec8Bits(cad.charAt(i))+" ";
        }
        showMessageDialog(null, cad+"\n"+cb);
    }
    public static String letraMen(String cad){
        String m=cad.substring(0,1);
        for (int i = 1; i < cad.length(); i++) {
            if (cad.substring(i,i+1).compareTo(m)<0){
               m=cad.substring(i,i+1);
            }
            int n=cad.charAt(i);
            System.out.println(n);
        }
        return m;
    }

    public static void main(String[] args) {
        //showMessageDialog(null, letraMen("PABLO"));
        showMessageDialog(null, DATE+"/"+MONTH+1+"/"+YEAR);
    }
}
