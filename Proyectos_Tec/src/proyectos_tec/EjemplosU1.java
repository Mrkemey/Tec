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
public class EjemplosU1 {
//    public static boolean primos(int n){
//      int d=0;
//      for(int i=1;i<=n;i++){
//         if(n%i==0){         
//            d++;         
//         }
//      }
//      if(d==2){     
//         return true;    
//      }
//      else{     
//         return false;     
//      }
//    }
    
    
    public static void primos1aN(){
        String primos="";
        int numPrimos=0;
        int a=Integer.parseInt(showInputDialog("Ingrese un numero"));
        for (int i = 1; i <= a; i++) {
            
            if (EjerciciosUnidad1.primos(i)) {
                primos=primos+i+"/";
                numPrimos++;
            }           
        }
        showMessageDialog(null, "Primos: "+primos+"\n Cantidad: "+numPrimos);
    }
    public static void main(String[] args) {        
//        showMessageDialog(null, EjerciciosUnidad1.primos(32));
          primos1aN();
    }
}
