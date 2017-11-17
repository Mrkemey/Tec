/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class OpNumeros {
    public static void mult5Rango(){
        int s=0;
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            if (j%5==0) {
                s=j+s;
            }
            
        }
        showMessageDialog(null, s);
    }
    public static void raizExacta(){
        double s=0;String cad="";
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            s=Math.sqrt(j);
            if (j%s==0) {  
                cad=cad+"\n"+j;
            }           
        }
        showMessageDialog(null, cad);
    }
    public static void numCon0(){
        String cad;
        String h="";
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            cad=j+"";
            for (int a = 0; a < cad.length(); a++) {    
                
                if (cad.charAt(a)=='0') {
                    h=h+"\n"+cad;
                    a=cad.length();
                }   
            }            
        }                  
        showMessageDialog(null, h);
    }
    public static void numCon0_2(){
        String cad;
        String h="";
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            cad=j+"";                
            if (cad.indexOf("0")>=1) {
                h=h+"\n"+cad;
            }               
        }                  
        showMessageDialog(null, h);
    }
    public static void numPrimos(){
        String cad;
        String h="";
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            cad=j+"";                
            if (EjerciciosUnidad1.primos(j)) {
                h=h+"\n"+cad;
            }               
        }                  
        showMessageDialog(null, h);
    }
    public static void añosBisi(){
        String cad="";
        int i=Integer.parseInt(showInputDialog("Ingerese el inicio"));
        int f=Integer.parseInt(showInputDialog("Ingerese el fin"));
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) { 
            
            if (j%1000==0||j%100!=0&&j%4==0) {
                cad=cad+"\n"+j;
                System.out.println(cad);
            }               
        }                  
        showMessageDialog(null, cad);
    }
    public static void codigoAscii(){
        String cad="";
        String cad1=showInputDialog("Ingerese el inicio");
        String cad2=showInputDialog("Ingerese el fin");
        int i=cad1.charAt(0);
        int f=cad2.charAt(0);
        if (i>f) {
            int temp=i;
            i=f;
            f=temp;
        }
        for (int j= i;  j<= f; j++) {
            showMessageDialog(null,cad.charAt(j) + " = " + cad.codePointAt(j));
        }
                
    }
    public static int ascMAY(String cad){
        int m;
        m = cad.charAt(0);
        for (int i = 1; i < cad.length(); i++) {
            if (cad.charAt(i)>m) {
                m=cad.charAt(i);
            }
        }
        return m;
    }
    public static boolean esPalindormo(String cad){
        cad=cad.toUpperCase();
        cad=cad.replace(" ", "");
        String cInv="";
        for (int i = 0; i < cad.length(); i++) {
            cInv=cad.substring(i,i+1)+cInv;   
        }
        return cad.equals(cInv);
    }

    public static void main(String[] args) {
//        showMessageDialog(null,ascMAY("HELLO"));
//        showMessageDialog(null, (char)ascMAY("HELLO"));
        //codigoAscii();
       // showMessageDialog(null,esPalindormo("Anita lava la tina"));
       if (esPalindormo(showInputDialog("Cadena"))) {
           showMessageDialog(null, "Es Palindromo");
       } else {
           showMessageDialog(null, "No es Palindromo");
       }
    }

}
