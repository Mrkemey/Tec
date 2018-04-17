/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 * @param <Tipo>
 */
public class Array<Tipo> {
    private int tam;
    private Object A[];

    public Array(int t) {
        tam = t;
    }
    
    public void leer(){
        for (int i = 0; i < tam; i++) {
            A[i]=showInputDialog("leer"); 
            
        }
    }
    public void mostrar(){
        for (Object t : A) {
            showMessageDialog(null, t);
        }
    }
    
    
    public static void main(String[] args) {
        Array<Integer> a=new Array(3);
        a.leer();
        a.mostrar();
    }
    
    
}

