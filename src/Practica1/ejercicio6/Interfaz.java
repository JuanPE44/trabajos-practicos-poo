package src.Practica1.ejercicio6;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Interfaz {
  private static final String GRIS = "\u001B[90m";
  private static final String AZUL = "\u001B[34m";
  private static final String RESET = "\033[0m";
  private static final String VERDE = "\033[0;32m";
  private static final String ROJO = "\033[0;31m";

  private Usuario usuarioActual = new Usuario("pepe");
  private GestorTurnos gestor;
  private Scanner input = new Scanner(System.in);

  public Interfaz(GestorTurnos gestor) {
    this.gestor = gestor;
  }

  public void iniciarMenu() {
    int opcion = 0;
    do {
      mostrarMenu();
      opcion = input.nextInt();
      input.nextLine();

      switch (opcion) {
        case 1:
          System.out.print("Cancha (id): ");
          int canchaId = input.nextInt();
          System.out.print("Hora: ");
          int hora = input.nextInt();
          gestor.agregarTurno(usuarioActual, canchaId, hora);
          break;
        case 2:
          System.out.print("Fecha (ejemplo: 2025-03-29): ");
          LocalDate fecha = LocalDate.parse(input.nextLine());
          gestor.setFechaActual(fecha);
          break;
        case 3:
          System.out
              .print("Para ser socio debes tener al menos 4 turnos en los ultimos 2 meses, desea ser socio? (s/n): ");
          String respuesta = input.nextLine();
          if (respuesta.equalsIgnoreCase("s")) {
            gestor.agregarSocio(usuarioActual);
          }
          break;
        case 4:
          break;
        default:
          System.out.println("Opción no válida, seleccione una opción del 1 al 4.");
          break;
      }
    } while (opcion != 4);
    input.close();
  }

  pkrivate void mostrarMenu() {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    mostrarHorariosDisponibles(3);
    System.out
        .println(GRIS + "Gestor Turnos (" + usuarioActual.getNombreUsuario()
            + (usuarioActual.getEsSocio() ? " es socio" : " no es socio") + ")" + RESET);
    System.out.println("1. Agregar turno");
    System.out.println("2. Cambiar fecha");
    System.out.println("3. Volverme socio");
    System.out.println("4. Salir");
    System.out.print("Selecione una opcion: ");
  }

awdjawdajdajwkdajwkda  public void mostrarHorariosDisponibles(int columnas) {
    System.out.println(AZUL + "Horarios disponibles " + gestor.getFechaActual() + ": " + RESET);
    int totalCanchas = gestor.getCanchas().size();
    int filas = (int) Math.ceil((double) totalCanchas / columnas);

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        int index = i * columnas + j;
        if (index < totalCanchas) {
          System.out.printf("%-20s", gestor.getCanchas().get(index).getNombre());
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
            Cancha cancha = gestor.getCanchas().get(index);
            List<Turno> turnos = cancha.obtenerTurnos(gestor.getFechaActual(),
                gestor.getHoraInicio(), gestor.getHoraFin());
            if (filaActual < turnos.size()) {
              Turno turno = turnos.get(filaActual);
              String color = turno.getDisponibilidad() ? VERDE : ROJO;
              System.out.printf("%s%-20s%s", color, turno.getHora(), RESET);
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

  public static void limpiarConsola() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
