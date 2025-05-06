package src.Practica4.puertocereales;

import java.time.LocalDate;

public class Camion {
  private static int contadorId = 0;
  private int id;
  private String nombre;
  private LocalDate fechaCarga;
  private double capacidadCargado;

  public Camion(String nombre, LocalDate fechaCarga, double capacidadCargado) {
    this.id = ++contadorId;
    this.nombre = nombre;
    this.fechaCarga = fechaCarga;
    this.capacidadCargado = capacidadCargado;
  }

  public static int getContadorId() {
    return contadorId;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public LocalDate getFechaCarga() {
    return fechaCarga;
  }

  public double getcapacidadCargado() {
    return capacidadCargado;
  }

}
