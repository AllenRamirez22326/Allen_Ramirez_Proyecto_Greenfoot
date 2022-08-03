import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img= new GreenfootImage("Player1: WASD|| Player2:8456 " , 30, Color.RED, new Color(0, 0, 0, 0));
    public void act()
    {
        setImage(img);
    }
    public Instructions(){
        setImage(img);
    }
}
