package src.service;

import src.api.ApiConversor;
import src.model.Moneda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConversorService {

    private final ApiConversor apiConversor;
    private final List<String> historial;

    public ConversorService(ApiConversor apiConversor) {
        this.apiConversor = apiConversor;
        this.historial = new ArrayList<>();
    }

    public void convertirMoneda(String monedaEntrada, String monedaSalida, double monto) {
        validarEntradas(monedaEntrada, monedaSalida, monto);
        Moneda moneda = apiConversor.consultarConversion(monedaEntrada, monedaSalida, monto);
        LocalDateTime fecha = LocalDateTime.now();
        historial.add("El valor " + monto+" "+moneda.base_code()+" corresponde al valor final de =>>>"+moneda.conversion_result()+" "+moneda.target_code()+" / "+fecha);
        System.out.println("\n=== Resultado ===");
        System.out.println("Tasa de conversión: " + moneda.conversion_rate());
        System.out.println("El valor " + monto+" "+moneda.base_code()+" corresponde al valor final de =>>>"+moneda.conversion_result()+" "+moneda.target_code() );
    }
    public void mostrarHistorial() {
        System.out.println("\n=== Historial de Conversiones ===");
        if (historial.isEmpty()) {
            System.out.println("No hay conversiones en el historial.");
        } else {
            for (String conversion : historial) {
                System.out.println(conversion);
            }
        }
    }
    private void validarEntradas(String monedaEntrada, String monedaSalida, double monto) {
        if (monedaEntrada == null || monedaSalida == null || monto <= 0) {
            throw new IllegalArgumentException("Moneda o monto no válidos");
        }
    }
}
