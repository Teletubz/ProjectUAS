/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
class Komputer extends JFrame implements ActionListener {
    
    private String merek;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 150;
    
    private JButton Komputer;
    private JButton CPU;
    
    public static void main(String[] args) {
        Komputer btn = new Komputer();
        btn.setVisible(true);
    }
    
    //Dependensi
    //public void on(CPU cpu){
       // cpu.on();
    //}
    
    //public void off(CPU cpu){
    //    cpu.off();
   // }
    
    
    public Komputer () {
        
        setTitle("Program SecondJFrame");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set layout
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        Komputer = new JButton("KOMPUTER");
        contentPane.add(Komputer);
        
        CPU = new JButton("CPU");
        contentPane.add(CPU);
        
        Komputer.addActionListener(this);
        CPU.addActionListener(this);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }    
    
    public void actionPerformed(ActionEvent event) {
        
        JButton clickedButton = (JButton) event.getSource();
        
        String buttonText = clickedButton.getText();
        setTitle(buttonText + " Menyala ");
                
    }
}
