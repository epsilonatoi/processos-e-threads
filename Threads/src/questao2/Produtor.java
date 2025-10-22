package questao2;

public class Produtor extends Thread {
    private Deposito deposito;
    private int tempoProducao;
    
    public Produtor(Deposito deposito, int tempoProducao) {
        this.deposito = deposito;
        this.tempoProducao = tempoProducao;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            deposito.colocar();
            System.out.println("Produzido - Total: " + deposito.getNumItens());
            
            try {
                Thread.sleep(tempoProducao);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(">>> Produtor terminou");
    }
}