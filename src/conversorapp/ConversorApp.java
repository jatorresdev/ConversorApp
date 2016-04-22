package conversorapp;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class ConversorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opcionMenu;
        Scanner cadena = new Scanner(System.in);

        /**
         * Imprimo en pantalla información al usuario
         */
        System.out.println("\t\t\t\tBienvenido a ConversorApp\n");
        System.out.println("Seleccione una de las siguientes opciones: \n");
        System.out.println("1. Conversor de Celsius a Fahrenheit\n");
        System.out.println("2. Conversor de Fahrenheit a Celsius \n");
        System.out.println("3. Conversor de Pesos a Dolares\n");
        System.out.println("4. Conversor de Dolares a Pesos\n");
        System.out.println("5. Conversor de Euros a Dolares\n");
        System.out.println("6. Conversor de Dolares a Euros\n");
        System.out.println("7. Conversor de Pesos a Euros\n");
        System.out.println("8. Conversor de Euros a Pesos\n");
        System.out.println("9. Conversor de Gramos a Libras o Kilos\n");
        System.out.print("Opción: ......... ");

        opcionMenu = cadena.nextInt();

        switch (opcionMenu) {
            case 1:
                double celsiusCF;
                double fahrenheitCF;

                System.out.print("Ingrese el valor en Celsius que desea convertir: ");
                // Le pedimos al usuario los grados celsius a convertir
                celsiusCF = cadena.nextDouble();
                // Llamamos al metodo que convierte y le paso los grados
                fahrenheitCF = convertirCF(celsiusCF);
                System.out.print("Su grados celsius " + celsiusCF + " en Fahrenheit son igual a " + fahrenheitCF);

                break;

            case 2:
                double celsiusFC;
                double fahrenheitFC;

                System.out.print("Ingrese el valor en Fahrenheit que desea convertir: ");
                // Le pedimos al usuario los grados fahrenheit a convertir
                fahrenheitFC = cadena.nextDouble();
                // Llamamos al metodo que convierte y le paso los grados Fahrenheit
                celsiusFC = convertirFC(fahrenheitFC);
                System.out.print("Su grados Fahrenheit " + fahrenheitFC + " en celsius son igual a " + celsiusFC);

                break;

            case 3:
                int pesosPD;
                int dolaresPD;
                System.out.print("ingrese el valor en pesos que desee convertir a dolares ");
                // le pedimos al usuario el valor en pesos para poderlo convertir a dolares
                pesosPD = cadena.nextInt();
                // Llamamos al metodo que convierte pesos a dolares
                dolaresPD = convertirPesosDolares(pesosPD);
                System.out.print("el valor en pasos " + pesosPD + "sus pesos son" + dolaresPD);

                break;

            case 4:
                int dolaresDP;
                int pesosDP;
                System.out.print("ingrese el valor en dolares que desee convertir a pesos");
                // ler pedimos al usuario el valor en dolares para convertirlo a pesos
                dolaresDP = cadena.nextInt();
                // Lamamos al metodo que convierte dolares a pesos
                pesosDP = convertirDolaresPesos(dolaresDP);
                System.out.print(" el valor en dolares"+ dolaresDP + "sus dolares son"+ pesosDP);
                
                             
                break;

        }

    }

    /**
     * Convierte celsius a fahrenheit
     */
    public static double convertirCF(double celsius) {
        double fahrenheit = 33.8;
        return (fahrenheit * celsius);
    }

    /**
     * Convierte fahrenheit a celsius
     */
    public static double convertirFC(double fahrenheit) {
        return (fahrenheit / 33.8);
    }

    /**
     * Convierte Pesos a Dolar
     */
    public static int convertirPesosDolares(int pesos) {
        int dolar = 3600;
        int total = pesos/dolar;
       
        return total;
    }

    /**
     * Convierte Dolares a Pesos
     */
    public static int convertirDolaresPesos(int dolares) {
        int total = dolares * 3600;

        return total;
    }
}
