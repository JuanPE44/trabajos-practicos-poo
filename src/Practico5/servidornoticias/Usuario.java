package src.Practico5.servidornoticias;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String Nombre;
  private List<String> Preferencias = null;
  private List<Noticia> NoticiaRecomendada = null;

  public Usuario(String NOMBRE) {
    this.Nombre = NOMBRE;
  }

}
