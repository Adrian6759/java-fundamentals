/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
// Dice Roll Function
    public static int[] roll(int n) {
        Random rand = new Random();
        int[] diceRoll = new int[n];
        for (int i = 0; i < n; i++) {
            int randNum = rand.nextInt(5);
            diceRoll[i] = randNum + 1;
        }
        return diceRoll;
    }

    // Duplicates Function

//    public static void () {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++);
//            }
//        }
//        return boolean;
}

