
/**
 * GeneralStore.java
 * This class represents the general store in the game.
 * 
 * @author Orion Duffy and Emily Doran
 * @version 6-12-17
 */
public class GeneralStore implements Town
{
   public GeneralStore()
   {
       
   }
   
   public void ask()
   {
       System.out.println("What would you like to buy?");
       Start.sleep(2);
       
       for(int i = 0; i < Start.equipmentLength(); i++)
       {
           System.out.println(" " + i + ". " + Start.getEquipment(i).getName() + "| Attack: " + Start.getEquipment(i).getAttack() + "| Defense: " + Start.getEquipment(i).getDefense());
       }
       Start.sleep(2);
       
       int answer = -2;
       
       while(answer < 0 || answer >= Start.equipmentLength())
       {
           System.out.println("Please choose one of the numbers in the list, or choose -1 to leave");
           answer = Start.a.nextInt();
       }
       
       if(answer > -1)
            function(answer);
   }
   
   public void function(int choice)
   {
       String debug = Start.a.nextLine();
       
       Equipment item = Start.getEquipment(choice);
       int cost = item.getAttack() * 10 + item.getDefense() * 10;
       
       
       if(cost >= Character.getMoney())
       {
           if(item instanceof Armor)
           {
               Character.setArmor((Armor)item);
               Character.remMoney(cost);
           }
           else if(item instanceof Weapon)
           {
               Character.setWeapon((Weapon)item);
               Character.remMoney(cost);
           }
           else
               System.out.println("Error! Object is neither armor nor weapon!");
       }
       else
       {
           System.out.println("You cannot afford that item!");
       }
   }

   private void buyItem(int choice)
   {
       
    } //end class GeneralStore
}
