    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MyWorld here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Latar extends World
    {
        private int jeda=0;
        private int score;
        private int nyawa = 3;
        private int time;
        /**
         * Constructor for objects of class MyWorld.
         * 
         */
        public Latar()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(500, 600, 1); 
            tampilnyawa();
            tampilscore();
            showTime();
            time= 1000;
            addObject (new Player(),250,520);
        }
        public void updatenyawa(int point)
        {
            nyawa = nyawa + point;
            tampilnyawa();
            showText("HP :" +nyawa, 400, 5);
            if(nyawa ==0)
            {
                Greenfoot.stop();
                addObject(new Kalah(),250,300);
            }
        }
        public void tampilnyawa()
        {
            showText("HP :"+nyawa, 400, 25);
        }
        public void addScore (int points)
        {
            score = score + points;
            tampilscore();
        }
        public void tampilscore()
        {
            showText ("Score :"+score, 100, 25);
        }
        private void countTime()
        {
            time--;
            showTime();
            if (time == 0)
            {
                Greenfoot.stop();
                addObject(new Menang(),250,300);
            }
        }
        private void showTime()
        {
            showText("Time :"+time,250,25);
        }
        public void act()
        {
            if (Greenfoot.getRandomNumber (100) < 1)
            {
                addObject(new Musuh(), Greenfoot.getRandomNumber(550), 500);
            }
            countTime();
        }
    }

