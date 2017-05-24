import java.nio.file.*;
/**
 * Write a description of class Save here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Save
{
    private UnlockTownStuff unlock;
    private TownStuff town;
    private Character character;
    
    private Scanner a = new Scanner(System.in);
    int slot;
    public Save(UnlockTownStuff u, TownStuff t, Character c)
    {
        unlock = u;
        town = t;
        character = c;
    }
    public void saveGame()
    {
        System.out.println("What slot would you like to save this game to? You can choose slots 1-10");
        slot = a.nextInt();
        try {
            if (Files.exists(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt")) != true){
                Files.write(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"), character.getStart().placeHolder.getBytes(), StandardOpenOption.CREATE); 
            }
        } catch(java.io.IOException e){
            
        }
        
    }
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
    
    private void saveCharacter(){
        String money = Integer.toString(character.money);
        
        try {
            Files.write(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"), money.getBytes(), StandardOpenOption.APPEND);
            
        } catch(java.io.IOException e){
            
        }
    }
}
