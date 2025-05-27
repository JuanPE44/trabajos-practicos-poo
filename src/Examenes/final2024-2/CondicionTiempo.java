

class CondicionTiempo extends Condicion {
  private double tiempo;
  
  public CondicionTiempo(double tiempo) {
    this.tiempo = tiempo;
  }

  @Override
  public boolean cumple(Producto producto) {
    return producto.getTiempo() < tiempo;
  }
}
