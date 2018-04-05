package semestre2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static javax.swing.JOptionPane.*;
/**
 *
 * @author jmanu
 */
public class Unidad {
    private int num,calif;
    private String tema;
    public void leer(){
        num=proyectos_tec.EjerciciosU3.leerEntero("Numero de la Unidad");
        tema=showInputDialog("Tema");
        calif=proyectos_tec.EjerciciosU3.leerEntero("Calificacion");
        
    }
    public int getCalif(){
        return calif;
    }
    public void setCalif(int c){
        calif=c;
    }
    public String toString(){
        return num+" - "+tema+" - "+calif;
    }
}
