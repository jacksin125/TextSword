
/**
 * Combat.java
 * This class represents the fighting between the player and the enemy.
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
 */
public class Combat
{
    Monster enemy;
    int pHealth;
    int mHealth;
    int damage;
    
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
        int bonus = (int)(Math.random() * 2 + 1);
        if ((Character.getAttack() + bonus) - enemy.getDefense() < 0)
            damage = 0;
        else
            damage = (Character.getAttack() + bonus) - enemy.getDefense();
        
        return damage;
    }
    
    public int monRound()
    {
        int bonus = (int)(Math.random() * 2 + 1);
        if ((enemy.getAttack() + bonus) - Character.getDefense() < 0)
            damage = 0;
        else
            damage = (enemy.getAttack() + bonus) - Character.getDefense();
        
        return damage;
    }
}//end class Combat
