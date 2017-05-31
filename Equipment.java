
/**
 * Equipment.java
 * Write a description of class Equiptment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipment
{
    private boolean isWeapon;
    private int attack;
    private int defense;
    public Equipment(boolean isWeapon, int attack, int defense)
    {
       this.isWeapon = isWeapon;
       this.attack = attack;
       this.defense = defense;
    }
    
    public String getWeapon()
    {
        if(isWeapon)
        {
        }
        return "";
    }
}
