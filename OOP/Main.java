package OOP;

import OOP.Game;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        String computerPick = game.getComputerPick();
        String userPick = game.getUserPick();
        String result = game.getResult(computerPick, userPick);

        System.out.println("User Pick: " + userPick);
        System.out.println("Computer Pick: " + computerPick);
        System.out.println("You " + result);
    }
}
