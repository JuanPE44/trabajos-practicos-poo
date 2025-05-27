

class CondicionPreparacion extends Condicion {
  private String modoPreparacion;
  
  public CondicionPreparacion(String modoPreparacion) {
    this.modoPreparacion = modoPreparacion;
  }

  @Override
  public boolean cumple(Producto producto) {
    return producto.getModoPreparacion().equals(modoPreparacion);
  }
}
