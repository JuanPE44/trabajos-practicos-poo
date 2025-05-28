package src.Examenes.recuperatorio2023;

public class FiltroPalabrasClave extends Filtro {
  private int cantPalabras;

  public FiltroPalabrasClave(int cantPalabras) {
    this.cantPalabras = cantPalabras;
  }

  @Override
  public boolean cumple(Curso curso) {
    return curso.getPalabrasClave().size() < cantPalabras;
  }

}
