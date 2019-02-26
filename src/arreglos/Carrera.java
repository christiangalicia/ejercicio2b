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
public class Carrera {
  private String nombre;
  private int noDeGruposActivos;
  private Grupo[] grupos;
  
  public Carrera(String nombre){
      grupos= new Grupo[10];
      this.nombre = nombre;
      noDeGruposActivos=0;
  }
  
  public void crearNuevoGrupo(int noAlumnos, String nombre){
      Grupo nuevo = new Grupo(noAlumnos, nombre);
      grupos[noDeGruposActivos]=nuevo;
      noDeGruposActivos++;
  }
  
  public void agregarAlumnoGrupo(String grupo,String nombre,String paterno,
       String materno, String sexo, Date fechaNacimiento, int matricula,
                String carrera){
      for (int i = 0; i < noDeGruposActivos; i++) {
         if(grupo.equals(grupos[i].getNombre())){
              grupos[i].agregarAlumno(nombre, paterno, materno, sexo,
                      fechaNacimiento, matricula, carrera, grupo);
              
          } 
      }
  }
  
  public Grupo obtenerGrupo(String nombre){
      for (int i = 0; i < noDeGruposActivos; i++) {
         if(nombre.equals(grupos[i].getNombre())){
             return grupos[i];
         }
      }
      return null;
  }
  
  public float promedioCarrera(){
      float acu=0;
      for (int i = 0; i < noDeGruposActivos; i++) {
          acu=acu+ grupos[i].promedioGrupo();
      }
      return acu/noDeGruposActivos;
  }

 
}
