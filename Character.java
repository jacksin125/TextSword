
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
    Start start;
    
    public Character()
    {
        
    }
    
    
    public static void setName(String newName)
    {
        name = newName;
    }
    
    public void Getstats()
    {
        
    }
    
    public int getLevel()
    {
        return level;
    }
    public String getName()
    {
        return name;
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
