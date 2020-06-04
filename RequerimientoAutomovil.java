/*
 * Implemente un algoritmo que le permita ingresar por teclado los paradigmas
de la programacion orientada a objetos
1. Objeto del mundo real
2. Objeto del mundo informatico
3. Clase de objeto
4. Atributos
5. Servicios
 */
package requerimientoautomovil;

/**
 *
 * @author JESSICA MARIBEL VEGA MASAPANTA
 */
import java.util.Scanner;
public class RequerimientoAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner (System.in);

        System.out.println("        TEMA");
        System.out.println("      Vehiculo");

        System.out.println("\n Objeto del mundo real");
        String real=objeto.nextLine();

        System.out.println("\n Objeto del mundo informatico");
        String informatico=objeto.nextLine();

        System.out.println("\n Atributos");

        System.out.println("\n Atributo 1");
        String atributo1=objeto.nextLine();

        System.out.println("\n Atributo 2");
        String atributo2=objeto.nextLine();

        System.out.println("\n Atributo 3");
        String atributo3=objeto.nextLine();

        System.out.println("\n Servicios");

        System.out.println("\n Servicio 1");
        String servicio1=objeto.nextLine();

        System.out.println("\n Servicio 2");
        String servicio2=objeto.nextLine();

        System.out.println("\n Servicio 3");
        String servicio3=objeto.nextLine();


        // TODO code application logic here
    }

}
