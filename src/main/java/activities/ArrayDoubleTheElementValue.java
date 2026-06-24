package com.activities;

/*
    Activity 23: Double the element value - Group Activity

    Objective:
        Given an array of integers, return a new array with each value doubled.

    Test data 1:
    input: [1, 2, 3]
    expected output: [2, 4, 6]

    --------------------------------------------------
    Test data 2:
    input: [5, 10, 15, 20]
    expected output: [10, 20, 30, 40]
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
public class ArrayDoubleTheElementValue {
    public static void main(String[] args) {
        int[] testDataArray1 = {1, 2, 3};

        System.out.println("input: " + Arrays.toString(testDataArray1));
        System.out.println("expected output: " + Arrays.toString(doubleArrayElements(testDataArray1)));

        System.out.println("-------------------------------------");

        int[] testDataArray2 = {5, 10, 15, 20};

        System.out.println("input: " + Arrays.toString(testDataArray2));
        System.out.println("expected output: " + Arrays.toString(doubleArrayElements(testDataArray2)));
    }

    public static int[] doubleArrayElements(int[] arrayNumberList) {
        int[] outputArray = new int[arrayNumberList.length];
        int index = 0;

        while (index < arrayNumberList.length) {
            outputArray[index] = arrayNumberList[index] * 2;
            index++;
        }

        return outputArray;
    }
}
