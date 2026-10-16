Resolución del ejercicio N°28 de la unidad 3 de programación 2.
Este programa modela un sistema de gestión comercial que calcula los precios finales de venta para diferentes tipos de artículos mediante el uso de herencia, atributos protegidos, polimorfismo y sobrescritura de métodos en Java.

Clases utilizadas
Producto: Clase base que almacena los datos comunes (codigo, descripcion, costoBase) y define la estructura general.
ProductoAlimenticio: Clase hija que extiende de Producto, incorpora el porcentaje de impuesto interno o descuento y calcula el precio final específico.
Electrodomestico: Clase hija que extiende de Producto, incorpora la garantía en meses y el costo adicional por cobertura, sobrescribiendo el cálculo del precio final.
