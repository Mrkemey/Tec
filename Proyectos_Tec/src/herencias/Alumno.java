/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class Alumno extends Persona{
    
    private String nc, carrera;
    private int sem;
    
    public Alumno(){
        super();
        nc="17401096";
        carrera="ISC";
        sem=2;
    }
    public Alumno(String n,int e,String nc,String c,int s){
        super(n,e);
        this.nc=nc;
        this.carrera=c;
        this.sem=s;
    }
    void leer(){
        super.leer();
        nc=showInputDialog("Num. Control");
        carrera=showInputDialog("Carrera");
        sem=Integer.parseInt(showInputDialog("Semestre"));
    }
    public void mostrar(){
        showMessageDialog(null, nombre+"\n"+edad+"\n"+nc+"\n"
        +carrera+"\n"+sem);
    }
    public static void main(String[] args) {
        Alumno yo=new Alumno();
        yo.leer();
        yo.mostrar();
    }
    
}
