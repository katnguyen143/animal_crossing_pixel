import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{    
    private Fruit fruits[] = new Fruit[3];
    private boolean fruitsDropped = false;
    Fruit fruit = null;
    public Tree()
    {
        GreenfootImage trunk = getImage();
        trunk.scale(52, 125);  
        setImage(trunk);  
    }
    public void addFruits()
    {
        int randomNum = (int)(Math.random() * 5);      
        for (int i = 0; i < fruits.length; i++)
        {
             if (randomNum == 0)
                fruit = new Apple();
             else if (randomNum == 1)
                fruit = new Orange();
             else if (randomNum == 2)
                fruit = new Cherry();
             else if (randomNum == 3)
                fruit = new Pear();
             else if (randomNum == 4)
                fruit = new Peach();
             fruits[i] = fruit;            
        }
        getWorld().addObject(fruits[0], getX()+5, getY()-150);
        getWorld().addObject(fruits[1], getX()-54, getY()-95);
        getWorld().addObject(fruits[2], getX()+60, getY()-95);
    }
    public void addedToWorld(World world)
    {
        Treetop treetop = new Treetop();
        world.addObject(treetop, this.getX(), this.getY()-55);
        addFruits();
    }
    public void dropFruits()
    {
        if (fruitsDropped)
        {
            return;
        }
        int bottom = getY() + 90;
        for (int i = 0; i < fruits.length; i++)
        {
            if (fruits[i].isOnTree())
            {
                fruits[i].dropFruit(bottom);
            }           
        }
        fruitsDropped = true;
    }
    public void deleteFruit(Fruit fruit)
    {
        getWorld().removeObject(fruit);
    }
    public void act() 
    {
         
    }    
}
