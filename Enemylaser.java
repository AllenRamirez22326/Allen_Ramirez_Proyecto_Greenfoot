import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemylaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemylaser extends Enemy
{
    GifImage getImage= new GifImage("AlienLaser.gif");
    public Enemylaser(){
        
        setImage(getImage.getCurrentImage());
        getImage().scale(70,60);
    }
    public void act()
    {
        Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
        setImage(getImage.getCurrentImage());
        getImage().scale(70,60);
        moveEnemyLaser();
        turnTowards(player.getX(), player.getY());
        removeLaser();
    }
    public void moveEnemyLaser(){
        move(2);
    }
    public void removeLaser(){
        Actor hitbox= getOneIntersectingObject(Hitbox.class);
        HealthBar healthbar= getWorld().getObjects(HealthBar.class).get(0);
        if(hitbox!=null){
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
