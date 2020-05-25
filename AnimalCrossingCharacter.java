import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * class AnimalCrossingCharacter: where characters inherit actions.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalCrossingCharacter extends Actor
{
    final static int DISTANCE = 4;
    final static int LEFT = 1;
    final static int RIGHT = 2;
    int walkIndex = 0;
    float walkValue = 0;
    protected GreenfootImage[] villagerRight;
    protected GreenfootImage[] villagerLeft;
    GreenfootImage imageLeft;
    GreenfootImage imageRight;
    int direction = 0;
    public AnimalCrossingCharacter()
    {
        imageLeft = new GreenfootImage("boy_standleft.PNG");
        imageRight = new GreenfootImage("boy_standright.PNG");
        imageLeft.scale(100, 140);
        imageRight.scale(100, 140);
    }
    public void act() 
    {
        
    }    
    public void checkKeys()
    {       
        if (Greenfoot.isKeyDown("left"))
        {
            setImage(villagerLeft[walkIndex]);
            walkValue += 0.25;  
            walkIndex = (int) walkValue;
            if (walkIndex >= villagerLeft.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            setLocation(getX()-DISTANCE, getY());
            direction = LEFT;
        }
        else if (Greenfoot.isKeyDown("right"))
        {            
            setImage(villagerRight[walkIndex]);
            walkValue += 0.25;  
            walkIndex = (int)walkValue;
            if (walkIndex >= villagerRight.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            setLocation(getX()+DISTANCE, getY());
            direction = RIGHT;
        }
        else
        {
            if (direction == LEFT)            
                setImage(imageLeft);
            else if (direction == RIGHT)
                setImage(imageRight);
        }
        //if (Greenfoot.isKeyDown("up"))
        //{
        //    setLocation(getX(), getY()-DISTANCE);
        //}
        //if (Greenfoot.isKeyDown("down"))
        //{
        //    setLocation(getX(), getY()+DISTANCE);
        //}
    }
}
