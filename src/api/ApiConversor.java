package src.api;

import com.google.gson.Gson;
import src.model.Moneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import io.github.cdimascio.dotenv.Dotenv;
public class ApiConversor {
    private final String apiUrl = "https://v6.exchangerate-api.com/v6";
    private final String apiKey;

    public ApiConversor() {
        Dotenv dotenv = Dotenv.configure()
                .directory("./src/resources")
                .load();
        this.apiKey = dotenv.get("API_KEY");
    }

    public Moneda consultarConversion(String monedaEntrada, String monedaSalida, double monto) {
        String url = apiUrl + "/" + apiKey + "/pair/" + monedaEntrada + "/" + monedaSalida + "/" + monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException("Error al consultar la API de conversión", e);
        }
    }
}
