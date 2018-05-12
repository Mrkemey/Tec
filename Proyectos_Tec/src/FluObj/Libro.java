package FluObj;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Libro implements Serializable{
    String isbn,titulo, autor, editorial;
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
            java.io.FileOutputStream fb = new java.io.FileOutputStream("LIBROS.OBJ", true);
            java.io.ObjectOutputStream fow = new java.io.ObjectOutputStream(fb);
            fow.writeObject(this);
            fow.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo para guardar");
        } catch (IOException ex) {
            System.out.println("Error al guardar");
        }
    }//guardar
    
    public void buscar(String isbn)
    {   
        try {
            java.io.FileInputStream fb = new java.io.FileInputStream("LIBROS.OBJ");
            while (fb.available() > 0) { //Da los atributos al objeto principal de cada uno del archvo
                java.io.ObjectInputStream fol = new java.io.ObjectInputStream(fb);
                Libro p = (Libro) fol.readObject();
                this.isbn = (p.getIsbn());
                this.titulo = (p.getTitulo());  
                this.autor = (p.getAutor());
                this.editorial = (p.getEditorial());
                this.precio = (p.getPrecio());
                if (isbn.equals(this.isbn)) {
                    return; //Si lo encuentra, acaba la operacion
                }
            }
            if (fb.available() == 0) { //Si no encuentra el libro al final del archvo
                showMessageDialog(null, "Libro no encontrado " + isbn);
                this.setIsbn("");
                this.setTitulo("");
                this.setAutor("");
                this.setEditorial("");
                this.setPrecio(0);
            }
            
        } catch (FileNotFoundException ex) {

        } catch (IOException | ClassNotFoundException ex) {

        }
    }//buscar
    
    
}
