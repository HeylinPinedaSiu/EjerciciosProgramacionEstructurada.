import java.util.Scanner;

public class Ejercicio2{

    public static void main(String []args){
        Scanner lector = new Scanner(System.in);

        //declaramos las variables
        int intentos = 3;
        double lados1 ;
        double lado2;
        double lado3;

        for(int i=0;i<3;i++ ){

            do {
                //pedimos los datos al usuario 
                 System.out.print("Ingrese la longitud del primer lado: ");
                  lados1 = lector.nextDouble();

                 if (lados1 <= 0) {

                    System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                    intentos--;

                } else {
                    return;
                } 

              } while (intentos > 0);
      
              if (intentos == 0) {

                System.out.println("Error!! usted superó el número máximo de intentos. **El programa finalizará**.");
                return;

              } else {
                intentos = 3;

                }

            do {
                //pedimos los datos al usuario 
                System.out.print("Ingrese la longitud del segundo lado: ");
                lado2 = lector.nextDouble();

                 if (lado2 <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Por favor ntente nuevamente.");
                    intentos--;

                } else {
                    return;
                } 

              } while (intentos > 0);
      
              if (intentos == 0) {
                System.out.println("Error! usted superó el número máximo de intentos. **El programa finalizará**.");
                return;

              } else {

                intentos = 3;

                }

                /////////
                  do {

                    /*pedimos los datos al usuario */
                System.out.print("Ingrese la longitud del tercer lado: ");
                lado3 = lector.nextDouble();

                 if (lado3 <= 0) {

                    System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                    intentos--;

                } else {
                    return;
                } 
              } while (intentos > 0);
      
              if (intentos == 0) {
                System.out.println("Error! usted  superó el número máximo de intentos. **El programa finalizará**.");
                return;

              } else {
                intentos = 3;
                }
                 
                //hacemos las repectivas operaciones 
                if (lados1 + lado2 > lado3 && lado2 + lado3 > lados1 && lados1 + lado3 > lado2) {
                     
                    /*OPeracion para sacar el triangulo equilatero */
                    if (lados1 == lado2 && lado2 == lado3) {
                        System.out.println("Triángulo Equilátero");

                        break;
                    } 
                     /*OPeracion para sacar el triangulo isosceles */
                    if (lados1 == lado2 || lado2 == lado3 || lados1 == lado3) {
                        System.out.println("Triángulo   Isosceles");

                        break;

                    } else {
                            //SI NO CUMPLE NINGUNA DE LAS CONDICIONES ANTERIORES ENTONCES ES :
                        System.out.println("Triángulo escaleno");
                        break;
                    }
                } else {
                    System.out.println("********No se puede formar un triángulo con los lados proporcionados.*******");
                }
            }
           lector.close();
    }
}
