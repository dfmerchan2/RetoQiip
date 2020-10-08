**Solución**
1. Se realiza la automatización de la pagina demoblaze, en donde se realiza la compra de productos tecnologicos
2. Se consume la API de OpenUV para coonsultar el nivel de UV
3. Se realiza validación de los capos obligatorios y opcionales que tiene la API.
4. Al consumir la API sa valida el Staus que se genera

**Como generar el reporte de Serenity**

Para generar el reporte de Serenity se debe ejecutar por consola los siguintes comandos:
1. gradle clean assemble
2. gradle compileJava
3. gradle clean test aggregate 

**Herramientas utilizadas**
* Serenity BDD
* serenity rest
* Selenium

**Patron de diseño**
* Screenplay

**Lenguaje utilizado**
* Java

**Gestor de dependenciaso**
* Gradle


