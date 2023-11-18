import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //pedimos los datos al usaurio
        System.out.println("Ingrese tres Palabras:");

        String Palabras = lector.nextLine().trim();
        
        //declaramos aun array
        String[] PalabrasSeparadas = Palabras.split(" ");
        int cantidadDePalabras = PalabrasSeparadas.length;
        
        //declaramos las variables 
        String palabra_1 = "";
        String palabra_2 = "";
        String palabra_3 = "";
         String acronimo;
        
        if (cantidadDePalabras >= 1) {
            palabra_1 = PalabrasSeparadas[0];
        }
        if (cantidadDePalabras >= 2) {
            palabra_2 = PalabrasSeparadas[1];
        }
        if (cantidadDePalabras >= 3) {
            palabra_3 = PalabrasSeparadas[2];
        }
        
         acronimo = generarAcronimo(palabra_1, palabra_2, palabra_3);
        System.out.println("El acrónimo es: " + acronimo);
    }
    
    public static String generarAcronimo(String palabra_1, String palabra_2, String palabra_3) {
        StringBuilder acronimoBuilder = new StringBuilder();
        
        acronimoBuilder.append(palabra_1.charAt(0));
        acronimoBuilder.append(palabra_2.charAt(0));
        acronimoBuilder.append(palabra_3.charAt(0));
        
        return acronimoBuilder.toString().toUpperCase(); 

      
    }
}
