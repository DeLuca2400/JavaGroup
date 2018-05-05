import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    private GreenfootImage defaultView = new GreenfootImage("plane.png");
    private GreenfootImage rightTurn = new GreenfootImage("plane turn right.png");
    private GreenfootImage leftTurn = new GreenfootImage("plane turn left.png");
    
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeypress();
        popBalloon();
    } 
    
     public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setImage(leftTurn);
            move(-10);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setImage(rightTurn);
            move(10);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setImage(defaultView);
            setLocation(getX(), getY() - 10);      
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setImage(defaultView);
            setLocation(getX(), getY() + 10);
        }
    }
    
    public void popBalloon()
    {
        if (isTouching(redBalloon.class))
        {
            removeTouching(redBalloon.class);
        }
        
        if ( isTouching(yellowBalloon.class))
        {
            removeTouching(yellowBalloon.class);
        }
    }
}
