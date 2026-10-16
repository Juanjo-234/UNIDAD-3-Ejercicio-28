public class Electrodomestico extends Producto {
    private int garantiaMeses;
    private double tasaEcoReciclaje;


    public Electrodomestico(String codigo, String descripcion, double costoBase, int garantiaMeses, double tasaEcoReciclaje) {
        super(codigo, descripcion, costoBase);
        this.garantiaMeses = garantiaMeses;
        this.tasaEcoReciclaje = tasaEcoReciclaje;
    }

    @Override
    public double calcularPrecioFinal() {
        double margenComercial = costoBase * 0.35;
        double iva = costoBase * 0.21;
        return costoBase + margenComercial + iva + tasaEcoReciclaje;
    }
    @Override
    public String obtenerDetalle() {
        return "[Electrodoméstico] " + super.obtenerDetalle() + " | Garantía: " + garantiaMeses + " meses | Tasa Eco: $" + String.format("%.2f", tasaEcoReciclaje) + " | Precio Final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}
