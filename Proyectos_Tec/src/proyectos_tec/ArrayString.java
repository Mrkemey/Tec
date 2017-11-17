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
public class ArrayString {
    private int tam;
    String A[];
    public void leer(){
        tam=EjerciciosU3.leerEntero("Tamaño Array");
        A=new String[tam];
        for (int i = 0; i < A.length; i++) {
            //A[i]=showInputDialog(null,"Dato a["+i+"]: "); 
            A[i]=EjerciciosU3.randomLetra();
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < A.length; i++) {
            cad = cad +"A["+i+"]"+A[i]+"\n";            
        }
        showMessageDialog(null, cad+"\nMediana= "+mediana()+"\nMay= "+may()
                +"\nMen= "+men()+"\nModa= "+moda());
    }
    public String may(){
        String j=A[0];
        String a="A["+0+"]: "+A[0];
        for (int i = 0; i < A.length; i++) {
            if (j.compareToIgnoreCase(A[i])<-1) {
                j="A["+i+"]: "+A[i];
                a=j;
            }            
        }
        return a;
    }
    public String men(){
        String j=A[0];
        String a="A["+0+"]: "+A[0];
        for (int i = 0; i < A.length; i++) {
            if (j.compareToIgnoreCase(A[i])>1) {
                j="A["+i+"]: "+A[i];
                a=j;
            }            
        }
        return a;
    }
    public void ordenar(){
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].compareToIgnoreCase(A[j+1])>0) {
                    String t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }
    public void ordenartam(){
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].length()>A[j+1].length()) {
                    String t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }

    public String mediana(){
        ordenar();
        if (tam%2!=0) {
            return A[tam/2];
        }else{
            return (A[tam/2-1]+A[tam/2]);
        }
    }
    public String moda(){
        int c=0,n=0;
        String m="";
        for (int i = 0; i < tam; i++) {
            c=0;
            for (int j = 0; j < tam; j++) {
                if (A[i].equals(A[j])) {
                    c++;
                }
            }
            if (c>n) {
                n=c;m=A[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        ArrayString a=new ArrayString();
        a.leer();       a.mostrar();
        a.ordenar();    a.mostrar();
    }
}
