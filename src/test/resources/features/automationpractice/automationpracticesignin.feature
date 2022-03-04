Feature: Registro en pagina Web
  Yo como un nuevo cliente de la página http://automationpractice.com/index.php
  Quiero registrarme exitosamente
  para tener conocimiento de sus ofertas

  Background:
    Given el Cliente está en la pagina de landingpage http://automationpractice.com/index.php

  @registro1
  Scenario: Registro minimo en página web
    When El cliente ingresa la información necesaria para el registro en la pagina web de la compañia
    Then el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion minima

  @registro2
  Scenario: Registro completo en página web
    When El cliente ingresa la información completa para el registro en la pagina web de la compañia
    Then el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion completa
