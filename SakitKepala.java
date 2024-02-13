import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SakitKepala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SakitKepala extends Rintangan
{
    /**
     * Act - do whatever the SakitKepala wants to do. This method is called whenever
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
        setLocation(getX(), getY()+ Score.a);
    }
    
    public void checkCollision() 
    {
        Actor SakitKepala = getOneIntersectingObject(SakitKepala.class);
        if(SakitKepala != null)
        {
            getWorld().removeObject(SakitKepala);
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
