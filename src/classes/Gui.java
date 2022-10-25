/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author My
 */
public class Gui {
    public static void _centerFrame(JFrame frame){
        Rectangle rec = frame.getBounds();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width = rec.width)/ 2, (dim.height = rec.height)/2);
        
    }
    
    public void setIconFrame(JFrame frame){
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assess/ng9.png")));
        
    }
    
    public static void _integerOnly(KeyEvent evt){
        char _character = evt.getKeyChar();
        if(Character.isDigit(_character)
                || _character == KeyEvent.VK_SPACE
                || _character == KeyEvent.VK_DELETE
                || _character == KeyEvent.VK_SLASH){
            
            
        }
        else{
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            
        }
    }
    
   
    public static void _message(String message,int errorType){
        
        switch(errorType){
            case 0:
                JOptionPane.showMessageDialog(null, message,"ERROR",JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, message,"PROCESS",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, message,"WARNING",JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
                
        }
    }
    
    private static String pstFileBestScore = System.getProperty("user.dir")+ "/src/GUI/bestscore.ini";
    
    public static int getCurrentBestScore(){
        int bestScore;
        String line,newLine = "";
        try{
           BufferedReader buff = new BufferedReader(new FileReader(pstFileBestScore)); 
           while((line = buff.readLine()) != null){
               newLine = line;
           }
        }
        catch(FileNotFoundException e){
        } catch (IOException ex) { 
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        bestScore = Integer.parseInt(newLine.substring(newLine.indexOf("[") + 1, newLine.indexOf("]")));
        
        return bestScore;
        
    }
    
    public static void setNewBestScore(String newContent){
        try {
            File FileToUpdate = new File(pstFileBestScore);
            try(FileWriter fileWrite = new FileWriter(FileToUpdate)){
             fileWrite.write(newContent);
             fileWrite.close();
            }
        }
        catch(Exception e){
            
        }
    }
            
            
            
    
}
