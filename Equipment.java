
/**
 * Equipment.java
 * This class contains the basic information about the 2 kinds of equipment
 * 
 * @author Orion Duffy and Emily Doran 
 * @version 6-12-17
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
    
}//end class Equipment
