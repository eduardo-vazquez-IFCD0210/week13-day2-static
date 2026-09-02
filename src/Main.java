import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    System.out.println("EJERCICIO PERRERA");
    Perro p1 = new Perro("Toby", LocalDate.of(2020, 5, 10));
    Perro p2 = new Perro("Max", LocalDate.of(2022, 1, 15));

    System.out.println(p1);
    System.out.println(p2);

    System.out.println("EJERCICIO BLACK FRIDAY");
    Movil m1 = new Movil("iPhone 16", 950.0);
    Movil m2 = new Movil("Samsung S24", 850.0);

    System.out.println("ANTES DEL BLACK FRIDAY");
    System.out.println(m1.getModelo() + " - Precio: " + m1.getPrecioConDescuento() + "€");
    System.out.println(m2.getModelo() + " - Precio: " + m2.getPrecioConDescuento() + "€");

    Movil.descuentoEnPorcentaje(20);

    System.out.println("\n LLEGA EL BLACK FRIDAY (20% DTO)");
    System.out.println(m1.getModelo() + " - Precio con descuento: " + m1.getPrecioConDescuento() + "€");
    System.out.println(m2.getModelo() + " - Precio con descuento: " + m2.getPrecioConDescuento() + "€");

    Movil.descuentoEnPorcentaje(0);

    System.out.println("\nFIN DEL BLACK FRIDAY");
    System.out.println(m1.getModelo() + " - Precio: " + m1.getPrecioConDescuento() + "€");
  }
}
