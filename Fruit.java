import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor
{
    public final static int ON_TREE = 0;
    public final static int DROPPING = 1;
    public final static int DROPPED = 2;
    public final static int IN_INVENTORY = 3;
    public int state = ON_TREE;
    protected int bottom;
    public void act() 
    {
        if (state == DROPPING)
        {
            int y = getY() + 5;
            if (y >= bottom)
            {
                y = bottom;
                state = DROPPED;
            }
            else
            {
                setLocation (getX(), y);
            }
        }
    }    
    public void dropFruit(int bottom)
    {
        this.bottom = bottom;
        this.state = DROPPING;
    }
    public boolean isOnTree()
    {
        return state == ON_TREE;
    }
    public boolean isDropped()
    {
        return state == DROPPED;
    }
    public void setInInventoryState()
    {
        state = IN_INVENTORY;
    }
}
