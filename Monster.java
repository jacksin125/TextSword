
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster
{
    int attack;
    int defense;
    private String name;
    
    public Monster(String n, int a, int d)
    {
        attack = a;
        defense = d;
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
