import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ledakan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ledakan2 extends Actor
{
    /**
     * Act - do whatever the Ledakan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int jeda=10;
    public void act() 
    {
        if(jeda>0)jeda--;
        else getWorld().removeObject(this);// Add your action code here.
    }    
}
