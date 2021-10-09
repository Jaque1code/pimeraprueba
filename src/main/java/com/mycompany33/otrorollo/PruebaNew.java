/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany33.otrorollo;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class PruebaNew {
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] myGrades = new double[5];
        myGrades[0] = 3.3;
        myGrades[1] = 4.0;
        myGrades[2] = 4.0;
        myGrades[3] = 3.4;
        myGrades[4] = 4.0;
         
        double sum = add(myGrades);
        double avg = sum/myGrades.length;   
        print("Your averae is " + avg);
        
    }
    public static double add(double[] grades){
        double addition = 0;
        for(int i = 0; i<grades.length; i++ ){
            addition += grades[i];
        }
        return addition;
    }
    
    
    public static void print(String text){
        System.out.println(text );
    }
    
}

