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
public class Termino {
    private int c,e; 
    private String v;
    public Termino(){
        c=0;
        e=0;
        v="";
    }
    public Termino(int c,String v,int e){
        this.c=c;
        this.e=e;
        this.v=v;
    }
    public void leer(){
        c=leerEntero("Coeficiente");
        v=showInputDialog("Variable");
        e=leerEntero("Exponente");    
    }
    public void mostrar(){
        showMessageDialog(null, c+v+"^"+e);
    }
    @Override
    public String toString(){
        return c+v+"^"+e;
    }

}
