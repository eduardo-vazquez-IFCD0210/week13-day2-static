public class Movil {
  private String modelo;
  private Double precio;
  private static Integer descuentoEnPorcentaje = 0;

  public Movil(String modelo, Double precio) {
    this.modelo = modelo;
    this.precio = precio;
  }

  public static void descuentoEnPorcentaje(Integer descuentoEnPorcentajeNuevo) {
    descuentoEnPorcentaje = descuentoEnPorcentajeNuevo;
  }

  public Double getPrecioConDescuento() {
    return this.precio - this.precio * (descuentoEnPorcentaje / 100);
  }

  public String getModelo() {
    return this.modelo;
  }

  @Override
  public String toString() {
    return "Movil{" +
        "modelo='" + modelo + '\'' +
        ", precio=" + precio +
        '}';
  }

}
