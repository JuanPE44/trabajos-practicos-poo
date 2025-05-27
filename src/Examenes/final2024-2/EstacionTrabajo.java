
public class EstacionTrabajo {
  private Producto productoAsignado = null;
  private Condicion especialidad;

  public boolean intentarAsignar(Producto producto) {
    if (isVacio() && especialidad.cumple(producto)) {
      setProductoAsignado(producto);
      return true;
    }
    return false;
  }

  public boolean isVacio() {
    return productoAsignado == null;
  }

  public void productoListo() {
    this.productoAsignado = null;
  }

  public void setProductoAsignado(Producto productoAsignado) {
    this.productoAsignado = productoAsignado;
  }

  public void setEspecialidad(Condicion especialidad) {
    this.especialidad = especialidad;
  }
}
