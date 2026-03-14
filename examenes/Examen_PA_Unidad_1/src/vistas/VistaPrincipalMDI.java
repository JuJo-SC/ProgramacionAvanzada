package vistas;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VistaPrincipalMDI extends JFrame {
    public final JDesktopPane desktopPane;
    public final JMenuItem menuProductos;
    public final JMenuItem menuInventario;
    public final JMenuItem menuPuntoVenta;
    public final JMenuItem menuSalir;

    public VistaPrincipalMDI() {
        setTitle("Sistema de Catalogo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1320, 760);
        setLocationRelativeTo(null);

        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuSistema = new JMenu("Sistema");
        menuProductos = new JMenuItem("Productos");
        menuInventario = new JMenuItem("Inventario");
        menuPuntoVenta = new JMenuItem("Punto de Venta");
        menuSalir = new JMenuItem("Salir");
        menuSistema.add(menuProductos);
        menuSistema.add(menuInventario);
        menuSistema.add(menuPuntoVenta);
        menuSistema.addSeparator();
        menuSistema.add(menuSalir);
        menuBar.add(menuSistema);
        setJMenuBar(menuBar);
    }
}
