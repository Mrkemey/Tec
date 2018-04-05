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
public class Complejos {
    private int e,c,d;
    public Complejos()
    {
        e=1;
        c=1;
        d=1;
    }//constructor
    public Complejos(int e, int c,int d){
        this.e=e;
        this.c=c;
        this.d=d;
    }
    public void leer()
    {
        e=leerEntero("Numero Entero");
        do
        {
            c=leerEntero("Numero Complejo");
        }while(c==0);
    }//leer
    
    public Complejos mas(Complejos b)
    {
        return new Complejos(this.e+b.e, this.c+b.c,d);
        /*Racionales temp=new Racionales();
        temp.n=(n*b.d)+(d*b.n);
        temp.d=d*b.d;
        return temp.simplifica();*/
    }
    public Complejos division(Complejos b){
      return new Complejos((this.e * b.e) + (this.c*b.c),(this.c*b.e) - (this.e*b.c),(b.e*b.e) + (b.c*b.c));
    }
    
    public void mostrar()
    {
        showMessageDialog(null,e+"+"+c+"i");
    }//mostrar
    public void mostrarImg(){
      showMessageDialog(null,"      " + e + "            " + c + "i" + "\n-------- + ---------\n" + "       " + d+ "             " + d);
   }
    
    
    public static void main(String[] args) 
    {
        Complejos a=new Complejos(2,3,1);
        a.mostrar();//debido a que recibe parametros, manda llamar al mostrar correcto :)
        Complejos b=new Complejos(1,1,1);
        b.mostrar();
        Complejos c=new Complejos();
        c=a.division(b); c.mostrarImg();
    }
}
