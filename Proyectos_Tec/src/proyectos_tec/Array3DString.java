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
public class Array3DString {
    private int h,r,c;
    String M[][][];
    
    public void leer(){
        r=EjerciciosU3.leerEntero("Filas");
        c=EjerciciosU3.leerEntero("Columnas");
        h=EjerciciosU3.leerEntero("Profundidad");
        M=new String[h][r][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    M[i][j][k]=EjerciciosU3.randomLetra();
                }
            }
        }
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
            showMessageDialog(null, cad+"\n Vocales= "+vocales(i)+"\n Mayor= "+mayor(i),"Hoja "+i,3);
            cad="";
        }
    }
    public int vocales(int s){
        String v="AEIOU";
        int con=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (v.contains(M[s][i][j])) {
                    con++;
                }
            }
        }
        return con;
    }
    public String mayor(int s){
        String j=M[0][0][0];
        String a="M["+0+"]["+0+"]["+0+"]: "+M[0][0][0];
        for (int k = 0; k <r; k++) {
            for (int l = 0; l < c; l++) {
                if (j.compareToIgnoreCase(M[s][k][l])<-1) {
                    j="M["+s+"]["+k+"]["+l+"] "+M[s][k][l];
                    a=""+j;
                }
            }
        }       
        return a;
    }
    public static void main(String[] args) {
        Array3DString a=new Array3DString();
        a.leer();a.mostrar();
    }
}
