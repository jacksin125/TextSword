import java.nio.file.*;
/**
 * Save.java
 * This class saves the player's progress. 
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
 */
import java.util.Scanner;
public class Save
{
    private UnlockTownStuff unlock;
    private Character character;
    
    private Scanner a = new Scanner(System.in);
    static int slot;
    /**
     * Constructs a new Save object
     */
    public Save(UnlockTownStuff u, Character c)
    {
        unlock = u;
        character = c;
    }
    
    /** Asks the user where they would like to save the game, and if it exists saves the game.
     * Precondition: The game has not yet been saved to a slot.
     * Postcondition: Sets the slot that the game will be saved to and saves it to that slot.
     */
    public static void saveGame()
    {
        System.out.println("What slot would you like to save this game to? You can choose slots 1-10");
        slot = Start.a.nextInt();
        try {
            if (Files.exists(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt")) != true){
                Files.createDirectories(FileSystems.getDefault().getPath("Saves"));
                Files.createFile(FileSystems.getDefault().getPath("Saves\\Save "+slot+".txt"));
            }
        } catch(java.io.IOException e){
            
        }
        
    }
    
    /** Checks to see if the inn is unlocked and saves it if it is unlocked.
     * Precondition: The inn has not been saved
     * Postcondition: If the inn has been unlocked, it gets saved.
     */
    private void saveUnlocked()
    {
        String innUnlocked;
        String storeUnlocked;
        String smithUnlocked;
        
        if (UnlockTownStuff.getInnUnlocked() == true){
            innUnlocked = "true";
        } else {
            innUnlocked = "false";
        }
        
        try {
            Files.write(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"), innUnlocked.getBytes(), StandardOpenOption.APPEND);
            
        } catch(java.io.IOException e){
            
        }
    }
    
    /** Saves the character's money
     * Precondition: The money that the character has earned has not been saved
     * Postcondition: The player's money is saved. 
     */
    private void saveCharacter(){
        String money = Integer.toString(Character.getMoney());
        //String name = Character.getName();
        
        try {
            Files.write(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"), money.getBytes(), StandardOpenOption.APPEND);
            //Files.write(FileSystems.getDefault().getPath("Saves\\Save "+slot+".txt"), name.getBytes(), StandardOpenOption.APPEND);
        } catch(java.io.IOException e){
            
        }
    }
}//end class Save
