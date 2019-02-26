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
        Date fecha = new Date(96, 8, 29);
        Profesor p1 = new Profesor("David", "Perez", "Garcia",
                "hombre",fecha , "Maestria", "PTC");
        p1.edad();
        System.out.println(p1.informacion());
        System.out.println(p1.nombreCompleto());
        
        Scanner leer = new Scanner(System.in);
        int opcion=10;
        Carrera tics = new Carrera("tics");
        while (opcion != 0) {            
            System.out.println("Ingresa una opcion");
            System.out.println("1 para crear un grupo");
            System.out.println("2 para ingresar calificaciones");
            System.out.println("3 para imprimir calificaciones");
            System.out.println("4 promedio de la carrera");
             System.out.println("5 reprobados de un grupo");
            System.out.println("0 para salir");
            opcion= leer.nextInt();
            if(opcion==1){
                System.out.println("Ingresa No de alumnos y Nombre del grupo");
                int noAlumnos= leer.nextInt();
                String nombreGrupo= leer.next();
                tics.crearNuevoGrupo(noAlumnos, nombreGrupo);
            }else if(opcion==2){ 
                System.out.println("ingresa el nombre del grupo");
                String nombreGrupo= leer.next();
                tics.ingresarCalificacionesGrupo(nombreGrupo);
            }else if (opcion==3){
                System.out.println("ingresa el nombre del grupo");
                String nombreGrupo= leer.next();
                tics.imprimirCalificacionesGrupo(nombreGrupo);
            }else if (opcion==4){
                System.out.println(tics.promedioCarrera());
            }
            else if (opcion==5){
                 System.out.println("ingresa el nombre del grupo");
                String nombreGrupo= leer.next();
                tics.reprobados(nombreGrupo);
            }
            
        }
        
    }
    
}
