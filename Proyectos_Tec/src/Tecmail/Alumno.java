package Tecmail;

//<editor-fold defaultstate="collapsed" desc="Library">
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.*;
//</editor-fold>
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SG-A1
 */
public class Alumno {
    // <editor-fold defaultstate="collapsed" desc="Variables">
    private String nc, nombres, apaterno, amaterno;
    private String email;
    public static String File = "Alumnos.dat";
    // </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public Alumno() {
    }
    public Alumno(String nc, String nombres, String apaterno, String amaterno) {
        this.nc = nc;
        this.nombres = nombres;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Get&Set">
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

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Funciones Principales">
    public void save() {
        FileOutputStream fb = null;
        try {
            fb = new FileOutputStream(File, true);
            java.io.DataOutputStream fdw = new java.io.DataOutputStream(fb);
            fdw.writeUTF(nc);
            fdw.writeUTF(nombres);
            fdw.writeUTF(apaterno);
            fdw.writeUTF(amaterno);
            email = nombres.substring(0, 2) + apaterno + amaterno.substring(0, 1) + "@ittepic.edu.mx";
            fdw.writeUTF(email.toLowerCase());
            fdw.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void search(String nc) {
        FileInputStream fb;
        try {
            fb = new FileInputStream(File);
            java.io.DataInputStream fdr = new java.io.DataInputStream(fb);

            while (true) {
                this.nc = fdr.readUTF();
                nombres = fdr.readUTF();
                apaterno = fdr.readUTF();
                amaterno = fdr.readUTF();
                email = fdr.readUTF();
                if (nc.equals(this.nc)) {
                    break;
                }
            }
        } catch (EOFException ex) {
            //Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            showMessageDialog(null, "E" + "L ALUMNO NO FUE ENCONTRADO".toLowerCase() + nc);
            setNc("");
            setNombres("");
            setApaterno("");
            setAmaterno("");
            setEmail("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException ex){
            
        }
    }
    public boolean sea(String nc) {
        FileInputStream fb;
        try {
            fb = new FileInputStream(File);
            java.io.DataInputStream fdr = new java.io.DataInputStream(fb);

            while (true) {
                this.nc = fdr.readUTF();
                nombres = fdr.readUTF();
                apaterno = fdr.readUTF();
                amaterno = fdr.readUTF();
                email = fdr.readUTF();
                if (nc.equals(this.nc)) {
                    return true;
                }
            }
        } catch (EOFException ex) {
            //Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }// </editor-fold>
}
