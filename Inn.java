
/**
 * Inn.java
 * This class represents the Inn in the town
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
 */
public class Inn implements Town
{
    public void ask()
    {
        System.out.println("What would you like to do? \n 1. Sleep (Fully heal and save your game)");
        int choice1 = Start.a.nextInt();
        switch(choice1) {
            case 1:
            function(choice1);
        }
    }
    
    public void function (int choice)
    {
        
        switch(choice) {
            case 1:
            Save.saveGame();
        }
    }
}//end class Inn
