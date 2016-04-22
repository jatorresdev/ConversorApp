package conversorapp;

import java.util.Scanner;

/**
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

        do {
            /**
             * Imprimo en pantalla información al usuario
             */
            System.out.println("\n\t\t\t\tBienvenido a ConversorApp\n");
            System.out.println("Seleccione una de las siguientes opciones: \n");
            System.out.println("1. Conversor de Celsius a Fahrenheit");
            System.out.println("2. Conversor de Fahrenheit a Celsius");
            System.out.println("3. Conversor de Pesos a Dolares");
            System.out.println("4. Conversor de Dolares a Pesos");
            System.out.println("5. Conversor de Euros a Dolares");
            System.out.println("6. Conversor de Dolares a Euros");
            System.out.println("7. Conversor de Pesos a Euros");
            System.out.println("8. Conversor de Euros a Pesos");
            System.out.println("9. Conversor de Gramos a Libras");
            System.out.println("10. Conversor de Gramos a Kilos");
            System.out.println("0. Salir\n");
            System.out.print("Opción: ......... ");

            opcionMenu = cadena.nextInt();

            switch (opcionMenu) {

                case 0:
                    System.out.println("Adios");

                    break;

                case 1:
                    float celsiusCF;
                    float fahrenheitCF;

                    System.out.print("Ingrese los grados Celsius que desea convertir: ");
                    celsiusCF = cadena.nextFloat();
                    fahrenheitCF = convertirCF(celsiusCF);
                    System.out.println("Su grados celsius " + celsiusCF + " en Fahrenheit son igual a " + fahrenheitCF);

                    break;

                case 2:
                    float celsiusFC;
                    float fahrenheitFC;

                    System.out.print("Ingrese los grados en Fahrenheit que desea convertir: ");
                    fahrenheitFC = cadena.nextFloat();
                    celsiusFC = convertirFC(fahrenheitFC);
                    System.out.println("Su grados Fahrenheit " + fahrenheitFC + " en celsius son igual a " + celsiusFC);

                    break;

                case 3:
                    float pesosPD;
                    float dolaresPD;

                    System.out.print("Ingrese el valor en pesos que desea convertir a dolares: ");
                    pesosPD = cadena.nextFloat();
                    dolaresPD = convertirPesosDolares(pesosPD);
                    System.out.println("El valor de sus pesos " + pesosPD + " en dolares es " + dolaresPD);

                    break;

                case 4:
                    float dolaresDP;
                    float pesosDP;

                    System.out.print("Ingrese el valor en dolares que desea convertir a pesos: ");
                    dolaresDP = cadena.nextFloat();
                    pesosDP = convertirDolaresPesos(dolaresDP);
                    System.out.println("El valor de sus dolares " + dolaresDP + " en pesos es " + pesosDP);

                    break;

                case 5:
                    float dolaresDE;
                    float eurosDE;

                    System.out.print("Ingrese el valor en dolares que desea convertir a euros ");
                    dolaresDE = cadena.nextFloat();
                    eurosDE = convertirDolaresEuros(dolaresDE);
                    System.out.println("El valor de sus dolares " + dolaresDE + " en euros es " + eurosDE);

                    break;

                case 6:
                    float dolaresED;
                    float eurosED;

                    System.out.print("Ingrese el valor en euros que desea convertir a dolares ");
                    eurosED = cadena.nextFloat();
                    dolaresED = convertirEurosDolares(eurosED);
                    System.out.println("El valor de sus euros " + eurosED + " en dolares es " + dolaresED);

                    break;

                case 7:
                    float pesosPE;
                    float eurosPE;

                    System.out.print("Ingrese el valor en pesos que desea convertir a euros ");
                    pesosPE = cadena.nextFloat();
                    eurosPE = convertirPesosEuros(pesosPE);
                    System.out.println("El valor de sus pesos " + pesosPE + " en euros es " + eurosPE);

                    break;

                case 8:
                    float pesosEP;
                    float eurosEP;

                    System.out.print("Ingrese el valor en euros que desea convertir a pesos ");
                    eurosEP = cadena.nextFloat();
                    pesosEP = convertirEurosPesos(eurosEP);
                    System.out.println("El valor de sus euros " + eurosEP + " en pesos es " + pesosEP);

                    break;

                case 9:
                    float gramosGL;
                    float librasGL;

                    System.out.print("Ingrese los gramos que desea convertir a libras ");
                    gramosGL = cadena.nextFloat();
                    librasGL = convertirGramosLibras(gramosGL);
                    System.out.println("Los gramos ingresados " + gramosGL + " en libras son " + librasGL);

                    break;

                case 10:
                    float gramosGK;
                    float kilosGK;

                    System.out.print("Ingrese los gramos que desea convertir a kilos ");
                    gramosGK = cadena.nextFloat();
                    kilosGK = convertirGramosKilos(gramosGK);
                    System.out.println("Los gramos ingresados " + gramosGK + " en kilos son " + kilosGK);

                    break;

                default:
                    System.out.println("Ingrese una opción valida!");

                    break;
            }
        } while(opcionMenu != 0);

    }

    /**
     * Convierte celsius a fahrenheit
     */
    private static float convertirCF(float celsius) {
        float fahrenheit = 33.8F;

        return (fahrenheit * celsius);
    }

    /**
     * Convierte fahrenheit a celsius
     */
    private static float convertirFC(float fahrenheit) {
        return (fahrenheit / 33.8F);
    }

    /**
     * Convierte Pesos a Dolares
     */
    private static float convertirPesosDolares(float pesos) {
        float dolar = 3600;

        return pesos / dolar;
    }

    /**
     * Convierte Dolares a Pesos
     */
    private static float convertirDolaresPesos(float dolares) {
        return dolares * 3600;
    }

    /**
     * Convierte Dolares a Euros
     */
    private static float convertirDolaresEuros(float dolares) {
        float euro = 0.885128078F;

        return dolares / euro;
    }

    /**
     * Convierte Euros a Dolares
     */
    private static float convertirEurosDolares(float euros) {
        float dolar = 1.12978F;

        return euros * dolar;
    }

    /**
     * Convierte Pesos a Euros
     */
    private static float convertirPesosEuros(float pesos) {
        float dolares = convertirPesosDolares(pesos);

        return convertirDolaresEuros(dolares);
    }

    /**
     * Convierte Euros a Pesos
     */
    private static float convertirEurosPesos(float euros) {
        float dolares = convertirEurosDolares(euros);

        return convertirDolaresPesos(dolares);
    }

    /**
     * Convierte Gramos a Libras
     */
    private static float convertirGramosLibras(float gramos) {
        float libra = 0.00220462F;

        return gramos * libra;
    }

    /**
     * Convierte Gramos a Kilos
     */
    private static float convertirGramosKilos(float gramos) {
        float kilo = 0.001F;

        return gramos * kilo;
    }
}
