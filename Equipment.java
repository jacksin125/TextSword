
/**
 * Equipment.java
 * Write a description of class Equiptment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Equipment
{
    private boolean isWeapon;
    private int attack;
    private int defense;
    private String name;
    public Equipment(String n, int a, int d)
    {
       this.attack = a;
       this.defense = d;
       name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDefense()
    {
        return defense;
    }
    
}
