Feature: My Store
  @carritoCompras
  Scenario: Validacion del Precio de la tienda
    Given estoy en la pagina de la tienda
    And me logueo con mi usuario "whitebear.orblack@gmail.com" y clave "4LkApone2790"
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito