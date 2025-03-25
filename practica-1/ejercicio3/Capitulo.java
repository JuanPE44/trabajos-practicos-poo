
public class Capitulo {
  private String titulo;
  private String descripcion;
  private boolean visto;
  private int calificacion;

  private static final boolean VISTO_DEFAULT = false;
  private static final int CALIFICACION_DEFECTO = -1;

  public Capitulo(String titulo, String descripcion, int calificacion) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.visto = VISTO_DEFAULT;
    this.calificacion = CALIFICACION_DEFECTO;
  }

  public void setCalificacion(int calificacion) {
    if (calificacion < 1 || calificacion > 5) {
      System.out.println("La calificacion de estar en 1 y 5");
      return;
    }
    this.calificacion = calificacion;
  }

  public boolean getVisto() {
    return this.visto;
  }

  public int getCalificacion() {
    return this.calificacion;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setVisto(boolean visto) {
    this.visto = visto;
  }

  public static boolean isVistoDefault() {
    return VISTO_DEFAULT;
  }

  public static int getCalificacionDefecto() {
    return CALIFICACION_DEFECTO;
  }

}
