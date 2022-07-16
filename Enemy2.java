import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GifImage gifImage = new GifImage("gasright.gif");
    private int timer=0;
    private int compare=25;
    private int life=0;
    private int death=1;
    private int backTimer=0;
    public void act()
    {
        Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
        setImage(gifImage.getCurrentImage());
        getImage().scale(70,70);
        moveEnemy1();
        turnTowards(player.getX(), player.getY());
        if(timer<compare){
            timer++;
        }
        else if(timer==compare){
            touchPlayer();
            timer=0;
            
        }
        
        hitEnemy1();
    }   
    public void hitEnemy1(){
        Actor sword= getOneIntersectingObject(Sword.class);
        World world= getWorld();
        RPG rPg= (RPG)world;
        Score counter = rPg.getCounter();
        if (sword!=null && life!=death){
            life++;
            
            
        }
        else if(life==death && sword!=null){
            getWorld().addObject(new Explosion2(),getX(),getY());
            counter.addScore();
            getWorld().removeObject(this);
        }
    }
    public void moveEnemy1(){
        //setLocation(getX(),getY()+4);
        move(9);
    }
    public void touchPlayer(){
        
        Actor player= getOneIntersectingObject(Hitbox.class);
        World world= getWorld();
        RPG rPg= (RPG)world;
        if (player!=null){
            HealthBar healthbar = rPg.getHealthBar();
            healthbar.loseHealth();
            
        } 
    }
}
