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
public class Array2DEntero {
    private int r,c;
    private int M[][];
    public void leer(){
        r=EjerciciosU3.leerEntero("Filas");
        c=EjerciciosU3.leerEntero("Columnas");
        M=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //M[i][j]=Float.parseFloat(showInputDialog("M["+i+"]["+j+"]"));
                llenarSim();
            }
        }
    }
    public void mostrar(){
        String cad="",cad2="",cad3="";
        float s=0,sv,T[]=new float[c];
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
        showMessageDialog(null, cad+"-----------------------------------------------\n"+cad2+"\n"+cad3+"\n"
                + "Dig"+sumDiag()+ " \nDigin"+sumDiaginv()+ " \nOrillas"+sumOri());
    }
    public void random(){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j]=(int) (Math.random() * 10);
            }
        }
    }    
    public void llenar(){
        int k=2;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j]=k;
                k=k+2;
            }
        }
    }
    public void llenarSim(){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j]=Math.abs(i-j);
            }
        }
    }
    public void llenarPrimos(){
        int k=2;
        
        for (int i = 0; i < r; i++) {
            M[0][0]=1;
            for (int j = 0; j < c; j++) {
                if (EjerciciosUnidad1.primos(k)==true) {
                    M[i][j]=k;
                    
                }else{
                    j--;
                }
                k++;
            }
        }
    }
    public int sumDiag(){
        int s=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i==j) {
                    s=s+M[i][j];
                }
            }
        }
        return s;
    }
    public int sumDiaginv(){
        int s=0,a=c-1;
        for (int i = 0; i < r; i++) {
                s=s+M[i][a-i];
        }
        return s;
    }
    public int sumOri(){
        int s=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i==0||i==r-1) {
                   s=s+M[i][j]; 
                }   
            }       
        }
        for (int i = 1; i < r-1; i++) {
            s=s+M[i][0];
            s=s+M[i][c-1];  
        }
        return s;
    }
    
    public static void main(String[] args) {
        Array2DEntero a=new Array2DEntero();
        a.leer(); a.mostrar();
    }
}

