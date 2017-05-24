
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character
{
    private String name;
    private int level;
    int money = 500;
    Start start;
    
    public Character(Start s)
    {
        start = s;
    }
    
    public Start getStart()
    {
        return start;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void Stats()
    {
        level = 1;
        int experience = 0;
    }
    
    public int getLevel()
    {
        return level;
    }
    public String getName()
    {
        return name;
    }
    
    
}
