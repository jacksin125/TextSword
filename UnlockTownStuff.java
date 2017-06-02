
/**
 * Write a description of class UnlockTownStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//make blacksmith Thorald Stronghammer
import java.util.Scanner;
public class UnlockTownStuff
{
    private Scanner a = new Scanner(System.in);
    private static boolean smithUnlocked = false;
    private static boolean storeUnlocked = false;
    private static boolean innUnlocked = false;
    int innCost = 100;
    
    private Character character;
    
    
    public UnlockTownStuff()
    {
        
    }
    
    public void unlockInn () {
        
        int choice1;
        int choice2;
        int choice3;

        System.out.println ("Innkeeper: Hello, and welcome to the Swordman's Rest Inn!");
        sleep(2);
        System.out.println(" 1. Hello, my name is " + character.getName() + ". This looks like a fine establishment. \n 2. Hmm. Nice place \n 3. Hi. \n 4. This is a disgusting residence, but I guess I'm stuck with it and this filthy peasant.");
        choice1 = a.nextInt();
        sleep(1);
        switch (choice1) {
            case 1: 
            System.out.println("Innkeeper: Hello, " + character.getName() + ". My name is Adalwine Reslan, though you can call me Adam for short. Thank you for your kind compliments");
            innCost = innCost / 2;
            break;
            case 2:
            System.out.println ("Innkeeper: Thank you, I guess. My name is Adalwine Reslin");
            innCost = (int)(innCost * .75);
            break;
            case 3:
            System.out.println ("Innkeeper: Not one for speeches, are you? Well, I'm Adalwine Reslin.");
            break;
            case 4:
            System.out.println ("Innkeeper: EXCUSE ME!?! This is the finest establishment within 20 miles, and what's this about me being a FILTHY PEASANT!?! I am Adalwine Reslan, and I am richer then most in this village!");
            innCost = innCost * 3;
            break;
            default: System.out.println(character.getName() + ": Awrawrgolodybugood. Mrowndradubydacook. \n Ummmm... ok... Do you speak English? Or any intelligible language? My name is Adalwine Reslin, can you tell me yours?");
        }
        
        sleep(3);
        System.out.println(" 1. So, how are you today, Good Sir? \n 2. Well, my name is " + character.getName() + ". \n 3. Cool. \n 4. Even your name tells me that you're filth, an innkeeper addled by his own drink. A drunkard with an unlimited supply!");
        choice2 = a.nextInt();
        sleep(1);
        switch (choice2) {
            case 1:
            System.out.println("Adalwine: I am well. Thank you very much for asking! So many people are so rude these days.");
            innCost = innCost / 2;
            break;
            case 2:
            System.out.println("Adalwine: Thank you for letting me know.");
            innCost = (int)(innCost * (2/3));
            break;
            case 3:
            System.out.println("Adalwine: Well then, I guess I can deal with that.");
            break;
            case 4:
            System.out.println("Adalwine: You are incredibly rude, and it is angering me very much. What do you want?");
            innCost = innCost * 3;
            break;
            default: System.out.println(character.getName() + ": Wragarondakmisternomalom. Hobalobabob nomlom tom. \nAdam: So you don't speak English. ¿hablas español? Nederlands? Nihongo?");
        }
        
        sleep(3);
        System.out.println(" 1. If you would be so kind, I would love to buy a room. I am tired and in need of rest. \n 2. Please get me a room. \n 3. rooms. \n 4. Since this is the only inn anywhere nearby, I suppose I will need to stay here. Lesser peasant, prepare your best rooms for me. \n 5. You know what, I have to go. Bye.");
        choice3 = a.nextInt();
        sleep(1);
        switch (choice3) {
            case 1:
            System.out.println("Adalwine: I can absolutely get you a room. And it would only cost " + innCost + " Blik.");
            payInnCost();
            break;
            case 2:
            System.out.println("Adalwine: Alright, that'll cost " + innCost + " Blik.");
            payInnCost();
            break;
            case 3:
            System.out.println("Adalwine: Sure, for " + innCost + " Blik.");
            payInnCost();
            break;
            case 4:
            System.out.println("Adalwine: Yeah, sure, if you can pay " + innCost + " Blik. If not, then stop acting so high and mighty");
            payInnCost();
            break;
            case 5:
            System.out.println("Adalwine: Alright, bye.");
            sleep(1);
            System.out.println("Being as you didn't get a room, there is no reason for you to be at the inn. So you leave.");
            break;
            default: System.out.println(character.getName() + ": Heebajeebamaleeba. meeba oneeba kadeeva. \nAdam: You know what, if you won't speak something I understand, then go. Bye.");
        }
        
    }
    
    private void payInnCost()
    {
        sleep(3);
        System.out.println ("Are you willing to pay the cost? \n 1. Yes \n 2. No");
        int pay = a.nextInt();
        
        switch (pay){
            case 1:
            if (Character.getMoney() >= innCost){
                Character.remMoney(innCost);
                innUnlocked = true;
                System.out.println("Adalwine: Thank you for choosing the Swordman's Rest Inn! The rooms are up the stairs, and yours is fourth on the left");
                System.out.println("Congratulations! You bought a room! You can now actually save your game, as well as heal without buying potions (by taking a nap)");
            } else{
                System.out.println(character.getName() + ": I don't have enough money.");
                System.out.println("Adalwine: Then come back when you have enough.");
                innUnlocked = false;
            }
            break;
            case 2:
            System.out.println("Unhappy with the cost of the rooms, you leave.");
            sleep(2);
            break;
            default: System.out.println(character.getName() + ": Awrar mongreadar Dorandamaloedar \nNarrator: Ok, can you at least speak English to me? It's starting to get on my nerves");
            sleep(3);
        }
    }
    public static boolean getInnUnlocked()
    {
        return innUnlocked;
    }
    
    public void unlockStore()
    {
        int choice1;
        int choice2;
        int choice3;
        int storeCost = 200;
        
        if (character.getLevel() >= 5 && Character.getMoney() > 100) {
            System.out.println ("Shopkeeper: Hello, and welcome to Belethor's General Goods Store! How can I help you?");
            sleep(2);
            System.out.println(" 1. Hello, good sir. My name is " + character.getName() + ". Can I assume that yours is Belethor? \n 2. Hi, my name's " + character.getName() + ". I'm guessing yours isn't Belethor \n 3. Hi Belethor. I'm " + character.getName() + ". \n 4. Good god, your name is horrible. It's not even worth spitting upon. Though you might be, lowly peasant. If I must, my name is " + character.getName());
            choice1 = a.nextInt();
            
            switch (choice1) {
                case 1: System.out.println("Shopkeeper: Oh no, no, no. My name's not Belethor, that would be copyright infri- I mean, that would be very rude of me. My real name's John Hawkmoor.");
                storeCost = (int)(storeCost * .75);
                case 2: System.out.println ("Shopkeeper: How did you know?? You're the first new customer to not make that mistake. Well, anyway,my name is actually John Hawkmoor");
                storeCost = (int)(storeCost * .8);
            }
            sleep(3);
        }
    }
    public static boolean getStoreUnlocked()
    {
        return storeUnlocked;
    }
    
    private static void sleep(int x) {
        try {
            Thread.sleep(x * 1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
