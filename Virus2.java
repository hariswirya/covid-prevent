import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus2 extends Rintangan
{
    /**
     * Act - do whatever the Virus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          checkCollision();
        cek();
        driveDown();
        endOfRoad();
       
    } 
    public void cek(){
    if(isTouching(Flu.class)){
    setLocation(getX(), getY() + Score.a+2);
    }
    }
   
    public void driveDown() 
    {
        setLocation(getX(), getY() + Score.a+3);
    }
    
    public void checkCollision() 
    {
        Actor hero = getOneIntersectingObject(Virus2.class);
        
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

