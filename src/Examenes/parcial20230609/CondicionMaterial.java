package src.Examenes.parcial20230609;

public class CondicionMaterial extends Condicion {
  public String material;

  public CondicionMaterial(String material) {
    this.material = material;
  }

  public boolean cumple(Presupuesto presupuesto) {
    return presupuesto.getMateriales().contains(material);
  }
}
