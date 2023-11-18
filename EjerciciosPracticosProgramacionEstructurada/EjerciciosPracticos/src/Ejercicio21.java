import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int Intentos = 1;
        int YEAR;
        int FIRST_DAY;
        int diasMes;

        //pedimos los YEARs a mostrar entre  194 y 1999..
        System.out.print("Ingrese  el YEAR que quieres mostrar (entre 1994 y 1999): ");
         YEAR = lector.nextInt();

        //validamos la cantida de Intentos 
     while ((YEAR < 1994 || YEAR > 1999) && Intentos < 3) {

        //
     System.out.println("El YEAR debe estar entre 1994 y 1999: ");
      System.out.println("Ingrese otro YEAR");

     YEAR = lector.nextInt();
     Intentos++;
     }

    
     if (YEAR >= 1994 && YEAR <= 1999) {

    } else {
    System.out.println("**Error!! usted excedió la cantidad de Intentos permitidos***");
    return;
    }
 
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, YEAR);
        
        //hacemosun array 
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] dias = {"Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"};
        
        System.out.println("Calendario del YEAR " + YEAR);
        

        for (int mes = 0; mes < 12; mes++) {
            calendario.set(Calendar.MONTH, mes);

             FIRST_DAY = calendario.get(Calendar.DAY_OF_WEEK) - 1;
             diasMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);

            System.out.println("\n" + meses[mes]);
            
            for (int i = 0; i < 7; i++) {
                System.out.print(dias[i] + "\t");
            }
            System.out.println();
            
            for (int i = 0; i < FIRST_DAY; i++) {
                System.out.print("\t");
            }
            
            for (int i = 1; i <= diasMes; i++) {
                System.out.print(i + "\t");
                if ((FIRST_DAY + i) % 7 == 0) {
                    System.out.println();
                }
            }
        }
        
        lector.close();
    }
}
