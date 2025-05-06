
package src.Practico5.servidornoticias;

public class CondicionTitulo extends Condicion {
  private String titulo;

  public CondicionTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    return noticia.getTitulo().equals(titulo);
  }
}