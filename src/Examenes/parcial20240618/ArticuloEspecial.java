package src.Examenes.parcial20240618;

public class ArticuloEspecial extends Articulo {
  private int unidades;
  private Condicion control;
  private double otroPrecio;

  public ArticuloEspecial(String nombre, String descripcion, double peso, double precio, int unidades,
      Condicion condicion, double otroPrecio) {
    super(nombre, descripcion, peso, precio);
    this.unidades = unidades;
    this.control = condicion;
    this.otroPrecio = otroPrecio;
  }

  @Override
  public double getPrecio() {
    if (control.cumple(this)) {
      return super.getPrecio();
    }
    return otroPrecio;
  }

}
