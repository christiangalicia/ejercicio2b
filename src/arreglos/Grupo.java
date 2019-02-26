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
    private String nombre;
    private int a;

    public Grupo(int noAlumnos, String nombre) {
        alumnos = new Alumno[noAlumnos];
        this.nombre = nombre;
        a = 0;
    }

    public String getNombre() {
        return nombre;
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

    public void agregarCalificacionParcial1(int matricula,
            String materia, float calificacion) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                alumnos[i].obtenerMateria(materia).setParcial1(calificacion);
            }
        }
    }

    public void agregarCalificacionParcial2(int matricula,
            String materia, float calificacion) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                alumnos[i].obtenerMateria(materia).setParcial2(calificacion);
            }
        }

    }

    public Materia obtenerMateriaAlumno(int matricula, String materia) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                return alumnos[i].obtenerMateria(materia);
            }
        }
        return null;
    }
    
    public void generarMaterias(String m1, String m2, String m3,
            String m4,String m5){
        for (int i = 0; i < a; i++) {
            alumnos[i].agregarMateria(m1);
            alumnos[i].agregarMateria(m2);
            alumnos[i].agregarMateria(m3);
            alumnos[i].agregarMateria(m4);
            alumnos[i].agregarMateria(m5);
        }
    }

}
