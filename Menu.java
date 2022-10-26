import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        if(this.getClass().getName().equalsIgnoreCase("MenuUtama"))
        {
            TombolBantuan bantuan = new TombolBantuan();
            addObject(bantuan,440,560);
            TombolMulai mulai = new TombolMulai();
            addObject(mulai, 250,430);
            Level1 level1 = new Level1();
            addObject(level1, 125,500);
            Level2 level2 = new Level2();
            addObject(level2, 250,500);
            Level3 level3 = new Level3();
            addObject(level3, 375,500);
            Greenfoot.playSound("backsound.wav");

        }
        else
        {
            addObject (new TombolKembali(),61,61);
        }
        
    }
}
