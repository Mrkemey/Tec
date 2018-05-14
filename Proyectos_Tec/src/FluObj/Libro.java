package FluObj;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import static javax.swing.JOptionPane.showMessageDialog;

public class Libro implements Serializable{
    String isbn,titulo, autor, editorial;
    public static String fDir="Book.jObj";
    float precio;

    public Libro() 
    {
    }

    public Libro(String isbn, String titulo, String autor, String editorial, float precio) 
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void guardar()
    {
        try {
            java.io.FileOutputStream fb = new java.io.FileOutputStream(fDir, true);
            java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb);
            fow.writeObject(this);
            fow.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }//guardar
    public void guardar(boolean Type)
    {
        try {
            java.io.FileOutputStream fb = new java.io.FileOutputStream(fDir, Type);
            java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb);
            fow.writeObject(this);
            fow.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }
    public static void clean()
    {
        try {
            Libro a=new Libro(" "," "," "," ",0);
            java.io.FileOutputStream fb = new java.io.FileOutputStream(fDir, false);
            java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb);
            fow.writeObject(a);
            fow.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }
}
