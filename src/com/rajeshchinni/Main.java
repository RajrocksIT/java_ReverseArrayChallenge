package com.rajeshchinni;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        -Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name ReverseArrayChallenge.

        int[] array1 = {1,2,3,4,5,6,7,8,9};
        System.out.println("array1 is " + Arrays.toString(array1));  //Arrays.toString prints the contents of an entire array with comma separated.

        reverse(array1);
        System.out.println("Reverse of array1 is " + Arrays.toString(array1));

    }

    private static void reverse(int[] array){

        // For example elements 0,1,2,3,4 have values of 1,2,3,4 and 5.
        // then maxIndex = 4, halfLength = 2
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength;i++){        // when i = 0
            int temp = array[i];                    // int temp = array[0]
            array[i] = array[maxIndex - i];         // array[0] = array[4]
            array[maxIndex - i] = temp;             // array[4] = temp
        }                                           // when i = 1
    }                                               // int temp = array[1]
}                                                   // array[1] = array[3]
                                                    // array[3] = temp