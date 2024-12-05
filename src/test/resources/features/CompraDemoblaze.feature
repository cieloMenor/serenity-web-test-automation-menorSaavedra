@Demoblaze
Feature: Compra en Demoblaze

  @Login @AgregarAlCarrito
  Scenario: Login exitoso y agregar producto al carrito
  Given el usuario esta en la pagina de inicio de Demoblaze
  When el usuario inicia sesion con nombre de usuario "Cielomenor" y contrasenia "password"
  Then deberia ver el mensaje de bienvenida
  When el usuario navega a la categoria "Phones"
  And selecciona el producto "Samsung galaxy s6"
  And agrega el producto al carrito
  Then deberia ver un mensaje de confirmacion