/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Jose Angel Santiago Enriquez
 */
import java.util.Scanner;
public class coche {
    Scanner jaja=new Scanner(System.in);
    String combustible;
    public coche(){
       //Vacio
    }
    public coche(String combustible) {
        this.combustible=combustible;
        acelera();
    }
    public void acelera(){
        int cant=Integer.parseInt(combustible);
        if(cant==0){
            System.out.println("No tienes combustible");
        }else{
            System.out.println("Tu carro ha avanzado "+(cant*2)+" kilometros");
            System.out.println("Constructor  2");
            System.out.println("Escribe cuantas playeras quieres comprar $200c/u");
            constructor2 tel=new constructor2(jaja.nextInt());
        }
    }
}
