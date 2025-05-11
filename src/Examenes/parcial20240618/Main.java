package src.Examenes.parcial20240618;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Artículos
    Articulo a1 = new Articulo("Cuadro A", "Moderno", 10.5, 2000);
    Articulo a2 = new Articulo("Cuadro B", "Clásico", 8.0, 1500);
    // ArticuloEspecial a3 = new ArticuloEspecial("Escultura C", "Moderno", 25,
    // 3000, 2, new CondicionMinPrecio(1000),
    // 500);

    // Condiciones
    Condicion condicionModerno = new CondicionDescripcion("Moderno");
    Condicion condicionPrecioMin = new CondicionMinPrecio(1800);

    // Colecciones
    Coleccion col1 = new Coleccion("Colección 1", 0.5);
    col1.agregar(a1);
    col1.agregar(a2);

    Coleccion col2 = new Coleccion("Colección 2", 0.3);
    // col2.agregar(a3);
    col2.agregar(col1); // colección anidada

    ColeccionPrivada privada = new ColeccionPrivada("Privada", 0.4);
    privada.agregar(col2);

    // Probar métodos
    System.out.println("Precio de col1: " + col1.getPrecio());
    System.out.println("Cantidad de artículos en col2: " + col2.getCantidadArticulos());
    System.out.println("Artículo de mayor valor en col2: " + col2.getArticuloMayorValor().getDescripcion());

    // Copia por condición
    ColeccionMuseo copia = col2.getCopia(condicionModerno);
    if (copia != null) {
      System.out.println("Copia generada de col2 (filtrada por 'Moderno'): " + copia.getNombre());
      System.out.println("Cantidad artículos en la copia: " + copia.getCantidadArticulos());
    } else {
      System.out.println("No se generó copia filtrando por 'Moderno'");
    }

    // Artículo filtrado por descripción exacta (usando getArticulos)
    Articulo encontrado = col2.getArticulos("Moderno");
    if (encontrado != null) {
      System.out.println("Se encontró artículo con descripción 'Moderno': " + encontrado.getNombre());
    } else {
      System.out.println("No se encontró artículo con descripción 'Moderno'");
    }
  }
}