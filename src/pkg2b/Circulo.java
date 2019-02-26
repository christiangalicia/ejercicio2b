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
public class Circulo {
    private  final float PI = 3.1416f;
    private float radio;
    public void setRadio(float radio){
        this.radio=radio;
    }
    public void area(){
        System.out.println(PI*Math.pow(radio, 2));
    }
    
    public void perimetro(){
        System.out.println(PI*(radio*2));
    }
}
