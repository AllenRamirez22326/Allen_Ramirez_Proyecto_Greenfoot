import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean curar= false;
    private int timer=0;
    public void act()
    {
        movePlayer2();
        if (timer==10){
            curacion();
            timer=0;
        }
        else if(timer<10){
            timer++;
        }
    }
    public void movePlayer2(){
        if (Greenfoot.isKeyDown("8")){
            setLocation(getX(),getY()-1);
            curar=true;
        }
        if (Greenfoot.isKeyDown("5")){
            setLocation(getX(),getY()+1);
            curar=true;
        }
        if (Greenfoot.isKeyDown("6")){
            setLocation(getX()+1,getY());
            curar=true;
        }
        if (Greenfoot.isKeyDown("4")){
            setLocation(getX()-1,getY());
            curar=true;
        }
        else if (!Greenfoot.isKeyDown("8") && !Greenfoot.isKeyDown("5") && !Greenfoot.isKeyDown("6") && Greenfoot.isKeyDown("4") ){
            curar= false;
        }
    }
    public void curacion(){
        Actor player= getOneIntersectingObject(Player.class);
        HealthBar health= getWorld().getObjects(HealthBar.class).get(0);
        if(player!= null && curar==true && health.getHealth()<=50){
            health.addHealth();
        }
    }
}
