package com.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Compare_UI extends JFrame{
	static String path1;
	static String path2;
    JButton button1,button2, button3,button4 ;
    JLabel label;
    
    
    
    public Compare_UI(){
    super("Set Picture Into A JLabel Using JFileChooser In Java");
    button1 = new JButton("Browse");
    button2 = new JButton("Browse");
    button3 = new JButton("Approve");
    button1.setBounds(300,120,90,20);
    button2.setBounds(300,160,90,20);
    button3.setBounds(300,200,90,20);
    label = new JLabel();
    label.setBounds(20,10,88,50);
    add(button1);
    add(button2);
    add(button3);
    add(label);
    
    button1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
        	JFileChooser chooser = new JFileChooser();
        	chooser.setCurrentDirectory(new java.io.File("."));
        	chooser.setDialogTitle("choosertitle");
        	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        	chooser.setAcceptAllFileFilterUsed(false);
          
          //int result = chooser.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
        	  //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
        	  //System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        	  path1 = chooser.getSelectedFile().getPath();
        	  System.out.println(path1);
              //System.out.println(path);
              //label.setIcon(ResizeImage(path));
          }
           //if the user click on save in Jfilechooser


          else if(chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
        }
    });
    button2.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
        	JFileChooser chooser = new JFileChooser();
        	chooser.setCurrentDirectory(new java.io.File("."));
        	chooser.setDialogTitle("choosertitle");
        	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        	chooser.setAcceptAllFileFilterUsed(false);
          
          //int result = chooser.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
        	  //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
        	  //System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        	  path2 = chooser.getSelectedFile().getPath();
        	  System.out.println(path2);
              //System.out.println(path);
              //label.setIcon(ResizeImage(path));
          }
           //if the user click on save in Jfilechooser


          else if(chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
        }
    });
    button3.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        	Utility.function(path1, path2);
        	
        
        	
        }
    });
    

    
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(700,400);
    setVisible(true);
     
    }

    public static void main(String[] args){
        new Compare_UI();      
    }
  }