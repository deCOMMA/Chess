
import com.sun.source.tree.BreakTree;

public class Rook extends ChessPiece{

    Rook(String color){
        super(color);
    }
    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && chessBoard.board[line][column] != null){
            if(toLine != line || column != toColumn){
                if(column == toColumn){
                    int div = Math.abs(line - toLine) - 1;
                    int count = 0;
                    for(int i = Math.min(line,toLine) + 1; i < Math.max(line,toLine); i++){
                        if(chessBoard.board[i][column] == null){
                            count++;
                        }
                    }
                    if(div == count){
                        if(chessBoard.board[toLine][toColumn] == null) return true;
                        else return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                    }
                    else return false;
                }
                else if (line == toLine) {
                    int div = Math.abs(column - toColumn) - 1;
                    int count = 0;
                    for(int i = Math.min(column,toColumn) + 1; i < Math.max(column,toColumn); i++){
                        if(chessBoard.board[line][i] == null){
                            count++;
                        }
                    }
                    if(div == line){
                        if(chessBoard.board[toLine][toColumn] == null) return true;
                        else return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                    }
                    else return false;
                }
            }else return false;
        }else return false;
        return false;
    }
    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
