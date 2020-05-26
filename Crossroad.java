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
        this (new BoyVillager());        
    }
    public Crossroad(BoyVillager villager)
    {
        super(750, 650, 1); 
        addObject(villager, 350, 1);
    }
}
