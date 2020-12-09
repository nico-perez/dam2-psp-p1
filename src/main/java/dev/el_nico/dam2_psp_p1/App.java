package dev.el_nico.dam2_psp_p1;

/**
 * Hello world!
 *
 */
public class App 
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
