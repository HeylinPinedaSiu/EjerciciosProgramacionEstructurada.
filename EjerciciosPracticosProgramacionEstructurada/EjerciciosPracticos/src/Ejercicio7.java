import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int intentos = 3;
        int numerodeCuenta;
        int minutosdeDia;
        int minutosdeNoche;
        char codigoServicio;
        String tipoServicio ;
        int minutosUsados = 0;
        double montoPagar = 0.0;

        do {
            //pedimos los datos al usuario
            System.out.print("Ingrese el número de cuenta: ");
            numerodeCuenta = lector.nextInt();
  
            if (numerodeCuenta <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intente de nuevo.");
                //la cantidad de intentos va a ir decrementando
                intentos--;

            } else {
               return;
            } 

          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("Error! superó el número máximo de intentos. **El programa finalizará**.");
            return;

          } else {
            intentos = 3; 
        }
        /*pedimos los datos al usuario  */
        System.out.print("Ingrese el código de servicio (R o P): ");
         codigoServicio = lector.next().charAt(0);

        if (codigoServicio == 'R' || codigoServicio == 'r') {

            tipoServicio = "Regular";

            //////////////
            do {

                /*Pedimos la cantidad de minutos
                 usados al usuario */
             System.out.print("Ingrese los minutos utilizados: ");
             minutosUsados = lector.nextInt();

            if (minutosUsados <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                intentos--;

            } else {
                break;
            } 
            /////////////
          } while (intentos > 0);
                    //////
          if (intentos == 0) {
            System.out.println("Errror! superó el número máximo de intentos. **El programa finalizará**.");
            return;

          } else {
            intentos = 3; 
        }

            montoPagar = 10.0; 
            if (minutosUsados > 50) {
                  montoPagar += (minutosUsados - 50) * 0.2;
            }
        } else if (codigoServicio == 'P' || codigoServicio == 'p') {
            tipoServicio = "Premium";
            
             do {
                /* pedimos los minutos que se usaron durante
                 * el dia 
                */
              System.out.print("Ingrese los minutos usados durante el día desde: (6:00 a.m. - 6:00 p.m.): ");
              minutosdeDia = lector.nextInt();

               
            if (minutosdeDia <= 0) {
                System.out.println("El valor debe ser mayor a cero. Po favor intente nuevamente.");
               //lacantidad de intentos va a ir decrementando 
                intentos--;
                ////
            } else {
                break;
            } 
          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. **El programa finalizará**.");
            return;
          } else {
            intentos = 3; 
        }
         do {
            /*pedimos los datos al usuario que 
            uso durante la noche  */
              System.out.print("Ingrese los minutos usados durante la noche (6:00 p.m. a 6:00 a.m.): ");
            minutosdeNoche = lector.nextInt();

            if (minutosdeNoche <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                //intrentos va ir decrementando 
                intentos--;

            } else {

                break;
            } 

          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("Error!  usted superó el número máximo de intentos. **El programa finalizará**.");
            return;

          } else {
            intentos = 3; 
        }
          //hacemos las respectivas operaciones

            montoPagar = 25.0; 
            //si se cumple la condicion entonces: 
            if (minutosdeDia > 75) {
                montoPagar += (minutosdeDia - 75) * 0.1;
            }
            if (minutosdeNoche > 100) {
                montoPagar += (minutosdeNoche - 100) * 0.05;
            }

            minutosUsados = minutosdeDia + minutosdeNoche;

            //si no se cumple la condicion se va a mandar un mensaje 
        } else {
          
            System.out.println("********Código de servicio inválido. Por favor, ingrese R o P.********");
            return; 
        }
         
        //mostramos los resultados 
        System.out.println("Número de cuenta: " + numerodeCuenta);
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.printf("Monto a Pagar: "+ montoPagar);

        lector.close();
    }
}
