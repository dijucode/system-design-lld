package designtictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player> players;
    Board gameBoard;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Player 1", PieceType.X);
        Player player2 = new Player("Player 2", PieceType.O);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }


    // Inside your Game class
    public String startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean noWinner = true;
        while (noWinner && !gameBoard.getFreeCells().isEmpty()) {
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            int r, c;
            while (true) {
                System.out.print(playerTurn.getName() + ", enter row and column (e.g., 0 1): ");
                r = scanner.nextInt();
                c = scanner.nextInt();
                if (gameBoard.addPiece(
                        playerTurn.getPieceType() == PieceType.X ? new PlayingPieceX() : new PlayingPieceO(),
                        r, c)) {
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            if (gameBoard.checkWinner(playerTurn.getPieceType())) {
                gameBoard.printBoard();
                System.out.println(playerTurn.getName() + " wins!");
                scanner.close();
                return playerTurn.getName() + " wins!";
            }
            players.addLast(playerTurn);
        }
        gameBoard.printBoard();
        System.out.println("Game Over. It's a draw!");
        scanner.close();
        return "Game Over. It's a draw!";
    }
}