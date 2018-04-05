/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestre2;
import static proyectos_tec.EjerciciosU3.*;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Racional {
    private int n,d,n2=0;
    public Racional(){
        n=0;d=1;
    }
    public Racional(int n, int d){
        this.n=n;
        this.d=d;
    }

//   public Racional(float e, float c, float de,float dc){
//      this.n2 = (int) e;
//      this.n = (int) c;
//      this.d = (int) de;
//      this.d=(int) dc;
//   }
    public void leer(){
        n=leerEntero("Numerador");
        d=leerEntero("Denominador");
    }
    public void mostrar(){
        showMessageDialog(null, " "+n+"\n__\n "+d);
    }
    public void mostrar(String obj){
        showMessageDialog(null,"       "+n+"\n"+obj+"=____\n       "+d);
    }
    public Racional mas(Racional b){
        return new Racional(this.n*b.d+this.d*b.n, this.d*b.d);
    }
    public Racional mas(int e){
        return new Racional(this.n+this.d*e, this.d);
    }
    public Racional menos(Racional b){
        return new Racional(this.n*b.d-this.d*b.n, this.d*b.d);
    }
    public Racional menos(int e){
        return new Racional(this.n-this.d*e, this.d);
    }
    public Racional por(Racional b){
        return new Racional(this.n*b.n, this.d*b.d);
    }
    public Racional por(int e){
        return new Racional(this.n*e, this.d*e);
    }
    public Racional entre(Racional b){
        return new Racional(this.n*b.n, this.d*b.d);
    }
    public Racional entre(int e){
        return new Racional(this.n*e, this.d);
    }
    public Racional pow(int p){
        Racional temp = new Racional(1,1);
        for (int i = 1; i <= p; i++) {
            temp=temp.por(this); 
        }
        return temp;
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
        Racional a= new Racional(1,2);
        a.mostrar("a");
//        Racional b= new Racional(2,3);
        Racional c= new Racional();
//        b.mostrar("b");
//        c=a.mas(8);
//        c.mostrar("c");
//        c=a.por(8);
        c=a.pow(4);
        c.mostrar("c");
    }
    
}
