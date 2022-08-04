import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Actor
{
    GifImage gifImage = new GifImage("ExplosionPurple.gif");
    private int timer=0;
    public Explosion2(){
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
