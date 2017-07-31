package javaminusculamayuscula;

/**
 *
 * @author RAFAEL SANTIAGO CRUZ
 */
import java.util.Scanner;
public class JavaminusculaMayuscula {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe palabra:");
        String cadena=entrada.nextLine();
        //Conversiones
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }
    
}
