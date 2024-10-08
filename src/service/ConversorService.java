package src.service;

import src.api.ApiConversor;
import src.model.Moneda;

public class ConversorService {

    private final ApiConversor apiConversor;

    public ConversorService(ApiConversor apiConversor) {
        this.apiConversor = apiConversor;
    }

    public void convertirMoneda(String monedaEntrada, String monedaSalida, double monto) {
        validarEntradas(monedaEntrada, monedaSalida, monto);
        Moneda moneda = apiConversor.consultarConversion(monedaEntrada, monedaSalida, monto);
        System.out.println("\n=== Resultado ===");
        System.out.println("Tasa de conversión: " + moneda.conversion_rate());
        System.out.println("El valor " + monto+" "+moneda.base_code()+" corresponde al valor final de =>>>"+moneda.conversion_result()+" "+moneda.target_code() );
    }

    private void validarEntradas(String monedaEntrada, String monedaSalida, double monto) {
        if (monedaEntrada == null || monedaSalida == null || monto <= 0) {
            throw new IllegalArgumentException("Moneda o monto no válidos");
        }
    }
}
