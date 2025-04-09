import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoRefrigerado {
  private int porcentajeNitrogeno;
  private int porcentajeOxigeno;
  private int porcentajeCarbono;
  private int porcentajeVaporAgua;

  public ProductoCongeladoAire(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
      int codigoOrganismo, int temperaturaRecomendada, int porcentajeNitrogeno, int porcentajeOxigeno,
      int porcentajeCarbono, int porcentajeVaporAgua) {
    super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoOrganismo, temperaturaRecomendada);
    this.porcentajeNitrogeno = porcentajeNitrogeno;
    this.porcentajeOxigeno = porcentajeOxigeno;
    this.porcentajeCarbono = porcentajeCarbono;
    this.porcentajeVaporAgua = porcentajeVaporAgua;
  }

  public int getPorcentajeNitrogeno() {
    return porcentajeNitrogeno;
  }

  public int getPorcentajeOxigeno() {
    return porcentajeOxigeno;
  }

  public int getPorcentajeCarbono() {
    return porcentajeCarbono;
  }

  public int getPorcentajeVaporAgua() {
    return porcentajeVaporAgua;
  }

}