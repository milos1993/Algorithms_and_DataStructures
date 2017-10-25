/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation_algorithms;

import inf_algorithms.ISearchingAlgorithms;

/**
 *
 * @author Milos Dragovic
 */
public class SearchingAlgorithms implements ISearchingAlgorithms {

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
            sum += arr[i];
        }
        System.out.println("sum = : " + sum + " count in array is " + arr.length + " avg is " + sum / arr.length);
        return sum / arr.length;
    }

    @Override
    public boolean LinearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Number has found ");
                return true;
            }
        }
        System.out.println("Number you are looking for, didnt find in given array");
        return false;
    }
}
