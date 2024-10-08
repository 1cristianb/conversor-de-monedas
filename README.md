# Conversor de Monedas | Challenge de Alura - ONE Oracle

<p align="center" >
  <img src="https://app.aluracursos.com/assets/images/logos/logo-aluraespanhol.svg" alt="Alura logo">
  <img src="https://cdn2.gnarususercontent.com.br/6/449886/e4621638-6168-4948-a623-76dcfdefd99c.png" alt="ONE Oracle logo">
</p>

## Descripción
Este proyecto es parte del desafío del curso de Alura - ONE Oracle.Es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando una API de tasas de cambio. Los resultados de las conversiones se guardan en un historial que puede ser consultado en cualquier momento.

## Funcionalidades

- Convertir entre las siguientes monedas:
  - Dólar (USD) y Peso Argentino (ARS)
  - Peso Argentino (ARS) y Dólar (USD)
  - Dólar (USD) y Real Brasileño (BRL)
  - Real Brasileño (BRL) y Dólar (USD)
  - Dólar (USD) y Peso colombiano (COP)
  - Peso colombiano (COP) y Dólar (USD)
  - Dólar (USD) y Peso chileno (CLP)
  - Peso chileno (CLP) y Dólar (USD)
  
- Guardar el historial de conversiones.
- Consultar el historial de conversiones en cualquier momento.

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

## Instrucciones

### Clonar el repositorio

```bash
git clone https://github.com/1cristianb/conversor-monedas.git
cd conversor-monedas
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

## Tecnologías Usadas

Este proyecto utiliza las siguientes tecnologías y bibliotecas:

- **Java 17**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Gson**: Biblioteca para serialización y deserialización de objetos JSON en Java.
- **Dotenv**: Biblioteca para manejar variables de entorno, utilizada para almacenar de forma segura la API Key.
- **API ExchangeRate-API**: Servicio externo de tasas de cambio utilizado para obtener las tasas de conversión entre monedas.
- **HttpClient**: Librería incluida en Java para realizar peticiones HTTP a la API externa.
- **Eclipse / IntelliJ IDEA**: IDEs recomendados para el desarrollo y ejecución del proyecto.

## Autor
Cristian Boschi
