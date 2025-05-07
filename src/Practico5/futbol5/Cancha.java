package src.Practico5.futbol5;

public class Cancha {
  private static int contadorId;
  private int id;
  private int precio;
  private String nombre;

  public Cancha(String nombre, int precio) {
    this.id = ++contadorId;
    this.precio = precio;
    this.nombre = nombre;
  }

  public static int getContadorId() {
    return contadorId;
  }

  public int getId() {
    return id;
  }

  public int getPrecio() {
    return precio;
  }

  public String getNombre() {
    return nombre;
  }

}
