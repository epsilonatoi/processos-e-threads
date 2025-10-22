package questao1;

public class RacerUsandoRunnable implements Runnable {
    private int i;
    
    public RacerUsandoRunnable(int i){
        this.i = i;
    }
    
    @Override
    public void run(){
        int contador = 0;
        while (contador < 1000) {
            contador++;
            System.out.println("Racer (R)" + i + "- imprimindo");
        }
        System.out.println("--- Racer " + i + " FINALIZADO ---");
    }
}