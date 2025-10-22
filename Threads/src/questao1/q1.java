package questao1;

public class q1 {
    
    public static void main(String[] args) {
    
    Thread task1 = new Thread(new RacerUsandoRunnable(1));
    Thread task2 = new RacerUsandoExtends(2);
    
    task1.start();
    task2.start();
    }
    
    
}