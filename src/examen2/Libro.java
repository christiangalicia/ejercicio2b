/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 * Libro poo = new Libro("POO","Juan Perez")
 * @author christian
 */
public class Libro {

   private String nombreLibro;
   private String nombreAutor;
   private boolean estado;
   private int cantidad;
   public Libro(String nombreLibro, String nombreAutor){
       this.nombreLibro=nombreLibro;
       this.nombreAutor=nombreAutor;
   }
   public void prestarLibro(){
       estado=true;
   }
   public void regresarLibro(){
       estado=false;
   }
   public String informacion(){
       if( estado==true){
           return "Libro "+ nombreLibro+ " "
               +" Autor "+ nombreAutor + 
               "Estado Prestado ";
       }else{
           return "Libro "+ nombreLibro+ " "
               +" Autor "+ nombreAutor + 
               "Estado Disponible ";
       }
       
   }
   
}
