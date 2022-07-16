import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("BlueKnightStand.gif");
    GifImage gifImageR= new GifImage("BlueKnightRight.gif");
    GifImage gifImageU= new GifImage("BlueKnightUp.gif");
    GifImage gifImageL= new GifImage("BlueKnightLeft.gif");
    GifImage gifImageD= new GifImage("BlueKnightDown.gif");
    GreenfootImage pngImageU= new GreenfootImage("SwordguU.png");
    GreenfootImage pngImageD= new GreenfootImage("SwordguD.png");
    public boolean counter= true;
    public int horizontal= 0;
    private int inicial=0;
    private int time=0;
    private int timeFire=25;
    private boolean switchFire=true;
    public int positionFire=0;
    public boolean cool=false;
    public boolean dashS=true;
    public Player(){
        
        setImage(gifImage.getCurrentImage());
        getImage().scale(80,80);
        //pngImageU.scale(50,50);
        
    }
    public void act()
    {
        pngImageU.scale(100,100);
        pngImageD.scale(100,100);
        if (horizontal==0){
            setImage(gifImage.getCurrentImage());
        }
        else if(horizontal==1){
            setImage(gifImageR.getCurrentImage());
        }
        else if(horizontal==2){
            setImage(gifImageL.getCurrentImage());
        }
        else if(horizontal==3){
            setImage(gifImageU.getCurrentImage());
        }
        else if(horizontal==4){
            setImage(gifImageD.getCurrentImage());
        }
        getImage().scale(80,80);
        movePlayer();
        dash();
        if(time<5){
            time++;
        }else if(time==5){
            sword();
            time=0;
        }
       

        
    }
    public void movePlayer(){
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-2);
            horizontal=3;
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+2);
            horizontal=4;
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+2,getY());
            horizontal=1;
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-2,getY());
            horizontal=2;
        }
    }
    public void sword(){
        if (horizontal==1){
            if (Greenfoot.isKeyDown("space") && counter==true){
            getWorld().addObject(new Sword(),getX()+50,getY());
            counter=false;
        }
        else if (!Greenfoot.isKeyDown("space" )){
            counter=true;
        }
        }
        else if (horizontal==2){
            if (Greenfoot.isKeyDown("space") && counter==true){
            getWorld().addObject(new Sword(),getX()-50,getY());
            getWorld().getObjects(Sword.class).get(0).setImage(new GreenfootImage("swordguR.png"));
            counter=false;
        }
        else if (!Greenfoot.isKeyDown("space" )){
            counter=true;
        }
        }
        else if (horizontal==3){
            if (Greenfoot.isKeyDown("space") && counter==true){
            getWorld().addObject(new Sword(),getX(),getY()-50);
            getWorld().getObjects(Sword.class).get(0).setImage(new GreenfootImage(pngImageU));
            counter=false;
        }
        else if (!Greenfoot.isKeyDown("space" )){
            counter=true;
        }
        }
        else if (horizontal==4){
            if (Greenfoot.isKeyDown("space") && counter==true){
            getWorld().addObject(new Sword(),getX(),getY()+50);
            getWorld().getObjects(Sword.class).get(0).setImage(new GreenfootImage(pngImageD));
            counter=false;
        }
        else if (!Greenfoot.isKeyDown("space" )){
            counter=true;
        }
        }
    }
    public void shootFire(){
        
    }
    public boolean getCounter(){
        return counter;
    }
    public int getHorizontal(){
        return horizontal;
    }
    public int getPositionFire(){
        return positionFire;
    }
    public void dash(){
        if (Greenfoot.isKeyDown("o") && dashS==true && horizontal==1){
            setLocation(getX()+70,getY());
            dashS=false;
        }
        if (Greenfoot.isKeyDown("o") && dashS==true && horizontal==2){
            setLocation(getX()-70,getY());
            dashS=false;
        }
        if (Greenfoot.isKeyDown("o") && dashS==true && horizontal==3){
            setLocation(getX(),getY()-70);
            dashS=false;
        }
        if (Greenfoot.isKeyDown("o") && dashS==true && horizontal==4){
            setLocation(getX(),getY()+70);
            dashS=false;
        }
        else if (!Greenfoot.isKeyDown("o" ) && dashS==false){
            dashS=true;
        }
    }
}
