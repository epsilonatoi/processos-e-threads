package questao1b;

import questao1.RacerUsandoRunnable;

public class Race {
    
    public static void main(String[] args) {
        
        System.out.println("--- CARROS ÍMPARES ---");
        
        Thread[] threadsImpares = new Thread[5];
        int index = 0;
        
        for (int i = 1; i <= 10; i += 2) {
            RacerUsandoRunnable racer = new RacerUsandoRunnable(i);
            Thread task = new Thread(racer);
            threadsImpares[index++] = task;
            task.start();
        }
        
        // aguardar os ímpares terminarem
        for (Thread thread : threadsImpares) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("--- CARROS PARES ---");
        
        for (int i = 2; i <= 10; i += 2) {
            RacerUsandoRunnable racer = new RacerUsandoRunnable(i);
            Thread task = new Thread(racer);
            task.start();
        }
    }
}