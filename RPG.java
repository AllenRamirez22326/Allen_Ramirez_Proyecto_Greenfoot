import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RPG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPG extends World
{

    /**
     * Constructor for objects of class RPG.
     * 
     */
    HealthBar healthbar= new HealthBar();
    Hitbox hitbox= new Hitbox();
    Score counter= new Score();
    public RPG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        
    }
    public Score getCounter(){
        return counter;
    }
    public void act(){
        addEnemy1();
        addEnemy2();
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void addEnemy1(){
        if (Greenfoot.getRandomNumber(87)<1){
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
    }
    }
    public void addEnemy2(){
        if (Greenfoot.getRandomNumber(150)<1){
        addObject(new Enemy2(), Greenfoot.getRandomNumber(600),0+999*Greenfoot.getRandomNumber(2));
    }
    }
    
    private void prepare()
    {
        Player player = new Player();
        addObject(player,296,215);
        player.setLocation(488,307);
        addObject(healthbar, 60,20);
        addObject(hitbox,488,307);
        addObject(counter,90,560);
    }
    
}
