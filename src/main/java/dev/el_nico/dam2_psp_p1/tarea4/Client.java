package dev.el_nico.dam2_psp_p1.tarea4;

public class Client extends Thread {

    private Cartera cartera;

    public Client(Cartera cartera) {
        this.cartera = cartera;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                cartera.meterDinero(Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
