import greenfoot.*;
/**
 * Village
 * 
 * @Kat Nguyen 
 * @5/24/2020
 */
public class Village extends World
{
    public Village()
    {    
        super(750, 650, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TomNook tomNook = new TomNook();
        addObject(tomNook,524,380);
        tomNook.setLocation(298,507);
    }
}
