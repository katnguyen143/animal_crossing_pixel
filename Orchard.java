import greenfoot.*;
/**
 * Orchard: The player picks up fruit from trees here.
 * 
 * @Kat Nguyen 
 * @5/29/2020
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

        Tree tree = getTree(465, 500);
        Tree tree2 = getTree(265, 260);
        Tree tree3 = getTree(615, 210);        
        addObject(villager, 1, 300);
        
        prepare();
    }
    public Tree getTree(int x, int y)
    {
        Tree tree = new Tree();
        addObject(tree, x, y+40);
        return tree;
    }
    private void prepare()
    {
        addObject(inv, getWidth() / 2, getHeight() / 2 );
    }
}