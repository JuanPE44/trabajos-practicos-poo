package src.Practica3.cienciascomputacion;

import java.util.ArrayList;

public class Trabajo {
  protected Evaluador evaluador;
  protected ArrayList<String> palabrasClave;

  public Trabajo(ArrayList<String> palabrasClave) {
    this.evaluador = null;
    this.palabrasClave = palabrasClave;
  }

  public void asignarEvaluador(Evaluador evaluador) {
    this.evaluador = evaluador;
  }

  public boolean esApto(ArrayList<String> conocimientos) {
    for (String conocimiento : conocimientos) {
      if (!palabrasClave.contains(conocimiento))
        return false;
    }
    return true;
  }

  public ArrayList<String> getPalabrasClave() {
    return palabrasClave;
  }
}
