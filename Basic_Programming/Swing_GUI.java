
package com.chiragha.SelectionDemo ;

import javax.swing.JOptionPane;

public class Swing_GUI {
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Tell me your age "+name));
        JOptionPane.showMessageDialog(null, "You are  "+age+ "years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Tell me your height "+name));
        JOptionPane.showMessageDialog(null, "You are  "+height+ "cm long");
        
    }
    
}
