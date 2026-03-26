#language:es

  Característica: Registro Usuario

    """
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 001:
    Como usuario que ingreso a la pagina
    quiero poder ingresar mi informacion personal
    para crear mi cuenta en el sistema

    """
  @RegistroUsuario
 Escenario: Registro usuario exitoso.
    Dado que el usuario se encuentra en la página de registro
    Cuando ingresa la información personal y sus credenciales de usuario
      | primerNombre | segundoNombre | email                | password | confirm |
      | pedro        | sanchez       | testqa2028@gmail.com | $1234%   | $1234%  |
    Entonces se debe visualizar el mensaje de confirmación

