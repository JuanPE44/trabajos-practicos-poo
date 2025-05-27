
public class ProductoBasico extends Producto {
  private double precio;
  private double calorias;
  private double tiempo;

  public ProductoBasico(String nombre, String tipo, String modoPreparacion, double precio,double calorias, double tiempo) {
    super(nombre,tipo,modoPreparacion);
    this.precio = precio;
    this.calorias = calorias;
    this.tiempo = tiempo;
  }
 
  @Override 
  public double getPrecio() {
    return this.precio;
  }

  @Override
  public double getCalorias() {
    return this.calorias;
  }

  @Override 
  public double getTiempo() {
    return this.tiempo;
  }
}
