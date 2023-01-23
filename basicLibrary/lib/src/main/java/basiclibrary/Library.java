/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    // Dice Roll Function
    public static int[] roll(int n) {
        Random rand = new Random();
        int[] diceRoll = new int[n];
        for (int i = 0; i < n; i++) {
            int randNum = rand.nextInt(6);
            diceRoll[i] = randNum + 1;
        }
        return diceRoll;
    }

    // Duplicates Function

        public boolean containsDuplicates(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++){
                    if (i == j) continue;
                if array[i] == array[j])
                return true;
                }
            }
            return false;
            }

    // Calculating Averages
    public static int calculateAverage(int[] arrayOfValues){
        int sum=0;
        int arrayLength = arrayOfValues.length;
        for (int i = 0; i < arrayOfValues.length; i++) {
            sum = sum + arrayOfValues[i];
        }
        return sum/arrayLength;
    }

    //Array of Arrays
    public int[] lowestAverageArray(int[][] weeklyMonthTemperatures){
        int[] lowestAverageArray = weeklyMonthTemperatures[0];
        int lowestAverage = calculateAverage(weeklyMonthTemperatures[0]);
        for (int i = 0; i < weeklyMonthTemperatures.length ; i++) {

            int currentArrayAverage = calculateAverage(weeklyMonthTemperatures[i]);
            if(currentArrayAverage < lowestAverage){
                lowestAverageArray = weeklyMonthTemperatures[i];
            }
        }
        return lowestAverageArray;
    }
}



//LAB 03
    //Analyzing Weather Data Function

    //Loop Through weather data
    //Find min values
    //Find Max Values
    //Return a string that contains the values not shown during the month
    public static String findNum(int [][] weeklyMonthTemp) {
        int max = 0;
        int min = 1000;
        int currentVal = 0;
        String missingVal = "";
        HashSet<Integer> maxAndMin = new HashSet<>();
        for (int i = 0; i < weeklyMonthTemp.length; i++) {
            for (int j = 0; j < weeklyMonthTemp[i].length; j++) {
                maxAndMin.add(weeklyMonthTemp[i][j]);
                currentVal = weeklyMonthTemp[i][j];
                if (max < currentVal){
                    max = currentVal;
                } else if (min > currentVal) {
                    min = currentVal;
                }
            }

        }
        missingVal += "High: " + max + "\n";
        missingVal += "Low: " +min + "\n";
        for (int i = min; i < max; i++) {
            if (!maxAndMin.contains(i)) {
                missingVal += "Never saw temperature: " + i + "\n";
            }
        }
        return missingVal;
    }

}
   




