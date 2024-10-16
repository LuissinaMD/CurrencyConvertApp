# CurrencyConvertApp (Conversor de moneda).

## Descripción del Proyecto

CurrencyConvertApp es una aplicación de consola que permite realizar conversiones de moneda entre diferentes divisas. El proyecto se desarrolla en Java y se basa en la utilización de una API para obtener tasas de cambio en tiempo real. El usuario puede seleccionar la conversión deseada e ingresar un monto, y la aplicación calculará el valor equivalente en la moneda de destino.
Este proyecto se realizó dentro del marco del programa Oracle Next Education (ONE) junto con Alura Latam, y tiene como objetivo facilitar la conversión de divisas entre pesos argentinos (ARS), dólares estadounidenses (USD), reales brasileños (BRL), euros (EUR) y pesos mexicanos (MXN).

## Características

- Conversión de monedas en tiempo real utilizando la API de ExchangeRate.
- Opciones de conversión de las monedas más utilizadas en Latinoamérica y el mundo.
- Interfaz de menú interactiva que permite elegir la conversión deseada y el valor a convertir.
- Mensajes claros y amigables, con separación visual para facilitar el uso.

## Ilustraciones

![Conversor](https://github.com/user-attachments/assets/3a1c54e9-1f62-44f6-a6bf-ea1ef26c7bd7)
![Conversor2](https://github.com/user-attachments/assets/93057850-d410-4e5b-998a-3901d262e719)
![Conversor4](https://github.com/user-attachments/assets/d1970253-a8f3-46d8-a4a2-d876731b9fbf)
![Conversor3](https://github.com/user-attachments/assets/f79b7fc2-9424-4ef1-a6c9-8d5ac3121593)


## Tecnologías Empleadas

- **Java**: Lenguaje de programación utilizado.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE) para la programación en Java.
- **API ExchangeRate**: Para obtener tasas de cambio en tiempo real.
- **Gson**: Biblioteca de Java para manejar JSON.

## Requisitos Previos

- Java Development Kit (JDK) 17 o superior.
- IntelliJ IDEA u otro entorno de desarrollo compatible con Java.
- Conexión a internet para realizar la conversión utilizando la API de ExchangeRate.
- API Key de ExchangeRate API.

## Instrucciones de Uso

1. Al ejecutar la aplicación, recibirá la bienvenida con un mensaje interactivo.
2. Se brirá un menú con las opciones de conversión disponibles. Solo debe seleccionar la opción deseada ingresando el número correspondiente.
3. Luego, se solicitará ingresar el valor que desea convertir.
4. El sistema realizará la conversión en tiempo real y le mostrará el resultado.
5. Puede continuar realizando más conversiones o salir de la aplicación seleccionando la opción "21" en el menú.

## Instrucciones para descargar del repositorio

1. Haga clic en el botón "Code" en la página principal del repositorio y seleccione Download ZIP. Extraiga el contenido del archivo en su computadora. O clone este repositorio en su máquina local utilizando el siguiente comando:
**git clone https://github.com/LuissinaMD/CurrencyConvertApp.git**
2. Abra el proyecto en su IDE favorito (mi recomendación es **IntelliJ IDEA**).
3. Asegúrese de que tiene Java 17 o superior instalado.
4. Instale la dependencia de Gson, que se utiliza para el parseo de JSON.
5. Agregue su propia API key de ExchangeRate en la clase CurrencyConverter reemplazando el valor del atributo apiKey.

## Ejecución del Proyecto

1. Ejecute el método main() de la clase Main para iniciar la aplicación.
2. Siga las instrucciones en pantalla para convertir la/s moneda/s.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo LICENSE para más detalles.
