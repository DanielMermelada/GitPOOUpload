import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El robot, que es manejado por el jugador mediante el teclado.
 * 
 * @author Daniel Barco López
 * @version 0.1 (31/01/2021)
 */
public class Robot extends Actor
{
    /**
     * Este se mueve mediante las teclas de movimiento del teclado.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -3, getY());
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
        }
    }    
}
