package dev.el_nico.dam2_psp_p1.tarea4;

public class Main {
    public static void main(String[] args) {
        Cartera c = new Cartera(0);

        Client[] clients = new Client[10];
        for (Client client : clients) {
            client = new Client(c);
            client.start();
        }

        Worker[] workers = new Worker[10];
        for (Worker worker : workers) {
            worker = new Worker(c);
            worker.start();
        }
    }
}
