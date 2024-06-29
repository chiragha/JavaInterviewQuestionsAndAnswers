
package com.chiragha.SelectionDemo;

public class Overloaded_methods {
    public static void main(String[] args) {
        
        double a = add(2.0,3.0,4.0,5.0);
        
        System.out.println(a);
        
    }
    static int add(int x, int y){
        System.out.println("this is overloaded method #1");
            return x+y;
        }
    
    static int add(int x, int y, int z){
        System.out.println("this is overloaded method #2");
            return x+y+z;
        }
    
    static int add(int x, int y, int  z, int s){
        System.out.println("this is overloaded method #3");
            return x+y+z+s;
        }
    
    static double add(double x, double y){
        System.out.println("this is overloaded method #4");
            return x+y;
        }
    
    static double add(double x, double y, double z){
        System.out.println("this is overloaded method #5");
            return x+y+z;
        }
    
    static double add(double x, double y, double  z, double s){
        System.out.println("this is overloaded method #6");
            return x+y+z+s;
        }
    
}
