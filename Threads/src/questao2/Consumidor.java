package questao2;

public class Consumidor extends Thread {
    private Deposito deposito;
    private int tempoConsumo;
    
    public Consumidor(Deposito deposito, int tempoConsumo) {
        this.deposito = deposito;
        this.tempoConsumo = tempoConsumo;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            boolean conseguiuRetirar = deposito.retirar();
            
            if (conseguiuRetirar) {
                System.out.println("Consumido - Total: " + deposito.getNumItens());
            } else {
                System.out.println("Falha ao consumir - Total: " + deposito.getNumItens() + " - Tentando novamente...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
                continue;
            }
            
            try {
                Thread.sleep(tempoConsumo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(">>> Consumidor " + Thread.currentThread().getId() + " terminou");
    }
}
