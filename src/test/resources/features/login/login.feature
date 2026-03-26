#language:es

Característica: Login Usuario

"""
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 002:
    Como usuario registrado quiero ingresar con mis credenciales
    para ver la informacion de mi cuenta
    y realizar compras de productos
    """
  @LoginUsuario
  Esquema del escenario: Login usuario exitoso.
    Dado que el usuario se encuentra en la página del login
    Cuando ingresa las credenciales validas "<email>" y "<password>"
    Entonces se debe acceder correctamente a su cuenta

    Ejemplos:
      | email                  | password |
      | pruebaqa2016@gmail.com | $246810$ |