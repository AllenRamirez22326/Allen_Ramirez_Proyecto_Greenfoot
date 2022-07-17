import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossFire extends BossAttack
{
    /**
     * Act - do whatever the BossFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage getImage= new GifImage("BossFire.gif");
    public int x;
    public int y= Greenfoot.getRandomNumber(600);
    public int speed=3;
    
    public BossFire(){
        getImage().scale(50,50);
        setImage(getImage.getCurrentImage());
    }
    public void act()
    {
        getImage().scale(50,50);
        setImage(getImage.getCurrentImage());
        moveFire();
        hitPlayer();
        
        
    }
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
    public void moveFire(){
        turnTowards(x,y);
        move(speed);
        
    }
    
    public void hitPlayer(){
        Actor hitbox= getOneIntersectingObject(Hitbox.class);
        Player player= getWorld().getObjects(Player.class).get(0);
        Kingghas kingghas= getWorld().getObjects(Kingghas.class).get(0);
        HealthBar healthbar= getWorld().getObjects(HealthBar.class).get(0);
        if (hitbox!=null && kingghas.getPositionKing()==890){
            player.move(-200);
            healthbar.bossHit();
            getWorld().removeObject(this);
        }
        else if (hitbox!=null && kingghas.getPositionKing()==90){
            player.move(200);
            healthbar.bossHit();
            getWorld().removeObject(this);
        }
        else if(getX()==0 || getX()==999 || getY()==0 || getY()==599){
            getWorld().removeObject(this);
        }
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
}
