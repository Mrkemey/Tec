/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestre2;
import static proyectos_tec.EjerciciosU3.*;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Funcion {
    private int nt;
    private Termino[] T;
    public Funcion(){
        
    }
    public Funcion(int n){
        nt=n;T=new Termino[nt];
    }
    public void leer(){
        if(nt==0){
            nt=leerEntero("Numero de Terminos");
        }
        for (int i = 0; i < nt; i++) {
            T[i]=new Termino();
            T[i].leer();
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < nt; i++) {
            cad=cad+T[i]+"+";
            
        }
        showMessageDialog(null, cad);
    }
    public static void main(String[] args) {
        Funcion f=new Funcion();
        f.leer();f.mostrar();
    }
    
}
