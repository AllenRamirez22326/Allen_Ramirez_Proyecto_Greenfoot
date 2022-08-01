import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealtBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealtBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health=50;
    int healthBarW=100;
    int healthBarH= 20;
    int pixelsPerHealthPoint= (int)healthBarW/health;  
    public HealthBar(){
        update();
    }
    public void act()
    {
        update();
        endGame();
    }
    public void update(){
        setImage(new GreenfootImage(healthBarW+2,healthBarH+2));
        GreenfootImage myImage= getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarW+1, healthBarH+1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint, healthBarH);
        
    }
    public void loseHealth(){
        health=health-3;
    }
    public void bossHit(){
        health=health-5;
    }
    public void endGame(){
        Player player =getWorld().getObjects(Player.class).get(0);
        if (health<=0){
            getWorld().removeObject(player);
                   
        }
    }
}
