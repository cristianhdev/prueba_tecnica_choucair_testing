#language:es

Característica: Carrito de compra

   """
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 003:
    Como usuario registrado en la pagina
    quiero ingresar, seleccionar y agregar mis productos al carrito
    para posteriormente realizar la compra

    """

  Antecedentes:Login usuario exitoso.
    Dado que el usuario se encuentra en la página del login
    Cuando ingrese las credenciales validas
      | email                  | password |
      | pruebaqa2016@gmail.com | $246810$ |



  @CarritoCompras
  Escenario: Agregar productos al carrito
    Cuando selecciona un producto y lo agregue al carrito
    Entonces  el producto debe agregarse correctamente al carrito