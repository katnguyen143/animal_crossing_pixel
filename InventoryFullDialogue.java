import greenfoot.*;
/**
 * Write a description of class InventoryFullDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryFullDialogue extends Actor
{    
    static boolean displayed = false;
    public InventoryFullDialogue()
    {
        // when adding message to world
        GreenfootImage fullInv = new GreenfootImage("inv_full.PNG");
        fullInv.scale(250, 100);
        setImage(fullInv);        
    }
    public void addedToWorld(World world)
    {
        displayed = true;
    }
    public void act() 
    {        
        if (Greenfoot.mouseClicked(this))
        {   
            displayed = false;
            getWorld().removeObject(this);           
        }
    }  
    public static boolean hasDisplayed()
    {
        return displayed == true;
    }
}
