package bg.softuni;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "";
        do{
            System.out.println("Rolling the dices...");
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;

            System.out.println("You rolled a " + dice1 + " and a " + dice2);
            System.out.println("Total of " + sum);
            System.out.println("Do you want to play again? (y/n)");
            playAgain = scanner.nextLine();
        }while(playAgain.equals("y"));

        System.out.println("Thanks for playing");
    }
}