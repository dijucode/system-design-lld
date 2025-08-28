package designtictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    PlayingPiece[][] board;

    Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(PlayingPiece piece, int row, int col) {
        if (row >= size || col >= size || row < 0 || col < 0 || board[row][col] != null) {
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public List<List<Integer>> getFreeCells() {
        List<List<Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    freeCells.add(cell);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }


    public boolean checkWinner(PieceType pieceType) {
//        logic to check winner
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null || board[i][j].pieceType != pieceType) {
                    rowWin = false;
                }
                if (board[j][i] == null || board[j][i].pieceType != pieceType) {
                    colWin = false;
                }
            }
            if (rowWin || colWin) {
                return true;
            }
        }

        // Check diagonals
        boolean diag1Win = true;
        boolean diag2Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] == null || board[i][i].pieceType != pieceType) {
                diag1Win = false;
            }
            if (board[i][size - 1 - i] == null || board[i][size - 1 - i].pieceType != pieceType) {
                diag2Win = false;
            }
        }
        return diag1Win || diag2Win;
    }
}
