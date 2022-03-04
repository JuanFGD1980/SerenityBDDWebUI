Feature: Contacto en pagina Web
  Yo como un nuevo cliente de la página http://automationpractice.com/index.php
  Quiero  enviar un mensaje de contacto
  para tener conocimiento de sus ofertas

  Background:
    Given el Cliente está en la pagina de aterrizaje http://automationpractice.com/index.php

  @contacto1
  Scenario: Mensaje de Contacto Webmaster
    When el cliente realizara el proceso para el contacto con la compañía con Webmaster
    Then el cliente  deberá observar el mensaje de  confirmación del envío del mensaje al Webmaster


  @contacto2
  Scenario: Mensaje de Contacto Customer service
    When el cliente realizara el proceso para el contacto con la compañía con Customer service
    Then el cliente  deberá observar el mensaje de  confirmación del envío del mensaje al Customer service





