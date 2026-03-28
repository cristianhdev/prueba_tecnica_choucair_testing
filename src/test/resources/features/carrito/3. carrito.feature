#language:es

Característica: Carrito de compra

   """
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 003:
    Como usuario registrado en la pagina
    quiero ingresar, seleccionar y agregar mis productos al carrito
    para posteriormente realizar la compra

    """


  @CarritoCompras
  Escenario: Agregar productos al carrito
    Dado que el usuario se encuentra autenticado
      | email                | password |
      | testqa2040@gmail.com | $12348%  |
    Cuando selecciona un producto y lo agregue al carrito
    Entonces  el producto debe agregarse correctamente al carrito