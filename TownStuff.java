
/**
 * Write a description of class TownStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TownStuff
{
    private Character mainCharacter;
    private Scanner a = new Scanner(System.in);
    private Save save;
    
    public TownStuff(Character c, UnlockTownStuff u)
    {
        mainCharacter = c;
        save = new Save(u, this, c);
    }
    
    
    public void innScene() {
        System.out.println("What would you like to do? \n 1. Sleep (Fully heal and save your game)");
        int choice1 = a.nextInt();
        
        switch(choice1) {
            case 1:
            save.saveGame();
        }
    }
    
    public Save getSave()
    {
        return save;
    }
}
