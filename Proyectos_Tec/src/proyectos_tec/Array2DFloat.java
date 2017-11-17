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
public class Array2DFloat {
    private int r,c;
    private float M[][];
    public void leer(){
        r=EjerciciosU3.leerEntero("Filas");
        c=EjerciciosU3.leerEntero("Columnas");
        M=new float[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < M.length; j++) {
                //M[i][j]=Float.parseFloat(showInputDialog("M["+i+"]["+j+"]"));
                random();
            }
        }
    }
    public void mostrar(){
        String cad="",cad2="",cad3="";
        float s=0,sv=0,T[]=new float[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cad=cad+M[i][j]+"   ";
                s=s+M[i][j];  
                //sv=sv+M[j][i];
                T[j]=T[j]+M[i][j];
                
            }
            //cad2=cad2+" s: "+sv;
            cad=cad+"   Suma: "+s+"\n";
            s=0;
            sv=0;
            
        }
        for (int i = 0; i < c; i++) {
            cad3=cad3+T[i]+"    ";    
        }
        showMessageDialog(null, cad+"-----------------------------------------------\n"+cad2+"\n"+cad3);
    }
    public void random(){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j]=(float)Math.random()*10;
            }
        }
    }
    public static void main(String[] args) {
        Array2DFloat a=new Array2DFloat();
        a.leer(); a.mostrar();
    }
}

