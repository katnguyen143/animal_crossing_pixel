import greenfoot.*;
/**
 * AnimalCrossingWorld
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */

public class AnimalCrossingWorld extends World
{
    public AnimalCrossingWorld()
    {    
         super(750, 650, 1); 
         prepare();
         //GreenfootImage image = getImage();
         //image.scale(800, 800);
         //setImage(image);      
    }       
    private void prepare()
    {
        BoyVillager villager = new BoyVillager();
        addObject(villager,200, 550);
    }
}
