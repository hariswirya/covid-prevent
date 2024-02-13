import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flu extends Rintangan
{
    /**
     * Act - do whatever the Flu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         driveDown();   
      checkCollision();
      endOfRoad();
    } 
    
    
    public void driveDown() 
    {
        setLocation(getX(), getY()+Score.a+2);
    }
    
    public void checkCollision() 
    {
        Actor hero = getOneIntersectingObject(Flu.class);
        if(hero != null)
        {
            getWorld().removeObject(hero);
        }
        else{
        
        
        
        }
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

