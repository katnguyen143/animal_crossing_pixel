import greenfoot.*;
/**
 * Orchard - The player picks up fruit from trees here.
 * 
 * @Kat Nguyen 
 * @5/26/2020
 */
public class Orchard extends World
{
    private Inventory inv = new Inventory();
    public Orchard()
    {    
        this (new BoyVillager());         
        
    }
    public Orchard(BoyVillager villager)
    {
        super(750, 650, 1);
        
        
        Tree tree = getTree(465, 460);
        Tree tree2 = getTree(265, 220);
        Tree tree3 = getTree(615, 170);
        
        addObject(villager, 1, 300);
        
        prepare();
    }
    public Tree getTree(int x, int y)
    {
        Tree tree = new Tree();
        addObject(tree, x, y);
        //addObject(new Apple(), tree.getX()+5, tree.getY()-106);
        //addObject(new Apple(), tree.getX()-64, tree.getY()-34);
        //addObject(new Apple(), tree.getX()+70, tree.getY()-25);
        return tree;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}
