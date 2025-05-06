package src.Practico5.servidornoticias;

public class Imagen extends Contenido {
  private String url;
  private String descripcion;

  public Imagen(String url, String descripcion) {
    this.url = url;
    this.descripcion = descripcion;
  }

  @Override
  public String getTexto() {
    return this.descripcion;
  }
}