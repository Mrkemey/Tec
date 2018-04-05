/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestre2;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Fecha {
    private int d,m,a,n;
    String M[]={"","Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
    int D[]={0,31,28,31,30,31,31,30,31,30,31,30,31};
    public void leer(){
        String mes;
                
        do {            
            mes=showInputDialog(null,"Mes:","Mes",3,null,M,M[1]).toString();
        } while (mes.equals(""));
        
        for (int i = 1; i <= 12 ; i++) {
            if (mes.equals(M[i])) {
                m=i;
            }
        }
        a=proyectos_tec.EjerciciosU3.leerEntero("Año");
        if (a%4==0) {
            D[2]++;
        }
        do {            
            d=proyectos_tec.EjerciciosU3.leerEntero("Dia"+"1 - "+D[m]);
        } while (d<1||d>D[m]);     
        
        
    }
    public void mostrar(){
        showMessageDialog(null, d+"/"+m+"/"+a);
    }
    public void nDias(){
        for (int i = 1; i < m; i++) {
                n=D[i]+n; 
        }       
        n=n+this.d;
        if (a%4==0) {
            n=n+1;
        }
        showMessageDialog(null, n);
    }
    public Fecha(){
        
    }
    public Fecha(int d,int m,int a){
        this.d=d;this.m=m;this.a=a;
    }
    public static void main(String[] args) {
        Fecha hoy;
//        hoy=new Fecha();
//        hoy.leer();
        hoy=new Fecha(19,06,1999);
        hoy.mostrar();
        hoy.nDias();
    }
}
