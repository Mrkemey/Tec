/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import static javax.swing.JOptionPane.*;
import static proyectos_tec.EjerciciosU3.*;
/**
 *
 * @author jmanu
 */
public class Deportista extends Persona {
    protected String Deporte,tipo;
     public Deportista(){
        super();
        Deporte="Natacion";
        tipo="Estudiantil";
    }
    public Deportista(String d,String t,String n,int e){
        super(n,e);
        this.Deporte=d;
        this.tipo=t;
    }
    void leer(){
        super.leer();
        Deporte=showInputDialog("Num. Control");
        tipo=showInputDialog("Carrera");
    }
    public void mostrar(){
        showMessageDialog(null, nombre+"\n"+edad+"\n"+Deporte+"\n"
        +tipo);
    }
    public static void main(String[] args) {
        Deportista yo=new Deportista();
        yo.mostrar();
    }
}
