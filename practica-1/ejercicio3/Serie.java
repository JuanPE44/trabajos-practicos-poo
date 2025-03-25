
public class Serie {
  private Temporada[] temporadas;
  private String titulo;
  private String descripcion;
  private String creador;
  private String genero;

  public Serie(String titulo, String descripcion, String creador, String genero, int cantTemporadas) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.creador = creador;
    this.genero = genero;
    this.temporadas = new Temporada[cantTemporadas];
  }

  public int obtenerCapitulosVistos() {
    int capitulosVistos = 0;
    for (Temporada temporada : temporadas) {
      capitulosVistos = temporada.obtenerCapitulosVistos();
    }
    return capitulosVistos;
  }

  public double promedioTotalSerie() {
    double sumaPromedios = 0;
    int totalTemporadas = 0;

    for (Temporada temporada : temporadas) {
      double promedio = temporada.promedioCalificaciones();
      if (promedio > 0) {
        sumaPromedios += promedio;
        totalTemporadas++;
      }
    }
    if (totalTemporadas == 0)
      return 0;

    return sumaPromedios / totalTemporadas;
  }

  public boolean vioTodosLosEpisodios() {
    boolean vioTodos = true;
    for (Temporada temporada : temporadas) {
      for (Capitulo capitulo : temporada.getCapitulos()) {
        if (capitulo.getVisto())
          vioTodos = false;
      }
    }
    return vioTodos;
  }

  public Temporada[] getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(Temporada[] temporadas) {
    this.temporadas = temporadas;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getCreador() {
    return creador;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

}
