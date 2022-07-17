import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Round here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Round extends Actor
{
    /**
     * Act - do whatever the Round wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int round= 1;
    public Round(){
        setImage(new GreenfootImage("Round:"+round,50, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Round: "+round, 50, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public void addRound(){
        round++;
    }
    public int getRound(){
        return round;
    }
}
