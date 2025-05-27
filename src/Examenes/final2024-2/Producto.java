
public abstract class Producto {
  private String nombre;
  private String tipo;
  private String modoPreparacion;
  public Producto(String nombre, String tipo, String modoPreparacion) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.modoPreparacion = modoPreparacion;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getTipo() {
    return this.tipo;
  }
  
  public String getModoPreparacion() {
    return this.modoPreparacion;
  }

  public abstract double getPrecio();

  public abstract double getCalorias();

  public abstract double getTiempo();
}
