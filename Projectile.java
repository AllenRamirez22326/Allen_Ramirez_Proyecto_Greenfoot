import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Weapon
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("Fire.gif");
    private boolean once= true;
    private int timer=0;
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        getImage().scale(50,50);
        
        moveProjectile();
        removeProjectile();
    }
    public Projectile(){
        setImage(gifImage.getCurrentImage());
        getImage().scale(50,50);
        
    }
    public void moveProjectile(){
        Player player= getWorld().getObjects(Player.class).get(0);
        if(player.getPositionFire()==1){
            setLocation(getX()+20,getY());
        }
        else if(player.getPositionFire()==2){
            setLocation(getX()-20,getY());
        }
        else if(player.getPositionFire()==3){
            setLocation(getX(),getY()-20);
        }
        else if(player.getPositionFire()==4){
            setLocation(getX(),getY()+20);
        }
    }
    public void removeProjectile(){
        if(getY()==0 || getY()==599 || getX()==0 || getX()==999  ){
            getWorld().removeObject(this);
        }
    }
}
