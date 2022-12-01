package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoCrearColeccion miColeccion;
    public DialogoCrearLibro miLibro;

    
    
    public VentanaPrincipal()
    {
        
        this.setLayout(null);

        
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        this.add(miPanelEntradaDatos);

        
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,120);
        this.add(miPanelOperaciones);

        
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,380,190);
        this.add(miPanelResultados);

        
        this.setTitle("Empresa Automotriz");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public void crearDialogoAgregarColeccion()
    {
        miColeccion = new DialogoCrearColeccion();
    }

    
    public void crearDialogoAgregarLibro()
    {
        miLibro = new DialogoCrearLibro();
    }
}
