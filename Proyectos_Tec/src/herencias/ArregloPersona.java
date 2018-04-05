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
public class ArregloPersona {
    
    private Persona P[]=new Persona[2];
    private int tam=P.length;
    public ArregloPersona(){
        P[0]=new Alumno("Juan",18,"17401096","ISC",2);
        P[1]=new Deportista("profesional","Natacion","Wong",18);
    }
    public void mostrar(){
        String cad="";
        for (int i = 0; i < tam; i++) {
            cad=cad+P[i]+"\n";
            
        }
        showMessageDialog(null, cad);
    }
    public static void main(String[] args) {
        ArregloPersona a=new ArregloPersona();
        a.mostrar();
    }
}
