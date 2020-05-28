import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Global here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Global extends World
{
    public static ArrayList <Actor> collectedObjects = new ArrayList <Actor>();
    
    /**
     * Constructor for objects of class Global.
     * 
     */
    public Global()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
