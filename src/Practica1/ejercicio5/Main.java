package src.Practica1.ejercicio5;

/*
Un país tiene que controlar el gasto público de las ciudades con más de 100.000
habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
de déficit. Tener en cuenta la delegación de responsabilidades a la hora de plantear la
solución. Implementar en java 

*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    double[] impuestos1 = { 100, 300, 35, 100.5, 28 };
    double[] impuestos2 = { 100, 200, 305, 10.5, 28 };
    double[] impuestos3 = { 500, 200, 35, 1, 28 };
    double[] impuestos4 = { 100, 200, 350, 500, 28 };

    Ciudad ciudad1 = new Ciudad("Tandil", 1000000, impuestos1, 1000);
    Ciudad ciudad2 = new Ciudad("Azul", 10000, impuestos2, 1000);
    Ciudad ciudad3 = new Ciudad("Ushuaia", 1000000, impuestos3, 1000);
    Ciudad ciudad4 = new Ciudad("Bariloche", 100000, impuestos4, 1000);

    ArrayList<Ciudad> ciudadesBuenosAires = new ArrayList<Ciudad>();
    ciudadesBuenosAires.add(ciudad1);
    ciudadesBuenosAires.add(ciudad2);

    ArrayList<Ciudad> ciudadesTierraFuego = new ArrayList<Ciudad>();
    ciudadesTierraFuego.add(ciudad3);
    ciudadesTierraFuego.add(ciudad4);

    Provincia provincia1 = new Provincia("Buenos Aires", ciudadesBuenosAires);
    Provincia provincia2 = new Provincia("Tierra Del Fuego", ciudadesTierraFuego);

    ArrayList<Provincia> provinciasArgentina = new ArrayList<Provincia>();
    provinciasArgentina.add(provincia1);
    provinciasArgentina.add(provincia2);

    Pais Argentina = new Pais("Argentina", provinciasArgentina);

    System.out.println("Provincias con deficit");
    for (Provincia provincia : Argentina.provinciasConMayorDeficit()) {
      System.out.println(provincia.getNombre());
    }
  }
}
