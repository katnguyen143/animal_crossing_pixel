import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flower 
 * 
 * @author Kat Nguyen 
 * @version 5/29/2020
 */
public class Flower extends Actor
{
    public int state = 0;
    public static final int IN_INVENTORY = 1;
    public void setInInventoryState()
    {
        state = IN_INVENTORY;
    }
    public boolean isInInventory()
    {
        return state == IN_INVENTORY;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
