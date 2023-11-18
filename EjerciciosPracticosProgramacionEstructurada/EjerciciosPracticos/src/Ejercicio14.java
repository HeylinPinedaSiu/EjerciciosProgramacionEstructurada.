import java.util.Scanner;
public class Ejercicio14{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int CantIntentos=0;
        int TKilometros=0;
        int Kilometros;
        int Tlitros=0;
        int  litros;
        double kmporLitro;
         double promedioKmPorLitros;

            //validamos la cantidad de intentos 
        while(CantIntentos < 3){
            //pedimos la usuario que ingrese los datos 
            System.out.print("Ingrese la cantidad de Kilometros conducidos en el viaje:");
            Kilometros = lector.nextInt();

            if(Kilometros < 0){
                System.out.print("***El numero de Kilometros  no puede ser negativo****.");
                CantIntentos++;
                continue;
            }

              litros = lector.nextInt();
            if(litros < 0){
                System.out.println("**El numero de litros de Combustible no puede ser negativo***.");
               CantIntentos++;
               continue;
            }
             kmporLitro = (double) Kilometros/litros;

             
            System.out.println("Km por litros por litro en este viaje: "+kmporLitro);
            TKilometros += Kilometros;
            Tlitros += litros;
            
             promedioKmPorLitros = (double) TKilometros/Tlitros;
            System.out.println("Km por litro promedio en este momento: "+promedioKmPorLitros);
            CantIntentos = 0;
        }
        System.out.println("***Usted alcanzo el limite de intentos***");
        lector.close();
    }
}
