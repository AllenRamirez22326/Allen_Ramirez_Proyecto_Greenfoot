import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World link;
    public Button(String image, World link){
        setImage(new GreenfootImage(image));
        this.link=link;
        getImage().scale(200,100);
    }
    public void act()
    {
        getImage().scale(200,100);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
    }
}
