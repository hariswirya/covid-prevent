import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    static int score=3700;
    static int nyawa=Score.nyawa;
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new Hero(), 305, 550); 
        
        setPaintOrder(Hero.class,Flu.class,Virus2.class,Virus.class,SakitKepala.class);
    prepare();
    }
    public void act(){
        rintangan();
        masker();
        pohon();
    }  
    public void rintangan(){
    if(Greenfoot.getRandomNumber(800) < 2)
        {        
            addObject(new Virus(), Greenfoot.getRandomNumber(200) + 200, 0);   
        }
    if(Greenfoot.getRandomNumber(500) < 2)
        {        
            addObject(new Flu(), Greenfoot.getRandomNumber(200) + 200, 0);   
        }
    if(Greenfoot.getRandomNumber(500) < 2) 
        {        
            addObject(new Virus2(), Greenfoot.getRandomNumber(200) + 200, 0);   
        }
    if(Greenfoot.getRandomNumber(800) < 2) 
         {        
            addObject(new SakitKepala(), Greenfoot.getRandomNumber(200) + 200, 0);    
        }
    if(Greenfoot.getRandomNumber(800) < 2) 
        {
            
            addObject(new Influenza(), Greenfoot.getRandomNumber(200) + 200, 0); 
        }    
    }
    public void masker(){
     if(Greenfoot.getRandomNumber(500) < 2) 
        {        
            addObject(new Masker(), Greenfoot.getRandomNumber(200) + 200, 0);    
        }
        
    }
    
    public void pohon(){
        if(Greenfoot.getRandomNumber(10) < 2) 
        {
            addObject(new Pohon(), Greenfoot.getRandomNumber(170), 0);  
            addObject(new Pohon(), Greenfoot.getRandomNumber(170) + 440, 0); 
        }
    }
/**
 * Prepare the world for the start of the program.
 * That is: create the initial objects and add them to the world.
 */
private void prepare()
{
    Exit exit = new Exit();
    addObject(exit,82,52);
    exit.setLocation(80,95);
    SaveGame save = new SaveGame();
    addObject(save,551,81);
}
}
