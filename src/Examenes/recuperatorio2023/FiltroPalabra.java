package src.Examenes.recuperatorio2023;

public class FiltroPalabra extends Filtro {
  private String palabra;

  public FiltroPalabra(String palabra) {
    this.palabra = palabra;
  }

  @Override
  public boolean cumple(Curso curso) {
    return curso.getPalabrasClave().contains(palabra);
  }
}
