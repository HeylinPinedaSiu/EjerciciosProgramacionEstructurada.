import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int cantidadDEClientes;
        double TotalDEReciVosDEAyer = 0.0;
         int Intentos;
          double Cargo;
           int horasDEEstacionamiento;
           int horasExcedentes;

          //peddimos los datos al usuario 
        System.out.print("Ingrese la cantidad de clientes: ");
        cantidadDEClientes = lector.nextInt();

        for (int i = 1; i <= cantidadDEClientes; i++) {
            Intentos = 0;
            Cargo = 0.0;

            //validamos los in tentos 
            while (Intentos < 3) {
                //pedimos las horas del estacionamiento del cliente 
                System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
                 horasDEEstacionamiento = lector.nextInt();


                if (horasDEEstacionamiento >= 0) {
                    Cargo = 2.00; 
                    if (horasDEEstacionamiento > 3) {
                        horasExcedentes = horasDEEstacionamiento - 3;
                        Cargo += horasExcedentes * 0.50;
                    }
                    if (Cargo > 10.00) {
                        Cargo = 10.00;
                    }
                      break;
                } else {
                    System.out.println("Las horas de estacionamiento deben ser no negativas. Intentos restantes: " + (2 - Intentos));
                    Intentos++;
                }
            }
             if (Intentos == 3) {
                System.out.println("**Error!! se han realizado 3 Intentos fallidos. No se puede calcular el Cargo para el cliente*** " + i);
                continue;
            }

            TotalDEReciVosDEAyer += Cargo;
            System.out.println("El Cargo de el estacionamieto para el cliente es" + i + " es: C$" + Cargo);
        }
           System.out.println("El Total que corresponde de los reccibos de ayer es: C$" + TotalDEReciVosDEAyer);
           lector.close();
    }
}
