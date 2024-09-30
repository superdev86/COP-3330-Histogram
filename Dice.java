package assignment2;

public class Dice {

    // instance variables
    private Die dice1;
    private Die dice2;

    // no args constructor
    public Dice() {
        dice1 = new Die();
        dice2 = new Die();
    }

    // get sum of faceValues
    public int getFaceValuesSum() {
        // return the sum of faceValues
        return dice1.getFaceValue() + dice2.getFaceValue();
    }

    // roll both dice
    public void doubleRoll() {
        dice1.roll();
        dice2.roll();
    }
}