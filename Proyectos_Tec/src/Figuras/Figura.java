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
public abstract class Figura {
    protected int x,y;
    protected String nom,color;
    protected float a,p;
    public Figura(){
        x=y=100;
        color="Azul";
        a=p=0;
        nom="";
    }
    public Figura(int x,int y, String c,String n){
        this.x=x;
        this.y=y;
        color=c;
        a=p=0;
        nom=n;
    }
    
    public void leer(){
        x=leerEntero("Coordenada x: ");
        y=leerEntero("Coordenada Y: ");
        color=showInputDialog("Color: ");
        nom=showInputDialog("Nombre: ");
        
    }
    public abstract float area();
    public abstract void dibujar();
}
