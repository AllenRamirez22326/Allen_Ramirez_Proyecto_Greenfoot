import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private Button playButton;
    Instructions ins= new Instructions();
    Logo logo= new Logo();
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(logo, 500,200);
        addObject(ins,500,550);
    }
    public void createButtons(World play){
        playButton = new Button("Playboton.png",play);
        addObject(playButton, 500, 450);
        
    }
}
