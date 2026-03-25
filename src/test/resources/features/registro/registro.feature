#language:es

  Característica: Registro Usuario

    """
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 001:
    Como usuario que ingreso a la pagina
    quiero poder ingresar mi informacion personal
    para crear mi cuenta en el sistema

    """
  @RegistroUsurio
  Escenario: Registro usuario exitoso.
    Dado que el usuario se encuentra en la página de registro
    Cuando ingresa la información personal y sus credenciales de usuario
    Entonces se debe visualizar el mensaje de confirmación