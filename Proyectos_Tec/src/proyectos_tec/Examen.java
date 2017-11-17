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
public class Examen {
    public static void suma2Numpares(){
        int r;
        int n1=Integer.parseInt(showInputDialog("Ingrese un numero"));
        int n2=Integer.parseInt(showInputDialog("Ingrese otro numero"));
        if (n1%2==0) {
            if (n2%2==0) {
              r=n1+n2;  
            }else{
                n2=n2-1;
                r=n1+n2;
            }
        }else{
            n1=n1-1;
            if (n2%2==0) {
                r=n1+n2;
            }else{
                n2=n2-1;
                r=n1+n2;
            }
        }
        showMessageDialog(null, "El resultado es: "+r);
    }
    public static void main(String[] args) {
        suma2Numpares();
    }
    
}
