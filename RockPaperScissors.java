import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args) {
        System.out.println("Are you Ready to play Rock,Paper,Scissors?(YES OR NO)");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if(option.equals("YES")){
            System.out.println("welcome to the game!!");
            System.out.println("please select between rock(1),paper(2) and scissors(3)");
            int select = sc.nextInt();
            switch (select) {
                case 1:System.out.println("you have choosen rock");break;
                case 2:System.out.println("you have choosen paper");break;
                case 3:System.out.println("you have choosen Scissors");break;
            
                default:System.out.println("choose correct option ");
                   
            }
            int systemPick = userRoll();
            System.out.println("the system has picked (1-rock,2-paper,3-Scissors) " + systemPick);
            Winner(systemPick, select);

         
    
        }
        else {
            System.out.println("Thank you for playing the game");
        }

        
    }

    public static int userRoll() {
        double random = 1 + Math.random()*3;
        return (int)random;
   
    }

    public static void Winner(int systemPick,int select) {
        if(systemPick == select){
            System.out.println("It is a draw");
        }
        else if(systemPick == 1 && select ==2){
            System.out.println("You win");
        }
        else if(systemPick == 2 && select == 3){
            System.out.println("You win");
        }
        else if(systemPick == 3 && select == 1){
            System.out.println("You win");
        }
        else if(systemPick == 1 && select == 3){
            System.out.println("You lose");

        }
        else if(systemPick == 2 && select == 1){
            System.out.println("You lose");

        }
        else if(systemPick == 3 && select == 2){
            System.out.println("You lose");
        }

        }
       



        
    }
