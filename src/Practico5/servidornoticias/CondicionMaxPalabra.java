package src.Practico5.servidornoticias;

public class CondicionMaxPalabra extends Condicion {
  private int maxPalabras;

  public CondicionMaxPalabra(int maxPalabras) {
    this.maxPalabras = maxPalabras;
  }

  @Override
  public boolean cumple(Noticia noticia) {
    int contador = 0;
    for (Contenido contenido : noticia.getCuerpo()) {
      contador += contenido.contarPalabras(contenido.getTexto());
    }
    return (contador <= maxPalabras);
  }

  public int getMaxPalabras() {
    return maxPalabras;
  }

  public void setMaxPalabras(int maxPalabras) {
    this.maxPalabras = maxPalabras;
  }
}
