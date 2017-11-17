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
public class Repaso2 {
    public static int cAsc(String l){
        return l.charAt(0);
    }
    public static void ascRango(){
        String cad="";
        String ini=showInputDialog("Ingerese el inicio");
        String fin=showInputDialog("Ingerese el fin");
        int i=cAsc(ini);
        int f=fin.charAt(0);//es lo mismo que lo de arriba
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j = i; j <= f; j++) {
            cad=cad+(char)j+" : "+j+"\n";           
        }
        showMessageDialog(null, cad);
    }
    public static int sumaAsc(String cad){
        int s=0,a=0;
        for (int j = 0; j < cad.length(); j++) {
            s=s+cad.charAt(j);
            a=a+cAsc(cad.substring(j,j+1));
        }
        System.out.print(a);
        return s;
        
    }
        public static int mayAsc(String cad){
        int s=0,a=0;
        for (int j = 0; j < cad.length(); j++) {
            a=cad.charAt(j);
            if (a<cad.charAt(j)){
                
            }else{
                
            }
            
        }
        return s;
        
    }
    
    public static void main(String[] args) {
        showMessageDialog(null, sumaAsc("JUAN"));
    }
}
