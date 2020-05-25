
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
    public BoyVillager()
    {
         villagerRight = new GreenfootImage[4];
         villagerLeft = new GreenfootImage[4]; 
         
         imageLeft = new GreenfootImage("boy_standleft.PNG");
         imageRight = new GreenfootImage("boy_standright.PNG");
         imageLeft.scale(100, 140);
         imageRight.scale(100, 140);
         
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
    }
    public void act() 
    {
         status = checkKeys();
         
         if (status == RIGHT_SCREEN)
         {
             Village village = new Village();
             village.addObject(new BoyVillager(),1, 550);
             Greenfoot.setWorld(village);
             
         }
    } 
}
