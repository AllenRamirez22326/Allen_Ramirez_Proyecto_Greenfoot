import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{
    /**
     * Act - do whatever the Enemy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage getImage= new GifImage("ovnippp.gif");
    private int turnit=0;
    private int life=0;
    private int death=1;
    private int timer=0;
    Enemylaser laser= new Enemylaser();
    public Enemy3(){
        setImage(getImage.getCurrentImage());
    }
    public void act()
    {
        setImage(getImage.getCurrentImage());
        checkBorder();
        moveEnemy3();
        shootLaser();
        hitEnemy3();
    }
    public void moveEnemy3(){
        if(turnit==1){
            setLocation(getX()+((0-Greenfoot.getRandomNumber(2))*Greenfoot.getRandomNumber(7)),getY()-2);
        }
        else if(turnit==2){
            setLocation(getX()+((0-Greenfoot.getRandomNumber(2))*Greenfoot.getRandomNumber(7)),getY()+2);
        }
        else if(turnit==3){
            setLocation(getX()+(Greenfoot.getRandomNumber(5)-Greenfoot.getRandomNumber(2)),getY()+((0-Greenfoot.getRandomNumber(2))*Greenfoot.getRandomNumber(7)));
        }
        else if(turnit==4){
            setLocation(getX()-Greenfoot.getRandomNumber(5),getY()+((0-Greenfoot.getRandomNumber(2))*Greenfoot.getRandomNumber(7)));
        }
        else if(turnit==0){
            setLocation(getX()+Greenfoot.getRandomNumber(5),getY()+(Greenfoot.getRandomNumber(5)-Greenfoot.getRandomNumber(5)));
        }
    }
    public void checkBorder(){
        if(getY()==599){
            turnit=1;
        }
        else if(getY()==0){
            turnit=2;
        }
        if(getX()==0){
            turnit=3;
        }
        else if(getX()==999){
            turnit=4;
        }
        
    }
    public void hitEnemy3(){
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
            getWorld().removeObject(laser);
            getWorld().removeObject(this);
        }
    }
    public void shootLaser(){
        if (timer<150){
            timer++;
        }
        else if(timer==150){
            getWorld().addObject(laser,getX(),getY());
            timer=0;
        }
        
    }
}
