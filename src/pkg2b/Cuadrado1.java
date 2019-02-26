/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b;

/**
 *
 * @author christian
 */
public class Cuadrado1 {
    
    private float lado;
    
    public void setLado(float l){
        lado=l;
    }
    public void area(){
        float a = lado*lado;
        System.out.println(a);
    }
    
    public void perimetro(){
        float a = lado*4;
        System.out.println(a);
    }
}
