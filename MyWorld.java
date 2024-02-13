import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
     public GreenfootSound music =new GreenfootSound("Play.mp3");
   
   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        music.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Judul judul = new Judul();
        addObject(judul,420,419);
        judul.setLocation(418,411);

        Play play = new Play();
        addObject(play,82,65);
        removeObject(play);
        Play play2 = new Play();
        addObject(play2,445,334);
        play2.setLocation(443,332);
        Controller controller = new Controller();
        addObject(controller,128,339);
        controller.setLocation(126,336);
        controller.setLocation(125,333);
        Button button = new Button();
        addObject(button,720,329);
        removeObject(button);
        Lanjut lanjut = new Lanjut();
        addObject(lanjut,725,349);
        lanjut.setLocation(749,48);

        play2.setLocation(455,326);
        controller.setLocation(77,41);
    }
}
