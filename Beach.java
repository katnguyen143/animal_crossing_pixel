import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{
    private Inventory inv = new Inventory();
    public Beach()
    {    
        this (new BoyVillager(),"left");        
    }
    public Beach(BoyVillager villager, String from)
    {
        super(750, 650, 1);         
        if (from.equals( "top" ))
            addObject(villager, villager.getX(), 2);
        prepare();
    }
    public void prepare()
    {
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
