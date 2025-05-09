package src.Examenes.parcial20240618;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Crear artículos
    Articulo a1 = new Articulo("Cuadro de Van Gogh");
    Articulo a2 = new Articulo("Escultura griega");
    Articulo a3 = new Articulo("Máscara africana");
    Articulo a4 = new Articulo("pepe");

    // Crear subcolección y agregar artículos
    Coleccion subcoleccion = new Coleccion();
    subcoleccion.agregar(a1);
    subcoleccion.agregar(a2);

    // Colección principal
    Coleccion coleccionPrincipal = new Coleccion();
    coleccionPrincipal.agregar(subcoleccion); // subcolección
    coleccionPrincipal.agregar(a3); // artículo suelto
    coleccionPrincipal.agregar(a4); // artículo suelto

    // Obtener todos los artículos
    List<Articulo> resultado = coleccionPrincipal.getArticulos(new ArrayList<>(), "pepe");

    // Mostrar los artículos
    for (Articulo art : resultado) {
      System.out.println(art.getDescripcion());
    }
  }
}
