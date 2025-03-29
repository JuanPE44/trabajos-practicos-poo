import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTurnos {
  private static final String GRIS = "\u001B[90m";
  private static final String AZUL = "\u001B[34m";
  private static final String RESET = "\033[0m";
  private static final String VERDE = "\033[0;32m";
  private static final String ROJO = "\033[0;31m";
  private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
  private ArrayList<Turno> turnos = new ArrayList<Turno>();
  private ArrayList<Usuario> socios = new ArrayList<Usuario>();
  private LocalDate fechaActual = LocalDate.now();

  public GestorTurnos() {
    canchas.add(new Cancha("Cancha Paddle (1)", 100, 1));
    canchas.add(new Cancha("Cancha Paddle (2)", 100, 2));
    canchas.add(new Cancha("Cancha Paddle (3)", 100, 2));
    canchas.add(new Cancha("Cancha Paddle (4)", 100, 3));
    canchas.add(new Cancha("Cancha Futbol 5 (5)", 400, 4));
    canchas.add(new Cancha("Cancha Futbol 5 (6)", 400, 5));
  }

  public void mostrarMenu() {
    Scanner input = new Scanner(System.in);
    int opcion = 0;
    do {
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      this.mostrarHorariosDisponibles(fechaActual, 3);
      System.out.println("Gestor Turnos");
      System.out.println(GRIS + "1. Sacar turno" + RESET);
      System.out.println(GRIS + "2. Cambiar fecha" + RESET);
      System.out.println(GRIS + "3. Ser socio" + RESET);
      System.out.println(GRIS + "4. Salir" + RESET);
      System.out.print("Selecione una opcion: ");
      opcion = input.nextInt();
      input.nextLine();

      switch (opcion) {
        case 1:
          System.out.print("Cancha (id): ");
          int canchaId = input.nextInt();
          Cancha canchaSeleccionada = obtenerCancha(canchaId);
          System.out.print("Hora: ");
          int hora = input.nextInt();
          canchaSeleccionada.agregarHorarioOcupado(hora, this.fechaActual);

          Turno turno = new Turno("pepe", canchaSeleccionada, new Horario(hora, this.fechaActual));
          turnos.add(turno);

          break;
        case 2:
          System.out.print("Fecha (ejemplo: 2025-03-29): ");
          LocalDate fecha = LocalDate.parse(input.nextLine());
          setFechaActual(fecha);
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

  public void mostrarHorariosDisponibles(LocalDate fecha, int columnas) {
    System.out.println(AZUL + "Horarios disponibles " + fecha + ": " + RESET);
    int totalCanchas = canchas.size();
    int filas = (int) Math.ceil((double) totalCanchas / columnas);

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        int index = i * columnas + j;
        if (index < totalCanchas) {
          System.out.printf("%-20s", canchas.get(index).getNombre());
        }
      }
      System.out.println();

      boolean hayMasHorarios;
      int filaActual = 0;
      do {
        hayMasHorarios = false;
        for (int j = 0; j < columnas; j++) {
          int index = i * columnas + j;
          if (index < totalCanchas) {
            List<Horario> horarios = canchas.get(index).obtenerHorariosDisponibles(fecha);
            if (filaActual < horarios.size()) {
              Horario horario = horarios.get(filaActual);
              String color = horario.getDisponibilida() ? VERDE : ROJO;
              System.out.printf("%s%-20s%s", color, horario.getHora(), RESET);
              hayMasHorarios = true;
            } else {
              System.out.printf("%-20s", "");
            }
          }
        }
        System.out.println();
        filaActual++;
      } while (hayMasHorarios);
    }
  }

  private Cancha obtenerCancha(int canchaId) {
    for (Cancha cancha : canchas) {
      if (cancha.getId() == canchaId) {
        return cancha;
      }
    }
    return null;
  }

  public static void limpiarConsola() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void setFechaActual(LocalDate fechaActual) {
    this.fechaActual = fechaActual;
  }
}
