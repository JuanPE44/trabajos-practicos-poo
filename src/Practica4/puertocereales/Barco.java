package src.Practica4.puertocereales;

import src.Practica4.puertocereales.Barco;

public class Barco {
  private static int contadorId = 0;
  private int id;
  private String nombre;
  private double cargaDisponible;
  private double capacidad;

  public Barco(String nombre, int capacidad) {
    this.id = ++contadorId;
    this.nombre = nombre;
    this.capacidad = capacidad;
  }

  public boolean cargarBarco(Camion camion) {
    if (camion.getcapacidadCargado() <= cargaDisponible) {
      cargaDisponible -= camion.getcapacidadCargado();
      return true;
    }
    return false;
  }

  public void liberarCamion(Camion camion) {
    cargaDisponible += camion.getcapacidadCargado();
  }

  public boolean estaLleno() {
    return cargaDisponible <= 0;
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

  public double getCapacidad() {
    return capacidad;
  }

}
