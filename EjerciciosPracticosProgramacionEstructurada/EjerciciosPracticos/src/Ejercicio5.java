import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables
        String numeros;
        int suma;
        

        //pedimos los datos al usuario
        System.out.print("Ingrese los numeros: ");
         numeros = lector.next();

        for (int i = 0; i < numeros.length(); i++) {
            System.out.print(numeros.charAt(i) + " ");
        }

         suma = 0;
        int i = 0;

        while (i < numeros.length()) {
            char digito = numeros.charAt(i);

            //
            if (digito >= '0' && digito <= '9') {
                ////////////////
                int valor = digito - '0';
                suma += valor;
            }
            i++;
        }

        //Mostramos resultados en pantalla
        System.out.println("La suma de los dígitos ingresados es: " + suma);
     lector.close();
    }
}
