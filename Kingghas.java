import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingghas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kingghas extends Boss
{
    /**
     * Act - do whatever the Kingghas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life=0;
    private int death=0;
    private int delay=0;
    GifImage getImage= new GifImage("KingghasR.gif");
    GifImage oneImageL= new GifImage("KingghasL2.gif");
    BossFire bossfire1= new BossFire();
    BossFire bossfire2= new BossFire();
    BossFire bossfire3= new BossFire();
    BossFire bossfire4= new BossFire();
    BossFire bossfire5= new BossFire();
    BossFire bossfire6= new BossFire();
    BossFire bossfire7= new BossFire();
    BossFire bossfire8= new BossFire();
    BossFire bossfire9= new BossFire();
    BossFire bossfire10= new BossFire();
    BossFire bossfire11= new BossFire();
    BossFire bossfire12= new BossFire();
    BossFire bossfire13= new BossFire();
    BossFire bossfire14= new BossFire();
    public Kingghas(){
        getImage().scale(150,150);
        
    }
    public void act()
    {
        setImage(getImage.getCurrentImage());
        getImage().scale(150,150);
        moveBoss();
        hitBoss();
    }
    public void moveBoss(){
        if (getY()!=300){
            setLocation(getX(),getY()+20);
        }
    }
    public void hitBoss(){
        Actor sword= getOneIntersectingObject(Sword.class);
        Player player= getWorld().getObjects(Player.class).get(0);
        Round round= getWorld().getObjects(Round.class).get(0);
        Score score= getWorld().getObjects(Score.class).get(0);
        World world= getWorld();
        RPG rPg= (RPG)world;
        if(delay<40){
            delay++;
        }
        else if(delay==40){
            delay=40;
        }
        if (sword!=null && getX()==90 & delay==40){
            life=1;
            death++;
            getWorld().removeObjects(getWorld().getObjects(BossFire.class));
        }
        else if (sword!=null && getX()==890){
            life=2;
            death++;
            getWorld().removeObjects(getWorld().getObjects(BossFire.class));
        }
        if(life==1 && getX()!=890){
            player.setLocation(player.getX()-20,player.getY());
            setLocation(getX()+20,getY());
        }
        else if (life==2 && getX()!=90){
            player.setLocation(player.getX()+20,player.getY());
            setLocation(getX()-20,getY());
        }
        if(getX()==890){
            
            bossfire1.setx(0);
            //bossfire1.sety(0);
            bossfire2.setx(0);
            //bossfire2.sety(120);
            bossfire3.setx(-1000);
            //bossfire3.sety(Greenfoot.getRandomNumber(500));
            bossfire4.setx(0);
            //bossfire4.sety(Greenfoot.getRandomNumber(300));
            bossfire5.setx(0);
            //bossfire5.sety(590);
            bossfire6.setx(0);
            //bossfire6.sety(Greenfoot.getRandomNumber(600));
            bossfire7.setx(0);
            //bossfire7.sety(327);
            bossfire8.setx(0);
            //bossfire8.sety(510);
            bossfire9.setx(500);
            bossfire9.sety(599);
            bossfire9.setSpeed(6);
            bossfire10.setx(500);
            bossfire10.sety(0);
            bossfire10.setSpeed(6);
            bossfire11.setx(300);
            bossfire11.sety(0);
            bossfire11.setSpeed(5);
            bossfire12.setx(300);
            bossfire12.sety(599);
            bossfire12.setSpeed(5);
            bossfire13.setx(0);
            bossfire13.sety(500);
            bossfire13.setSpeed(7);
            bossfire14.setx(0);
            bossfire14.sety(100);
            bossfire14.setSpeed(7);
            getWorld().addObject(bossfire1,getX(),getY());
            getWorld().addObject(bossfire2,getX(),getY());
            getWorld().addObject(bossfire3,getX(),getY());
            getWorld().addObject(bossfire4,getX(),getY());
            getWorld().addObject(bossfire5,getX(),getY());
            getWorld().addObject(bossfire6,getX(),getY());
            getWorld().addObject(bossfire7,getX(),getY());
            getWorld().addObject(bossfire8,getX(),getY());
            getWorld().addObject(bossfire9,getX(),getY());
            getWorld().addObject(bossfire10,getX(),getY());
            getWorld().addObject(bossfire11,getX(),getY());
            getWorld().addObject(bossfire12,getX(),getY());
            getWorld().addObject(bossfire13,getX(),getY());
            getWorld().addObject(bossfire14,getX(),getY());
            setImage(oneImageL.getCurrentImage());
        }
        else if(getX()==90 && getY()==300){
            
            bossfire1.setx(1000);
            //bossfire1.sety(0);
            bossfire2.setx(1000);
            //bossfire2.sety(120);
            bossfire3.setx(1000);
            //bossfire3.sety(Greenfoot.getRandomNumber(500));
            bossfire4.setx(1000);
            //bossfire4.sety(Greenfoot.getRandomNumber(300));
            bossfire5.setx(1000);
            //bossfire5.sety(590);
            bossfire6.setx(1000);
            //bossfire6.sety(Greenfoot.getRandomNumber(600));
            bossfire7.setx(1000);
            //bossfire7.sety(327);
            bossfire8.setx(1000);
            //bossfire8.sety(510);
            bossfire9.setx(500);
            bossfire9.sety(599);
            bossfire9.setSpeed(6);
            bossfire10.setx(600);
            bossfire10.sety(0);
            bossfire10.setSpeed(6);
            bossfire11.setx(800);
            bossfire11.sety(0);
            bossfire11.setSpeed(5);
            bossfire12.setx(600);
            bossfire12.sety(599);
            bossfire12.setSpeed(5);
            bossfire13.setx(1000);
            bossfire13.sety(500);
            bossfire13.setSpeed(7);
            bossfire14.setx(1000);
            bossfire14.sety(100);
            bossfire14.setSpeed(7);
            getWorld().addObject(bossfire1,getX(),getY());
            getWorld().addObject(bossfire2,getX(),getY());
            getWorld().addObject(bossfire3,getX(),getY());
            getWorld().addObject(bossfire4,getX(),getY());
            getWorld().addObject(bossfire5,getX(),getY());
            getWorld().addObject(bossfire6,getX(),getY());
            getWorld().addObject(bossfire7,getX(),getY());
            getWorld().addObject(bossfire8,getX(),getY());
            getWorld().addObject(bossfire9,getX(),getY());
            getWorld().addObject(bossfire10,getX(),getY());
            getWorld().addObject(bossfire11,getX(),getY());
            getWorld().addObject(bossfire12,getX(),getY());
            getWorld().addObject(bossfire13,getX(),getY());
            getWorld().addObject(bossfire14,getX(),getY());
        }
        if (death==6){
            round.addRound();
            score.killBoss();
            rPg.setMulti(3);
            getWorld().removeObject(this);
        }
    }
    public int getPositionKing(){
        return getX();
    }
    
}
