package src.Practico5.servidornoticias;

import java.util.List;

public class CondicionPalabra extends Condicion {
  private String palabra;

  public CondicionPalabra(String palabra) {
    this.palabra = palabra;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    return noticia.isCuerpoContienePalabra(palabra);
  }
}