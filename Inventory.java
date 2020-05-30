import greenfoot.*;
import java.util.*;
/**
 * Player's inventory
 * 
 * @Kat Nguyen 
 * @5/29/2020
 */
public class Inventory extends Actor
{    
    public static boolean inventoryShowing = false;
    //arraylist that will hold the items the player collects
    public ArrayList <Actor> inventoryObjects = new ArrayList <Actor>();
    private static final int INVENTORY_SIZE = 12;
    public void act() 
    {
        checkInv();
    }
    // returns true if the inventory is full
    public static boolean addToInventory(Actor x)
    {
        if (Global.collectedObjects.size() < INVENTORY_SIZE)
        {
            Global.collectedObjects.add(x);
            return false;
        }
        return true;
    }
    public static void displayInventoryFull(World world)
    {
        if (InventoryFullDialogue.hasDisplayed() == false)
        {            
            world.addObject(new InventoryFullDialogue(), world.getWidth() / 2, world.getHeight() / 2);
        }
    }
    public void addedToWorld(World World)
    {
        getImage().setTransparency(0);
        getImage().scale(495,429);
    }
    public void toggleInventory()
    {
        if(!inventoryShowing)
        {
            getImage().setTransparency(255);
            for (int i = 0; i < Global.collectedObjects.size(); i++)
            {
                Actor item = Global.collectedObjects.get(i);
                GreenfootImage itemImage = new GreenfootImage(item.getImage());
                itemImage.scale(58, 60);
                item.setImage(itemImage);
                int xItem = 0;
                int y = 0;
                if (i < 5)
                {
                    xItem = 185 + i * 94;
                    y = 229;
                }
                else if (i < 10)
                {
                    int j = i % 5;
                    xItem = 185 + j * 94;
                    y = 350;
                }
                else if (i == 10)
                {
                    xItem = 185;
                    y = 471;
                }               
                else // if i = 11
                {
                    xItem = 561;
                    y = 471;
                }
                getWorld().addObject(item, xItem, y);
                inventoryObjects.add(item);
            }
            inventoryShowing = true;
        }
        else
        { //remove inventory
            getImage().setTransparency(0);
            getWorld().removeObjects(inventoryObjects);
            inventoryShowing = false;
        }
    }
    //public void useInv(Actor a)
    {
        //getWorld().removeObject(a);
        //if (Greenfoot.mouseClicked(this))
        {
            //MouseInfo mouse = Greenfoot.getMouseInfo();
            //int index = mouse.getX()/ 70 -4;
            //getWorld().removeObject(reference.collectedObjects.remove(index));
            //System.out.println("removeksldjfha");
        }
    }
    public void checkInv()
    {
        if (Greenfoot.isKeyDown("i") )
        {
            toggleInventory();
            Greenfoot.delay(10);
        }
    }
    public void goAway()
    {
        getImage().setTransparency(0);
        getWorld().removeObjects(inventoryObjects);
        inventoryShowing = false;
    }    
    public void remove (Actor a)
    {
        Global.collectedObjects.remove(a);
    }        
}