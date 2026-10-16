public class ProductoAlimenticio extends Producto{
    private double porcentajeImpuestoInterno;
    private boolean requiereRefrigeracion;

    public ProductoAlimenticio(String codigo, String descripcion, double costoBase, double porcentajeImpuestoInterno, boolean requiereRefrigeracion) {
        super(codigo, descripcion, costoBase);
        this.porcentajeImpuestoInterno = porcentajeImpuestoInterno;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    @Override
    public double calcularPrecioFinal() {
        double margenComercial = costoBase * 0.25;
        double impuesto = costoBase * (porcentajeImpuestoInterno / 100.0);
        return costoBase + margenComercial + impuesto;
    }

    @Override
    public String obtenerDetalle() {
        return "[Alimento] " + super.obtenerDetalle() + " | Impuesto Interno: " + porcentajeImpuestoInterno + "% | Refrigeración: " + (requiereRefrigeracion ? "Sí" : "No") + " | Precio Final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}
