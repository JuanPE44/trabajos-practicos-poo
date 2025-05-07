package src.Practico5.candy;

public class FichaEspecial extends Ficha {
  public FichaEspecial(String nombre, int fortaleza, int espacioCasillas, int poderDestruccion) {
    super(nombre, fortaleza, espacioCasillas, poderDestruccion);
  }

  @Override
  public int getPoderDestruccion() {
    return super.getFortaleza() / super.getEspacioCasillas();
  }
}
