package src.Practico5.servidornoticias;

import java.util.ArrayList;
import java.util.List;

public class ServidorNoticias {
  private List<Noticia> noticias;

  public List<Noticia> getNoticiasCondicion(Condicion condicion) {
    List<Noticia> listaNoticias = new ArrayList<Noticia>();
    for (Noticia noticia : noticias) {
      if (condicion.cumple(noticia)) {
        listaNoticias.add(noticia);
      }
    }
    return listaNoticias;
  }

  public List<Noticia> getNoticiasTitulo(String titulo) {
    CondicionTitulo compara = new CondicionTitulo(titulo);
    return getNoticiasCondicion(compara);
  }

  public List<Noticia> getNoticiasClacificacion(String clasificacion) {
    CondicionClasificacion compara = new CondicionClasificacion(clasificacion);
    return getNoticiasCondicion(compara);
  }

  public List<Noticia> getNoticiasPalabra(String palabra) {
    CondicionPalabra compara = new CondicionPalabra(palabra);
    return getNoticiasCondicion(compara);
  }

  public List<Noticia> getNoticiasMaxPalabra(int maximo) {
    CondicionMaxPalabra compara = new CondicionMaxPalabra(maximo);
    return getNoticiasCondicion(compara);
  }

  public List<Noticia> getNoticiasPalabras(List<String> palabras) {
    CondicionPalabras compara = new CondicionPalabras(palabras);
    return getNoticiasCondicion(compara);
  }

  public void agregarNoticia(Noticia noticia) {
    noticias.add(noticia);
  }

}
