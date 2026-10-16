//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Producto> inventario = new ArrayList<>();

    inventario.add(new ProductoAlimenticio("P001", "Aceite de Oliva 1L", 8500.00, 4.5, false));
    inventario.add(new Electrodomestico("E001", "Lavarropas Automático", 450000.00, 12, 3500.00));
    inventario.add(new ProductoAlimenticio("P002", "Yogur Entero 1L", 1800.00, 2.0, true));
    inventario.add(new Electrodomestico("E002", "Smart TV 50 pulgadas", 320000.00, 24, 2500.00));

    System.out.println("=== LISTADO DE PRECIOS Y PRODUCTOS ===");
    for (Producto prod : inventario) {
        System.out.println(prod.obtenerDetalle());
    }
}

