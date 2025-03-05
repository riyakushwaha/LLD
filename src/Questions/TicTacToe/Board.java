package Questions.TicTacToe;

public class Board {
    int size;
    PieceType [][] gameBoard;

    Board(int size){
        this.size = size;
        this.gameBoard = new PieceType[size][size];
    }


}
