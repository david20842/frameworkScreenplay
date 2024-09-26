Feature: Abrir una pagina web

  Background:
    Given "David" abre el sitio web


  @pass
  Scenario: abrir con el navegador una pagina web
    And validar el area de elementos
    When seleccione una subfuncion
    Then visualizara en la cabecera el nombre de la opcion elegida