Este programa está diseñado para modelar un sistema de gestión y tasación de inventarios comerciales aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización de atributos mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para el cálculo de precios finales con regímenes impositivos particulares.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Producto: Concentra los atributos protegidos comunes a cualquier artículo del catálogo (codigo, descripcion y costoBase), junto con un constructor centralizado y un método base para consultar los datos generales.

Desarrollar las clases hijas (ProductoAlimenticio y Electrodomestico): Extienden de Producto incorporando atributos y reglas de negocio propias (como la fecha de vencimiento y el porcentaje de impuesto interno para alimentos; los meses de garantía y el costo de seguro técnico para electrodomésticos).

Implementa el cálculo del precio final: Cada subclase sobrescribe el método correspondiente aplicando su fórmula impositiva y de recargo específica para determinar el precio de venta al público.

Ejecuta la prueba en el main: Crea una lista polimórfica de productos especializados, calcula sus precios finales invocando las reglas particulares, y despliega un reporte consolidado por consola.
