import greenfoot.*;
/**
 * Village
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */
public class NooksCranny extends World
{
    public NooksCranny()
    {            
        this (new BoyVillager());
        prepare();        
    }
    public NooksCranny(BoyVillager villager)
    {
        super(750, 650, 1);
        addObject(villager, 1, 550);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TomNook tomNook = new TomNook();
        addObject(tomNook,400,500);
    }
}
