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
public class Alumno extends Persona{
    private int matricula;
    private String carrera;
    private String grupo;
    private Materia[] materias;
    private int m;
    public Alumno(String nombre, String paterno, String materno,
            String sexo, Date fechaNacimiento,
            int matricula,String carrera,String grupo) {
        super(nombre, paterno, materno, sexo, fechaNacimiento);
        this.carrera=carrera;
        this.grupo= grupo;
        this.matricula=matricula;
        materias = new Materia[5];
        m=0;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public String informacion(){
        return nombreCompleto()+"\n"+
               "Edad "+ edad()+"\n"+
                sexo+'\n'+
                "Matricula "+matricula+'\n'+
                carrera+"\n"+grupo;
    }
    
    public void agregarMateria(String materia){
        Materia m1 = new Materia(materia);
        materias[m]= m1;
        m++;
    }
    
//    public void  agregarCalificacionParcial1(String materia, float c){
//        for (int i = 0; i < m; i++) {
//            if(materia.equals(materias[i].getNombre())){
//               materias[i].setParcial1(c);
//            }
//        }
//    }
//    
//     public void  agregarCalificacionParcial2(String materia, float c){
//        for (int i = 0; i < m; i++) {
//            if(materia.equals(materias[i].getNombre())){
//               materias[i].setParcial2(c);
//            }
//        }
//    }
     public Materia obtenerMateria(String nombre){
         for (int i = 0; i < m; i++) {
            if(nombre.equals(materias[i].getNombre())){
               return materias[i];
            }
        } 
         return null;
     }
     
     public float promedioAlumno(){
         float acu=0;
         for (int i = 0; i < m; i++) {
             acu= acu + materias[i].promedio();
         }
         return acu/m;
     }
}
