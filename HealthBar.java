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
    int delaytime=0;
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
    public void addHealth(){
        health=health+1;
    }
    public void bossHit(){
        health=health-5;
    }
    public int getHealth(){
        return health;
    }
    public void endGame(){
        Player player =getWorld().getObjects(Player.class).get(0);
        GameOver gameover= new GameOver();
        Menu menu= new Menu();
        RPG rpg= new RPG();
        if (health<=0){
        //Esta parte permitía recargar el menú al momento de morir pero daba
        //muchos bajones de fps :(
            player.setImage(new GreenfootImage (30,50));
            player.setDeath(true);
            getWorld().addObject(gameover,500,300);
        /*   if (delaytime==50){
            menu.createButtons(rpg);
        
            Greenfoot.setWorld(menu);
            delaytime=0;
        }else if(delaytime<50){
            delaytime++;
        }*/
        }
    }
}
