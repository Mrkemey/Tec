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
public class ArrayPonencia {
    private int np=5;
    private Ponencia P[];
    public ArrayPonencia(){
        np=0;
    }
    public ArrayPonencia(int n){
        np=n;
    }
    public void leer(){
        if (np==0) {
            np=leerEntero("Numero de ponencias");
        }
        P=new Ponencia[np];
        for (int i = 0; i < np; i++) {
            P[i]=new Ponencia();
            P[i].leer();
        }
    }
    public int promDur(){
        int s=0;
        for (int i = 0; i < np; i++) {
            s=s+P[i].getDur();  
        }
        return s/np;
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < np; i++) {
            cad=cad+P[i]+"\n";
        }
        showMessageDialog(null, cad+"\nPromedio = "+promDur());
    }
    
    public static void main(String[] args) {
        ArrayPonencia a=new ArrayPonencia(3);
        a.leer();
        a.mostrar();
    }
}
