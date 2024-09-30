package assignment2;

//  Christopher Stephenson
//  P2 6/28/24
//  This program will roll two dice 1000 times, add the sum of the two dice that were rolled,
//  count the number of times each sum was rolled, then add the number of occurrences to a histogram.

public class Stephenson_Christopher {

    public static void main(String[] args) {
        Dice dice = new Dice(); // initialize dice obj
        int[] occurrences = new int[11]; // initialize arr with 10 elements at 0

        // roll the dice 1000 times and count the occurrences of each face value
        for (int i = 0; i < 1000; i++) {
            dice.doubleRoll();
            int sum = dice.getFaceValuesSum();
            occurrences[sum - 2] += 1; // at idx of sum - 1, increment by 1
        }

        // print the number of times each face value has been rolled
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println("Number of " + (i + 2) + "s are " + occurrences[i]);
        }

        System.out.println("Graph");

        // print y axis and stars for each occurrence
        for (int y = 150; y >= 0; y -= 25) {
            System.out.printf("%3d|", y); // print y axis numbers from 150 to 0 with proper spacing
            // for each element in occurrences check if it is greater than the y axis num and print a star or spaces
            for (int occurrence : occurrences) {
                if (occurrence >= y) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // graph format for x axis
        System.out.println("\t--------------------------------");
        System.out.print("\t");
        //print x axis
        for (int x = 2; x <= 12; x++) {
            if (x < 10) {
                System.out.print(x + "  ");
            } else {
                System.out.print(x + " ");
            }
        }
    } // end main
}