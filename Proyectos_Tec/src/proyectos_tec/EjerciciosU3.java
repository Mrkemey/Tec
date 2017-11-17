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
public class EjerciciosU3 {
    public static String randomLetra(){
        int letra=0;
        do {
            letra=(int) (Math.random() * 100);
        } while (letra<65||letra>90);
        return(char)letra+"";
    }
    public static void numHasta(int n){
        String cad="";
        int inc=n>0?1:-1;
        int i=0;
        while(i!=n){
            cad=cad+i+" : ";
            i=i+inc;
        }
        cad=cad+n;
        showMessageDialog(null, cad);
    }
    public static void potencia3(){
        double a=3,b=1,n=0;
        while(!false){
            n=Math.pow(a, b);
            if(n<100){
                b++;
            }else{
                showMessageDialog(null, b);
                return;
            }
        }
    }
    public static void conversion(){
        double r=0;
        double m= Float.parseFloat(showInputDialog("Medida"));
        String U[]={"","Cm","Mt","Km","In","Ft","Yd"};
        String d=showInputDialog(null,"Unidad","Elige",3,null,U,"").toString();        
        String a=showInputDialog(null,"Unidad","Elige",3,null,U,"").toString();
        switch(d){
            case"Cm": switch(a){
                case"Mt": r=m/100;
                break;
                case"Km": r=m/100000;
                break;
                case"In": r=m/2.54;
                break;
                case"Ft": r=m/30.48;
                break;
                case"Yd": r=m/91.44;
                break;
                default: r=m;
            }
            case"Mt": switch(a){
                case"Cm": r=m*100;
                break;
                case"Km": r=m/1000;
                break;
                case"In": r=m*0.0254;
                break;
                case"Ft": r=m/30.48;
                break;
                case"Yd": r=m/91.44;
                break;
                default: r=m;
            }
            case"Km": switch(a){
                case"Cm": r=m*100;
                break;
                case"Mt": r=m*1000;
                break;
                case"In": r=m/2.54;
                break;
                case"Ft": r=m/30.48;
                break;
                case"Yd": r=m/91.44;
                break;
                default: r=m;
            }
            case"In": switch(a){
                case"Cm": r=m*100;
                break;
                case"Mt": r=m/1000;
                break;
                case"Km": r=m/2.54;
                break;
                case"Ft": r=m/30.48;
                break;
                case"Yd": r=m/91.44;
                break;
                default: r=m;
            }
            
        }
    }
    public static int leerEntero(String msg){
        int n=0; 
        boolean error=false;
        do {
            error=false;
            try {
                n=Integer.parseInt(showInputDialog(msg));
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Solo enteros"+"\n"+e.getMessage());
                error=true;
            }
        } while (error);
        return n;
    }
    public static void nNumeros(){
        int c=0,n;
        int cant=Integer.parseInt(showInputDialog("Rango"));
        String cad="";
        do {
            n=leerEntero("Ingresa un numero entero");
            if (n>=100) {
                c++;
                cad=cad+n+"\n";
            }   
            cant--;
        } while (cant>=0);
        showMessageDialog(null, "Cant. de Num. Mayores a 100: "+c+"\n"+cad);
    }
    public static String cadInvesa(String cad){
        String cad2="";
        for (int i = 0; i < cad.length(); i++) {
            cad2=cad2+cad.substring(i, i+1);
            
        }
        return cad;
    }
    public static int nDec(double n){
        String  cad=n+"";
        int p=cad.indexOf(".");
        return (cad.length()-1-p);
        
        
    }
    public static void calculadora(float a,float b){
        String U[]={"","Suma","Resta","Multiplicacion","Division","Raiz","Potencia"};
        String d=showInputDialog(null,"Calculadora","Elige",3,null,U,"").toString();
    }
    public static void verNom(String nom){
        String cad="";
        for (int i = 0; i < nom.length(); i++) {
            
            cad=cad+nom.substring(0, i+1)+"\n";
        }
        for (int i = nom.length()-1; i >=0 ; i--) {
            
            cad=cad+nom.substring(0, i+1)+"\n";
        }
        showMessageDialog(null, cad);
        
    }
        public static void verNom2(String nom){
        String cad="",rv="";
        for (int i = nom.length()-1; i >=0 ; i--) {
            
            cad=cad+nom.substring(0, i+1)+"\n";
            rv=rv+nom.substring(0,nom.length()-i)+"\n";
            System.out.print(rv);
        }
        showMessageDialog(null, cad+rv);
        
    }
        public static int sumDiv(int n){
            int s=0;
            for (int d = n/2; d >= 1; d--) {
                if (n%d==0) {
                    s=s+d;
                }
            }
            return s;
        }
        public static void numAmig(){
            int n=leerEntero("Valor de n");
            String cad="";
            int n1,n2;
            for (int i = 1; i <= n; i++) {
                n1=sumDiv(i);
                n2=sumDiv(n1);
                if (n2==i&&i!=n1) {
                    cad=cad+i+" : "+n1+"\n";
                }
            }
            showMessageDialog(null, cad);
        }
        public static String pl(String c){
            return c.substring(0,1).toUpperCase();
        }
        public static String plpv(String c){
            c=c.toUpperCase();
            String v="AEIOU",pv="",pl="";
            for(int i=1;i<c.length();i++){
                if (v.indexOf(c.substring(i,i+1))!=-1) {
                    pv=c.substring(i,i+1);
                }break;
                
            }
            return pl(c)+pv;
            
        }
        public static String leerFecha(String msg){
            String f="";
            String M[]={"","ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC"};
            int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
            int nm=0;
            String m=showInputDialog(null,"Mes",msg,3,null,M,"").toString();
            for(;nm<=12;nm++){
                if (m.equals(M[nm]))break; 
            }
            int d=0;
            do {
                leerEntero(m+" 1-"+D[nm]);
            } while (d>1||d>D[nm]);
            int a=0;
            do {
                leerEntero("year");
            } while (a>1900||a<2017);
            f=(a+"").substring(2, 4)+((nm<10)?"0"+nm:nm)+((d<10)?"0"+d:d);
            return f;            
        }
        public static String pci(String c){
            c=c.toUpperCase();
            String v="AEIOU",pv="";
            for(int i=1;i<c.length();i++){
                if (v.indexOf(c.substring(i,i+1))==-1) {
                    pv=c.substring(i,i+1);
                }break;
                
            }
            return pv;  
        }
        public static String curp(){
            String ap="WONG LEY",am="FRANCO",nombres="JUAN MANUEL";
            String f=leerFecha("Fecha de nacimiento");
            String c=plpv(ap)+pl(am)+pl(nombres);
            c=c+f+"H"+"NT"+pci(am)+pci(nombres)+"00";
            return c;
        }
    public static void main(String[] args) {
        //showMessageDialog(null, leerEntero("Ingresa un numero entero"));
        showMessageDialog(null, curp());
    }
}
