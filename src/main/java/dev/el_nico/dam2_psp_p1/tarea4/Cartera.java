package dev.el_nico.dam2_psp_p1.tarea4;

public class Cartera {

    private double dinero;

    public Cartera(double dinero) {
        this.dinero = dinero;
    }

    public synchronized void meterDinero(double cuanto) {     
        System.out.println("Meter dinero: " + (int)dinero + " + " + (int)cuanto + " = " + (int)(dinero += cuanto));
    }

    public synchronized void sacarDinero(double cuanto) {
        System.out.println("Sacar dinero: " + (int)dinero + " - " + (int)cuanto + " = " + (int)(dinero -= cuanto));
    }
}
