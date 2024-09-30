package assignment2;

import java.util.Random;

public class Die {
    // instance variable
    private int faceValue;

    // no arg constructor
    public Die() {
        int faceValue = 1;
    }

    // get the faceValue
    public int getFaceValue() {
        return faceValue;
    }

    // set the faceValue to an int
    public void setFaceValue(int fValue) {
        faceValue = fValue; // set the parameter to faceValue
    }

    // roll dice for a random num between 1-6 inclusive
    public void roll() {
        Random dice = new Random(); // create dice random object
        faceValue = dice.nextInt(1, 7); // set faceValue to random num between 1-6 inclusive
    }
}