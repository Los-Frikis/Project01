import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class generates this game's actionfield.
 * 
 * Authors: Jerick Castro Ortiz (@J3r1ckSB), Simón Andrés Álvarez González (@Simonalgo), Santiago Barrera Salamanca (@Sanbarrera9090) 
 * Version: 1.0.0 - 02/04/2021
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepareScenario();
    }
    private void prepareScenario()
    {
        addObject(new Robot(), 48,50);
        
        addObject(new Wall(), 52,147);
        addObject(new Wall(), 159,147);
        addObject(new Wall(), 266,147);
        addObject(new Wall(), 587,147);
        addObject(new Wall(), 692, 147);
        addObject(new Wall(), 791, 147);
        
        addObject(new Block(), 427, 145);
        
        addObject(new Home(), 751, 552);
        
        addObject(new ScorePanel(), 71, 554);
        
        addObject(new Apple(), 720, 46);
        addObject(new Apple(), 433, 38);
        addObject(new Apple(), 183, 302);
        addObject(new Apple(), 682, 312);
        addObject(new Apple(), 417, 537);
    }
}
