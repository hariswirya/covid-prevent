import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Masker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masker extends Move
{
    /**
     * Act - do whatever the Masker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         driveDown();
        endOfRoad();
       
    } 
    
    
    public void driveDown() 
    {
        setLocation(getX(), getY() + Score.a);
    }
 
    public void endOfRoad() 
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
        }
        else
        {
           
    

        }
    }    
}
