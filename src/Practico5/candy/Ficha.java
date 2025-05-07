package src.Practico5.candy;

public class Ficha {
  private String nombre;
  private int fortaleza;
  private int espacioCasillas;
  private int poderDestruccion;

  public Ficha(String nombre, int fortaleza, int espacioCasillas, int poderDestruccion) {
    this.nombre = nombre;
    this.fortaleza = fortaleza;
    this.espacioCasillas = espacioCasillas;
    this.poderDestruccion = poderDestruccion;
  }

  public String getNombre() {
    return nombre;
  }

  public int getFortaleza() {
    return fortaleza;
  }

  public int getEspacioCasillas() {
    return espacioCasillas;
  }

  public int getPoderDestruccion() {
    return poderDestruccion;
  }

}
