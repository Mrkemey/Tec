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
public class EjemplosCiclos {
    public static void Nnumeros(){
        int cont=0;
        String cad="";
        int n;
        do {
            n=Integer.parseInt(showInputDialog("Numero"));
            cont=cont+n;
            if(n!=0)cad=cad+"\n"+n;   
        } while (n!=0);
        showMessageDialog(null, "Suma= "+cont+"\n"+cad);
    }
    
    public static void main(String[] args) {
        Nnumeros();
    }
    
}
