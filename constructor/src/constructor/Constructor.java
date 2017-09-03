/*
    Constructores en Java
 **/
package constructor;
/**
 *
 * @author SANTIAGO ENRIQUEZ JOSE ANGEL
 */
import java.util.Scanner;
public class Constructor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner jaja=new Scanner(System.in);
        System.out.println("Escriba cuantos litros gasolina desea ingresar al carro");
        coche auto=new coche(jaja.nextLine());
    }
}
