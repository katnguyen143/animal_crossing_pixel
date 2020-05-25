import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Girl Villager Actions
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */
public class GirlVillager extends AnimalCrossingCharacter
{
    public GirlVillager()
    {
         GreenfootImage image = getImage();
         image.scale(60, 90);
         setImage(image);
    }
    public void act() 
    {
         checkKeys();
    }    
}
