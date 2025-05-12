package src.Examenes.parcial20230609;

import java.util.List;

public class PresupuestoComplejoAcotado extends PresupuestoComplejo {
  private Politica politica;

  public PresupuestoComplejoAcotado(String nombre, List<Presupuesto> presupuestos, double descuento) {
    super(nombre, presupuestos, descuento);
  }

  @Override
  public void addPresupuesto(Presupuesto presupuesto) {
    if (politica.puedeAgregar(this)) {
      super.addPresupuesto(presupuesto);
    }
  }
}
