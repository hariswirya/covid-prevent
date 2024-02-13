import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Influenza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Influenza extends Rintangan
{
    /**
     * Act - do whatever the Influenza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
        driveDown();
        endOfRoad();
       
    } 
    
    
    public void driveDown() 
    {
        setLocation(getX(), getY()+Score.a );
    }
    
    public void checkCollision() 
    {
        Actor influenza = getOneIntersectingObject(Influenza.class);
        if(influenza != null)
        {
            getWorld().removeObject(influenza);
        }
        else{
        
        
        
        }
     }
     
     
    public void endOfRoad() // removes batu once it hits end of the world.
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

