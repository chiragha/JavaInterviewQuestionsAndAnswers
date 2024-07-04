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
public class Logical_operators {
    public static void main(String[] args){
        
//        int temp = 25;
//        
//        if(temp>30){
//             System.out.println("Too much hot");
//        }else if(temp >= 20 && temp <= 30){
//            System.out.println("Not so hot not so cool");
//        }



//         Scanner scanner = new Scanner(System.in);
//         System.out.println("You are playing a game: please press q or Q to quit the game");
//         
//         String response = scanner.next();
//         
//         if(response.equals("q") || response.equals("Q")){
//             System.out.println("You quit the game");
//         }else{
//             System.out.println("You are still playing the game");
//         }



Scanner scanner = new Scanner(System.in);
         System.out.println("You are playing a game: please press q or Q to quit the game");
         
         String response = scanner.next();
         
         if(!response.equals("q") || !response.equals("Q")){
             System.out.println("You are still playing the game");
         }else{
             System.out.println("You quit the game");
         }
         
    }
    
}
