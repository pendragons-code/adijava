import java.util.Scanner;

public class TicTacToe{
    static Scanner scan = new Scanner(System.in);
    static String player1 = "X";
    static String player2 = "O";
    static char[][] board = {
        {'_', '_', '_'},
        {'_', '_', '_'},
        {'_', '_', '_'}
    };
    


    public static void main(String[] args) {
        System.out.println("LET'S Play Tic tac toe");
        printBoard(board);

        

       for(int i = 0 ; i<9; i ++){
        if(i%2==0){
            System.out.println("Turn : " + player1);
            int[] spot=askUser(board);
            board[spot[0]][spot[1]] = 'X';

        }
        else {
            System.out.println("Turn : " + player2);
            askUser(board);
            int[] spot=askUser(board);
            board[spot[0]][spot[1]] = 'O';
        }
        printBoard(board);

        int count = checkWin(board);
        if(count == 3){
            System.out.println("X wins");
            break;
        }
        else if(count == -3){
            System.out.println("O wins");
            break;


        }

       }



    }


    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.print("\n\n");
        }
    }


    public static int[] askUser(char[][] board){
        System.out.println();
        System.out.print("Pick a row and a coloumn : ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        while(board[row][element]== 'X' || board[row][element]== 'O' ){
            System.out.println("spot taken please try again");
            row = scan.nextInt();
            element = scan.nextInt();
        }
        return new int[] {row,element} ;
    }


    public static int checkWin(char[][] board){
        int count = 0;
        for(int i =0 ; i<board.length;i++){
            for(int j =0;j<board[i].length;j++){
               if(board[i][j] == 'X'){
                count++;
               } else if(board[i][j] == 'O'){
                count--;
               }

            }
        }
        if(count == 3 || count == -3){
            return count;
        } else{
            count = 0 ;
        }


        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<board.length;j++){
                if(board[j][i]=='X'){
                    count++;
                }
                else {
                    count--;
                }
            }
        }

        if(count == 3 || count == -3){
            return count;
        } else {
            count = 0 ;
        }

        for(int i = 0 ; i<3;i++){
            if(board[i][i] == 'X'){
                count++;
            } else if(board[i][i] == 'O'){
                count--;
            }
            
        }
        if(count == 3 || count == -3){
            return count;
        } else{
            count = 0 ;
        }


        for(int i = 0 ; i<3;i++){
            int rowIndex = 2-i;
            if(board[rowIndex][i] == 'X'){
                count++;
            } else if(board[rowIndex][i] == 'O'){
                count--;
            }
            
        }









        return count;
    }

       
        
    }

       

    


