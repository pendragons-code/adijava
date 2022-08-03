import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("******************************************************");
        System.out.println("\t\tWELCOME TO JAVA DRINKS!!\t\t");
        System.out.println("******************************************************");
       

        Item[][] items = new Item[][] {
            { new Item("jerk", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);
        System.out.println(machine);
        Scanner sc = new Scanner(System.in);
        System.out.println("go Ahead choose a drink");
        while(true){

        

        System.out.print("Pick a row: "); 
        int row = sc.hasNextInt() ? sc.nextInt() : 404;


        System.out.print("Pick a spot in the row: "); 
        int spot = sc.hasNextInt() ? sc.nextInt() : 404;

        sc.nextLine();
        if(row == 404 || spot ==404){
            System.out.println("invalid input");
            continue;
        } else if(row < 0 || row>machine.getLength() -1 || spot<0 || spot >machine.getRowLength()-1){
            System.out.println("invalid input");
            continue;
        }




        

       boolean sold = machine.dispense(row, spot);

        System.out.println("\n" + machine);

        if(sold == true){
            System.out.println("\n Enjoy your drink press 1 to continue to anotherpurchase : ");
    

        } else{
            System.out.println("sorry we are out of the items press 1 to purchase another : ");
        }
        if(sc.nextInt()!=1){
            break;
        }
    }
    sc.close();
         




        

        
        
        
        

    }
}