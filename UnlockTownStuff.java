
/**
 * UnlockTownStuff.java
 * This class unlocks different parts of the town once the player gains access.
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
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
    int storeCost = 200;
    
    
    
    public UnlockTownStuff()
    {
        
    }
    
    public void unlockInn () {
        
        int choice1;
        int choice2;
        int choice3;

        System.out.println ("Innkeeper: Hello, and welcome to the Swordman's Rest Inn!");
        sleep(2);
        System.out.println(" 1. Hello, my name is " + Character.getName() + ". This looks like a fine establishment. \n 2. Hmm. Nice place \n 3. Hi. \n 4. This is a disgusting residence, but I guess I'm stuck with it and this filthy peasant.");
        choice1 = a.nextInt();
        sleep(1);
        switch (choice1) {
            case 1: 
            System.out.println("Innkeeper: Hello, " + Character.getName() + ". My name is Adalwine Reslan, though you can call me Adam for short. Thank you for your kind compliments");
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
            default: System.out.println(Character.getName() + ": Awrawrgolodybugood. Mrowndradubydacook. \n Ummmm... ok... Do you speak English? Or any intelligible language? My name is Adalwine Reslin, can you tell me yours?");
        }
        
        sleep(3);
        System.out.println(" 1. So, how are you today, Good Sir? \n 2. Well, my name is " + Character.getName() + ". \n 3. Cool. \n 4. Even your name tells me that you're filth, an innkeeper addled by his own drink. A drunkard with an unlimited supply!");
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
            default: System.out.println(Character.getName() + ": Wragarondakmisternomalom. Hobalobabob nomlom tom. \nAdam: So you don't speak English. ¿hablas español? Nederlands? Nihongo?");
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
            default: System.out.println(Character.getName() + ": Heebajeebamaleeba. meeba oneeba kadeeva. \nAdam: You know what, if you won't speak something I understand, then go. Bye.");
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
                System.out.println(Character.getName() + ": I don't have enough money.");
                System.out.println("Adalwine: Then come back when you have enough.");
                innUnlocked = false;
            }
            break;
            case 2:
            System.out.println("Unhappy with the cost of the rooms, you leave. Perhaps he will charge less if you are nicer next time.");
            sleep(2);
            break;
            default: System.out.println(Character.getName() + ": Awrar mongreadar Dorandamaloedar \nNarrator: Ok, can you at least speak English to me? It gets on my nerves");
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
        
        if (Character.getMoney() > 100) {
            System.out.println ("Shopkeeper: Hello, and welcome to Belethor's General Goods Store! How can I help you?");
            sleep(2);
            System.out.println(" 1. Hello, good sir. My name is " + Character.getName() + ". Can I assume that your name is Belethor? \n 2. Hi, my name's " + Character.getName() + ". I'm guessing your name isn't Belethor \n 3. Hi Belethor. I'm " + Character.getName() + ". \n 4. Good god, your name is horrible. It's not even worth spitting upon. Though you might be, lowly peasant. If I must, my name is " + Character.getName());
            choice1 = a.nextInt();
            
            switch (choice1) {
                case 1: System.out.println("Shopkeeper: Oh no, no, no. My name's not Belethor, that would be copyright infri- I mean, that would be very rude of me. My real name's John Hawkmoor.");
                storeCost = (int)(storeCost * .5);
                case 2: System.out.println ("Shopkeeper: How did you know?? You're the first new customer to not make that mistake. Well, anyway,my name is actually John Hawkmoor");
                storeCost = (int)(storeCost * .75);
                case 3: System.out.println("Shopkeeper: No, my name's John Hawksmoor. My father named the store.");
                case 4: System.out.println("For your information, my name is John Hawksmoor. And I sincerely hope you have a king's purse with that attitude of yours.");
                storeCost = (int)(storeCost * 3);
                default: System.out.println(Character.getName() + ": Ermahgerdamordian Dedorian \n John: Hmmm... Interesting. I have no idea what language that is.");
            }
            sleep(3);
            
            System.out.println(" 1. That's a fine name. Now, may I please buy from your store? \n 2. Alright, I'm willing to pay. Can I see your wares? \n 3. Alright, what do you have for sale? \n 4. Whatever. Now give me what I want so I can leave this disgusting place.");
            choice3 = a.nextInt();
            switch (choice3) {
                 case 1: storeCost = (int)(storeCost * .6);
                 System.out.println("John: Unfortunately, there's a fee for outsiders to use a local store. You will have to pay " + storeCost + " Blik.");
                 payStoreCost();
                 case 2: storeCost = (int)(storeCost * .8);
                 System.out.println("John: I'm sorry, but outsiders have to pay a fee before buying from the store. It is " + storeCost + " Blik");
                 payStoreCost();
                 case 3: System.out.println ("John: Outsiders are required to pay a fee before they can buy from a local store. The cost is " + storeCost + "Blik");
                 payStoreCost();
                 case 4: storeCost = (int)(storeCost * 2);
                 System.out.println("John: Hahaha, not so fast. Outsiders have to pay a fee before they can buy from a local store. Someone as entitled as you should be able to pay " + storeCost + "Blik, shouldn't they?");
                 payStoreCost();
            }

        }
    }
    private void payStoreCost()
    {
        sleep(3);
        System.out.println ("Are you willing to pay the cost? \n 1. Yes \n 2. No");
        int pay = a.nextInt();
        
        switch (pay){
            case 1:
            if (Character.getMoney() >= storeCost){
                Character.remMoney(storeCost);
                storeUnlocked = true;
                System.out.println("John: Thank you for paying the fee! You can now buy from me whenever you want.");
                System.out.println("Congratulations! You payed the fee to use the store! You can now actually buy weapons and armor (The blacksmith should be the one selling those, and the storekeeper should sell potions, but the game's not done yet)");
            } else{
                System.out.println(Character.getName() + ": I don't have enough money.");
                System.out.println("John: Then come back when you have enough.");
                storeUnlocked = false;
            }
            break;
            case 2:
            System.out.println("Unhappy with the cost of the fee, you leave. Perhaps he will charge less if you are nicer next time.");
            sleep(2);
            break;
            default: System.out.println(Character.getName() + ": Awrar mongreadar Dorandamaloedar \nNarrator: Ok, can you at least speak English to me? It gets on my nerves");
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
}//end class UnlockTownStuff
