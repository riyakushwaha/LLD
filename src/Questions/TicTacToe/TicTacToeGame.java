package Questions.TicTacToe;

import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    Board board;
    Deque<Player> turnQue;

    TicTacToeGame(int size){
        intializeGame(size);
    }

    private void intializeGame(int size) {
        board = new Board(size);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name of player1");
        String player1 = scn.nextLine();
        System.out.println("Enter name of player2");
        String player2 = scn.nextLine();

        Player playerX = new Player(player1, PieceType.X);
        Player playerO = new Player(player2, PieceType.O);

        turnQue.add(playerX);
        turnQue.add(playerO);
    }

    public String startGame(){
        boolean winner = false;
        Scanner scn = new Scanner(System.in);

        while(!winner){
            Player currPlayer = turnQue.getFirst();

//            int emptySpaces = board.getNumberOfEmptySpots();
//            if(emptySpaces == 0){
//                break;
//            }

            System.out.println("Enter pos in format [i,j]: ");
            String positions = scn.next();


        }

        return null;
    }



}
