
public class Horse extends ChessPiece{
    public Horse(String color){
        super(color);
    }
    @Override
    public String getColor() {
        return super.color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if( toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7){
            if(line - toLine == -2 && column - toColumn == 1){
                if(chessBoard.board[line+1][column] == null && chessBoard.board[line+2][column] == null){
                    if(chessBoard.board[line+2][column-1] == null)return true;
                    else return  !chessBoard.board[line+2][column-1].getColor().equals(color);
                }
                else if(chessBoard.board[line][column-1] == null && chessBoard.board[line+1][column-1] == null && !chessBoard.board[line+2][column-1].getColor().equals(color)){
                    if(chessBoard.board[line+2][column-1] == null)return true;
                    else return  !chessBoard.board[line+2][column-1].getColor().equals(color);
                }
            }
            else if(line - toLine == -2 && column - toColumn == -1){
                if(chessBoard.board[line+1][column] == null && chessBoard.board[line+2][column] == null){
                    if(chessBoard.board[line+2][column+1] == null)return true;
                    else return  !chessBoard.board[line+2][column+1].getColor().equals(color);
                }
                else if(chessBoard.board[line][column+1] == null && chessBoard.board[line+1][column+1] == null ){
                    if(chessBoard.board[line+2][column+1] == null)return true;
                    else return  !chessBoard.board[line+2][column+1].getColor().equals(color);
                }
            }
            else if(line - toLine == 2 && column - toColumn == -1){
                if(chessBoard.board[line-1][column] == null && chessBoard.board[line-2][column] == null){
                    if(chessBoard.board[line-2][column+1] == null)return true;
                    else return  !chessBoard.board[line-2][column+1].getColor().equals(color);
                }
                else if(chessBoard.board[line][column+1] == null && chessBoard.board[line-1][column+1] == null){
                    if(chessBoard.board[line-2][column+1] == null)return true;
                    else return  !chessBoard.board[line-2][column+1].getColor().equals(color);
                }
            }
            else if(line - toLine == 2 && column - toColumn == 1){
                if(chessBoard.board[line-1][column] == null && chessBoard.board[line-2][column] == null){
                    if(chessBoard.board[line-2][column-1] == null)return true;
                    else return  !chessBoard.board[line-2][column-1].getColor().equals(color);
                }
                else if(chessBoard.board[line][column-1] == null && chessBoard.board[line-1][column-1] == null){
                    if(chessBoard.board[line-2][column-1] == null)return true;
                    else return  !chessBoard.board[line-2][column-1].getColor().equals(color);
                }
            }
        }
        else if(line - toLine == -1 && column - toColumn == -2){
            if(chessBoard.board[line][column+1] == null && chessBoard.board[line][column+2] == null){
                if(chessBoard.board[line+2][column+1] == null)return true;
                else return  !chessBoard.board[line+2][column+1].getColor().equals(color);
            }
            else if(chessBoard.board[line+1][column] == null && chessBoard.board[line+1][column+1] == null ){
                if(chessBoard.board[line+2][column+1] == null)return true;
                else return  !chessBoard.board[line+2][column+1].getColor().equals(color);
            }
        }
        else if(line - toLine == 1 && column - toColumn == -2){
            if(chessBoard.board[line][column+1] == null && chessBoard.board[line][column+2] == null){
                if(chessBoard.board[line-1][column+2] == null)return true;
                else return  !chessBoard.board[line-1][column+2].getColor().equals(color);
            }
            else if (chessBoard.board[line-1][column] == null && chessBoard.board[line-1][column+1] == null){
                if(chessBoard.board[line-1][column+2] == null)return true;
                else return  !chessBoard.board[line-1][column+2].getColor().equals(color);
            }
        }
        else if(line - toLine == 1 && column - toColumn == 2){
            if(chessBoard.board[line][column-1] == null && chessBoard.board[line][column-2] == null) {
                if(chessBoard.board[line-1][column-2] == null)return true;
                else return  !chessBoard.board[line-1][column-2].getColor().equals(color);
            }else if (chessBoard.board[line-1][column] == null && chessBoard.board[line-1][column-1] == null ){
                if(chessBoard.board[line-1][column-2] == null)return true;
                else return  !chessBoard.board[line-1][column-2].getColor().equals(color);
            }
        }
        else if(line - toLine == -1 && column - toColumn == 2){
            if(chessBoard.board[line][column-1] == null && chessBoard.board[line][column-2] == null) {
                if(chessBoard.board[line+1][column-2] == null)return true;
                else return  !chessBoard.board[line+1][column-2].getColor().equals(color);
            }else if (chessBoard.board[line+1][column] == null && chessBoard.board[line+1][column-1] == null){
                if(chessBoard.board[line+1][column-2] == null)return true;
                else return  !chessBoard.board[line+1][column-2].getColor().equals(color);
            }
        }
        else return false;
        return false;
    }
    @Override
    public String getSymbol() {
        return "H";
    }
}