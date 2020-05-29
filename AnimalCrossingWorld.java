import greenfoot.*;
/**
 * AnimalCrossingWorld
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */

public class AnimalCrossingWorld extends World
{
    public static Inventory inv = new Inventory();
    public AnimalCrossingWorld()
    {
        super(750, 650, 1);
        prepare();
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
    public AnimalCrossingWorld(int x, int y, int z)
    {    
        super(750, 650, 1);        
    }       
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BoyVillager boyVillager = new BoyVillager();
        addObject(boyVillager,362,373);
        boyVillager.setLocation(215,555);
    }
}
