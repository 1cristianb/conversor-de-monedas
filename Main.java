import src.api.ApiConversor;
import src.service.ConversorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApiConversor apiConversor = new ApiConversor();
        ConversorService conversorService = new ConversorService(apiConversor);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("Elige una opción:");
            System.out.println("1. Dólar (USD) => Peso Argentino (ARS)");
            System.out.println("2. Peso Argentino (ARS) => Dólar (USD)");
            System.out.println("3. Dólar (USD) => Real Brasileño (BRL)");
            System.out.println("4. Real Brasileño (BRL) => Dólar (USD)");
            System.out.println("5. Dólar (USD) => Peso colombiano (COP)");
            System.out.println("6. Peso colombiano (COP) => Dólar (USD)");
            System.out.println("7. Dólar (USD) => Peso chileno (CLP)");
            System.out.println("8. Peso chileno (CLP) => Dólar (USD)");
            System.out.println("===============");
            System.out.println("9. Historial de conversiones");
            System.out.println("10. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 10) {
                System.out.println("Saliendo del programa...");
                break;
            }

            String monedaEntrada = null;
            String monedaSalida = null;

            switch (opcion) {
                case 1:
                    monedaEntrada = "USD";
                    monedaSalida = "ARS";
                    break;
                case 2:
                    monedaEntrada = "ARS";
                    monedaSalida = "USD";
                    break;
                case 3:
                    monedaEntrada = "USD";
                    monedaSalida = "BRL";
                    break;
                case 4:
                    monedaEntrada = "BRL";
                    monedaSalida = "USD";
                    break;
                case 5:
                    monedaEntrada = "USD";
                    monedaSalida = "COP";
                    break;
                case 6:
                    monedaEntrada = "COP";
                    monedaSalida = "USD";
                    break;
                case 7:
                    monedaEntrada = "USD";
                    monedaSalida = "CLP";
                    break;
                case 8:
                    monedaEntrada = "CLP";
                    monedaSalida = "USD";
                    break;
                case 9:
                    conversorService.mostrarHistorial();
                    continue;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            System.out.print("Ingrese el monto a convertir(mayor a 0): ");
            double monto = scanner.nextDouble();
            if(monto<=0){
                System.out.println("El monto debe ser mayor a 0. Intente de nuevo.");
                continue;
            }

            conversorService.convertirMoneda(monedaEntrada, monedaSalida, monto);
        }

        scanner.close();
    }
}
