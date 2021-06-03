
import static java.lang.Math.random;

public class Baraja { 

   

   
    public static void main(String[] args) {
        int numero  = (int) (Math.random()*13);
         int palo = (int) (Math.random()*4);
         
         String [] palos = {"bastos", "oros", "espada", "copas"};
         for (int i = 0; i < 4; i++) {
             System.out.println( "la carta es " + numero + " y el palo es " +palos[i]);
             break;
             
                     }
    }
}
