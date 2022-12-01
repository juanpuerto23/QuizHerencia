package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Biblioteca;
import vista.VentanaPrincipal;

public class controlador implements ActionListener
{
    private VentanaPrincipal venPrin;
    private Biblioteca biblioteca;

    public controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblio)
    {
        this.venPrin = pVenPrin;
        this.biblioteca = pBiblio;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Funciona :D");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("AgregarColeccion"))
        {
            venPrin.crearDialogoAgregarColeccion();
            this.venPrin.miColeccion.agregarOyenteBoton(this);
        }

        if(comando.equals("AgregarLibro"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miLibro.agregarOyenteBoton(this);
        }

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }
    }
}