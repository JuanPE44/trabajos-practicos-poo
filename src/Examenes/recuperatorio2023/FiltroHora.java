package src.Examenes.recuperatorio2023;

public class FiltroHora extends Filtro {
  private int horaMax;

  public FiltroHora(int horaMax) {
    this.horaMax = horaMax;
  }

  @Override
  public boolean cumple(Curso curso) {
    return curso.getCantHoras() > horaMax;
  }

}
