package src.Practico5.servidornoticias;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
  private String titulo;
  private String Clacificacon;
  private List<Contenido> cuerpo;

  public Noticia(String titulo, String Clacificacon, List<Contenido> cuerpo) {
    this.titulo = titulo;
    this.Clacificacon = Clacificacon;
    this.cuerpo = new ArrayList<Contenido>();
  }

  public boolean isCuerpoContienePalabra(String palabra) {
    for (Contenido contenido : cuerpo) {
      if (contenido.contienePalabra(contenido.getTexto(), palabra)) {
        return true;
      }
    }
    return false;
  }

  public boolean isCuerpoMaxPalabra(int maxPalabras) {
    int contador = 0;
    for (Contenido contenido : cuerpo) {
      contador += contenido.contarPalabras(contenido.getTexto());
    }
    return (contador <= maxPalabras);
  }

  public String getTitulo() {
    return titulo;
  }

  public String getClacificacon() {
    return Clacificacon;
  }

  public List<Contenido> getCuerpo() {
    return cuerpo;
  }

}
