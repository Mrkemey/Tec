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
public abstract class Figura implements Calculos {
    protected int x,y;
    protected String color, nombre;
    protected double a,p;

    public Figura() {
        this.x = 100;
        this.y = 100;
        this.color = "Negro";
        this.nombre = "Figura";
    }

    public Figura(int x, int y, String color, String nombre) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.nombre = nombre;
    }
    public abstract void dibujar();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
