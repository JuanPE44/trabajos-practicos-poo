/* 
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de
cada planta se guarda su nombre científico, su nombre común, país de origen, fecha
de compra y un identificador único. Cada vez que se crea una planta nueva para la
colección, se debe asignar un número nuevo de forma automática e incremental.
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class Jardin {
  private ArrayList<Planta> plantas;
  private int ultimoId;

  public Jardin() {
    this.plantas = new ArrayList<Planta>();
  }

  public void agregarPlanta(String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
    Planta planta = new Planta(ultimoId, nombreCientifico, nombreComun, paisOrigen, fechaCompra);
    plantas.add(planta);
    ultimoId++;
  }
}