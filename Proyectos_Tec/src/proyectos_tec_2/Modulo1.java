/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_tec_2;
import static java.lang.Math.*;
/**
 *
 * @author jmanu
 */
public class Modulo1 {
    public static int dobleNum(int n){
        return 2*n;
    }
    public static int binDec(String b){
        int d=0,p=0;
        for (int i = b.length()-1; i >= 0; i--)
            d=d+Integer.parseInt(b.substring(i,i+1))*(int)Math.pow(2,p++);
        return d;
    }
    public static String decBin(int n){
        String b;
        b = "";
        for (; n>0; n=n/2)b=n%2+b;
        return b;
    }
    public static String decHEX(int n){
        String b;
        b = "";
        for (; n>0; n=n/16){
//            b=n%16+b;
            switch(n%16){
                case 10:b="A"+b;
                    break;
                case 11:b="B"+b;
                    break;
                case 12:b="C"+b;
                    break;
                case 13:b="D"+b;
                    break;
                case 14:b="E"+b;
                    break;
                case 15:b="F"+b;
                    break;
                default:b=n%16+b;
            }
        }
        return b;
    }
        public static int hexDec(String hex){
        int dec=0,p=0,d;String c="";
        for (int i = hex.length()-1; i >= 0; i--){
//            int c=d+Integer.parseInt(b.substring(i,i+1))*(int)Math.pow(2,p++);
            c=hex.substring(i,i+1);
            switch(c){
                case "a":d=10;break;case "b":d=11;break;case "c":d=12;break;case "d":d=13;break;case "e":d=14;break;case "f":d=15;break;
                case "A":d=10;break;case "B":d=11;break;case "C":d=12;break;case "D":d=13;break;case "E":d=14;break;case "F":d=15;break;
                default:d=Integer.parseInt(c);
            }
            dec=dec+d*(int)Math.pow(16,p++);
//              dec=dec+(d*(16^p++));
        }
        return dec;
    }
    public static String decOct(int n){
        String b;
        b = "";
        for (; n>0; n=n/8)b=n%8+b;
        return b;
    }
        public static int octDec(String b){
        int d=0,p=0;
        for (int i = b.length()-1; i >= 0; i--)
            d=d+Integer.parseInt(b.substring(i,i+1))*(int)Math.pow(8,p++);
        return d;
    }
        public static String EjemploCiclo(int n){
            String b="";
            for (int i = 1; i <= 10; i++) {
                b=b+n+"x"+i+"="+(n*i)+"\n";
            }
            return b;
        }

}
