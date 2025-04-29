import java.time.LocalDate;

public class Alumno extends Persona {
  private String legajo;
  private LocalDate fechaIngreso;

  public Alumno(String nombre, String apellido, int dni, String mail, String legajo, LocalDate fechaIngreso) {
    super(nombre, apellido, dni, mail);
    this.legajo = legajo;
    this.fechaIngreso = fechaIngreso;
  }

  public String getLegajo() {
    return legajo;
  }

  public LocalDate getFechaIngreso() {
    return fechaIngreso;
  }

}
