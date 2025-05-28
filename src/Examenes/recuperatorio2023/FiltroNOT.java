package src.Examenes.recuperatorio2023;

public class FiltroNOT extends Filtro {
  private Filtro c1;

  public FiltroNOT(Filtro c1) {
    this.c1 = c1;
  }

  public boolean cumple(Curso curso) {
    return !c1.cumple(curso);
  }

}