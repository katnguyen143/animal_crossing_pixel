import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    public StartWorld(int x, int y, int z)
    {    
         super(750, 650, 1); 
         prepare();      
    }       
    
    private void prepare()
    {
        BoyVillager villager = new BoyVillager();
        addObject(villager,200, 550);
    }
}
