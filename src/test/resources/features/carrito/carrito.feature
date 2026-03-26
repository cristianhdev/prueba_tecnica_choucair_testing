#language:es

Característica: Carrito de compra

   """
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 003:
    Como usuario registrado en la pagina
    quiero ingresar a la pagina, seleccionar y agregar mis productos al carrito
    para posteriormente realizar la compra

    """

  Antecedentes: Login usuario exitoso.
    Dado que el usuario se encuentra en la página del login
    Cuando ingresa las credenciales validas "<email>" y "<password>"

  @CarritoCompras
  Escenario: Agregar productos al carrito
    Dado que el usuario se encuentra en la página de productos
    Cuando selecciona un producto y lo agregue al carrito
    Entonces  el producto debe agregarse correctamente al carrito