package src.Practico5.servidornoticias;

public class CondicionClasificacion extends Condicion {
  private String clasificacion;

  public CondicionClasificacion(String clasificacion) {
    this.clasificacion = clasificacion;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    return noticia.getClacificacon().equals(clasificacion);
  }
}
