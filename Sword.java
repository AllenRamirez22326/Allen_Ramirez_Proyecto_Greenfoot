import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class Sword extends Weapon
{
    /**
     * Act - do whatever the Sword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    private int swordTimer=0;
    private boolean counter=true;
    public Sword(){
        turn(-30);
    }
    public void act()
    {
        
        animateSword();
        
        removeSword();
    }
    public void removeSword(){
        Player player= getWorld().getObjects(Player.class).get(0);
        if (player.getCounter()==false){
            if (timer<4){
                timer++;
            }
            else if(timer==4){
                getWorld().removeObject(this);
                timer=0;
            }
            
        }
    }
    public void animateSword(){
        turn(30);
    }
    
    
}
