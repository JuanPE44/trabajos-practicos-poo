package src.Practico5.servidornoticias;

public class Video extends Contenido {
  private String url;
  private String descripcion;
  private int reproducciones;
  private int duracion;

  public Video(String url, String descripcion, int reproducciones, int duracion) {
    this.url = url;
    this.descripcion = descripcion;
    this.reproducciones = reproducciones;
    this.duracion = duracion;
  }

  @Override
  public String getTexto() {
    return this.descripcion;
  }

  // metodos video play, pause, etc
}
