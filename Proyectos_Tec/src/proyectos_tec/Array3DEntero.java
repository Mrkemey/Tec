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
public class Array3DEntero {
    private int h,r,c,
            M[][][];
    public void leer(){
        r=EjerciciosU3.leerEntero("Filas");
        c=EjerciciosU3.leerEntero("Columnas");
        h=EjerciciosU3.leerEntero("Profundidad");
        M=new int[h][r][c];
        random();
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    cad=cad+M[i][j][k]+"    ";      
                }
                cad=cad+"\n";     
            }
            showMessageDialog(null, cad+ "  SumaT= "+sumaH()+"\n  Prom= "+promH(i)+"  May= "+mayHoja(i)
                    ,"Hoja"+i+"  Suma= "+suma(i),3);
            cad="";
        }
    }
    public void random(){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    M[i][j][k]=(int) (Math.random() *10);      
                }    
            }
        }
    }
    public int suma(int i){
        int s=0;
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                s=s+M[i][j][k];      
            }    
        }
        return s;
    }
    public float promH(int s){
        return (float)suma(s)/(r*c);
    }
    public int mayHoja(int s){
        int m=M[s][0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (M[s][i][j]>m) {
                    m=M[s][i][j];
                }
            }
            
        }
        return m;
    }
    public int sumaH(){
        int s=0;
        for (int i = 0; i < h; i++) {
            s=s+suma(i);
            
        }
        return s;
    }
    public static void main(String[] args) {
        Array3DEntero a=new Array3DEntero();
        a.leer();a.mostrar();
        
    }
}
