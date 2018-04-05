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
public class Materia {
    private int calif,nu;
    private String nombre,clave;
    private Unidad U[];
    public void leer(){
        clave=showInputDialog("Clave");
        nombre=showInputDialog("Nombre");
        nu=proyectos_tec.EjerciciosU3.leerEntero("Numero de unidades");
        U= new Unidad[nu];
        for (int i = 0; i < nu; i++) {
            U[i] = new Unidad();
            U[i].leer(); 
        }
        calif=prom()   ;
    }
    public int prom(){
        int temp=0;
        for (int i = 0; i < nu; i++) {
            temp=temp+U[i].getCalif();
        }
        return temp/nu;
    }
    @Override
    public String toString(){
        return clave+" - "+nombre+" - "+calif;
    }
    public static void main(String[] args) {
        Materia m=new Materia();
        m.leer();
        showMessageDialog(null, m.toString());
    }
}
