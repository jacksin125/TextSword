
/**
 * Write a description of class Combat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combat
{
    
    public Combat (int mA, int mD)
    {
        
        
        begin();
    }
    
    public void begin()
    {
        int monNum = (int)(Math.random() * Start.monstersLength());
        Monster enemy = Start.getMonster(monNum);
        
        int turn = (int)(Math.random() + 0.5);
        
    }
    
    public int playerRound()
    {
        return 1;
    }
    
    public int monRound()
    {
        return 1;
    }
}
