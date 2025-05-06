package src.Practico5.servidornoticias;

import java.util.List;

public class CondicionPalabras extends Condicion {
  private List<String> palabras;

  public CondicionPalabras(List<String> palabras) {
    this.palabras = palabras;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    for (String palabra : palabras) {
      CondicionPalabra condicion = new CondicionPalabra(palabra);
      if (!condicion.cumple(noticia))
        return false;
    }
    return true;
  }
}