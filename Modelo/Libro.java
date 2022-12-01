package Modelo;

public class Libro
{
    protected String nombreLib;
    protected int annioLib;
    protected String autor;
    protected boolean edicionLujo;

    public Libro(String nom, String aut, int annio)
    {
        this.nombreLib = nom;
        this.autor = aut;
        this.annioLib = annio;
    }

    public String toString()
    {
        return("-Nombre: " + nombreLib + "\n-Autor: " + autor + "\n-Año de edición: " + annioLib + "\n-Edicion de lujo:" + edicionLujo);
    }
}