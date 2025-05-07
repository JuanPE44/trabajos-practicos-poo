package src.Practico5.futbol5;

import java.util.ArrayList;
import java.util.List;

public class Socio {
  private String nombre;
  private String apellido;
  private int edad;
  private boolean pagoCuota;
  private List<Turno> historialTurnos;

  public Socio(String nombre, String apellido, int edad, boolean pagoCuota) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.pagoCuota = pagoCuota;
    this.historialTurnos = new ArrayList<Turno>();
  }

  public boolean isPagoCuota() {
    return pagoCuota;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getEdad() {
    return edad;
  }

  public List<Turno> getHistorialTurnos() {
    return historialTurnos;
  }

}
