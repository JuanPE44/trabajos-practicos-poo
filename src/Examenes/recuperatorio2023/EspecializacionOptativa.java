package src.Examenes.recuperatorio2023;

public class EspecializacionOptativa extends Especializacion {
  private double porcentaje;

  public EspecializacionOptativa(String nombre, double porcentaje) {
    super(nombre);
    this.porcentaje = porcentaje;
  }

  @Override
  public boolean aprobo(Alumno alumno) {
    double cantMin = super.getCantCursos() * porcentaje;
    int cont = 0;
    for (Curso curso : super.getCursos()) {
      if (curso.aprobo(alumno))
        cont++;
    }
    return cont >= cantMin;
  }
}
