import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int tahan=50;
    private int jeda=0;
    
    public void gerak()
    {
        setLocation(getX(),getY()+1);
        if(getY()>400){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(50));
        }
    }
    
    public void act() 
    {
        gerak();
        if(tahan==0){
            tahan=50;
        }
        if(jeda>0)jeda--;
        if(jeda==2)getWorld().addObject(new LaserMusuh(),getX(),getY()+50);
        if(jeda==0)jeda=120;//
    }    
}
