package semestre2;


import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmanu
 */
public class Pelicula {
    String tit,clas,gen,cad;
    int dur;
    public String leer(){
        String C[]={"AA","A","B","B15","C"};
        String G[]={"Drama","Suspenso","Accion","Drama","Terror"};
            tit=showInputDialog("Titulo");
            clas=showInputDialog(null,"Clasificacion:","Clasificacion",3,null,C,0).toString();
            gen=showInputDialog(null,"Genero:","Genero",3,null,G,0).toString();          
            dur=proyectos_tec.EjerciciosU3.leerEntero("Duracion(minutos)");
        return cad=
                "Titulo: "+tit+"\n"+
                "Clasificacion: "+clas+"\n"+
                "Genero: "+gen+"\n"+
                "Duracion: "+dur+"m";
    }
    public void mostrar(){
        showMessageDialog(null, ""+cad);   
    }
    public static void main(String[] args) {
        Pelicula a=new Pelicula();
        a.leer();
        a.mostrar();
    }
}
