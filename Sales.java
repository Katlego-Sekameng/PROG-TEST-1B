/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoledevicesales;

/**
 *
 * @author Student
 */
public abstract class Sales{
    private String deviceType;
    private String storeName;
    private int amountOfSales;
    
    //Constructor
    public Sales(String deviceName, String storeName, int amountOfSales){
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.amountOfSales = amountOfSales;
    }
    //getter methods
    public String getDeviceType(){
        return deviceType;
    }
    public String getStoreName (){
        return storeName;
    }
    public int getAmountOfSales(){
        return amountOfSales;
    }

    
}
