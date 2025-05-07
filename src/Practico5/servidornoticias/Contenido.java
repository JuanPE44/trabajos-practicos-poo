package src.Practico5.servidornoticias;

public abstract class Contenido {
  public abstract String getTexto();

  public int contarPalabras(String texto) {
    return getPalabras(texto).length;
  }

  public String[] getPalabras(String texto) {
    return texto.trim().split("\\s+");
  }

  public boolean contienePalabra(String texto, String palabra) {
    String[] palabras = getPalabras(texto);
    for (String p : palabras) {
      if (p.equals(palabra)) {
        return true;
      }
    }
    return false;
  }
}
