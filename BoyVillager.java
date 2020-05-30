import greenfoot.*;
/**
 * Villager Actions
 * 
 * Kat Nguyen
 * 5/29/2020
 */
public class BoyVillager extends AnimalCrossingCharacter
{
    final static int DISTANCE = 4;      
    final static int START = 0;
    public BoyVillager()
    {
         villagerRight = new GreenfootImage[4];
         villagerLeft = new GreenfootImage[4]; 
         villagerUp = new GreenfootImage[3];
         villagerDown = new GreenfootImage[3];
         
         imageLeft = new GreenfootImage("boy_standleft.PNG");
         imageRight = new GreenfootImage("boy_standright.PNG");
         imageUp = new GreenfootImage("boy_up1.PNG");
         imageDown = new GreenfootImage("boy_down1.PNG");
         
         imageLeft.scale(75, 140);
         imageRight.scale(75, 140);
         imageUp.scale(85, 140);
         imageDown.scale(85, 140);
         
         GreenfootImage image = null;
         setImage(imageRight);          
         for(int i = 0; i < villagerRight.length; i++)
         {
             image = new GreenfootImage("boy_walkright" + i + ".PNG"); 
             image.scale(80, 140);
             villagerRight[i] = image;
         }
         for(int i = 0; i < villagerLeft.length; i++)
         {
             image = new GreenfootImage("boy_walkleft" + i + ".PNG"); 
             image.scale(80, 140);
             villagerLeft[i] = image;
         }
         for(int i = 0; i < villagerUp.length; i++)
         {
             image = new GreenfootImage("boy_up" + i + ".PNG"); 
             image.scale(85, 140);
             villagerUp[i] = image;
         }
         for(int i = 0; i < villagerDown.length; i++)
         {
             image = new GreenfootImage("boy_down" + i + ".PNG"); 
             image.scale(85, 140);
             villagerDown[i] = image;
         }
    }
    public void act() 
    {
         status = checkKeys();         
         checkNextLevel();         
    } 
    private void checkNextLevel()
    {
        String worldType = getWorld().getClass().getName();
        if (worldType.equals("AnimalCrossingWorld"))
        {
            if (getX() >= getWorld().getWidth()-1)
            {
                Greenfoot.setWorld(new NooksCranny(this,"left"));
            }         
        }
        else if (worldType.equals("NooksCranny"))
        {            
            if (isTouching(TomNook.class));
            {
                TomNook tom = (TomNook)getOneIntersectingObject(TomNook.class);
                //tom.showSpeechBubble(getWorld());
            }
            if (getY() >= getWorld().getHeight()-1)
            {
                Greenfoot.setWorld(new Crossroad(this,"top"));            
            }
        }        
        else if (worldType.equals("Crossroad"))
        {
            if (getY() <= 0)
            {
                Greenfoot.setWorld(new NooksCranny(this,"bottom"));
            }
            else if(getX() >= getWorld().getWidth()-1)
            {
                Greenfoot.setWorld(new Orchard(this));
            }
            else if(getY() >= getWorld().getHeight()-1)
            {
                Greenfoot.setWorld(new Beach(this, "top"));
            }
            else if(getX() <= 0)
            {
                Greenfoot.setWorld(new Garden(this, "right"));
            }
        }
        else if (worldType.equals("Orchard"))
        {            
            if (isTouching(Tree.class))
            {
                Tree tree = (Tree)getOneIntersectingObject(Tree.class);
                tree.dropFruits();                
            }
            if (isTouching(Fruit.class))
            {
                Fruit fruit = (Fruit)getOneIntersectingObject(Fruit.class);
                if (fruit.isDropped())
                {                                                            
                    // add fruit to inventory                   
                    boolean isFull = Inventory.addToInventory(fruit);
                    if (isFull)
                    {
                        Inventory.displayInventoryFull(getWorld());
                    }
                    else
                    {
                        fruit.setInInventoryState();
                        // remove fruit from world
                        getWorld().removeObject(fruit);
                    }
                }
            }
            if (getX() <= 0)
            {                
                Greenfoot.setWorld(new Crossroad(this,"right"));
            }
        }
        else if (worldType.equals("Beach"))
        {            
            if (isTouching(Shell.class))
            {
                Shell shell = (Shell)getOneIntersectingObject(Shell.class);
                if (shell.isInInventory() == false)
                {                    
                    boolean isFull = Inventory.addToInventory(shell);
                    if (isFull)
                    {
                        Inventory.displayInventoryFull(getWorld());
                    }
                    else
                    {
                        shell.setInInventoryState();
                        getWorld().removeObject(shell);
                    }
                }
            }
            if (getY() <= 0)
            {
                Greenfoot.setWorld(new Crossroad(this,"bottom"));
            }
        }
        else if (worldType.equals("Garden"))
        {            
            if (isTouching(Flower.class))
            {
                Flower flower = (Flower)getOneIntersectingObject(Flower.class);
                if (flower.isInInventory() == false)
                {                    
                    boolean isFull = Inventory.addToInventory(flower);
                    if (isFull)
                    {
                        Inventory.displayInventoryFull(getWorld());
                    }
                    else
                    {
                        flower.setInInventoryState();
                        getWorld().removeObject(flower);
                    }
                }
            }
            if (getX() >= getWorld().getWidth()-1)
            {
                Greenfoot.setWorld(new Crossroad(this, "left"));
            }
        }
    }
}