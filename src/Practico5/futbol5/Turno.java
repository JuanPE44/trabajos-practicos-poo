package src.Practico5.futbol5;

import java.time.LocalDate;

public class Turno {
  private int id;
  private Cancha cancha;
  private Socio socio;
  private LocalDate fecha;

  public Turno(int id, Cancha cancha, Socio socio, LocalDate fecha) {
    this.id = id;
    this.cancha = cancha;
    this.socio = socio;
    this.fecha = fecha;
  }

  public int getPrecio() {
    return cancha.getPrecio();
  }

  public int getId() {
    return id;
  }

  public Cancha getCancha() {
    return cancha;
  }

  public Socio getSocio() {
    return socio;
  }

  public LocalDate getFecha() {
    return fecha;
  }

}
