# Conversor de Monedas

Este proyecto es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando una API de tasas de cambio. Los resultados de las conversiones se guardan en un historial que puede ser consultado en cualquier momento.

## Funcionalidades

- Convertir entre las siguientes monedas:
  - Dólar (USD) y Peso Argentino (ARS)
  - Peso Argentino (ARS) y Dólar (USD)
  - Dólar (USD) y Real Brasileño (BRL)
  - Real Brasileño (BRL) y Dólar (USD)
  
- Guardar el historial de conversiones.
- Consultar el historial de conversiones en cualquier momento.
- Validación de monto para asegurar que sea mayor a 0.

## Estructura del Proyecto

El proyecto sigue una arquitectura basada en servicios, con las siguientes carpetas y archivos principales:

- **api/ApiConversor.java**: Esta clase se encarga de hacer la solicitud a la API externa de tasas de cambio.
- **model/Moneda.java**: Clase que modela los datos de la moneda.
- **service/ConversorService.java**: Clase que realiza la conversión de moneda y almacena el historial de conversiones.
- **Main.java**: Clase principal que maneja la interacción con el usuario a través de un menú.

## Requisitos

- Java 17 o superior
- Biblioteca [Gson](https://github.com/google/gson) para el manejo de JSON
- Biblioteca [Dotenv](https://github.com/cdimascio/dotenv-java) para manejar las variables de entorno

## Instalación y Configuración

### Clonar el repositorio

```bash
git clone https://github.com/1cristianb/conversor-monedas.git
cd conversor-monedas-java
```
Configurar la API Key
- Debes tener una API Key válida de ExchangeRate-API.
- Crea un archivo .env dentro del directorio src/resources/.
- Agrega la clave de tu API en el archivo .env:
```
 API_KEY=tu_api_key_aqui
```
Asegúrate de que el archivo .env no se suba al repositorio. Esto se hace añadiendo una entrada en el archivo .gitignore

## Compilar y Ejecutar
Puedes compilar y ejecutar el proyecto desde tu IDE favorito como IntelliJ IDEA o Eclipse.

Asegúrate de que las dependencias necesarias (Gson y Dotenv) están incluidas.
Ejecuta la clase Main.java.
