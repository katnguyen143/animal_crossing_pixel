import greenfoot.*;
import java.util.*;
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
    final static int UP = 3;
    final static int DOWN = 4;
    // status values
    final static int RIGHT_SCREEN = 1;
    int walkIndex = 0;
    float walkValue = 0;
    protected GreenfootImage[] villagerRight;
    protected GreenfootImage[] villagerLeft;
    protected GreenfootImage[] villagerUp;
    protected GreenfootImage[] villagerDown;
    protected GreenfootImage imageLeft;
    protected GreenfootImage imageRight;
    protected GreenfootImage imageUp;
    protected GreenfootImage imageDown;
    int direction = 0;
    int status = 0;
    // inventory
    public boolean inventoryShowing = false;
    public List<Actor> inventoryObjects = new ArrayList(0);
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
            if (walkIndex >= villagerLeft.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            setImage(villagerLeft[walkIndex]);
            walkValue += 0.25;  
            walkIndex = (int) walkValue;
            
            setLocation(getX()-DISTANCE, getY());
            direction = LEFT;
        }
        else if (Greenfoot.isKeyDown("right"))
        {            
            if (walkIndex >= villagerRight.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            setImage(villagerRight[walkIndex]);
            walkValue += 0.25;  
            walkIndex = (int)walkValue;
            
            int newX = getX()+DISTANCE;
            setLocation(newX, getY());
            if (newX >= 749)
            {
                status = RIGHT_SCREEN;
            }
            //System.out.println(getX());
            direction = RIGHT;           
        }
        else if (Greenfoot.isKeyDown("up"))
        {
            if (walkIndex >= villagerUp.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            System.out.println("Up: " + walkIndex);
            setImage(villagerUp[walkIndex]);
            
            walkValue += 0.33;  
            walkIndex = (int) walkValue;
            
            setLocation(getX(), getY()-DISTANCE);
            direction = UP;           
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            if (walkIndex >= villagerDown.length)
            {
                walkValue = 0; 
                walkIndex = 0;
            }
            setImage(villagerDown[walkIndex]);
            walkValue += 0.15;  
            walkIndex = (int) walkValue;
            
            setLocation(getX(), getY()+DISTANCE);
            direction = DOWN;           
        }
        else if (Greenfoot.isKeyDown("i"))
        {
            showInventory();
        }
        else
        {
            System.out.println(direction);
            if (direction == LEFT)            
                setImage(imageLeft);
            else if (direction == RIGHT)
                setImage(imageRight);
            else if (direction == UP)
                setImage(imageUp);
            else if (direction == DOWN)
                setImage(imageDown);
        }
        return status;        
    }
    public void showInventory()
    {
        if(!inventoryShowing)
        {
            Actor background = new Actor() {};
            GreenfootImage image = new GreenfootImage(500, 400);
            image.setColor(new Color(100, 0, 0));
            image.fill();
            background.setImage(image);
            getWorld().addObject(background, getWorld().getWidth()/2, getWorld().getHeight()/2);
            inventoryObjects.add(background);
            inventoryShowing = true;
        } 
        else
        {
            getWorld().removeObjects(inventoryObjects);
            inventoryShowing = false;
            inventoryObjects = new ArrayList(0);
        }
    }        
                
}
