Feature: Prueba Banistmo
  i as user want check the page Banitsmo

  Scenario: Validate the correct pdf inform
    Given the user is on the page Proveedores
    When the user click on button descarga el documento on Proveedores Page
    Then the user check the document politicas.pdf