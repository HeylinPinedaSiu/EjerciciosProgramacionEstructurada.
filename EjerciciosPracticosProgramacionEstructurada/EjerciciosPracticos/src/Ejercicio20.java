import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {

        //ddeclaramos las variables 
        long inicio = System.currentTimeMillis();
        long Cuenta = 1;
        long MILLON = 1;
        long TIME_ELASEP;


        while (Cuenta <= 300_000_000) {

            if (Cuenta % 1_000_000 == 0) {
                ///
                System.out.println("Múltiplo de 1,000,000: " + Cuenta);
                TIME_ELASEP = System.currentTimeMillis() - inicio;
                System.out.println("Tiempo transcurrido: " + TIME_ELASEP + " milisegundos");
                inicio = System.currentTimeMillis();
                MILLON++;
            }
            Cuenta++;
        }
       
    }
}
