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
    public boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Number has found ");
                return true;
            }
        }
        System.out.println("Number you are looking for, didnt find in given array");
        return false;
    }
    
    @Override
    public boolean binarySearch(int v, int[] arr, int l, int r) {
        if (l > r) {
        System.out.println("not found");
        return false;
    }    
    int middle = (l+r)/2;
    if (v == arr[middle]) {
        System.out.println("found! It is at " + middle);
        return true;
    }
    else if (v > arr[middle]) {
        return binarySearch(v, arr, middle+1, r);
    }
    else {
        return binarySearch(v, arr, l, middle-1);
    }
    }
}
