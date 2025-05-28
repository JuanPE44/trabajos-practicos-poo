package src.Examenes.recuperatorio2023;

public class FiltroAND extends Filtro {
  private Filtro c1;
  private Filtro c2;

  public FiltroAND(Filtro c1, Filtro c2) {
    this.c1 = c1;
    this.c2 = c2;
  }

  public boolean cumple(Curso curso) {
    return c1.cumple(curso) && c2.cumple(curso);
  }

}
