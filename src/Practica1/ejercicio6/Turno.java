package src.Practica1.ejercicio6;

import java.time.LocalDate;

public class Turno {
  private Cancha cancha;
  private double precio;
  private int hora;
  private boolean disponible = true;
  private LocalDate fecha;

  public Turno(Cancha cancha, int hora, LocalDate fecha) {
    this.cancha = cancha;
    this.hora = hora;
    this.fecha = fecha;
  }

  public Turno(Cancha cancha, int hora, LocalDate fecha, boolean disponible) {
    this(cancha, hora, fecha);
    this.disponible = disponible;
  }

  public Cancha getCancha() {
    return this.cancha;
  }

  public double getPrecio() {
    return this.precio;
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

  public boolean getDisponibilidad() {
    return this.disponible;
  }
}
