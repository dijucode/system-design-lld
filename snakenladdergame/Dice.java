package snakenladdergame;

public class Dice {

    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {

        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCount) {
            int randomNum = (int) (Math.random() * (max - min + 1)) + min;
            totalSum += randomNum;
            diceUsed++;
        }
        return totalSum;

    }
}
