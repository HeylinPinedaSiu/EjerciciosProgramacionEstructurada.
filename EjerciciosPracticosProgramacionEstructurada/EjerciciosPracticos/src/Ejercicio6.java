import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

     //declaramos las variables 
      double Nuevo ;
     double interes ;
     double Cargo;
     int intentos = 3;
     int NUMERO;
     char TIPO;
     double MINIMO;
     double ACTUAL;
  
    do {
         //pedimos los datos al usuario 
        System.out.print("Ingrese el número de cuenta: ");
        NUMERO = lector.nextInt();
  
    if (NUMERO <= 0) {
        System.out.println("El valor debe ser mayor a cero. Por favor intente de nuevo.");
          // 
         intentos--;

     } else {
         break;
     } 

    } 
    while (intentos > 0);
  
      if (intentos == 0) {
         System.out.println("Error! superó el número máximo de intentos. *** programa cerrara.***");
        return;

     } else {
        intentos = 3; 
     }

        //pedimos datos al usuario 
        System.out.print("Ingrese el TIPO de cuenta (A para ahorros, C para cheques): ");
        TIPO = lector.next().charAt(0);

        System.out.print("Ingrese el saldo mínimo que debe mantener a la cuenta: ");
         MINIMO = lector.nextDouble();

          
     while (MINIMO < 0 && intentos > 0) {
        //intentos va a ir decrementando 
            intentos--;

        //
     if (intentos > 0) {
        System.out.println("Saldo mínimo inválido. Por favor ingrese un valor que no sea  negativo.");
         MINIMO = lector.nextDouble();

     } else {
        System.out.println("Saldo mínimo inválido. Se han agotado la cantidad de  intentos.");
            break;
            }
        }

        intentos = 3;

        /*pedimos datos al usuario */
        System.out.print("Ingrese el Saldo ACTUAL de la cuenta: ");
        ACTUAL = lector.nextDouble();

        //validamos los intentos
    while (ACTUAL < 0 && intentos > 0) {
         intentos--;

     if (intentos > 0) {
        System.out.println("Saldo ACTUAL inválido. Por favor ingrese un valor que no sea negativo.");
        ACTUAL = lector.nextDouble();

    } else {
        System.out.println("Saldo ACTUAL inválido. Se han agotado los intentos.");
         break;
       }
     }
        //si ahorro es igual a ahorro y se cumple tal condicion
    if (TIPO == 'A' || TIPO == 'A') {
         //
     if (ACTUAL < MINIMO) {
        // hacemos ls operaciones 
        Cargo = 10;
        Nuevo = ACTUAL - Cargo;

         //sino se cumple tal condicion entonces 
    } else {
        interes = 0.04;
         Nuevo = ACTUAL + ACTUAL * interes;
    }
        } 
        /* si el TIPO es de cheque igual a cheque y  se
        cumple tal condicion entonces se haran ls respectivas operaciones*/ 
         if (TIPO == 'C' || TIPO == 'c') {

        if (ACTUAL < MINIMO) {
            Cargo = 25;

            Nuevo = ACTUAL - Cargo;

                //sino se cumple la condicion entonces 
        } else {
                /////
            if (ACTUAL <= MINIMO + 5000) {
                    
             interes = 0.03;

        } else {
                interes = 0.05;
        }

             Nuevo = ACTUAL + ACTUAL * interes;
            }
        } else {
         System.out.println("TIPO de cuenta inválido. Por favor, ingrese A o C.");
            return; 
        }

        //mostramos los resultados 
        System.out.println("Número de cuenta: " +   NUMERO);

        System.out.println("TIPO de cuenta: " + TIPO);
    
        System.out.println("Saldo ACTUAL: U$" + ACTUAL);

        System.out.println("Saldo nuevo: U$" + Nuevo);

        lector.close();
    }
}
