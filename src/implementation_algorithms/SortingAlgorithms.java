/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation_algorithms;

import java.util.Arrays;
import inf_algorithms.ISortingAlgorithms;

/**
 *
 * @author Milos Dragovic
 */
public class SortingAlgorithms implements ISortingAlgorithms {

    /**
     * In this method we have ilustration of how selection sort algorithms
     * actually works, input parametar is simple array of integer @param arr and
     * return value is itselg but previously sorted
     *
     * @param arr
     * @return int[]
     *
     */
    @Override
    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int position = i;
            System.out.println("Smallest value is " + smallest + " witch postition is " + position);
            for (int j = i; j < arr.length; j++) {
                System.out.println(j + " " + (arr[j] < smallest) + "");
                if (arr[j] < smallest) {
                    //Here we storege position and value of min num
                    smallest = arr[j];
                    position = j;
                    System.out.println("New smallest value has changed and its value is " + smallest + " and its " + position + ". position");
                }
            }
            //swaping position 
            int temp = arr[i];
            arr[i] = smallest;
            arr[position] = temp;
            System.out.println("On " + i + ". iterations, array looks like this: " + Arrays.toString(arr) + "\n");

        }
        return arr;
    }

    
    @Override
    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    @Override
    public int[] megeSort(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        }
