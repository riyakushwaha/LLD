package Questions.TicTacToe;

public class Player {
    String name;
    PieceType playingPiece;

    public Player(String name, PieceType piece) {
        this.name = name;
        this.playingPiece = piece;
    }

    public String getName() {
        return name;
    }

    public PieceType getPlayingPiece() {
        return playingPiece;
    }
}
