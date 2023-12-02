package OOP;

import java.util.Scanner;

public class Game {
    String userPick;
    String computerPick;
    String result;

    String getComputerPick(){
        String computerPick;
        int randomNumber = (int)(Math.random() * 3) + 1;

        if(randomNumber == 1){
            computerPick = "rock";
        }else if (randomNumber == 2){
            computerPick = "paper";
        }else {
            computerPick = "scissors";
        }
        return computerPick;
    }

    String getUserPick(){
        Scanner input = new Scanner(System.in);
        String userPick;

        while (true){
            System.out.println("Enter rock, paper or scissors:");
            userPick = input.nextLine();

            if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")){
                break;
            }
        }
        return userPick;
    }

    String getResult(String userPick, String computerPick){
        if(userPick.equals(computerPick)){
            return "draw";
        } else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        } else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        } else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        }else{
            return "lose";
        }
    }
}
