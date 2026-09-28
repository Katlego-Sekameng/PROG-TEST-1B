/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoledevicesales;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Consoledevicesales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //THe user inputs the data
        System.out.print("Enter the Console type: ");
        String type = scanner.nextLine();
        
        System.out.print("Enter Store Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the amount of sales: ");
        int sales = scanner.nextInt();
        
        
        
    }
}
