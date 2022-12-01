package Ejecutable;

import Modelo.Biblioteca;
import vista.VentanaPrincipal;
import Controlador.controlador;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        controlador miControlador = new controlador(miVentana, miBiblioteca);    
    }
}
