
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character
{
    private static String name;
    private static int level = 1;
    private static int money = 500;
    private static int experience = 0;
    private static int health;
    private static Weapon weapon = new Weapon("Nothing", 0, 0);
    private static Armor armor = new Armor("Nothing", 0, 0);
    
    Start start;
    
    public Character()
    {
        
    }
    
    public static int getAttack()
    {
        return armor.getAttack() + weapon.getAttack();
    }
    public static int getDefense()
    {
        return armor.getDefense() + weapon.getDefense();
    }
    
    public static void setArmor(Armor a)
    {
        armor = a;
    }
    
    public static Armor getArmor()
    {
        return armor;
    }
    
    public static void setWeapon(Weapon w)
    {
        weapon = w;
    }
    
    public static Weapon getWeapon()
    {
        return weapon;
    }
    
    public static void setName(String newName)
    {
        name = newName;
    }
    
    public static void Getstats()
    {
        
    }
    
    public static int getLevel()
    {
        return level;
    }
    public static String getName()
    {
        return name;
    }
    public static int getHealth()
    {
        return level;
    }
    
    public static void addMoney(int a)
    {
        money += a;
    }
    public static void remMoney(int a)
    {
        money -= a;
    }
    public static int getMoney()
    {
        return money;
    }
}
