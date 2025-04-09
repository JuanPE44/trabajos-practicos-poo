public class Sensor {
  private String zona;
  private boolean estado = false;

  public Sensor(String zona) {
    this.zona = zona;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  public String getZona() {
    return zona;
  }

  public boolean isEstado() {
    return estado;
  }
}
