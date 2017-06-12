
/**
 * Monster.java
 * This class represents a monster in the game.
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
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
