/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;
import static javax.swing.JOptionPane.*;
import static proyectos_tec.EjerciciosU3.*;
/**
 *
 * @author jmanu
 */
public class Racional {
    private int n,d;
    public String toString(){
        return n+"/"+d;
    }
    public void leer(){
        n=leerEntero("Numerador");
        d=leerEntero("Denominador");
    }
    public void mostrar(){
        showMessageDialog(null, n+"/"+d);
    }
    public Racional mas(Racional b){
        Racional temp=new Racional();
        temp.n=n*b.d+d*b.n;
        temp.d=d*b.d;
        return temp.Simpli();
    }
    public Racional menos(Racional b){
        Racional temp=new Racional();
        temp.n=n*b.d-d*b.n;
        temp.d=d*b.d;
        return temp;
    }
    public Racional por(Racional b){
        Racional temp=new Racional();
        temp.n=n*b.n;
        temp.d=d*b.d;
        return temp;
    }
    public Racional entre(Racional b){
        Racional temp=new Racional();
        temp.d=n*b.d;
        temp.n=d*b.n;
        return temp.Simpli();
    }
    public boolean Mayor(Racional r){
        return (float)n/d>r.n/r.d;
    }
    public Racional(){
        do {            
            n=(int)(Math.random()*10);
        } while (n==0); 
        do {            
            d=(int)(Math.random()*10);
        } while (d==0);
    }
    public Racional(int x,int y){
        n=x;d=y;
    }
    public int MCD(int a,int b){
        int r;
        if (a<b) {
            int t=a;
            a=b;
            b=t;
        }do {
            r=b;
            b=a%b;
            a=r;
        } while (b!=0);
        return a;
    }
    public Racional Simpli(){
        int m=MCD(n, d);
        n=n/m; d=d/m;
        return this;
    }
    public static void main(String[] args) {
        Racional a=new Racional();
        a.leer();
        a.mostrar();
        
        Racional b=new Racional();
        b.leer();
        b.mostrar();
        
        Racional c=new Racional();
        c=a.mas(b);
        c.mostrar();
    }
}
