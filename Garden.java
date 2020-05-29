import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garden extends World
{
    private Inventory inv = new Inventory();
    public Garden()
    {    
        this (new BoyVillager(),"left");        
    }
    public Garden(BoyVillager villager, String from)
    {
        super(750, 650, 1);         
        if (from.equals( "right" ))
            addObject(villager, getWidth()-1, villager.getY());
        prepare();
    }
    public void prepare()
    {
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
