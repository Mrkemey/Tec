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
public class ArrayEntero {
    private int tam,A[];
    public void leer(){
        tam=EjerciciosU3.leerEntero("Tamaño Array");
        A=new int[tam];
        for (int i = 0; i < A.length; i++) {
            A[i]=EjerciciosU3.leerEntero("Dato a["+i+"]");      
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < A.length; i++) {
            cad = cad +"A["+i+"]"+A[i]+"\n";            
        }
        showMessageDialog(null, cad+"\nSuma= "+suma()+"\nProm= "+prom()+"\nMay= "+may()
                +"\nMen= "+men()+"\nMediana= "+mediana());
    }
    public int suma(){
        int j=0;
        for (int i = 0; i < A.length; i++) {
            j = A[i]+j;
            
        }
        return j;
    }
    public float prom(){
        float j = A.length;
        float r=suma()/j;
        return r;
    }
    public int may(){
        int j=A[0];
        for (int i = 0; i < A.length; i++) {
            if (j<A[i]) {
                j=A[i];
            }            
        }
        return j;
    }
    public int men(){
        int j=A[0];
        for (int i = 0; i < A.length; i++) {
            if (j>A[i]) {
                j=A[i];
            }            
        }
        return j;
    }
    public void ordenar(){
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j]>A[j+1]) {
                    int t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }
    public float mediana(){
        ordenar();
        if (tam%2!=0) {
            return A[tam/2];
        }else{
            return (A[tam/2]+A[tam/2-1])/2.0f;
        }
    }
 
    public static void main(String[] args) {
        ArrayEntero a=new ArrayEntero();
        a.leer();       a.mostrar();
        a.ordenar();    a.mostrar();

    }
}
