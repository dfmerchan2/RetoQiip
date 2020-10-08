#language: es

Característica: Consultar el indice de UV en tiempo real

  Yo como usuario
  Quiero quiero conocer los indices de UV
  Para saber

  @ConsultarIndiceUv
  Esquema del escenario: Consultar indice UV mediante OpenUV
    Dado que Diego quiere consultar el UV con el metodo https://api.openuv.io/api/v1/uv
    Cuando le proporsiona la informacion solicitada
      | Latitud   | Longitud   | Altura   | Ozone   | Fecha   | Token   |
      | <Latitud> | <Longitud> | <Altura> | <Ozone> | <Fecha> | <Token> |
    Entonces observa que se generan los indices de UV con Status 200
    Ejemplos:
      | Latitud | Longitud | Altura | Ozone | Fecha                    | Token                            |
      | -31.45  | 115.67   | 115.67 | 500   | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      | -31.45  | 115.67   |        |       |                          | 5efbe6c5f3e3c566f77f34dbfe8dafcc |


  @ValidacionObligatorios
  Esquema del escenario: Validar campos obligatorios de la API
    Dado que Diego quiere consultar el UV con el metodo https://api.openuv.io/api/v1/uv
    Cuando le proporsiona la informacion solicitada
      | Latitud   | Longitud   | Altura   | Ozone   | Fecha   | Token   |
      | <Latitud> | <Longitud> | <Altura> | <Ozone> | <Fecha> | <Token> |
    Entonces observa que se una exceptions con Status 500
    Ejemplos:
      | Latitud | Longitud | Altura | Ozone | Fecha                    | Token                            |
      |         | 115.67   | 950    | 500   | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      | -31.45  |          | 950    | 500   | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      |         |          | 950    | 500   | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |


  @ValidacionOpcionales
  Esquema del escenario: Validar campos opcionales de la API
    Dado que Diego quiere consultar el UV con el metodo https://api.openuv.io/api/v1/uv
    Cuando le proporsiona la informacion solicitada
      | Latitud   | Longitud   | Altura   | Ozone   | Fecha   | Token   |
      | <Latitud> | <Longitud> | <Altura> | <Ozone> | <Fecha> | <Token> |
    Entonces observa que se generan los indices de UV con Status 200
    Ejemplos:
      | Latitud | Longitud | Altura | Ozone | Fecha                    | Token                            |
      | -31.45  | 115.67   |        | 500   | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      | -31.45  | 115.67   | 950    |       | 2020-01-24T10:50:52.283Z | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      | -31.45  | 115.67   | 950    | 500   |                          | 5efbe6c5f3e3c566f77f34dbfe8dafcc |
      | -31.45  | 115.67   |        |       |                          | 5efbe6c5f3e3c566f77f34dbfe8dafcc |