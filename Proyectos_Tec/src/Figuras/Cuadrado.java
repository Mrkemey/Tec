/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import static proyectos_tec.EjerciciosU3.*;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Cuadrado extends Figura{
    protected float lado;
    
    public Cuadrado(){
        super();
        lado=(float)Math.PI*lado;
        
    }
    public Cuadrado(float l){
        super();
        lado=l;
    }
    public Cuadrado(int x,int y, String c,String n, float l){
        super(x,y,c,"Cuadrado");
        lado=l;
    }
    @Override
    public float area() {
        return a=lado*lado;
    }

    @Override
    public void dibujar() {
        
    }
    @Override
    public void leer(){
        super.leer();
        lado=Float.parseFloat(showInputDialog("Lado :"));
    }
    public void mostrar(){
        showMessageDialog(null, "X= "+x+"\nY= "+y+"\nColor:"+color
        +"\nNombre: "+nom+"\nArea="+a);
    }
    public static void main(String[] args) {
        Cuadrado c=new Cuadrado();
        c.mostrar();
    }
    
}
