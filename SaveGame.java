import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import javax.swing.*;
/**
 * Write a description of class SaveGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveGame extends Button
{
    /**
     * Act - do whatever the SaveGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            JOptionPane.showMessageDialog(null,"Kamu sukses menyimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);

            save();
    }    
}
     public void save(){
        try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("level.txt"));
                bw.write(Hero.a);
                bw.newLine();
                bw.write(Integer.toString(Score.nyawa));
                bw.newLine();
                bw.write(Integer.toString(Score.counterhero));
                bw.newLine();
                bw.close();
          } catch (Exception e) {
              System.err.println("Error: "+e.getMessage());
         }
}
}
