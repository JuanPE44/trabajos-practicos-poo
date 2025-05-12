package src.Examenes.parcial20230609;

public class PoliticaOR extends Politica {
  private Politica politica1;
  private Politica politica2;

  public PoliticaOR(Politica politica1, Politica politica2) {
    this.politica1 = politica1;
    this.politica2 = politica2;
  }

  @Override
  public boolean puedeAgregar(PresupuestoComplejo presupuesto) {
    return politica1.puedeAgregar(presupuesto) || politica2.puedeAgregar(presupuesto);
  }

}
