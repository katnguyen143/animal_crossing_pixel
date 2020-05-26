
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
    private int worldType = START;
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
        if (worldType == START)
        {
            if (getX() >= getWorld().getWidth()-1)
            {
                worldType = NOOKS_CRANNY;
                Greenfoot.setWorld(new NooksCranny(this));
            }           
        }
        else if (worldType == NOOKS_CRANNY)
        {            
            if (getY() >= getWorld().getHeight()-1)
            {
                worldType = CROSSROAD;
                Greenfoot.setWorld(new Crossroad(this));            
            }
        }        
        else if (worldType == CROSSROAD)
        {
            if (getY() <= 0)
            {
                worldType = NOOKS_CRANNY;
                Greenfoot.setWorld(new NooksCranny(this));
            }
        }
    }
}
