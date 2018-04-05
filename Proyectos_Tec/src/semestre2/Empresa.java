package semestre2;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmanu
 */
import static javax.swing.JOptionPane.*;
public class Empresa {
    String rfc="",dir,nom,url,cad;
    public String leer(){
        rfc=showInputDialog("RFC");
        dir=showInputDialog("Direccion");
        nom=showInputDialog("Nombre");
        url=showInputDialog("Url");
        return cad=rfc+"\n"+dir+"\n"+nom+"\n"+url;
    }
    public void mostrar(){
        showMessageDialog(null, ""+cad);   
    }
    public static void main(String[] args) {
        Empresa a=new Empresa();
        a.leer();
        a.mostrar();
    }
}

