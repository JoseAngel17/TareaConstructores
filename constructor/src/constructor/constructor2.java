/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Jose Angel Santiago Enriquez
 */
public class constructor2 {
   int cantidad;
    constructor2(int cantidad){
        this.cantidad=cantidad ;
        numplayeras();
    }
    private void numplayeras() {
        System.out.println("Seran"+" "+"$"+(200*cantidad)+" "+"de"+" "+(cantidad)+" "+"playeras");
    }
}

