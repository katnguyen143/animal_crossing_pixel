
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Villager Actions
 * 
 * Kat Nguyen
 * 5/24/2020
 */
public class BoyVillager extends AnimalCrossingCharacter
{
    final static int DISTANCE = 4;      
    final static int START = 0;
    final static int NOOKS_CRANNY = 1;
    final static int CROSSROAD = 2;
    final static int ORCHARD = 3;
    final static int BEACH = 4;
    final static int GARDEN = 5;
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
         
         imageLeft.scale(100, 140);
         imageRight.scale(100, 140);
         imageUp.scale(100, 140);
         imageDown.scale(100, 140);
         
         GreenfootImage image = null;
         setImage(imageRight); 
         
         for(int i = 0; i < villagerRight.length; i++)
         {
             image = new GreenfootImage("boy_walkright" + i + ".PNG"); 
             image.scale(100, 140);
             villagerRight[i] = image;
         }
         for(int i = 0; i < villagerLeft.length; i++)
         {
             image = new GreenfootImage("boy_walkleft" + i + ".PNG"); 
             image.scale(100, 140);
             villagerLeft[i] = image;
         }
         for(int i = 0; i < villagerUp.length; i++)
         {
             image = new GreenfootImage("boy_up" + i + ".PNG"); 
             image.scale(100, 140);
             villagerUp[i] = image;
         }
         for(int i = 0; i < villagerDown.length; i++)
         {
             image = new GreenfootImage("boy_down" + i + ".PNG"); 
             image.scale(100, 140);
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
        //System.out.println("World type: " + worldType);
        if (worldType.equals("AnimalCrossingWorld"))
        {
            if (getX() >= getWorld().getWidth()-1)
            {
                //Greenfoot.setWorld(new NooksCranny(this,"left"));
                Greenfoot.setWorld(new Orchard(this));
            }         
        }
        else if (worldType.equals("NooksCranny"))
        {            
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
        }
        else if (worldType.equals("Orchard"))
        {
            if (isTouching(Tree.class))
            {
                //Actor actor = (Actor)(getWorld().getObjects(Tree.class).get(0));
                Tree tree = (Tree)getOneIntersectingObject(Tree.class);
                tree.dropFruits();
                
            }
            if (isTouching(Fruit.class))
            {
                Fruit fruit = (Fruit)getOneIntersectingObject(Fruit.class);
                System.out.println("is touching fruit");
                // add fruit to inventory
                Global.collectedObjects.add(fruit);
                // remove fruit from world
                getWorld().removeObject(fruit);
                
            }
            if (getX() <= 0)
            {                
                Greenfoot.setWorld(new Crossroad(this,"right"));
            }
        }
    }
}
