package activities;

/*
    Activity 25: Average of Elements in an Array (Group Activity)

    Objective:
        Find the Average of Elements in an Array:

    Description:
        This activity calculates the average of all elements in a given array.

    --------------------------------------------------
    Test Data 1:
    Array: [10, 15, 20, 25, 30]

    Expected Output:
    Test Data 1: Average = 20
    --------------------------------------------------
    Test Data 2:
    Array: [5, 5, 5, 5, 5]

    Expected Output:
    Test Data 2:
    Average = 5
*/

import java.util.Arrays;

/**
 * Group 2 - Agile Achievers
 *
 * @author Bonayon, Christian - Team Lead
 * @author Baito, Mary Christine Anne - Team Secretary
 * @author Duldulao, Frank Joshua - Sub-Team Lead
 * @author Gozun, Jessa Nazarene - Minutes of the Meeting (MOM)
 * @author Padron, Neil Patrick - Team Facilitator
 */
public class AverageElementsArray {
    public static void main(String[] args) {
        int[] testDataArray1 = {10, 15, 20, 25, 30}; // Test Data 1

        System.out.println("Array: " + Arrays.toString(testDataArray1));
        System.out.println("Test Data 1");
        System.out.println("Average = " + averageOfAllElements(
                sumOfAllElements(testDataArray1),
                testDataArray1.length));

        System.out.println("-------------------------------------");

        int[] testDataArray2 = {5, 5, 5, 5, 5}; // Test Data 2

        System.out.println("Array: " + Arrays.toString(testDataArray2));
        System.out.println("Test Data 2");
        System.out.print("Average = " + averageOfAllElements(
                sumOfAllElements(testDataArray2),
                testDataArray2.length));
    }

    public static int sumOfAllElements(int[] arrayNumberList) {
        int sum = 0;
        int index = 0;

        while (index < arrayNumberList.length) {
            sum += arrayNumberList[index];
            index++;
        }

        return sum;
    }

    public static int averageOfAllElements(int sum, int numberListCount) {
        return sum / numberListCount;
    }
}
