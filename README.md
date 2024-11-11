# Currency Converter Project

Este proyecto es una aplicación de conversión de divisas desarrollada en Java. Permite convertir montos entre diferentes monedas utilizando tasas de cambio actualizadas desde una API.

## Tabla de Contenidos
- [Descripción](#descripción)
- [Tecnologías](#tecnologías)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Descripción
Este proyecto fue desarrollado para facilitar la conversión de divisas en tiempo real. La aplicación consume datos de la API de ExchangeRate para obtener tasas de cambio actualizadas y así realizar cálculos precisos. Es útil para cualquier persona que necesite convertir divisas de manera rápida y confiable.

## Tecnologías
- **Java** - Lenguaje de programación principal
- **IntelliJ IDEA** - Entorno de desarrollo integrado (IDE)
- **ExchangeRate API** - API utilizada para obtener tasas de cambio actualizadas en tiempo real
- **JSON** - Para el manejo de datos recibidos desde la API

## Requisitos
- Java JDK 11 o superior
- IntelliJ IDEA o cualquier IDE compatible con Java
- Conexión a Internet para acceder a la API

## Instalación
1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu_usuario/currency-converter.git
    ```
2. Abre el proyecto en IntelliJ IDEA.
3. Agrega tu clave de API en la sección correspondiente del código. (Ejemplo: `API_KEY = "tu_clave_api"`).
4. Asegúrate de que todas las dependencias están instaladas y configuradas.

## Uso
1. Ejecuta el programa desde IntelliJ IDEA.
2. Selecciona la moneda de origen y destino.
3. Ingresa el monto a convertir.
4. El programa mostrará el monto convertido utilizando la tasa de cambio actual.

## Estructura del Proyecto
currency-converter/ ├── src/ │ ├── Main.java # Clase principal para ejecutar la aplicación │ ├── ApiHandler.java # Clase para gestionar las solicitudes a la API │ ├── Converter.java # Lógica de conversión de divisas │ └── utilities/ # Utilidades y funciones auxiliares └── README.md # Este archivo

## Contribuciones
Si deseas contribuir a este proyecto:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -m 'Añadir nueva funcionalidad'`).
4. Envía un pull request.

## Licencia
Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.
Este formato cubre los aspectos principales de un README.md y te permitirá describir las características y el uso del proyecto de forma clara. ¡Espero que te sea útil!









