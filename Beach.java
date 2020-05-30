import greenfoot.*;
/**
 * Beach: Player can pick up shells here.
 * 
 * @Kat Nguyen 
 * @5/29/2020
 */
public class Beach extends World
{
    Shell shell = null;
    private Inventory inv = new Inventory();
    public Beach()
    {    
        this (new BoyVillager(),"left");        
    }
    public Beach(BoyVillager villager, String from)
    {
        super(750, 650, 1);         
        if (from.equals( "top" ))
            addObject(villager, villager.getX(), 2);
        prepare();
    }
    public void addShells()
    {              
        for (int i = 0; i < 8; i++)
        {
            int randomNum = (int)(Math.random() * 3); 
            if (randomNum == 0)
                shell = new Conch();
             else if (randomNum == 1)
                shell = new Scallop();
             else if (randomNum == 2)
                shell = new Coral(); 
             addObject(shell, getRandX(), getRandY());
        }       
    }
    public void prepare()
    {
        addShells();
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
    public int getRandX()
    {
        return 15 + (int)((Math.random() * 700));
    }
    public int getRandY()
    {
        return 15 + (int)((Math.random() * 450));
    }
}