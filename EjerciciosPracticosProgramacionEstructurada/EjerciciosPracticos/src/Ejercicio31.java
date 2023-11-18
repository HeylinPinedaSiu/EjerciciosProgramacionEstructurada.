import java.util.Scanner;
public class Ejercicio31 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables
        int intentos = 3;
         int Numero;
         int Divisor = 2;

        //validamos los intentos 
        while (intentos > 0) {
            //pedimos los datos al usuario 
            System.out.print("Ingrese un número entero positivo grande: ");
            Numero = lector.nextInt();

            if (Numero > 0) {
                //Pedimos los datos  y concatenamos nombre 
                System.out.println("Los factores primos de " + Numero + " son:");
                
                while (Numero > 1) {
                    if (Numero % Divisor == 0) {

                        System.out.println(Divisor);
                        Numero /= Divisor;

                    } else {
                        Divisor++;
                    }
                }
                break;

            } else {

                System.out.println("****El número debe ser mayor que cero***. Intentos restantes: " + (intentos - 1));
               //la cantidad de intenros va ir decrementando
                intentos--;
            }
        }

        if (intentos == 0) {
            System.out.println("Se agotaron los intentos.");
        }

        lector.close();
    }
}
