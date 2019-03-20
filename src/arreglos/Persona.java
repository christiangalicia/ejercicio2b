/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Date;
/**
 *
 * @author christian
 */
public class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected String sexo;
    protected Date fechaNacimiento;

    public Persona(String nombre, String paterno, String materno, String sexo, Date fechaNacimiento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String nombreCompleto(){
        return nombre+" "+paterno+" "+materno;
    }
    
    public int edad(){
        Date fechaAtual= new Date();
        
        long tiempo= fechaAtual.getTime()-fechaNacimiento.getTime();
        return (int)(tiempo/1000/60/60/24/365);
    }
    public String informacion(){
        return "";
    }
    
    public String CURP(){
        String curp = paterno.substring(0, 2)+
                materno.substring(0,1)+
                nombre.substring(0,1)+
                fechaNacimiento.getYear();
        return curp;
    }
}
