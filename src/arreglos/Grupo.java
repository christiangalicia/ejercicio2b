/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Grupo {

    private Alumno[] alumnos;
    private Profesor[] profesores;
    private String nombre;
    private int a, p;

    public Grupo(int noAlumnos, String nombre) {
        alumnos = new Alumno[noAlumnos];
        profesores = new Profesor[5];
        this.nombre = nombre;
        a = 2;
        p=2;
        alumnos[0]=new Alumno("christian", "galicia", "garcia", "hombre",new Date("17/07/1984") , 123, nombre, "tics");
        alumnos[1]=new Alumno("david", "carrillo", "garcia", "hombre",new Date("4/07/1999"), 124, nombre, "tics");
       profesores[0]=new Profesor("luis", "galicia", "garcia", "hombre",new Date("17/07/1984") , "maestria", "ptc", "programacion");
        profesores[1]=new Profesor("david", "carrillo", "garcia", "hombre",new Date("4/07/1999"), "doctorado", "ptc", "QUimica");
    }

    public String getNombre() {
        return nombre;
    }
    public void agregarProfesor(String nombre, String paterno, String materno,
                String sexo,Date fechaNacimiento,String gradoE,
                String tipoP, String materia){
       
        Profesor pr= new Profesor(nombre, paterno, materno, 
                sexo, fechaNacimiento, gradoE, tipoP, materia);
        profesores[p]=pr;
        p++;
    }
    public void agregarAlumno(String nombre, String paterno, String materno,
            String sexo, Date fechaNacimiento, int matricula,
            String carrera, String grupo) {

        Alumno alumno = new Alumno(nombre, paterno, materno, sexo,
                fechaNacimiento, matricula, carrera, grupo);

        alumnos[a] = alumno;
        a++;
    }

    public void agregarMateria(String materia, int matricula) {
        for (int i = 0; i < a; i++) {
            if (alumnos[i].getMatricula() == matricula) {
                alumnos[i].agregarMateria(materia);
            }
        }
    }

//    public void agregarCalificacionParcial1(int matricula,
//            String materia, float calificacion) {
//        for (int i = 0; i < a; i++) {
//            if (matricula == alumnos[i].getMatricula()) {
//                alumnos[i].obtenerMateria(materia).setParcial1(calificacion);
//            }
//        }
//    }
//
//    public void agregarCalificacionParcial2(int matricula,
//            String materia, float calificacion) {
//        for (int i = 0; i < a; i++) {
//            if (matricula == alumnos[i].getMatricula()) {
//                alumnos[i].obtenerMateria(materia).setParcial2(calificacion);
//            }
//        }
//
//    }

//    public Materia obtenerMateriaAlumno(int matricula, String materia) {
//        for (int i = 0; i < a; i++) {
//            if (matricula == alumnos[i].getMatricula()) {
//                return alumnos[i].obtenerMateria(materia);
//            }
//        }
//        return null;
//    }
    
    public void generarMaterias(
            String m1, String p1,
            String m2, String p2,
            String m3,String p3,
            String m4,String p4,
            String m5, String p5){
        for (int i = 0; i < a; i++) {
            alumnos[i].agregarMateria(m1);
            alumnos[i].agregarMateria(m2);
            alumnos[i].agregarMateria(m3);
            alumnos[i].agregarMateria(m4);
            alumnos[i].agregarMateria(m5);
        }
    }
    
    public float promedioGrupo(){
       float acu=0;
         for (int i = 0; i < a; i++) {
             acu=acu+ alumnos[i].promedioAlumno();
         }
         
         return acu/a;
    }
    
    public String listaAlumnos(){
        String acu="";
        for (int i = 0; i < a; i++) {
            acu= acu+ alumnos[i].nombreCompleto()+"\n" ;
        }
        return acu;
    }
    public String listaProfesores(){
        String acu="";
        for (int i = 0; i < p; i++) {
            acu += profesores[i].nombreCompleto()+"\t"
                    +profesores[i].getMateria()+"\n";
        }
        return acu;
    }
    
    public String reporteInformacionPersona(String tipoPersona){
        Persona[] personas;
        String acu="";
        if ("profesor".equals(tipoPersona)){
            personas= profesores;
        }else{
            personas=alumnos;
        }
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]!=null){
                acu += personas[i].informacion();
            }
        }
        return acu;
    }

}
