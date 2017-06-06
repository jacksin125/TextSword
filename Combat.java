
/**
 * Write a description of class Combat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combat
{
    Monster enemy;
    int pHealth;
    int mHealth;
    
    public Combat ()
    {
        pHealth = Character.getHealth();
        mHealth = 5;
        
        begin();
    }
    
    public void begin()
    {
        int monNum = (int)(Math.random() * Start.monstersLength());
        enemy = Start.getMonster(monNum);
        
        int turn = (int)(Math.random() + 0.5);
        
        while(mHealth > 0 && pHealth > 0)
        {
            if(turn == 0)
            {
                playerRound();
                
            }
        }
        
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
