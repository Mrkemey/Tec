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
public class Array2DEntero_Cuadrados {
    private int r,c;
    private int M[][];
    public void leer(){
        int a=0,b=0;
        r=EjerciciosU3.leerEntero("Filas");
        c=r;
        M=new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                M[i][j]=a;
                a++;
            }
            b++;
            a=b;
        }
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cad=cad+M[i][j]+"       ";
            }
           cad=cad+"\n";
        }
        showMessageDialog(null, cad);
    }
    
    public static void main(String[] args) {
        Array2DEntero_Cuadrados a=new Array2DEntero_Cuadrados();
        a.leer(); a.mostrar();
    }
}

