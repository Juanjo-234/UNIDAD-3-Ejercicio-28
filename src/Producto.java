public class Producto {
    protected String codigo;
    protected String descripcion;
    protected double costoBase;


    public Producto(String codigo, String descripcion, double costoBase){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }

    public double calcularPrecioFinal() {
        return costoBase;
    }

    public String obtenerDetalle() {
        return "Código: " + codigo + " | Descripción: " + descripcion + " | Costo Base: $" + String.format("%.2f", costoBase);
    }
}
