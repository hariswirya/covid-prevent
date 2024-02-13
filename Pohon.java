import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pohon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pohon extends Move
{
    /**
     * Act - do whatever the Pohon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   
        treesMove();
        treesGone();
    }  
    
    public void treesMove() 
    {
        setLocation(getX(), getY() + Score.a);   
        checkDoubleTree();
    }
    
     public void checkDoubleTree() 
     {
         Actor tree = getOneIntersectingObject(Pohon.class);
         if(tree != null)
         {
             getWorld().removeObject(tree);
         }
         else{
        
        
        
        }
     }
    
     public void treesGone() 
     {
         if(getY() >= getWorld().getHeight() -1)
         {
             getWorld().removeObject(this);
         }
         else{
            
            
            }
    }    
}
