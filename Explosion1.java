import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion1 extends Actor
{
    /**
     * Act - do whatever the Explosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("Explosion1.gif");
    private int timer=0;
    public Explosion1(){
        setImage(gifImage.getCurrentImage());
        getImage().scale(70,70);
    }
    public void act()
    {
       
        setImage(gifImage.getCurrentImage());
        getImage().scale(70,70);
        if(timer<30){
            timer++;
        }
        else if(timer==30){
            removeExplosion();
            
        }
    }
    public void removeExplosion(){
        getWorld().removeObject(this);
    }
}
