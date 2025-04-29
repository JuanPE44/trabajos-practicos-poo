package src.Practica1.ejercicio5;

import java.util.ArrayList;

public class Pais {
  private String nombre;
  private ArrayList<Provincia> provincias;

  public Pais(String nombre, ArrayList<Provincia> provincias) {
    this.nombre = nombre;
    this.provincias = provincias;
  }

  public ArrayList<Provincia> provinciasConMayorDeficit() {
    ArrayList<Provincia> provinciasDeficit = new ArrayList<>();
    for (Provincia provincia : provincias) {
      if (provincia.masDelaMitadDeficit())
        provinciasDeficit.add(provincia);
    }
    return provinciasDeficit;
  }

  public String getNombre() {
    return this.nombre;
  }
}
