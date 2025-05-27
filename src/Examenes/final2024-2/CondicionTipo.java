

class CondicionTipo extends Condicion {
  private String tipo;
  
  public CondicionTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public boolean cumple(Producto producto) {
    return producto.getTipo().equals(tipo);
  }
}
