/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author christian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro libro = new Libro("POO", "Juan Perez");
       
       libro.prestarLibro();
       System.out.println(libro.informacion());
       libro.regresarLibro();
       System.out.println(libro.informacion());
    }
    
}
