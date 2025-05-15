package src.Experimentos;

import javax.swing.*;
import java.awt.*;

public class AnimacionConThread extends JPanel {
  private int x = 0; // Posición en el eje X (para mover algo en la pantalla)

  public AnimacionConThread() {
    // Se crea un Thread para la animación
    Thread animacionThread = new Thread(() -> {
      while (true) { // Bucle infinito para animación
        x += 1; // Mueve el objeto en X
        if (x > getWidth()) { // Si el objeto sale de la pantalla, vuelve al inicio
          x = 0;
        }
        repaint(); // Vuelve a dibujar el componente (invoca paintComponent)
        try {
          Thread.sleep(10); // Espera 20 ms antes de volver a ejecutar (controla la velocidad)
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    animacionThread.start(); // Inicia el hilo
  }

  // Método para dibujar en el panel
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); // Llama a la versión de la clase base
    g.setColor(Color.RED); // Define el color del objeto
    g.fillRect(x, 100, 50, 50); // Dibuja un rectángulo (que se mueve)
  }

  public static void main(String[] args) {
    // Crear la ventana (JFrame)
    JFrame frame = new JFrame("Animación con Thread");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600); // Tamaño de la ventana

    // Crear el panel de animación y añadirlo al JFrame
    AnimacionConThread animPanel = new AnimacionConThread();
    frame.add(animPanel);

    frame.setVisible(true); // Muestra la ventana
  }
}
