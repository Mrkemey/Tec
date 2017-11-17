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
public class EjemplosU2 {
    public static int numMayor(int n){
        int m=0;
        do {
            m=n%10;
            n=n/10;
            if (n%10>m) {
                m=n%10;
            }
        } while (n<0);
        return m;
    }
    public static String setTitulo(String cad){
        cad=cad.toLowerCase();
        String c="";
        c=cad.substring(0,1).toUpperCase();
        for (int i = 1; i < cad.length(); i++) {
            if (!cad.substring(i, i+1).equals(" ")) {
                c=c+cad.substring(i, i+1);
            }else{
                c=c+" "+cad.substring(i+1, i+2).toUpperCase();
                i++;
            }
        }
        return c;
    }
    public static int numMagico(String f){
        int n=0;String d="0123456789";
        for (int i = f.length()-1; i >= 0; i--) {
            int p=d.indexOf(f.substring(i,i+1));
            if (p!=-1) {
                n=n+p;
                if (n!=33||n!=22||n!=11) {
                    
                }
            }
        }
        return n;
    }
    public static String buscaCar(String cad, int ca){
        String m="";
        for (int i = cad.length()-1; i >= 0; i--) {
            if (ca==cad.charAt(i)) {
                m=i+"/"+m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        showMessageDialog(null, buscaCar("programacion", 111));
    }
}
