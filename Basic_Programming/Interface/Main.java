
package Interface;
 
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();   //the rabbit is fleeing
        
        
        Hawk hawk = new Hawk();
        hawk.hunt();
        
        
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
    
}
