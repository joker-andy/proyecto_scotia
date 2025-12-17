package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginsite;

public class loginsteps {
    WebDriver driver;
    loginsite login;

    @Given("que el usuario navega a la pagina de login")
    public void navegar() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        login = new loginsite(driver);
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresar_credenciales(String u, String p) {
        login.login(u, p);
    }


    @Then("debe ver la pagina de productos")
    //public void debe_ver_la_pagina_de_productos() {
    public void debe_ver_la_pagina_de_productos() throws InterruptedException {
        // Validación de URL
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("inventory.html")) {
            System.out.println("TEST PASSED: El usuario está en la página de productos.");
        } else {
            org.junit.Assert.fail("TEST FAILED: No se redirigió a la página de productos.");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
