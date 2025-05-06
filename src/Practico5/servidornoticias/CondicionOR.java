package src.Practico5.servidornoticias;

public class CondicionOR extends Condicion {
  private Condicion cond1;
  private Condicion cond2;

  public CondicionOR(Condicion cond1, Condicion cond2) {
    this.cond1 = cond1;
    this.cond2 = cond2;
  }

  @Override
  public boolean cumple(Noticia a) {
    return cond1.cumple(a) || cond2.cumple(a);
  }
}
