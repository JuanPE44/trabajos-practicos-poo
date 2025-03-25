
public class Temporada {
  private Capitulo[] capitulos;
  private int CantEpisodios = 5;

  public Temporada() {
    this.capitulos = new Capitulo[CantEpisodios];
  }

  public int obtenerCapitulosVistos() {
    int capitulosVistos = 0;
    for (Capitulo capitulo : capitulos) {
      if (capitulo.getVisto())
        capitulosVistos++;
    }
    return capitulosVistos;
  }

  public double promedioCalificaciones() {
    int suma = 0;
    int totalCal = 0;
    for (Capitulo capitulo : capitulos) {
      double calificacion = capitulo.getCalificacion();
      if (calificacion > 0) {
        suma += calificacion;
        totalCal++;
      }

    }
    return suma / totalCal;
  }

  public boolean vioTodosLosCapitulos() {
    for (Capitulo capitulo : capitulos) {
      if (!capitulo.getVisto()) {
        return false;
      }
    }
    return true;
  }

  public Capitulo[] getCapitulos() {
    return capitulos;
  }

  public int getCantEpisodios() {
    return CantEpisodios;
  }

}