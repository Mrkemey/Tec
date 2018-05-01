/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tecmail;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmanu
 */
public class Alumno {
    String nc,nombres,aPat,aMat,correo;

    public Alumno() {
    }
    

    public Alumno(String nc, String nombres, String aPat, String aMat) {
        this.nc = nc;
        this.nombres = nombres;
        this.aPat = aPat;
        this.aMat = aMat;
    }

    public Alumno(String nc, String nombres, String aPat, String aMat, String correo) {
        this.nc = nc;
        this.nombres = nombres;
        this.aPat = aPat;
        this.aMat = aMat;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getaPat() {
        return aPat;
    }

    public void setaPat(String aPat) {
        this.aPat = aPat;
    }

    public String getaMat() {
        return aMat;
    }

    public void setaMat(String aMat) {
        this.aMat = aMat;
    }
    public void save(){
        FileOutputStream fb=null;
        try {
            fb = new FileOutputStream("Alumnos.dat",true);
            java.io.DataOutputStream fdw=new java.io.DataOutputStream(fb);
            fdw.writeUTF(nc);
            fdw.writeUTF(nombres);
            fdw.writeUTF(aPat);
            fdw.writeUTF(aMat);
            correo=aPat+"@assdd.com";
            fdw.writeUTF(correo);
            fdw.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void buscar(String nc){
        try {
            FileInputStream fb = new FileInputStream("Alumnos.dat");
            DataInputStream fdr= new DataInputStream(fb);
            while (fdr!=null) {                
             this.nc=fdr.readUTF();
            nombres=fdr.readUTF();
            aPat=fdr.readUTF();
            aMat=fdr.readUTF();
            correo=fdr.readUTF();
                if (nc.equals(this.nc)) {
                    break;
                }
            }
            
        }catch(EOFException ex){
           Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex); 
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(VenAlum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
