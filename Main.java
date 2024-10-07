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
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
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
