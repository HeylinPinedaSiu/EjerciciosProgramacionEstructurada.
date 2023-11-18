import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables
        int intentos=3;
        int numCuenta;
         char codigoCliente;
         int canalesPremium;
          double procesamientoFactura;
            double serviciobasico ;
            double facCanalesPremium;
            double totalFactura;

        do {
            //pedimos los datos al usuario 
            System.out.print("Ingrese el numero de cuenta del cliente: ");
            numCuenta= lector.nextInt();
  
            if (numCuenta <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                intentos--;
            } else {
                break;
            } 
          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("**Error! usted superó el número máximo de intentos. El programa finalizará.***");
            return;
          } 
        
        System.out.print("Ingrese el código del cliente (R para residencial, N para negocios): ");
         codigoCliente = lector.next().charAt(0);

         do {
            //pedimos slos datos al usuario
            System.out.print("Ingrese el número de canales Premium a los que está suscrito: ");
          canalesPremium = lector.nextInt();

            if (canalesPremium <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                intentos--;
            } else {
                break;
            } 
          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("***Error!! Usted superó el número máximo de intentos. El programa finalizará**.");
            return;
          } 
     
         canalesPremium = lector.nextInt();

        totalFactura= 0.0;

        //haceos las operaciones
        if (codigoCliente == 'R' || codigoCliente == 'r') {
             procesamientoFactura = 4.50;
             serviciobasico = 20.50;
             facCanalesPremium = 7.50;

            totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium);
        } else if (codigoCliente == 'N' || codigoCliente == 'n') {
            procesamientoFactura = 15.00;
             serviciobasico = 75.00;
            facCanalesPremium = 50.00;

            System.out.print("Ingrese el número de conexiones de servicio básico: ");
            int conexionesbasico = lector.nextInt();

            if (conexionesbasico > 10) {
                totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium) + ((conexionesbasico - 10) * 5.00);
            } else {
                totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium);
            }
        }

        //mostrasmos los resultados 
        System.out.println("Número de cuenta del cliente: " + numCuenta);
        System.out.println("Monto de la factura: C$" + totalFactura);

        lector.close();
    }
}
