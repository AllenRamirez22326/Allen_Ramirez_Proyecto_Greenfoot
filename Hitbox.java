import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hitbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hitbox extends Actor
{
    /**
     * Act - do whatever the Hitbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hitbox(){
        GreenfootImage image = new  GreenfootImage(30, 50);
        //image.setColor(Color.RED);
        
        setImage(image);
    }
    public void act()
    {
        Player player= getWorld().getObjects(Player.class).get(0);
        setLocation(player.getX(),player.getY());
    }
}
