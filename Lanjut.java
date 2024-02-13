import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Lanjut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lanjut extends Button
{
    /**
     * Act - do whatever the Lanjut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
       load();
        }
    }    
     public void load(){
        String l = "0";
        int n = 0;
        int s = 0;
        String data[] = new String[3];
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("level.txt");
            BufferedReader baca = new BufferedReader(new InputStreamReader(is));
            String baris;
            
            int i = 0;
            while((baris=baca.readLine())!=null){
                data[i] = baris;
                i++;
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error di"+e);
        }
        
        l = data[0];
        n = Integer.parseInt(data[1]);
        s = Integer.parseInt(data[2]);
        if(l.equals("1")){
            Greenfoot.setWorld(new Level1());
        }else if(l.equals("2")){
             
             Score.counterhero = s;
             Score.nyawa = n;
             Greenfoot.setWorld(new Level2());
        }else if(l.equals("3")){
            
             Score.counterhero = s;
             Score.nyawa = n;
             Greenfoot.setWorld(new Level3());
        }else if(l.equals("4")){
            Level4 lvl = new Level4();
             Score.counterhero = s;
             Score.nyawa = n;
             Greenfoot.setWorld(new Level4());
        }}
}
