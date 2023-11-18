import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int intentos = 3;
        double prestamo;
        double tasa;
        double pago;
        double interes;
        double capital;
        double tasaMensua;

        do {
            //pedinmos los dtaos la usuario
            System.out.print("Ingrese el monto del préstamo: ");
            prestamo = lector.nextDouble();
            
            //validamos los intentos 
            if (prestamo <= 0) {
                System.out.println("El monto del préstamo debe ser mayor a cero. Por favor intente nuevamente.");
               //la cantidad de intentos van a ir decrementando
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("***Usted ha alcanzado el límite de intentos. El programa se cerrará.");
                System.exit(0);
            }
        } while (prestamo <= 0);
        
        do {
            //pedimos los datos al usuario 
            System.out.print("Ingrese la tasa de interés Anual (como porcentaje): ");
            tasa = lector.nextDouble();
            
            //validamos los intentos 
            if (tasa <= 0) {
                System.out.println("***La tasa de interés debe ser mayor a cero. Por favor nuevamente****.");
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("Usted ha alcanzado el límite de intentos. El programa se cerrará.****");
                System.exit(0);
            }
        } while (tasa <= 0);
        
      
        do {
            System.out.print("Ingrese el pago mensual: ");
            pago = lector.nextDouble();
            
            if (pago <= 0) {
                System.out.println("El pago mensual debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("***Usted ha alcanzado el límite de intentos. El programa se cerrará.***");
                System.exit(0);
            }
        } while (pago <= 0);
        
        

    
        tasaMensua = tasa / 12 / 100;

        
        if (pago < prestamo * tasaMensua) {
            System.out.println("El pago mensual es demasiado bajo y con este pago mensual la cantidad del préstamo no se podrá liquidar.");
        } else {
            int meses = 0;

            while (prestamo > 0) {
        
                 interes = prestamo * tasaMensua;
                capital = pago - interes;
                prestamo = prestamo - capital;
                meses++;
            }

            System.out.println("El número de meses que tomará pagar el préstamo es: " + meses);
        }

        
        lector.close();
    }
}
