package questao1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RacerUsandoExtends extends Thread{
    private int i;
    
    public RacerUsandoExtends(int i){
        this.i = i;
    }
    
    @Override
    public void run(){
        while (true) {
            System.out.println("Racer (E)"+ i +"- imprimindo");
        }
    }
}
