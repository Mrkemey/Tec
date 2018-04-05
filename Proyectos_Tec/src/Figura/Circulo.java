package Figura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmanu
 */
public class Circulo extends Figura {
    protected float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio, int x, int y, String color, String nombre) {
        super(x, y, color, nombre);
        this.radio = radio;
    }    
    @Override
    public void dibujar() {
        
    }

    @Override
    public double area() {
        a=(radio*radio)*PI;
        return a;
    }

    @Override
    public double perimetro() {
        p=PI*(2*radio);
        return p;
    }
    
}
