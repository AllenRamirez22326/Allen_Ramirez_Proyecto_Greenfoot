import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mana extends Actor
{
    /**
     * Act - do whatever the Mana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mana=50;
    int manaBarW=100;
    int manaBarH= 20;
    int pixelsPerManaPoint= (int)manaBarW/mana; 
    private int manarechargep=5;
    public Mana(){
        update();
    }
    public void act()
    {
        update();
    }
    public void update(){
        setImage(new GreenfootImage(manaBarW+2,manaBarH+2));
        GreenfootImage myImage= getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, manaBarW+1, manaBarH+1);
        myImage.setColor(Color.BLUE);
        myImage.fillRect(1,1,mana*pixelsPerManaPoint, manaBarH);
        
    }
    public void loseMana(){
        mana=mana-2;
    }
    public int getMana(){
        return mana;
    }
    public void addMana(){
        mana=mana+manarechargep;
    }
}
