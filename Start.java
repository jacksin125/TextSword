
/**
 * Start.java
 * This class asks the user where they would like to go when they first start the game.
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
 */
import java.nio.file.*;
import java.util.Scanner;
import java.util.*;
public class Start
{
    public static final Scanner a = new Scanner(System.in);
    static boolean gone = false;
    String placeHolder = "Hiiiii. My name is Bob";
    private static ArrayList<Monster> monsters = new ArrayList<Monster>();
    private static ArrayList<Equipment> equipment = new ArrayList<Equipment>();

    public static void main(String[] Args)
    {
        
        System.out.println("Choose the slot you would like to load");
        int slot = Start.a.nextInt();
        String debug = Start.a.nextLine();
        
         try {
            if (Files.exists(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt")) != true){
                System.out.println("What is your name?");
                sleep(1);
                String name = Start.a.nextLine();
                
                Character.setName(name);
            } else {
                Files.readAllLines(FileSystems.getDefault().getPath("TextSword\\Saves\\Save "+slot+".txt"));
            }
        } catch(java.io.IOException e){
            
        }
        
        loadMonsters();
        loadEquipment();

        while (gone == false){
            mainScene();
        }
    }
    
    public static void exitGame() {
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
    
    public boolean getGone()
    {
        return gone;
    }
    
    private static void mainScene()
    {
        UnlockTownStuff unlock = new UnlockTownStuff();
        int go;
        System.out.println("You are in the town. Where would you like to go? You can go to:");
        System.out.println(" 1. The Inn \n 2. The General Store \n 3. The Blacksmith \n 4. The Arena \n 5. Leave Town \nPlease give the number next to what you want to do");
        System.out.println("You can also: \n 6. View your character information \n 7. Check your inventory \n 8. Leave the game");
        go = Start.a.nextInt();
        
        switch (go) {
            case 1:    
            if (UnlockTownStuff.getInnUnlocked() == false){
                    unlock.unlockInn();
                } else {
                    
                }
            break;
            case 2:
            
            break;
            case 8:
            exitGame();
            break;
        }
    }
    
    public static void loadMonsters() 
    {
        
        monsters.add(new Monster("Rabbit", 1, 0));
        monsters.add(new Monster("Pig", 1, 1));
        monsters.add(new Monster("Deer", 2, 1));
    }
    
    public static Monster getMonster(int num)
    {
        return monsters.get(num);
    }
    
    public static int monstersLength()
    {
        return monsters.size();
    }
    
    public static Equipment getEquipment(int num)
    {
        return equipment.get(num);
    }
    
    public static int equipmentLength()
    {
        return equipment.size();
    }
    
    public static void loadEquipment() 
    {
        equipment.add(new Weapon ("No Weapon", 0, 0));
        equipment.add(new Armor ("No Armor", 0, 0));
        equipment.add(new Weapon ("Wooden Dagger", 1, 0));
        equipment.add(new Weapon ("Worn Dagger", 2, 0));
        equipment.add(new Weapon ("Bronze Dagger", 3, 0));
        equipment.add(new Weapon ("Rags", 0, 1));
        equipment.add(new Armor ("Pauper's Clothes", 0, 2));
        equipment.add(new Armor ("Peasant's Clothes", 0, 3));
        
    }
}//end class Start