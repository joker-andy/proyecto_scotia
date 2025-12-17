Feature: Login en Sauce Demo

  Scenario: Inicio de sesion exitoso
    Given que el usuario navega a la pagina de login
    When ingresa el usuario "standard_user" y la contraseña "secret_sauce"
    Then deberia ver la pagina de productos