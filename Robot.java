import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
  /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      comer();
      morirpared();
      morirbloque();
      completado();
        int y=getY();
      
      if(Greenfoot.isKeyDown("right"))
      move(2);
      if(Greenfoot.isKeyDown("left"))
      move(-2); 
        if(Greenfoot.isKeyDown("up"))
           y--;
           if(Greenfoot.isKeyDown("down"))
           y++; 
        setLocation(getX(),y);
    }
  public void comer(){
        Actor Apple;
        Apple = getOneObjectAtOffset(0,0, Apple.class);
        if (Apple != null){
            World mundo;
            mundo = getWorld();
            mundo.removeObject(Apple);
            Greenfoot.playSound("eat.wav");
        }
    }
  public void morirpared(){
        if (isTouching(Wall.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
  public void morirbloque(){
        if (isTouching(Block.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
  public void completado(){
        if (isTouching(Home.class)){
            setLocation(48,50);
            Greenfoot.playSound("missionpassed.wav");
        }
    }
}



