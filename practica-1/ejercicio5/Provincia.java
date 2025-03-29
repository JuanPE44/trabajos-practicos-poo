import java.util.ArrayList;

public class Provincia {
  private String nombre;
  private ArrayList<Ciudad> ciudades;

  public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
    this.nombre = nombre;
    this.ciudades = ciudades;
  }

  public ArrayList<Ciudad> obtenerCiudadesDeficit() {
    ArrayList<Ciudad> ciudadadesDeficit = new ArrayList<Ciudad>();
    for (Ciudad ciudad : ciudades) {
      if (ciudad.estaEnDeficit())
        ciudadadesDeficit.add(ciudad);
    }
    return ciudadadesDeficit;
  }

  public boolean masDelaMitadDeficit() {
    return obtenerCiudadesDeficit().size() > Math.floor(ciudades.size() / 2);
  }

  public String getNombre() {
    return this.nombre;
  }
}
