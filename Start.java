
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.nio.file.*;
import java.util.Scanner;
public class Start
{
    private Scanner input;
    private Start startGame;
    boolean gone = false;
    String placeHolder = "Hiiiii. My name is Bob";

    public static void main(String[] Args)
    {
        Start begin = new Start();
        Character c = new Character(begin);
        begin.initScanner();
        
        System.out.println("Choose the slot you would like to load");
        int slot = begin.getScanner().nextInt();
        String debug = begin.getScanner().nextLine();
        
         try {
            if (Files.exists(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt")) != true){
                System.out.println("What is your name?");
                sleep(1);
                String name = begin.getScanner().nextLine();
                
                c.setName(name);
            } else {
                Files.readAllLines(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"));
            }
        } catch(java.io.IOException e){
            
        }
        
        

        while (begin.getGone() == false){
            begin.mainScene(c);
        }
    }
    
    public void exitGame() {
        System.out.println("Thank you for playing. Goodbye!");
        System.exit(0);
    }
    
    private static void sleep(int x) {
        try {
            Thread.sleep(x * 1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void initScanner()
    {
        input = new Scanner(System.in);
    }
    
    public Scanner getScanner()
    {
        return input;
    }
    
    public boolean getGone()
    {
        return gone;
    }
    
    private void mainScene(Character c)
    {
        UnlockTownStuff unlock = new UnlockTownStuff(c);
        TownStuff town = new TownStuff(c, unlock);
        int go;
        System.out.println("You are in the town. Where would you like to go? You can go to:");
        System.out.println(" 1. The Inn \n 2. The General Store \n 3. The Blacksmith \n 4. The Arena \n 5. Leave Town \nPlease give the number next to what you want to do");
        System.out.println("You can also: \n 6. View your character information \n 7. Check your inventory \n 8. Leave the game");
        go = input.nextInt();
        
        switch (go) {
            case 1:    
            if (UnlockTownStuff.getInnUnlocked() == false){
                    unlock.unlockInn();
                } else {
                    town.innScene();
                }
            break;
            case 2:
            
            break;
            case 8:
            exitGame();
            break;
        }
    }
}