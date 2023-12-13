package Collections.TicTacToe;

import java.util.ArrayList;

public class Board {

    ArrayList<String> board = new ArrayList<>();
    void addElements(){
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
    }

    void printBoard(){
        System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
        System.out.println("-----------");
        System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
        System.out.println("-----------");
        System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));
    }

    boolean updateBoard(int position, String type){
        boolean returnValue;

        if (board.get(position - 1).equals(" ")){
            board.set(position - 1, type);

            returnValue = true;
        }else {
            System.out.println("Position already selected. Select another position");
            returnValue = false;
        }
        return returnValue;
    }


}
