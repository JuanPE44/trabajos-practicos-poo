package src.Practico5.servidornoticias;

import java.util.List;

public class CondicionPalabra extends Condicion {
  private String palabra;

  public CondicionPalabra(String palabra) {
    this.palabra = palabra;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    List<Contenido> auxCuerpo = noticia.getCuerpo();
    for (Contenido contenido : auxCuerpo) {
      if (contienePalabra(contenido.getPalabras(contenido.getTexto()), palabra)) {
        return true;
      }
    }
    return false;
  }

  public boolean contienePalabra(String[] palabras, String palabra) {
    for (String p : palabras) {
      if (p.equals(palabra)) {
        return true;
      }
    }
    return false;
  }

}