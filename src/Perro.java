import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Perro {
  private String nombre;
  private LocalDate fechaNacimiento;
  private static Integer cantidadPaseosDiarios = 2;
  private UUID id;

  public Perro(String nombre, LocalDate fechaNacimiento) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.id = UUID.randomUUID();
  }

  public static String ladrar() {
    return "Guau guau!";
  }

  public int calcularEdad() {
    return Period.between(fechaNacimiento, LocalDate.now()).getYears();
  }

  @Override
  public String toString() {
    return "El perro se llama " + this.nombre +
        " tiene " + this.calcularEdad() + " años" +
        " dice " + ladrar() +
        " su id es:" + this.id +
        " y necesita como mínimo " +
        cantidadPaseosDiarios + " al día.";
  }

}
