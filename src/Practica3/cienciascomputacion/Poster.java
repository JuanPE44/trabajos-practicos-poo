package src.Practica3.cienciascomputacion;

import java.util.ArrayList;

public class Poster extends Trabajo {

  public Poster(ArrayList<String> palabrasClave) {
    super(palabrasClave);
  }

  @Override
  public boolean esApto(ArrayList<String> conocimientos) {
    for (String conocimiento : conocimientos) {
      if (!palabrasClave.contains(conocimiento))
        return false;
    }
    return true;
  }

}