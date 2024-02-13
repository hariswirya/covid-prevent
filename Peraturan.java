import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peraturan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peraturan extends World
{

    /**
     * Constructor for objects of class Peraturan.
     * 
     */
    public Peraturan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Back back = new Back();
        addObject(back,83,43);
        back.setLocation(76,40);
    }
}

