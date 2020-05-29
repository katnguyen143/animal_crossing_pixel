import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Crossroad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crossroad extends World
{
    private Inventory inv = new Inventory();
    public Crossroad()
    {    
        this (new BoyVillager(),"left");        
    }
    public Crossroad(BoyVillager villager, String from)
    {
        super(750, 650, 1); 
        
        if (from.equals("right"))
            addObject(villager, getWidth()-1, villager.getY());  
        else if (from.equals("left"))
            addObject(villager, 2, villager.getY());
        else if (from.equals("top"))
            addObject(villager, villager.getX(), 2);
        else if (from.equals("bottom"))
            addObject(villager, villager.getX(), getHeight()-1);
        prepare();
    }
    public void prepare()
    {
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
