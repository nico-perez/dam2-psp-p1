package dev.el_nico.dam2_psp_p1.tarea1;

public class Hilo extends Thread {

    private static int _ids = 0;
    private int id = ++_ids;

    @Override
    public void run() {
        // Valor aleatorio, en segundos, entre 1 y 5.
        long s = (long) (Math.random() * 5 + 1);
        System.out.println("Soy el hilo nº " + id + " y me pongo a dormir " + s + " segundos.");
        try {
            // El valor de antes en milisegundos
            Thread.sleep(s * 1000);
            System.out.println("Soy el hilo nº " + id + " y he terminado de dormir.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
