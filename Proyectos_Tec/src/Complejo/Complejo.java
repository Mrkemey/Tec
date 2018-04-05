/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complejo;

/**
 *
 * @author jmanu
 */
public class Complejo {
    private float r,i,d;

    public Complejo() {
        r=i=0;d=1;
    }

    public Complejo(float r, float i,float d) {
        this.r = r;
        this.i = i;
        this.d = d;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }
    public Complejo mas(Complejo b)
    {
        return new Complejo(this.r+b.r, this.i+b.i,d);
        /*Racionales temp=new Racionales();
        temp.n=(n*b.d)+(d*b.n);
        temp.d=d*b.d;
        return temp.simplifica();*/
    }
    public Complejo menos(Complejo b)
    {
        return new Complejo(this.r-b.r, this.i-b.i,d);
        /*Racionales temp=new Racionales();
        temp.n=(n*b.d)-(d*b.n);
        temp.d=d*b.d;
        return temp.simplifica();*/
    }
    public Complejo division(Complejo b){
      return new Complejo((this.r * b.r) + (this.i*b.i),(this.i*b.r) - (this.r*b.i),(b.r*b.r) + (b.i*b.i));
    }
    
}
