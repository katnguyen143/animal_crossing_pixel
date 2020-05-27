import greenfoot.*;
/**
 * AnimalCrossingWorld
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */

public class AnimalCrossingWorld extends World
{
    public AnimalCrossingWorld()
    {
        super(750, 650, 1);
        prepare();
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
