# Automatización Sauce Demo

Este proyecto automatiza el flujo de inicio de sesión en la plataforma **Sauce Demo**.

## Tecnologías utilizadas
* **Lenguaje:** Java 11
* **Framework de Pruebas:** Cucumber con JUnit 4
* **Automatización Web:** Selenium WebDriver
* **Gestor de Dependencias:** Maven
* **Patrón de Diseño:** Page Object Model (POM)

## Requisitos
* JDK 11 o superior.
* Maven instalado.
* Google Chrome actualizado.

## Cómo ejecutar las pruebas
1. Clona el repositorio.
2. Abre una terminal en la raíz del proyecto.
3. Ejecuta el comando:
   "mvn clean test"
4. Al finalizar la ejecución, el reporte HTML se genera automáticamente en: Proyecto_scotia/target/cucumber-reports.html