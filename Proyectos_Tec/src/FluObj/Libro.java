/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FluObj;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmanu
 */
public class Libro {
    String ISBN,Titulo,Autor,Edi;
    float Precio;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEdi() {
        return Edi;
    }

    public void setEdi(String Edi) {
        this.Edi = Edi;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, String Edi, float Precio) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Edi = Edi;
        this.Precio = Precio;
    }
    public void guardar(){
        FileOutputStream fb=null;
        try {
            fb = new FileOutputStream("Libros.Obj",true);
            ObjectOutputStream fow =new ObjectOutputStream(fb);
            fow.writeObject(this);
            fow.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentFluObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentFluObj.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Libro Buscar(String isbn){
        FileInputStream fb=null;
        try {
            fb = new FileInputStream("Libros.Obj");
            ObjectInputStream fol =new ObjectInputStream(fb);
            
            return (Libro) fol.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentFluObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentFluObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
