import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String newItem = "";
        Integer num = 0;
        int delete = 0;
        String menu = "A - Add an item to the list\nD - Delete an item from the list\nI - Insert an item into the list\nP - Print the list\nQ - Quit the program\nSelect a menu option[A,D,I,P,Q]: ";
        String continueYN = "";

        ArrayList<String> myArrList = new ArrayList<>();

      //  String var = myArrList.get(m);
       // myArrList.add(m, "Some String");
       // myArrList.size();
       // myArrList.set(m, "New String Value");
        Boolean done = false;
        String quit = "";
        String trash = "";

        do {
            System.out.println("\nCurrent List:");
            for(int i = 0; i < myArrList.size();i++)
            {
               System.out.println((i + 1) + ". " + myArrList.get(i));
            }
            System.out.println("\nSelect an action from the menu:");
            System.out.print(menu);
            menuChoice = in.nextLine();

            if (menuChoice.equalsIgnoreCase("A"))
            {
                System.out.print("\nEnter the item you would like to add: ");
                newItem = in.nextLine();
                myArrList.add(newItem);
                done = true;
            }
            else if (menuChoice.equalsIgnoreCase("D"))
            {
                System.out.print("Select the item number you would like to delete: ");
                delete = in.nextInt() - 1;
                if(delete >= 0 && delete < myArrList.size())
                {
                    myArrList.remove(delete);
                    done = true;
                }
                else
                {
                    System.out.println("Invalid number selected for deletion.");
                }
                in.nextLine();

            }
            else if (menuChoice.equalsIgnoreCase("I"))
            {
                    System.out.print("Select the item number where you would like to insert the new item: ");
                    num = in.nextInt() - 1;
                    in.nextLine();
                    System.out.print("Enter the item you would like to add:");
                    newItem = in.nextLine();
                    myArrList.add(num, newItem);
                    done = true;
            }
            else if (menuChoice.equalsIgnoreCase("P"))
            {
                done = false;
            }
            else if (menuChoice.equalsIgnoreCase("Q"))
            {
                System.out.print("Are you sure you want to quit [Y/N]?");
                quit = in.nextLine();
                if(quit.equalsIgnoreCase("Y"))
                {
                      done= false;
                      break;
                }
                else if(quit.equalsIgnoreCase("N"))
                {
                      done = true;
                }
                else
                {
                      System.out.println("You must enter an valid choice: " + quit);
                }
            }
            else
            {
                System.out.println("You must select an option from the menu: " + trash);
            }
            System.out.println("\nUpdated List:");
            {
                for (int i = 0; i < myArrList.size(); i++)
                {
                    System.out.println((i + 1) + ". " + myArrList.get(i));
                }
            }
            System.out.print("Do you want to edit the list [Y/N]?");
            continueYN = in.nextLine();
        }while(continueYN.equalsIgnoreCase("Y"));//continueYN);//continueYN = in.nextLine("Y"));

    }
}