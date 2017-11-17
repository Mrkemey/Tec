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
public class Array2DString {
    private int r,c;
    private String M[][];
    public void leer(){
        r=EjerciciosU3.leerEntero("Filas");
        c=EjerciciosU3.leerEntero("Columnas");
        M=new String[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //M[i][j]=showInputDialog("M["+i+"]["+j+"]");
                M[i][j]=EjerciciosU3.randomLetra();
            }
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cad=cad+M[i][j]+" ";           
            }
            cad=cad+"\n";
        }
        showMessageDialog(null, cad+"\n"+moda());
    }
    public void posnomlength(){
        int largo=M[0][0].length();
        String cad="";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (largo<M[i][j].length()) {
                    cad="M["+i+"]["+j+"]";
                }
            }
        }
        showMessageDialog(null, cad);
    }
    public void ordenarAlf(){
        int tam=r*c,a=0;
        String A[]=new String[tam],cad="";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[a++]=M[i][j];
            }
        }
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].compareToIgnoreCase(A[j+1])>0) {
                    String t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
        a=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j]=A[a++];
                cad=cad+M[i][j]+"   ";
            }
        }
        showMessageDialog(null, cad);
    }
    public String moda(){
        int con=0,n=0,tam=r*c;
        String m="",A[] = new String[tam];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[con]=M[i][j];
                con++;
            }
        }
        for (int i = 0; i < tam; i++) {
            con=0;
            for (int j = 0; j < tam; j++) {
                if (A[i].equals(A[j])) {
                    con++;
                }
            }
            if (con>n) {
                n=con;m=A[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Array2DString a=new Array2DString();
        a.leer(); a.mostrar();
        a.posnomlength();
        a.ordenarAlf();
    }
}
