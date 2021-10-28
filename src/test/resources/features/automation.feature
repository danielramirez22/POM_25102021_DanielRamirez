@Account
Feature: Usuario quiere comprar un producto

  @CompraProducto
  Scenario Outline: Compra de un producto
    Given El usuario inició sesión correctamente en la plataforma
      |<Username>|<Password>|
    When Compramos un producto
      |<Nombre>|<Apellido>|<ZIPCode>|
    Then Validamos que la compra haya sido exitosa
      |<TextValidation>|
    Examples:
      |Username|Password|Nombre|Apellido|ZIPCode|TextValidation|
      |standard_user|secret_sauce|Pepito|Perez|33101|THANK YOU FOR YOUR ORDER|