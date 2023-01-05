/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public abstract class CPU {
    
    private String merek;
    
    public void on(){
        System.out.println("CPU Menyala...");
    }
    
     public void off(){
        System.out.println("CPU Mati...");
    }
     
     abstract void run();
}
