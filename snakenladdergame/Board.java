package snakenladdergame;

import java.util.Random;

public class Board {


    int boardSize;
    int noOfSnakes;
    int noOfLadders;

    private Random rand = new Random();




    Cells [][] cells;

    public Board(int boardSize, int noOfSnakes, int noOfLadders) {
        cells = new Cells[boardSize][boardSize];

        this.boardSize = boardSize;
        this.noOfSnakes = noOfSnakes;
        this.noOfLadders = noOfLadders;

        // Initialize cells
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cells();

            }
        }
    }

    private void placeSnakes(int noOfSnakes) {
        while (noOfSnakes > 0) {
            int start = rand.nextInt(boardSize * boardSize - 1) + 1; // avoid 0
            int end = rand.nextInt(start); // end < start

            if (start <= end) continue; // ensure snake goes down

            int startRow = start / boardSize;
            int startCol = start % boardSize;

            cells[startRow][startCol].setJump(new Jump(start, end));
            noOfSnakes--;
        }
    }

    private void placeLadders(int noOfLadders) {
        while (noOfLadders > 0) {
            int start = rand.nextInt(boardSize * boardSize - 1); // avoid last cell
            int end = rand.nextInt(boardSize * boardSize - start - 1) + start + 1; // end > start

            if (start >= end) continue; // ensure ladder goes up

            int startRow = start / boardSize;
            int startCol = start % boardSize;

            cells[startRow][startCol].setJump(new Jump(start, end));
            noOfLadders--;
        }
    }

    public Cells getcells(int position) {
        int row = position / boardSize;
        int col = position % boardSize;
        return cells[row][col];
    }

}
