/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf_algorithms;

/**
 *
 * @author acer e1
 */
public interface ISortingAlgorithms {

    /**
     * In this method we have ilustration of how selection sort algorithms
     * actually works, input parametar is simple array of integer @param arr and
     * return value is itselg but previously sorted
     *
     * @param arr
     * @return int[]
     *
     */
    int[] selectionSort(int[] arr);

    int[] bubbleSort(int[] arr);

    /**
     *
     * @param arr
     * @return int[]
     */
//    int[] mergeSort(int[]arr);
}
