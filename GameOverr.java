import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class GameOverr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverr extends World
{
 public GreenfootSound music =new GreenfootSound("GameOver.mp3");
    
    public GameOverr()
    {    
       
        super(587, 389, 1); 
        
        music.playLoop();
       
        prepare();
        }

     private void prepare(){
       Yes yes = new Yes();
        addObject(yes,307,576);
        yes.setLocation(302,572);
        yes.setLocation(302,388);
        yes.setLocation(92,348);
        No no = new No();
        addObject(no,516,362);
        no.setLocation(513,358);
     }
}
