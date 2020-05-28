import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{    
    private Fruit fruit[] = new Fruit[3];
    public Tree()
    {
        //addObject(new Apple(), getX(), getY());
        GreenfootImage image = getImage();
        image.scale(270, 360);        
    }
    public void addFruits()
    {
        //getWorld().addObject(new Apple(), getX()+5, getY()-95);
        //getWorld().addObject(new Apple(), getX()-64, getY()-34);
        //getWorld().addObject(new Apple(), getX()+70, getY()-25);
        for(int i = 0; i < fruit.length; i++)
        {
            fruit[i] = new Apple();            
            //getWorld().addObject(fruit[i], getX()+70, getY()-25);
        }
        getWorld().addObject(fruit[0], getX()+5, getY()-95);
        getWorld().addObject(fruit[1], getX()-64, getY()-34);
        getWorld().addObject(fruit[2], getX()+70, getY()-25);
    }
    public void addedToWorld(World world)
    {
        addFruits();
    }
    public void dropFruits()
    {
        int bottom = getY() + 100;
        for (int i = 0; i < fruit.length; i++)
        {
            int y = fruit[i].getY() + 1;
            if (y > bottom)
            {
                y = bottom;
            }
            fruit[i].setLocation(fruit[i].getX(), y);            
        }
    }
    public void deleteFruit(Fruit fruit)
    {
        getWorld().removeObject(fruit)
    }
    public void act() 
    {
         
    }    
}
