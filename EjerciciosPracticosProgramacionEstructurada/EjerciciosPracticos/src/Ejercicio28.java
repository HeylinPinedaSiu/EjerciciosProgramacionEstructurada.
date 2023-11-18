import java.util.Scanner;
import java.util.Random;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int INTENTOS = 3;
        int COINCIDENCIAS = 0;
        int ADIVINA_1 = 0;
        int ADIVINA_2 = 0;
        int ADIVINA_3 = 0;
        boolean CONCIENCIAEXACTA;
        int premio = 0; 

        int num_1 = random.nextInt(10);
        int num_2 = random.nextInt(10);
        int num_3 = random.nextInt(10);

       
        System.out.println("Bienvenido al juego de lotería.");
        while (INTENTOS > 0) {
            System.out.print("Ingrese un número: ");
            ADIVINA_1 = lector.nextInt();

            if (ADIVINA_1 >= 0) {
                break;
            } else {
                INTENTOS--;
                System.out.println("El número ingresado es negativo.");
            }
        }

        if (INTENTOS == 0) {
            System.out.println("Se han agotado los INTENTOS. El programa terminará.");
        }
        while (INTENTOS > 0) {
            System.out.print("Ingrese un segundo número: ");
            ADIVINA_2   = lector.nextInt();

            if (ADIVINA_2   >= 0) {
                break;
            } else {
                INTENTOS--;
                System.out.println("El número ingresado es negativo. ");
            }
        }

        if (INTENTOS == 0) {
            System.out.println("Se han agotado los INTENTOS. El programa terminará.");
        }
        while (INTENTOS > 0) {
            System.out.print("Ingrese un número tercer: ");
            ADIVINA_3  = lector.nextInt();

            if (ADIVINA_3  >= 0) {
               
                break;
            } else {
                INTENTOS--;
                System.out.println("El número ingresado es negativo. ");
            }
        }

        if (INTENTOS == 0) {
            System.out.println("Se han agotado los INTENTOS. El programa terminará.");
        }


        
       CONCIENCIAEXACTA = false; 
        if (ADIVINA_1 == num_1 && ADIVINA_2   == num_2 && ADIVINA_3  == num_3) {
            premio = 1000000;
            CONCIENCIAEXACTA = true;
        }
        else {
             COINCIDENCIAS =0; 
        
            if (ADIVINA_1 == num_1 || ADIVINA_1 == num_2 || ADIVINA_1 == num_3) {
                COINCIDENCIAS ++;
            }

            if (ADIVINA_2   == num_1 || ADIVINA_2   == num_2 || ADIVINA_2   == num_3) {
                if (ADIVINA_2   != ADIVINA_1) {
                    COINCIDENCIAS ++;
                }
            }

            if (ADIVINA_3  == num_1  || ADIVINA_3  == num_2 || ADIVINA_3  == num_3) {
                if (ADIVINA_3  != ADIVINA_1 && ADIVINA_3  != ADIVINA_2 )  {
                    COINCIDENCIAS ++;
                }
            }

            switch (COINCIDENCIAS ) {
                case 1: 
                    premio = 100;
                    break;
                case 2:
                    premio = 1000;
                    break;
                case 3: 
                    premio = 10000;
                    break;
                default: 
                    premio = 0;
                    break;
            }
        }
       
        System.out.println("Su suposición fue " + ADIVINA_1 + ADIVINA_2   + ADIVINA_3  + ".");
        System.out.println("El número generado al azar fue " + num_1 + num_2 + num_3 + ".");
        if (CONCIENCIAEXACTA) {
            System.out.println("¡Felicidades! Ha ganado C$" + premio + " por tener una coincidencia exacta.");
        }
        else {
            System.out.println("Ha ganado C$" + premio + " por tener " + COINCIDENCIAS  + " coincidencia(s) parcial(es).");
        }
        lector.close();
    }
}
