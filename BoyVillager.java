
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
        
         GreenfootImage image = getImage();
         image.scale(100, 140);
         setImage(image);
         
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
         checkKeys();
    } 
}
