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
    private Character character;
    
    private Scanner a = new Scanner(System.in);
    static int slot;
    public Save(UnlockTownStuff u, Character c)
    {
        unlock = u;
        character = c;
    }
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
        String money = Integer.toString(Character.getMoney());
        //String name = Character.getName();
        
        try {
            Files.write(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"), money.getBytes(), StandardOpenOption.APPEND);
            //Files.write(FileSystems.getDefault().getPath("Saves\\Save "+slot+".txt"), name.getBytes(), StandardOpenOption.APPEND);
        } catch(java.io.IOException e){
            
        }
    }
}
