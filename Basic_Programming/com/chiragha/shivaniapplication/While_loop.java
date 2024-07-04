/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chiragha.shivaniapplication;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class While_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        while(name.isBlank()){
            System.out.println("Enter youe name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }
    
}
