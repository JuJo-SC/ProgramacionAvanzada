package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {
    private final ControladorContexto contexto;

    public ControladorPrincipal(ControladorContexto contexto) {
        this.contexto = contexto;
        contexto.getVistaPrincipal().menuProductos.addActionListener(this);
        contexto.getVistaPrincipal().menuInventario.addActionListener(this);
        contexto.getVistaPrincipal().menuPuntoVenta.addActionListener(this);
        contexto.getVistaPrincipal().menuSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == contexto.getVistaPrincipal().menuProductos) {
            contexto.traerAlFrente(contexto.getVistaProductos());
        } else if (source == contexto.getVistaPrincipal().menuInventario) {
            contexto.traerAlFrente(contexto.getVistaInventario());
        } else if (source == contexto.getVistaPrincipal().menuPuntoVenta) {
            contexto.traerAlFrente(contexto.getVistaPuntoVenta());
        } else if (source == contexto.getVistaPrincipal().menuSalir) {
            contexto.getVistaPrincipal().dispose();
        }
    }
}