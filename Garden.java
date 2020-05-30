import greenfoot.*;
/**
 * A player can collect flowers here.
 * 
 * @Kat Nguyen 
 * @5/29/2020
 */
public class Garden extends World
{
    Flower flower = null;
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
    public void addFlowers()
    {              
        for (int i = 0; i < 8; i++)
        {
            int randomNum = (int)(Math.random() * 3); 
            if (randomNum == 0)
                flower = new Pansy();
             else if (randomNum == 1)
                flower = new Tulip();
             else if (randomNum == 2)
                flower = new Rose(); 
             addObject(flower, getRandX(), getRandY());
        }       
    }
    public int getRandX()
    {
        return 15 + (int)((Math.random() * 640));
    }
    public int getRandY()
    {
        return 125 + (int)((Math.random() * 425));
    }
    public void prepare()
    {
        addFlowers();
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
