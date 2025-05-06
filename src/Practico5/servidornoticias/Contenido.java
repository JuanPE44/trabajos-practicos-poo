package src.Practico5.servidornoticias;

public abstract class Contenido {
  public abstract String getTexto();

  public int contarPalabras(String texto) {
    return getPalabras(texto).length;
  }

  public String[] getPalabras(String texto) {
    return texto.trim().split("\\s+");
  }
}
