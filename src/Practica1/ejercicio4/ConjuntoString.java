package src.Practica1.ejercicio4;

/*
Conjunto de Strings, es una estructura que permite almacenar objetos del tipo
String, no permite repetidos. Permite preguntar por si el conjunto tiene un String dado,
permite borrar un elemento, cuando se le pide una elemento retorna cualquiera del
conjunto (un elemento aleatorio). Permite obtener la cantidad de elementos. 
*/

import java.util.ArrayList;
import java.util.Random;

public class ConjuntoString {
  private ArrayList<String> lista = new ArrayList<String>();

  public boolean estaEnLista(String cadena) {
    for (String elemento : lista) {
      if (elemento.equals(cadena))
        return true;
    }
    return false;
  }

  public void agregarString(String cadena) {
    if (!estaEnLista(cadena)) {
      lista.add(cadena);
    } else {
      System.out.print("La cadena esta repetida");
    }
  }

  public void borrarCadena(String cadena) {
    if (lista.remove(cadena)) {
      System.out.print("Se elimino correctamente");
    } else {
      System.out.print("no se elimino correctamente");
    }
  }

  public String obtenerElemento() {
    return lista.get(new Random().nextInt(lista.size()));
  }

  public int obtenerCantidadElementos() {
    return lista.size();
  }
}
