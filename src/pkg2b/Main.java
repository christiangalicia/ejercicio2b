/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b;
import banco.*;
/**
 *
 * @author christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(20);
        c1.area();
        c1.perimetro();
        
        TrianguloEquilatero t = new TrianguloEquilatero(12,12);
        t.area();
        t.perimetro();
        
    }

   

}
