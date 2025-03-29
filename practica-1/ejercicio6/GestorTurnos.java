import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorTurnos {
  public static final String RESET = "\033[0m";
  public static final String VERDE = "\033[0;32m";
  public static final String ROJO = "\033[0;31m";
  private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
  private ArrayList<Turno> turnos = new ArrayList<Turno>();
  private ArrayList<Usuario> socios = new ArrayList<Usuario>();

  public GestorTurnos() {
    canchas.add(new Cancha("Cancha Paddle (1)", 100));
    canchas.add(new Cancha("Cancha Paddle (2)", 100));
    canchas.add(new Cancha("Cancha Paddle (3)", 100));
    canchas.add(new Cancha("Cancha Paddle (4)", 100));
    canchas.add(new Cancha("Cancha Futbol 5 (1)", 400));
    canchas.add(new Cancha("Cancha Futbol 5 (2)", 400));
  }

  public void mostrarMenu() {
    Scanner input = new Scanner(System.in);
    int opcion = 0;
    do {
      System.out.println("Gestor Turnos");
      System.out.println("1. Sacar turno");
      System.out.println("2. Ser socio  ");
      System.out.println("3. Salir      ");
      System.out.print("Selecione una opcion: ");
      opcion = input.nextInt();
      input.nextLine();

      switch (opcion) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        default:
          System.out.println("Opción no válida, seleccione una opción del 1 al 3.");
          break;
      }
    } while (opcion != 3);
    input.close();
  }

  public void mostrarHorariosDisponibles(LocalDate fecha) {
    for (Cancha cancha : canchas) {
      System.out.println(cancha.getNombre());
      for (Horario horario : cancha.obtenerHorariosDisponibles(fecha)) {
        if (horario.getDisponibilida()) {
          System.out.print(VERDE + " " + horario.getHora() + RESET);
        } else {
          System.out.print(ROJO + " " + horario.getHora() + RESET);

        }
      }
      System.out.println();
    }
  }
}
