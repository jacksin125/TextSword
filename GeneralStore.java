
/**
 * Write a description of class GeneralStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneralStore implements Town
{
   public GeneralStore()
   {
       
   }
   
   public void ask()
   {
       System.out.println("What would you like to buy?");
       
       for(int i = 0; i < Start.equipmentLength(); i++)
       {
           System.out.println(i + ". " + Start.getEquipment(i).getName() + " Attack: " + Start.getEquipment(i).getAttack() + " Defense: " + Start.getEquipment(i).getDefense());
       }
   }
   
   public void function(int choice)
   {
       int answer = Start.a.nextInt();
       String debug = Start.a.nextLine();
   }
}
