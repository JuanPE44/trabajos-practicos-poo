import java.time.LocalDate;

public class Empleado extends Persona {
  private LocalDate fechaIngreso;
  private String departementoAsignado;

  public Empleado(String nombre, String apellido, String email, int dni, LocalDate fechaIngreso,
      String departamentoAsignado) {
    super(nombre, apellido, email, dni);
    this.fechaIngreso = fechaIngreso;
    this.departementoAsignado = departamentoAsignado;
  }

  public LocalDate getFechaIngreso() {
    return fechaIngreso;
  }

  public String getDepartementoAsignado() {
    return departementoAsignado;
  }

}