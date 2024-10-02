

public class King extends ChessPiece{

    King(String color){
        super(color);
    }
    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && chessBoard.board[line][column] != null){
            if(Math.abs(line-toLine) == 1 && Math.abs(column-toColumn) == 1){
                if(chessBoard.board[toLine][toColumn] == null) return true;
                else return !chessBoard.board[toLine][toColumn].getColor().equals(color);
            }
            else if(Math.abs(line-toLine) == 1 && Math.abs(column-toColumn) == 0){
                if(chessBoard.board[toLine][toColumn] == null) return true;
                else return !chessBoard.board[toLine][toColumn].getColor().equals(color);
            }
            else if(Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) == 1) {
                if(chessBoard.board[toLine][toColumn] == null) return true;
                else return !chessBoard.board[toLine][toColumn].getColor().equals(color);
            }
        }
        else return false;
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
    public boolean isUnderAttack(ChessBoard board, int line, int column){
        for(int i = 0; i < board.board.length; i++){
            for (int j = 0; j < board.board[0].length; j++) {
                if(board.board[i][j] != null) {
                    if (!board.board[i][j].getColor().equals(color)) {
                        if (board.board[i][j].canMoveToPosition(board,i,j,line,column)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
