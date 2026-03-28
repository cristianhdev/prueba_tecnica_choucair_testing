#language:es

Característica: Proceso de pago

"""
    Epica: Gestinar usuarios  y proceso de  compra en la plataforma web demowebshop.tricentis.com

    HU 004:
    Como usuario registrado en la página
    quiero ingresar mis productos seleccionados al carrito de compras ingresar mis datos
    y finalizar adquisición del producto.
    """

  Antecedentes: Agregar productos al carrito
    Dado que el usuario se encuentra autenticado
      | email                | password |
      | testqa2040@gmail.com | $12348%  |
    Cuando selecciona un producto y lo agregue al carrito



  @ProcesoDePago
  Escenario: Proceso de pago exitoso
    Cuando ingrese la informacion de envio
      | compania | pais     | ciudad  | direccion     | codigo_postal | numero_telefono |
      | QA       |  Colombia | Armenia | B las acacias | 000063        | 3015014539      |
    Entonces se debe visualizar el mensaje de confirmación de compra
