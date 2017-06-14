
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
        mHealth = 10;
        
        begin();
    }
    
    public void begin()
    {
        int monNum = (int)(Math.random() * Start.monstersLength());
        enemy = Start.getMonster(monNum);
        
        System.out.println("You encountered a wild " + enemy.getName());
        
        int turn = (int)(Math.random() + 0.5);
        
        while(mHealth > 0 && pHealth > 0)
        {
            if(turn == 0)
            {
                playerRound();
                monRound();
            }
            if(turn == 1)
            {
                monRound();
                playerRound();
            }
        }
        
        if(mHealth < 0)
        {
            System.out.println("Congratulations, you killed the monster and gained 50 blik!");
            Character.addMoney(50);
        }
        else
        {
            System.out.println("Sorry, but you failed. Better luck next time!");
        }
        
    }
    
    public int playerRound()
    {
        System.out.println("Would you like to: \n 1. Attack \n 2. Attack \n 3. You really don't have any other options");
        int choice1 = Start.a.nextInt();
        
        int bonus = (int)(Math.random() * 2 + 1);
        if ((Character.getAttack() + bonus) - enemy.getDefense() < 0)
            damage = 0;
        else
            damage = (Character.getAttack() + bonus) - enemy.getDefense();
        
        mHealth -= damage;
            
        System.out.println("You dealt " + damage + " damage, and the enemy has " + mHealth + " health left");
        Start.sleep(2);
        return damage;
    }
    
    public int monRound()
    {
        System.out.println (enemy.getName() + "Attacks you");
        Start.sleep(1);
        int bonus = (int)(Math.random() * 2 + 1);
        if ((enemy.getAttack() + bonus) - Character.getDefense() < 0)
            damage = 0;
        else
            damage = (enemy.getAttack() + bonus) - Character.getDefense();
        
        pHealth -= damage;
            
        System.out.println("The enemy dealt " + damage + " damage, and you have " + pHealth + " health left");
        Start.sleep(2);
        
        return damage;
    }
}//end class Combat
