/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class _Grupo {

    private float[] calificacion;
    private String nombre;
    public _Grupo(int noAlumnos, String nombre) {
        calificacion = new float[noAlumnos];
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void ingresarCalificaciones() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < calificacion.length; i++) {
           System.out.println("Ingresa la calificacion" +(i+1));
            float calif = leer.nextFloat();
            calificacion[i] = calif;
        }
    }
    public void imprimirCalificaciones() {
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("calificacion" + (i + 1));
            System.out.println(calificacion[i]);
        }
    }
    public float promedio() {
        float acu = 0;
        float resultado = 0;
        for (int i = 0; i < calificacion.length; i++) {
            acu = acu + calificacion[i];
        }
        return acu / calificacion.length;

    }

    public int noCalificacionesAprobatorias() {
        int aprobatorias = 0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] >= 8) {
                aprobatorias = aprobatorias + 1;
            }
        }
        return aprobatorias;
    }

    public int noCalificacionesReprobatorias() {
        int reprobatorias = 0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] < 8) {
                reprobatorias = reprobatorias + 1;
            }
        }
        return reprobatorias;
    }

    public int mayoresAPromedio() {
        int mayores = 0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] > promedio()) {
                mayores++;
            }
        }
        return mayores;
    }
    public float calificacionMasAlta(){
        float masAlta=0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i]> masAlta) {
                masAlta=calificacion[i];
            }
        }
        return masAlta;
    }
    public float calificacionMasBaja(){
        float masBaja=10;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i]< masBaja) {
                masBaja=calificacion[i];
            }
        }
        return masBaja;
    }
}
