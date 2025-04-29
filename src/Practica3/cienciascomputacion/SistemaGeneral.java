package src.Practica3.cienciascomputacion;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaGeneral {
  private final ArrayList<String> temasGenerales = new ArrayList<>(Arrays.asList("algoritmos", "estructuras de datos",
      "lenguajes de programación", "sistemas operativos"));
  private final ArrayList<String> temasExpertos = new ArrayList<>(Arrays.asList("agentes inteligentes", "visualización",
      "redes de comunicación", "inteligencia artificial"));
  private ArrayList<Evaluador> evaluadores;
  private ArrayList<Trabajo> trabajos;

  public SistemaGeneral(ArrayList<Evaluador> evaluadores, ArrayList<Trabajo> trabajos) {
    this.evaluadores = evaluadores;
    this.trabajos = trabajos;
  }

  public void asignarEvaluador(Evaluador evaluador, Trabajo trabajo) {
    if (trabajo.esApto(evaluador.getConocimientos()))
      trabajo.asignarEvaluador(evaluador);
  }

  public ArrayList<Evaluador> obtenerEvaluadores(Trabajo trabajo) {
    ArrayList<Evaluador> evaluadoresAsignados = new ArrayList<>();
    for (Evaluador evaluador : evaluadores) {
      if (trabajo.esApto(evaluador.getConocimientos()))
        evaluadoresAsignados.add(evaluador);
    }
    return evaluadoresAsignados;
  }

  public ArrayList<Trabajo> obtenerTrabajos(Evaluador evaluador) {
    ArrayList<Trabajo> trabajosApto = new ArrayList<>();
    for (Trabajo trabajo : trabajos) {
      if (trabajo.esApto(evaluador.getConocimientos()))
        trabajosApto.add(trabajo);
    }
    return trabajosApto;
  }

  public int cantidadTrabajos(Evaluador evaluador) {
    int cantidad = 0;
    for (Trabajo trabajo : trabajos) {
      if (trabajo.evaluador.getNombre().equals(evaluador.getNombre()))
        cantidad++;
    }
    return cantidad;
  }

  public String clasificarEvaluador(Evaluador evaluador) {
    int generales = 0;
    int expertos = 0;

    for (String conocimiento : evaluador.getConocimientos()) {
      if (temasGenerales.contains(conocimiento)) {
        generales++;
      } else if (temasExpertos.contains(conocimiento)) {
        expertos++;
      }
    }

    if (generales > expertos) {
      return "General";
    } else if (expertos > generales) {
      return "Experto";
    } else {
      return "Indefinido";
    }
  }
}
