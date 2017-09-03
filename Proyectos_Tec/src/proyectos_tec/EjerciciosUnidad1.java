package proyectos_tec;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class EjerciciosUnidad1{

//------------------------------------------------------------------------------------------------------------------
   public static void main(String ar[]){
   
   //mayor2num();
   //Circulo();
   //mayor_igual2num();
   //verTriangulo();
   //monedas();
   //centAfahr();
   //formulaGeneral();
   primos();
   
   }
//------------------------------------------------------------------------------------------------------------------
   public static void mayor2num(){
   
      int a=Integer.parseInt(showInputDialog("numeroA"));
      int b=Integer.parseInt(showInputDialog("numeroB"));
      if(a>b)showMessageDialog(null,a+" es mayor");
      else showMessageDialog(null,b+" es mayor");
      
   }
//------------------------------------------------------------------------------------------------------------------
   public static void Circulo(){
   
      double r=Double.parseDouble(showInputDialog("Ingrese el Radio del Circulo"));
      double a=PI*(r*r);
      double p=(2*PI)*r;
      showMessageDialog(null,"El Area es: "+a+"\n\nEl Perimetro es: "+p);
   
   }
//------------------------------------------------------------------------------------------------------------------
   public static void mayor_igual2num(){
   
    int a=Integer.parseInt(showInputDialog("numeroA"));
      int b=Integer.parseInt(showInputDialog("numeroB"));
      if(a==b){
         showMessageDialog(null,"Son Iguales");
      }
      else {
         if(a>b)showMessageDialog(null,a+" es mayor");
         else showMessageDialog(null,b+" es mayor");
      }
   
   }
//------------------------------------------------------------------------------------------------------------------
   public static void verTriangulo(){
   
      int n1=Integer.parseInt(showInputDialog("Numero 1"));
      int n2=Integer.parseInt(showInputDialog("Numero 2"));
      int n3=Integer.parseInt(showInputDialog("Numero 3"));  
          
         if(n1>n2){
         
            if(n1>n3){
            
               int r=n2+n3;
               if(r>n1)showMessageDialog(null,"Es un Triangulo");
               else showMessageDialog(null,"No es un triangulo");
            
            }
            else{
            
            int r=n2+n1;
            if(r>n3)showMessageDialog(null,"Es un Triangulo");
            else showMessageDialog(null,"No es un triangulo");
            
            }
         
         }
         else{
         
            if(n2>n3){
            
               int r=n1+n3;
               if(r>n2)showMessageDialog(null,"Es un Triangulo");
               else showMessageDialog(null,"No es un triangulo");
            
            }
            else{
            
               int r=n2+n1;
               if(r>n3)showMessageDialog(null,"Es un Triangulo");
               else showMessageDialog(null,"No es un triangulo");
            
            }
            
         }
      
      
   }
//------------------------------------------------------------------------------------------------------------------
    public static void verTriangulo2(){
   
      int a=Integer.parseInt(showInputDialog("Numero 1"));
      int b=Integer.parseInt(showInputDialog("Numero 2"));
      int c=Integer.parseInt(showInputDialog("Numero 3"));
      if((a>b&&a>c)&&(a<(b+c)))showMessageDialog(null,"Es un Triangulo");
         else if((b>a&&b>c)&&(b<(a+c)))showMessageDialog(null,"Es un Triangulo");
            else if((c>a&&c>b)&&(c<(b+a)))showMessageDialog(null,"Es un Triangulo");
               else {showMessageDialog(null,"No es Triangulo"); return;}
     if(a==b&&a==c)showMessageDialog(null,"Trianguo equilatero");
      else if(a==b||a==c||b==c)showMessageDialog(null,"Triangulo Isoceles");
         else showMessageDialog(null,"Triangulo Escaleno");
   }

//------------------------------------------------------------------------------------------------------------------
//Coversion de moneda -leer cuantos doloares, Tipo de cambio (a cuanto estan), convertir a pesos
   public static void monedas(){
   
      float us=Float.parseFloat(showInputDialog(null,"Ingrese los dolares a convertir"));
      float mx=(float)17.6161*us;
      showMessageDialog(null,"En Pesos Mexicanos es: "+mx);
   
   }
//Convertir temperaturas, leer los C� convertir a Farh
   public static void centAfahr(){
   
      float c=Float.parseFloat(showInputDialog(null,"Ingrese los grados Celsius"));
      float f=(float)((c*1.8)+32.0);
      showMessageDialog(null,"Grados Fahrenheint"+f);
      
   }
   
// PAR e IMPAR   
   public static void esPar(){
      int numero;
      numero=Integer.parseInt(showInputDialog(null,"Ingrese un numero"));
      if(numero % 2 == 0)showMessageDialog(null,"Es Par");
         else showMessageDialog(null,"Es ImPar");
    }
//Formula General
    public static void formulaGeneral(){
    
    int a=Integer.parseInt(showInputDialog(null,"Ingrese a"));
    int b=Integer.parseInt(showInputDialog(null,"Ingrese b"));
    int c=Integer.parseInt(showInputDialog(null,"Ingrese c"));
    float r1=(float)(-b+Math.sqrt(b*b-4*a*c))/(2*a);
    float r2=(float)(-b-Math.sqrt(b*b-4*a*c))/(2*a);
    showMessageDialog(null,"x1= "+r1+"\nx2= "+r2);  
    }
//Cadena De letras
   /*public static void cadenaLetras(){
   
   String cad=showInputDialog(null,"Ingrese su Frase");
   int c=0;
   for(int i=0;i<cad.leght;i++){
      if(cad.charAt(i)=='a'||cad.charAt(i)=='e'||cad.charAt(i)=='i'||cad.charAt(i)=='o'||cad.charAt(i)=='u'||cad.charAt(i)=='A'||cad.charAt(i)=='E'||cad.charAt(i)=='I'||cad.charAt(i)=='O'||cad.charAt(i)=='U'){c++;}  
   }    showMessageDialog(null,cad+"\nTiene: "+c+" Vocales");
  }*/ 
 // numero pares de 1aN
   public static void pares1aN(){
   
   int n=Integer.parseInt(showInputDialog("valor de n"));
   String cad="";
   for(int i=n;i<=1;i--)if(i%2==0)cad=cad+i+"\n";
   showMessageDialog(null,cad);
   
   }
   public static void primos(){
      int d=0;
      int n=Integer.parseInt(showInputDialog("Ingrese un numero"));
      for(int i=1;i<=n;i++){
         if(n%i==0){
         
            d++;
         
         }
      
      }
      if(d==2){
      
         showMessageDialog(null,"Es primo");
      
      }
      else{
      
         showMessageDialog(null,"No es primo");
      
      }
   }
//-----------------------------------------------------------------------
   
   
   
}
