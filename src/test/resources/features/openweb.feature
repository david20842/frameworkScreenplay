Feature: Abrir una pagina web
  @pass
  Scenario: abrir con el navegador una pagina web
    Given "Actor" abre el sitio web
    When ingresa al navegador
    Then Visualiza texto pagina "Pagina"