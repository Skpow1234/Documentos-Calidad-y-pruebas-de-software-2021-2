Feature: Registrarse en efset.org
  Como usuario quiero registrarme y logearme en la pagina de efset

  Scenario: Crear una cuenta en "efset.org"
    Given estoy en la página principal de efset.org
    When doy click en el botón de "Login"
    When doy click en el boton de "Create one now"
    When doy click en el boton de "SIGN UP WITH EMAIL"
    And ingreso mi primer nombre en la barra de texto de "First Name"
    And ingreso mi primer nombre en la barra de texto de "Last Name"
    And ingreso un email en la barra de texto de "Email"
    And ingreso una contraseña en la barra de "Password"
    And ingreso nuevamenta la contraseña en la barra de "Password Confirmation"
    When doy click en el boton "SIGN UP"

  Scenario: Logear una cuenta en "efset.org"
    Given estoy en la página principal de efset.org
    When doy click en el botón de "Login"
    And soy redireccionado a una página donde tengo que ingresar unos datos
    And ingreso un email en la barra de texto de "Email"
    And ingreso una contraseña en la barra de "Password"
    When doy click en el boton de "SIGN IN"
    And soy redireccionado a la pagina principal de efset.org
    Then en donde previamente estaba el boton de "Login" aparece un avatar de una persona con un menu desplegable
