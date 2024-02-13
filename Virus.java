import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends Rintangan
{
    /**
     * Act - do whatever the Virus wants to do. This method is called whenever
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
        Actor hero = getOneIntersectingObject(Virus.class);
        Actor hero1 = getOneIntersectingObject(SakitKepala.class);
        if(hero != null)
        {
            getWorld().removeObject(hero);
            getWorld().removeObject(hero1);
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
