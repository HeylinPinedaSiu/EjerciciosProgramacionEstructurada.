import java.util.Scanner;
public class Ejercicio15{
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);

        //declramos las variables
        int contador= 1;
        int horas;
         double horasN;
          double horasE;

        //validamos la cantidad de intentos
        while (contador <= 3) {
        System.out.println("Empleado " + contador);
        System.out.print("Horas trabajadas: ");
         horas = lector.nextInt();

        if (horas < 0) {
            System.out.println("***Las Horas trabajadas son inválidas***.");
        }

        System.out.print("Sueldo por hora: ");
         double sueldo = lector.nextDouble();

        if (sueldo < 0) {
            System.out.println("Sueldo por hora inválida.");
        }
        lector.nextLine(); 

        /*hacemos las respecctivas 
         * operaciones 
         */
           double sueldoBruto;
            if(horas <= 40)
            {
            sueldoBruto = horas*sueldo;

            }else{

             horasN = 40*sueldo;
            horasE = (horas-40)*(sueldo*1.5);
            sueldoBruto = horasN+horasE;

            //mostrasmos los resultados 
            System.out.println("Sueldo Bruto: C$"+sueldoBruto+"\n");
            contador++;

             }
        lector.close();
        }
    }
}
