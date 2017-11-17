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
public class ArrayRacional {
    private int tam;
    private Racional A[];
    public void leer(){
        tam=EjerciciosU3.leerEntero("Tamaño");
        A=new Racional[tam];
        for (int i = 0; i < tam; i++) {
            A[i]=new Racional();
            A[i].Simpli();
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < tam; i++) {
            cad=cad+"\n"+A[i].toString();     
        }
        showMessageDialog(null, cad+"\nSuma:    "+suma()+"\nMayor:  "+may()+"\nDivision:  "+Divi());
    }
    public Racional suma(){
        Racional s=new Racional(0,1);
        s=A[0];
        for (int i = 1; i < tam; i++) {      
            s=s.mas(A[i]);
        }
        return s;
    }
    public Racional Divi(){
        Racional s;
        s=A[0];
        for (int i = 1; i < tam; i++) {      
            s=s.entre(A[i]);
        }
        return s;
    }
    public Racional may(){
        Racional m;m=A[0];
        for (int i = 0; i < tam; i++) {
            if (m.Mayor(m)) {   
                m=A[i];
            }            
        }
        return m;
    }
    public void ordenar(){
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam-i; j++) {
                if (A[j].Mayor(A[j+1])) {
                    Racional t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }                
            }            
        }
    }
    //public Racional media(){
        //return suma().entre(Racional(tam,1));
    //}
    public static void main(String[] args) {
        ArrayRacional a=new ArrayRacional();
        a.leer();   a.mostrar();
        a.ordenar();a.mostrar();
    }
}
