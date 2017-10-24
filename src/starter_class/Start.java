/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter_class;

import java.util.Arrays;

/**
 *
 * @author Milos Dragovic
 */
public class Start {

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int position = i;
            System.out.println("Smallest is " + smallest + " witch postition is " + position + "\n");
            for (int j = i; j < arr.length; j++) {
                System.out.println(j + " " + (arr[j] < smallest) + "");
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    position = j;
                    System.out.println("Now smallest value has changed and its " + smallest);
                }
            }

            int temp = arr[i];
            arr[i] = smallest;
            arr[position] = temp;
            System.out.println("On " + i + ". iterations, array looks like this: " + Arrays.toString(arr));

        }
        return arr;
    }

    static int minValue(int[] arr) {
        int numberSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < numberSmallest) {
                numberSmallest = arr[i];
            }
        }
        System.out.println(numberSmallest);
        return numberSmallest;
    }

    static double averageValue(int[] arr) {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println("sum = : "+sum + " count in array is "+arr.length+ " avg is "+sum/arr.length);
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-9, 4, 1, 9, 7, 1, 3, 6, 5};
//        selectionSort(array);
//        selectionSort(new int[]{1,1,1,1,1,1});

        minValue(array);
        averageValue(array);
    }
}
