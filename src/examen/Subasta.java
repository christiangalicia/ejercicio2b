/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author christian
 */
public class Subasta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lote l = new Lote(500);
        l.ofertar("christian", 1000);
        l.ofertar("david", 950);
        l.ofertar("maria", 3000);
        System.out.println(l.getNombre());
        System.out.println(l.getOferta());
    }
    
}
