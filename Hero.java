import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

import java.io.*;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Move
{
    
   static String a="1";
   Exit exit=new Exit();
   int nyawa=3;
   int score=0;

    public void act() 
    {
        if(Greenfoot.mouseClicked(exit)){
           
        }
       
        text();
        checkKeyPress();
        checkBenturan();
        GameOverr();
        naikLevel();
        tambahPoin();
        
       
    }
    public void tambahPoin(){
    if(isTouching(Masker.class)){
            removeTouching(Masker.class);
            Greenfoot.playSound("Coin.wav");
            Score.counterhero+=100;
         
        }
    }
    
    public void text(){
        getWorld().showText("Score: "+Score.counterhero,80,9);
        getWorld().showText("Nyawa: "+Score.nyawa,500,9);
    }
     public void naikLevel(){
        if(Score.counterhero==500){
            
            Score.counterhero+=100;
            a="2";
            JOptionPane.showMessageDialog(null,"Lanjut Ke Level 2","Selamat", JOptionPane.INFORMATION_MESSAGE);
            save();
            Greenfoot.setWorld(new Level2());
            Score.a+=1;
            speed++;
        }
        if(Score.counterhero==1500){
            
            Score.counterhero+=100;
            a="3";
            save();
            JOptionPane.showMessageDialog(null,"Lanjut Ke Level 3","Selamat", JOptionPane.INFORMATION_MESSAGE);
            
            Greenfoot.setWorld(new Level3());
            Score.a+=2;
            speed+=2;
        }
        if(Score.counterhero==3500){
            a="4";
            save();
            Score.counterhero+=200;
            
            JOptionPane.showMessageDialog(null,"Lanjut Ke Level 4","Selamat", JOptionPane.INFORMATION_MESSAGE);
            
            Greenfoot.setWorld(new Level4());
            Score.a+=3;
            speed+=3;
            
        }
    
    }
         public void checkBenturan() 
    {
        Actor actor = getOneIntersectingObject(Flu.class);
        Actor actor1 = getOneIntersectingObject(Virus2.class);
        Actor actor2 = getOneIntersectingObject(SakitKepala.class);
        Actor actor3 = getOneIntersectingObject(Virus.class);
        Actor actor4 = getOneIntersectingObject(Influenza.class);
       
        
        if(actor != null||actor1!=null||actor2!=null||actor3!=null||actor4!=null){
           getWorld().removeObject(actor);
           getWorld().removeObject(actor1);
           getWorld().removeObject(actor2);getWorld().removeObject(actor3);
           getWorld().removeObject(actor4);
          
           
           JOptionPane.showMessageDialog(null, "Continue", "Kamu Menabrak", JOptionPane.WARNING_MESSAGE);
           Score.nyawa-=1;
           
           setLocation(305,550);
    
       }
             
        
    }
    public void GameOverr(){
    if(Score.nyawa==0){
        if(Score.counterhero>Score.point){
        Score.point=Score.counterhero;
        }
        JOptionPane.showMessageDialog(null,"Skor Kamu: "+Score.counterhero,"Game Over", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Skor Tertinggi : "+Score.point,"Informasi", JOptionPane.INFORMATION_MESSAGE);
    

       
        Greenfoot.setWorld(new GameOverr());
        

        Score.nyawa=3;
        Score.counterhero=0;
        Score.a=4;
        speed=4;
      }  
    }
    public void moveLeft() 
    {
        if(getX() <= 410 && getX() >= 215)
        {
        setLocation(getX() - 2, getY());
        }
    }
    
    public void moveRight()  
    {
        if(getX() < 400)
        {
        setLocation(getX() + 2, getY());
        }
    }
    public void moveUp()  
    {
        setLocation(getX(), getY() - 2);
    }
    public void moveDown() 
    {
        setLocation(getX(), getY() + 2);
    }
    public void checkKeyPress()
    {
        
        
        if(Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        if(Greenfoot.isKeyDown("up"))
        {
           
            moveUp();
            
        }
        if(Greenfoot.isKeyDown("down")) 
        {     
            moveDown();
        }
}
 public void save(){
        try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("level.txt"));
                bw.write(a);
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
    

