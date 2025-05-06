package src.Practica4.supermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
  private String nombre;
  private List<Producto> stock;
  private List<Factura> facturas;
  private double porcentajeEscasez; // 1.0 = 100%

  public Supermercado(String nombre, double porcentajeEscasez) {
    this.porcentajeEscasez = porcentajeEscasez;
    this.nombre = nombre;
    this.stock = new ArrayList<Producto>();
    this.facturas = new ArrayList<Factura>();
  }

  public List<Producto> obtenerProductosEscasean() {
    List<Producto> productosEscasean = new ArrayList<Producto>();
    for (Producto producto : stock) {
      double limite = producto.getMinCantidad() * porcentajeEscasez;
      if (producto.getCantidad() < limite) {
        productosEscasean.add(producto);
      }
    }
    return productosEscasean;
  }

  public double obtenerDineroFacturado(LocalDate fecha) {
    double dineroFacturado = 0;
    for (Factura factura : facturas) {
      if (factura.getFecha().equals(fecha)) {
        dineroFacturado += factura.getMontoTotal();
      }
    }
    return dineroFacturado;
  }

  public double obtenerDineroFacturadoPeriodo(LocalDate fechaInicial, LocalDate fechaFinal) {
    double dineroFacturado = 0;
    for (Factura factura : facturas) {
      if (isInPeriodo(factura.getFecha(), fechaInicial, fechaFinal)) {
        dineroFacturado += factura.getMontoTotal();
      }
    }
    return dineroFacturado;
  }

  public void actualizarProductos(List<Producto> stock, List<Producto> productos) {
    for (Producto producto : productos) {
      Producto productoStock = getProductoId(stock, producto.getId());
      if (productoStock != null)
        productoStock.setCantidad(productoStock.getCantidad() - producto.getCantidad());
      else
        System.out.println("Producto con ID " + producto.getId() + " no encontrado en el stock.");
    }
  }

  public void añadirProductosStock(List<Producto> stock, List<Producto> productos) {
    for (Producto producto : productos) {
      añadirCantProductoStock(producto);
    }
  }

  public void añadirProductos(List<Producto> listaProductos, List<Producto> productos) {
    for (Producto producto : productos) {
      añadirCantProducto(listaProductos, producto);
    }
  }

  public void añadirCantProductoStock(Producto producto) {
    Producto productoStock = getProductoId(stock, producto.getId());
    if (productoStock != null)
      productoStock.setCantidad(productoStock.getCantidad() + producto.getCantidad());
    else
      System.out.println("Producto con ID " + producto.getId() + " no encontrado en el stock.");
  }

  public void añadirCantProducto(List<Producto> listaProductos, Producto producto) {
    Producto productoStock = getProductoId(listaProductos, producto.getId());
    if (productoStock != null)
      productoStock.setCantidad(productoStock.getCantidad() + producto.getCantidad());
    else
      listaProductos.add(producto);
  }

  public Producto getProductoId(List<Producto> stock, int id) {
    for (Producto producto : stock) {
      if (producto.getId() == id) {
        return producto;
      }
    }
    return null;
  }

  public Producto obtenerProductoMasRecaudo(LocalDate fecha) {
    List<Factura> facturasFecha = getFacturasFecha(fecha);
    List<Producto> totalProductos = obtenerTotalProductosFacturas(facturasFecha);
    Producto productoMayorRecaudo = totalProductos.get(0);
    for (Producto producto : totalProductos) {
      if (producto.getPrecioFinal() > productoMayorRecaudo.getPrecioFinal()) {
        productoMayorRecaudo = producto;
      }
    }
    return productoMayorRecaudo;
  }

  public Producto obtenerProductoMasRecaudoPeriodo(LocalDate fechaInicial, LocalDate fechaFinal) {
    List<Factura> facturasFecha = getFacturasFechaPeriodo(fechaInicial, fechaFinal);
    List<Producto> totalProductos = obtenerTotalProductosFacturas(facturasFecha);
    Producto productoMayorRecaudo = totalProductos.get(0);
    for (Producto producto : totalProductos) {
      if (producto.getPrecioFinal() > productoMayorRecaudo.getPrecioFinal()) {
        productoMayorRecaudo = producto;
      }
    }
    return productoMayorRecaudo;
  }

  public List<Producto> obtenerTotalProductosFacturas(List<Factura> totalFacturas) {
    List<Producto> totalProductos = new ArrayList<Producto>();
    for (Factura factura : totalFacturas) {
      añadirProductosStock(totalProductos, factura.getProductosComprados());
    }
    return totalProductos;
  }

  public List<Factura> getFacturasFecha(LocalDate fecha) {
    List<Factura> facturasFecha = new ArrayList<Factura>();
    for (Factura factura : this.facturas) {
      if (factura.getFecha().equals(fecha)) {
        facturasFecha.add(factura);
      }
    }
    return facturasFecha;
  }

  public List<Factura> getFacturasFechaPeriodo(LocalDate fechaInicial, LocalDate fechaFinal) {
    List<Factura> facturasFecha = new ArrayList<Factura>();
    for (Factura factura : this.facturas) {
      if (isInPeriodo(factura.getFecha(), fechaInicial, fechaFinal)) {
        facturasFecha.add(factura);
      }
    }
    return facturasFecha;
  }

  public boolean isInPeriodo(LocalDate fecha, LocalDate fechaInicial, LocalDate fechaFinal) {
    return ((fecha.equals(fechaInicial) || fecha.isAfter(fechaInicial))
        && (fecha.equals(fechaFinal) || fecha.isBefore(fechaFinal)));
  }

  public String getNombre() {
    return nombre;
  }

  public List<Producto> getStock() {
    return stock;
  }

  public List<Factura> getFacturas() {
    return facturas;
  }

  public double getPorcentajeEscasez() {
    return porcentajeEscasez;
  }

}