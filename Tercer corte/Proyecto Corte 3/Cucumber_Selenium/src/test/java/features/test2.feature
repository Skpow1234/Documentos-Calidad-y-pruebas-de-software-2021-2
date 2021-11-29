Feature: agregar producto al carrito de compras
  Como usuario quiero registrarme y logearme en la pagina de efset

  Scenario: entrar agregar al carrito en amazon
    Given estoy en la pagina de amazon
    When buscar producto
    When elegir  producto
    When agregar al carrito
    When ir al carrito