import java.util.ArrayList;

public abstract class Alarma {
  protected ArrayList<Sensor> sensores = new ArrayList<>();

  public Alarma() {
    sensores.add(new Sensor("vidrio de la cocina"));
    sensores.add(new Sensor("puerta de la cocina"));
    sensores.add(new Sensor("ventana del cuarto"));
  }

  abstract void comprobar();

}
