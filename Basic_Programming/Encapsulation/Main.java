
package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti", "200", 1999);
       // System.out.println(car.make); //it shows some error (Encapsulation/Main.java make has private access in Encapsulation.Car)
//       System.out.println(car.getMake());
//       System.out.println(car.getModel());
//       System.out.println(car.getYear());
       
       
       car.setYear(2020);
       
        System.out.println(car.getMake());
       System.out.println(car.getModel());
       System.out.println(car.getYear());
       
    }
    
    
}
