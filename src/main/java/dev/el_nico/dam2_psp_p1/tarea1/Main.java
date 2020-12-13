package dev.el_nico.dam2_psp_p1.tarea1;

public class Main 
{
    public static void main(String[] args)
    {
        Hilo[] hilos = new Hilo[100];
        for (Hilo h : hilos) {
            h = new Hilo();
            h.start();
        }
    }
}
