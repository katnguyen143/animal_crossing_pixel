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
    // direction values
    final static int LEFT = 1;
    final static int RIGHT = 2;
    // status values
    final static int RIGHT_SCREEN = 1;
    int walkIndex = 0;
    float walkValue = 0;
    protected GreenfootImage[] villagerRight;
    protected GreenfootImage[] villagerLeft;
    protected GreenfootImage imageLeft;
    protected GreenfootImage imageRight;
    int direction = 0;
    int status = 0;
    
    public AnimalCrossingCharacter()
    {
        
    }
    public void act() 
    {
        
    }    
    public int checkKeys()
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
            int newX = getX()+DISTANCE;
            setLocation(newX, getY());
            if (newX >= 749)
            {
                status = RIGHT_SCREEN;
            }
            System.out.println(getX());
            direction = RIGHT;
            
        }
        else
        {
            if (direction == LEFT)            
                setImage(imageLeft);
            else if (direction == RIGHT)
                setImage(imageRight);
        }
        return status;
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
