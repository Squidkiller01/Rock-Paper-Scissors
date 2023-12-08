//Michael Porter
//Eric Gray
//CIT 149 (Java) | Midterm program
//2/21/2023
import static java.lang.Math.*;
public class Rock_Paper_Scissors {
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
        boolean gameOver = false;
        int PlayerScore = 0;
        int ComputerScore = 0;
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Play best of: ");
        int bestOf = in.nextInt();
        while(gameOver == false){
            int yourHand = option();
            result = compute(yourHand);
            gameOver = false;
            if(result == "Win"){
                PlayerScore += 1;
            }else if(result == "Lost"){
                ComputerScore +=1;
            }
            System.out.println("Score: " + PlayerScore + " - " + ComputerScore);
            if(PlayerScore == bestOf || ComputerScore == bestOf){
                system.out.println("Game Over!");
                if(PlayerScore == bestOf){
                    system.out.println("The winner is You!");
                    gameOver = true;
                }else if(ComputerScore == bestOf){
                    system.out.println("The winner is Computer!");
                    gameOver = true;
                }
            }
        }
    }
    public static int option(){
        System.out.println("\tMenu\n\n(1) Rock\n(2) Paper\n(3) Scissors" + "\n\nEnter Your Hand (1, 2, or 3): ");
        int yourHand = in.nextInt();
        return yourHand;
    }
    public static String compute(int yourHand){
        computerHand = ((int)(Math.random() * 100) % 3 + 1);
        switch(yourHand){
            case 1: if(computerHand == 1){
                return result = "Draw";
            }else if(computerHand == 2){
                return result = "Lost";
            }else if(computerHand == 3){
                return result = "Win";
            }
            case 2: if(computerHand == 1){
                return result = "Win";
            }else if(computerHand == 2){
                return result = "Draw";
            }else if(computerHand == 3){
                return result = "Lost";
            }
            case 3: if(computerHand == 1){
                return result = "Lost";
            }else if(computerHand == 2){
                return result = "Win";
            }else if(computerHand == 3){
                return result = "Draw";
            }
        }
    }
}