Feature: Categoria Comics
  Como Usuario quiero leer chistes de testers para reirme y pasar un buen rato.

  Scenario: Ingresar a la categoria Comics desde la pantalla Home
    Given El usuario se encuentra en la pagina home de imalittletester
    When Hace click sobre el link de Latest Comics
    Then Se debe redirigir a la pantalla Comics