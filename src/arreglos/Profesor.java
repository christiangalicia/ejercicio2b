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
public class Profesor extends Persona{
    private String gradoEstudios;
    private String tipoProfesor;
    public Profesor(String nombre, String paterno,
                    String materno, String sexo,
                     Date fechaNacimiento,
                     String gradoEstudios, String tipoProfesor){
        super(nombre, paterno, materno, sexo, fechaNacimiento);
         this.gradoEstudios=gradoEstudios;
         this.tipoProfesor=tipoProfesor;
    }
    
    public String informacion(){
        return nombreCompleto() + "\n"+
                sexo+"\n" +fechaNacimiento.toLocaleString()+"\n"+
                gradoEstudios+"\n"+tipoProfesor;
    }
}
