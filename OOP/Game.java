package OOP;

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
}
