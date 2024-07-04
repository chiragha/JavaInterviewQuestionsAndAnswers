
package Copy_objects;

public class Main {
      public static void main(String[] args) {
          
          Car car1 = new Car("Maruti", "200", 1999);
          Car car2  = new Car("Dzire", "Z+", 2020);
          
          
          //car2 = car1;//
          car2.copy(car1);
          
          System.out.println(car1);
          System.out.println(car2);
          
          System.out.println(car1.getMake());
       System.out.println(car1.getModel());
       System.out.println(car1.getYear());
       
       System.out.println(car2.getMake());
       System.out.println(car2.getModel());
       System.out.println(car2.getYear());
       
    }
    
    
}
