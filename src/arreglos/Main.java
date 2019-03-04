/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion = 10;
        Carrera tics = new Carrera("tics");
        while (opcion != 0) {
             System.out.println("/////////////////TICS////////////");
            System.out.println("Ingresa una opcion");
            System.out.println("1 para crear un grupo");
            System.out.println("2 obtener promedio carrera");
            System.out.println("3 consultar Grupo");
            System.out.println("0 para salir");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresa No de alumnos y Nombre del grupo");
                int noAlumnos = leer.nextInt();
                String nombreGrupo = leer.next();
                tics.crearNuevoGrupo(noAlumnos, nombreGrupo);
            } else if (opcion == 2) {

            } else if (opcion == 3) {
                System.out.println("ingresa el nombre del grupo");
                String nombreGrupo = leer.next();
                Grupo g = tics.obtenerGrupo(nombreGrupo);
                if (g == null) {
                    System.out.println("No exite el grupo");
                } else {
                    int opcion2 = 10;
                    while (opcion2 != 0) {
                        System.out.println("/////////////////" + g.getNombre() + "////////////");

                        System.out.println("1 para agregar alumno");
                        System.out.println("2 para promedio del grupo");
                        System.out.println("3 para agregar materia al grupo");
                        System.out.println("4 consultar alumno");
                        System.out.println("5 consultar alumnos grupo");
                        System.out.println("6 consultar profesores grupo");
                        System.out.println("7 Agregar profesores grupo");
                         System.out.println("8 reporte personalizado");
                        opcion2 = leer.nextInt();
                        if (opcion2 == 1) {
                            System.out.println("ingresa nombre");
                            String nombre = leer.next();
                            System.out.println("ingresa apellido paterno");
                            String paterno = leer.next();
                            System.out.println("ingresa apellido materno");
                            String materno = leer.next();
                            System.out.println("ingresa sexo");
                            String sexo = leer.next();
                            System.out.println("ingresa matricula");
                            int matricula = leer.nextInt();
                            System.out.println("ingresa fecha de nacimiento");
                            String fecha = leer.next();
                            Date fechaNacimiento = new Date(fecha);

                            g.agregarAlumno(nombre, paterno, materno, sexo,
                                    fechaNacimiento, matricula, "TIC", nombreGrupo);

                        } else if (opcion2 == 2) {
                            System.out.println(g.promedioGrupo());
                        } else if (opcion2 == 5) {
                            System.out.println(g.listaAlumnos());
                        }else if(opcion2==6){
                            System.out.println(g.listaProfesores());
                        }else if(opcion2==7){
                            System.out.println("ingresa nombre");
                            String nombre = leer.next();
                            System.out.println("ingresa apellido paterno");
                            String paterno = leer.next();
                            System.out.println("ingresa apellido materno");
                            String materno = leer.next();
                            System.out.println("ingresa sexo");
                            String sexo = leer.next();
                            System.out.println("ingresa Grado de estudios");
                            String grado = leer.next();
                            System.out.println("ingresa tipo de profesor");
                            String tipo = leer.next();
                            System.out.println("ingresa fecha de nacimiento");
                            String fecha = leer.next();
                             System.out.println("ingresa materia que imparte");
                            String materia = leer.next();
                            Date fechaNacimiento = new Date(fecha);
                            g.agregarProfesor(nombre, paterno, materno, sexo, fechaNacimiento, 
                                    grado,tipo,materia);
                        }else if(opcion2==8){
                            System.out.println("ingresa profesor o alumno");
                            String tipo = leer.next();
                            System.out.println(g.reporteInformacionPersona(tipo));
                        }
                    }
                }
            }
        }

    }

}
