/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsalesreport;

/**
 *
 * @author Student
 */
import java.util.*;
public class Electronicsalesreport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         //THe user inputs the data
        System.out.print("Enter the name of the City: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter name of console: ");
        String console= scanner.nextLine();
        
        System.out.print("Enter the number of sales: ");
        int sales = scanner.nextInt();
        
        //Cities(Rows)
        String[] cities = {"Cape Town" , "Port Elizabeth" , "Pretoria"};
        
        // Consoles(Columns)
        String[] consoles = {"PS5" , "XBOX" , "SWITCH" };
        
        //2D array
        int[][]consoleSales = {
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200},
        };
        //Consoles Sales Report
        System.out.println("    ");
        System.out.print(" Consoles Sales Report");
        System.out.print("    ");
        
        //Headers of the columns
        System.out.print(" ");
        for(String year:consoles){
            System.out.printf(" " , consoles);
        }
        System.out.println();
        //Print sales
        for(int i=0; i<consoleSales.length;i++){
            System.out.printf(" " , cities[i]);
            for(int j=0; j<consoleSales[i].length; j++){
                System.out.printf(" ", consoleSales[i][j]);
            
            }
            System.out.println();
        }
        System.out.println("     ");
        System.out.println("Consoles Total Sales");
        System.out.println("     ");
        //Calculating total sales
        for(int i=0; i<consoleSales.length; i++){
            int totalSales = 0;
            for (int j=0; j<consoleSales[i].length; j++){
                totalSales += consoleSales[i][j];
            }
        }
        
    }
}
