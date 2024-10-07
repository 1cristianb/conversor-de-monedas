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
        System.out.println("Base: " + moneda.base_code());
        System.out.println("Destino: " + moneda.target_code());
        System.out.println("Tasa de conversión: " + moneda.conversion_rate());
        System.out.println("Monto convertido: " + moneda.conversion_result());
    }

    private void validarEntradas(String monedaEntrada, String monedaSalida, double monto) {
        if (monedaEntrada == null || monedaSalida == null || monto <= 0) {
            throw new IllegalArgumentException("Moneda o monto no válidos");
        }
    }
}
