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
    Round round= new Round();
    Mana mana= new Mana();
    int enemy2appearence=150;
    public int multiplierround=1;
    boolean bossapp=true;
    public int kinground=2;
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
        
        addKingghas();
        addRound();
        
    }
    
    public HealthBar getHealthBar(){
        return healthbar;
    }
    public Round getRound(){
        return round;
    }
    public void addRound(){
        int core= getObjects(Score.class).get(0).getScore();
        
        if (core>=multiplierround*10){
            round.addRound();
            counter.addScore();
            
            multiplierround++;
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void addEnemy1(){
        
        if (Greenfoot.getRandomNumber(87)<1 && round.getRound()!=kinground){
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
    }
    }
    public void addEnemy2(){
        if (Greenfoot.getRandomNumber(enemy2appearence)<1 && round.getRound()!=kinground) {
        addObject(new Enemy2(), Greenfoot.getRandomNumber(600),0+999*Greenfoot.getRandomNumber(2));

    }
    
    }
    public void addKingghas(){
        Player player1= getObjects(Player.class).get(0);
        if (round.getRound()==kinground && bossapp==true){
            addObject(new Kingghas(),90, 0);
            
            
            bossapp=false;
        }
    }
    public Mana getMana(){
        return mana;
    }
    public int getMulti(){
        return multiplierround;
    }
    public void setMulti(int multiplierround){
        this.multiplierround=multiplierround;
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player,296,215);
        player.setLocation(488,307);
        addObject(healthbar, 60,20);
        addObject(hitbox,488,307);
        addObject(counter,90,560);
        addObject(round, 90,510);
        addObject(mana, 60,50);
    }
    
}
