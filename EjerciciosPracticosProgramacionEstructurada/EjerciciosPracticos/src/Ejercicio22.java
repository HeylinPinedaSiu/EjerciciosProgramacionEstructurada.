import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

    //declaramos las variables 
   Random random = new Random();
   int numeroparaAdivinar;
   int  INTENTOS = 0;
   int intento;
    String RESPUESTA ;
    boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            numeroparaAdivinar = random.nextInt(50) + 1;
            

            System.out.println("Adivina un número entre 1 y 50.");

            while (INTENTOS < 3) {
                System.out.print("Introduce un numero: ");
                 intento = lector.nextInt();
                INTENTOS++;

                if (intento < 1 || intento > 50) {
                    System.out.println("**El número debe estar entre 1 y 50**.");
                    continue;
                }

                if (intento < numeroparaAdivinar) {
                    System.out.println("Demasiado bajo. Por favor intente  de nuevo.");

                } 
                 if (intento > numeroparaAdivinar) {
                    System.out.println("Demasiado alto. Por favor intente de nuevo.");

                } else {
                    System.out.println("**** ¡Felicidades! ¡Adivinaste el número! *****");
                    break;
                }
            }

            if (INTENTOS >= 3) {
                System.out.println("**Agotaste tus INTENTOS**. El número a adivinar era: " + numeroparaAdivinar);
            }

            System.out.print("¿Deseas jugar otra vez? (Y/N): ");
            RESPUESTA = lector.next();
            jugarDeNuevo = RESPUESTA.equalsIgnoreCase("Y");
        }

        System.out.println("Gracias por jugar. ¡Vuelva Pronto!");

        lector.close();
    }
}
