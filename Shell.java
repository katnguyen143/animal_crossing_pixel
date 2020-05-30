import greenfoot.*;
/**
 * Shell
 * 
 * @Kat Nguyen
 * @5/29/2020
 */
public class Shell extends Actor
{
    public int state = 0;
    public static final int IN_INVENTORY = 1;
    public void act() 
    {
        // Add your action code here.
    }      
    public void setInInventoryState()
    {
        state = IN_INVENTORY;
    }
    public boolean isInInventory()
    {
        return state == IN_INVENTORY;
    }
    public void deleteShell()
    {
        getWorld().removeObject(new Shell());
    }
}
