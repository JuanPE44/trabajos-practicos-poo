package src.Practica4.agroquimicos;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
  private List<Agroquimico> agroquimicos;

  public Sistema() {
    this.agroquimicos = new ArrayList<>();
  }

  public List<Agroquimico> puedenCurar(Enfermedad enfermedad) {
    List<Agroquimico> curadores = new ArrayList<>();
    for (Agroquimico agroquimico : agroquimicos) {
      if (agroquimico.puedeTratarEnfermedad(enfermedad)) {
        curadores.add(agroquimico);
      }
    }
    return curadores;
  }

  public List<Agroquimico> puedenTratar(Cultivo cultivo, Enfermedad enfermedad) {
    List<Agroquimico> curadores = new ArrayList<>();
    for (Agroquimico agroquimico : agroquimicos) {
      if (agroquimico.puedeTratarEnfermedad(enfermedad) && !agroquimico.isProhibido(cultivo)) {
        curadores.add(agroquimico);
      }
    }
    return curadores;
  }

  public List<Agroquimico> getAgroquimicos() {
    return agroquimicos;
  }

}
