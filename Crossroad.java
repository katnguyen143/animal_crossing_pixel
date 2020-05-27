import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Crossroad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crossroad extends World
{
    public Crossroad()
    {    
        this (new BoyVillager(),"left");        
    }
    public Crossroad(BoyVillager villager, String from)
    {
        super(750, 650, 1); 
        System.out.println("Villager X: " + villager.getX() + " Villager Y: " + villager.getY());
        
        if ( from.equals( "right" ) )
            addObject(villager, getWidth()-1, villager.getY() );  
        else if( from.equals( "top" ) )
            addObject(villager, villager.getX(), 2);
        //    addObject(villager, villager.getX(), getHeight() );
    }
}
