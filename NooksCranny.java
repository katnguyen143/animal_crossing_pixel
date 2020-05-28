import greenfoot.*;
/**
 * Village
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */
public class NooksCranny extends World
{
    private Inventory inv = new Inventory();
    public NooksCranny()
    {            
        this (new BoyVillager(),"left");
        prepare();        
    }
    public NooksCranny(BoyVillager villager, String from )
    {
        super(750, 650, 1);
        prepare();
        System.out.println("Villager X: " + villager.getX() + "Villager Y: " + villager.getY());
        if ( from.equals( "left" ) )
            addObject(villager, 1, getHeight()-100);
        else if( from.equals( "bottom" ) )
            addObject(villager, villager.getX(), getHeight() );
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TomNook tomNook = new TomNook();
        addObject(tomNook,400,500);
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
