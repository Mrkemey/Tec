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
public class ArrayAlumno {
    private int tam;
    private Alumno A[];
    public void leer(){
        tam=EjerciciosU3.leerEntero("Tamaño");
        A=new Alumno[tam];
        for (int i = 0; i < tam; i++) {
            A[i]=new Alumno();
            A[i].leer();
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < tam; i++) {
            cad=cad+"\n"+A[i].toString();     
        }
        showMessageDialog(null, cad+"\n"+Prom());
    }
    public void ordenarE(){
         for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].getEdad()>A[j+1].getEdad()) {
                    Alumno t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }
    public void ordenarN(){
         for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].getNombre().compareToIgnoreCase(A[j+1].getNombre())>0) {
                    Alumno t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }
    public float Prom(){
        float s=0;
        for (int i = 0; i < tam; i++) {
            s=s+A[i].getEdad();
        }
        return s/tam;
    }
    public int men(){
        int j=A[0].getEdad();
        for (int i = 0; i < tam; i++) {
            if (j>A[i].getEdad()) {
                j=A[i].getEdad();
            }            
        }
        return j;
    }
    public static void main(String[] args) {
        ArrayAlumno a=new ArrayAlumno();
        a.leer();   a.mostrar();
        a.ordenarE();    a.mostrar();
    }
    
}
