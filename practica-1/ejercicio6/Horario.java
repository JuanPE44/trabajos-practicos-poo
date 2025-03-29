import java.time.LocalDate;

public class Horario {
  int hora;
  boolean disponible = true;
  LocalDate fecha;

  public Horario(int hora, LocalDate fecha) {
    this.hora = hora;
    this.fecha = fecha;
  }

  public Horario(int hora, LocalDate fecha, boolean disponible) {
    this(hora, fecha);
    this.disponible = disponible;
  }

  public int getHora() {
    return this.hora;
  }

  public LocalDate getFecha() {
    return this.fecha;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public boolean getDisponibilida() {
    return this.disponible;
  }
}
