import java.time.LocalDate;

public class Planta {
  private int id;
  private String nombreCientifico;
  private String nombreComun;
  private String paisOrigen;
  private LocalDate fechaCompra;

  public Planta(int id, String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
    this.id = id;
    this.nombreCientifico = nombreCientifico;
    this.nombreComun = nombreComun;
    this.paisOrigen = paisOrigen;
    this.fechaCompra = fechaCompra;
  }

  public int getId() {
    return id;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public LocalDate getFechaCompra() {
    return fechaCompra;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getNombreComun() {
    return nombreComun;
  }

}