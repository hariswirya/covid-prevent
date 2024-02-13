import greenfoot.*; 
import java.io.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
     public GreenfootSound music = new GreenfootSound("Play.mp3");
    
    public Level1()
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
         if(Score.counterhero==600){
        save();
        
        }
    }  
    public void rintangan(){
    if(Greenfoot.getRandomNumber(800) < 2)
        {        
            addObject(new Flu(), Greenfoot.getRandomNumber(200) + 200, 0);   
        }
    if(Greenfoot.getRandomNumber(500) < 2)
        {        
            addObject(new Virus2(), Greenfoot.getRandomNumber(200) + 200, 0);   
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
    private void prepare()
    {Point point = new Point();
        addObject(point, 520, 23);
        Flu flu = new Flu();
        addObject(flu,240,310);
        Virus2 virus2 = new Virus2();
        addObject(virus2,378,113);
        Flu flu2 = new Flu();
        addObject(flu2,243,89);
        Virus2 virus22 = new Virus2();
        addObject(virus22,362,355);
        removeObject(point);
        removeObject(virus22);
        flu.setLocation(366,341);
        virus2.setLocation(230,256);
        virus22.setLocation(311,86);
        flu.setLocation(308,209);
        flu.setLocation(382,350);
        SaveGame save = new SaveGame();
        addObject(save,553,50);
    Exit exit = new Exit();
    addObject(exit,85,53);
    exit.setLocation(67,49);
}
public void save(){
        try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("level.txt"));
                bw.write("1");
                bw.newLine();
                bw.write(Integer.toString(Score.nyawa));
                bw.newLine();
                bw.write(Integer.toString(Score.counterhero));
                bw.newLine();
                bw.close();
          } catch (Exception e) {
              System.err.println("Error: "+e.getMessage());
         }
        }}