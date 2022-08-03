import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image= new GreenfootImage("logo.png");
    
    public Logo(){
        setImage(image);
        getImage().scale(500,400);
    }
    public void act()
    {
        getImage().scale(500,400);
    }
}
