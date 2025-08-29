package snakenladdergame;

import java.util.Deque;

public class Game {

    Board board;
    Deque<Player> players;
    Dice dice;

    Player winner = null;


    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        // TODO Auto-generated method stub

        board = new Board(10, 5, 5);
        dice = new Dice(1);


    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame() {

        while (winner == null) {
            Player playerTurn = findNextPlayerTurn();
            System.out.println("Player turn: " + playerTurn.id + " current position: " + playerTurn.currentPosition);

            int diceValue = dice.rollDice();

            System.out.println("Dice value: " + diceValue);

            int playerNewPosition = playerTurn.currentPosition + diceValue;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player new position: " + playerTurn.currentPosition);

            if (playerTurn.currentPosition == board.boardSize * board.boardSize - 1) {
                winner = playerTurn;
                System.out.println("Winner is: " + winner.id);
            } else {
                players.addLast(playerTurn);
            }

        }



    }
    Player findNextPlayerTurn () {

        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck ( int playerNewPosition){

        if(playerNewPosition >= board.boardSize * board.boardSize){
            return playerNewPosition;
        }
        Cells cells = board.getcells(playerNewPosition);
        if(cells.jump != null && cells.jump.start == playerNewPosition){
            return cells.jump.end;
        }
        return playerNewPosition;
    }
}


