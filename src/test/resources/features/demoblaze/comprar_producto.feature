#language: es

Característica: Compra de productos en la pagina demoblaze

  Yo como cliente de demoblaze
  Quiero seleccionar un articulo
  Para realizar la compra

  @RealizarCompraExitosa
  Escenario: Compra de productos tecnologicos en la pagina demoblaze
    Dado que Diego ingresa a demoblaze
    Cuando agrega los productos al carrito de compras
      | Categoria | Producto       |
      | Phones    | Sony xperia z5 |
      | Laptops   | Dell i7 8gb    |
      | Monitors  | ASUS Full HD   |
    Entonces genera el pedido de la compra
      | Nombre | Pais     | Ciudad   | TarjetaCredito | Mes | Year |
      | Diego  | Colombia | Bogota   | 23456789876    | 11  | 2020 |
    Y observa la confirmacion del pedido
