import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    
   public void act() 
    {
      if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new Level1());
    }    
}}
