/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestre2;

import static javax.swing.JOptionPane.*;
import proyectos_tec.EjerciciosU3;

/**
 *
 * @author jmanu
 */
public class Fechas {
    private int d,m;
    private int a;
    int M[]={0,1,2,3,4,5,6,7,8,9,10,11,12};
    int D[]={0,31,28,31,30,31,31,30,31,30,31,30,31};

    public Fechas(){
        d=m=1;
        a=1;
    }    
    public Fechas(int d, int m, int a) {
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public void leer(){
        int mes;
                
        do {            
            mes=EjerciciosU3.leerEntero("Mes");//Cambialo aqui :V
        } while (mes==0);
        
        for (int i = 1; i <= 12 ; i++) {
            if (mes==(M[i])) {
                m=i;
            }
        }
        a=proyectos_tec.EjerciciosU3.leerEntero("Año");//Cambialo aqui :V
        if (a%4==0) {
            D[2]++;
        }
        do {            
            d=proyectos_tec.EjerciciosU3.leerEntero("Dia"+"1 - "+D[m]);//Cambialo aqui :V
        } while (d<1||d>D[m]);        
    }
    public void mostrar(){
        showMessageDialog(null, d+"/"+m+"/"+a);
    }
    public Fechas mas(Fechas y){
        int sd,sm;
        int sa;
        sd=d+y.d;
        sm=m+y.m;
        sa=a+y.a;
        while (sm>12) { 
            sm=sm-12;
            sa++;
        }
        while (sd>D[sm]) {            
            sd=sd-D[sm];
            sm=sm+1;
        }
                    
        
        return new Fechas(sd,sm,sa);

    }
    public Fechas mayor (Fechas f){
        int am,dm,mm;
            am=f.a;mm=f.m;dm=f.d;
        if(f.a>a){
            am=f.a;mm=f.m;dm=f.d;
        }else{
            if (f.m>m) {
                am=f.a;mm=f.m;dm=f.d;
            }else{
                if (f.d>d) {
                am=f.a;mm=f.m;dm=f.d;
                }else{
                   am=a;mm=m;dm=d; 
                }
            }
        }
        return new Fechas(dm,mm,am);
        
    }
    public static void main(String[] args) {
        Fechas a=new Fechas(19,6,1878);
        //a.leer();
        a.mostrar();
        Fechas b=new Fechas(10,11,1877);
        //b.leer();
        b.mostrar();
        Fechas c=new Fechas();
        c=a.mas(b);
        c.mostrar();
        c=a.mayor(b);
        c.mostrar();
    }    
}
