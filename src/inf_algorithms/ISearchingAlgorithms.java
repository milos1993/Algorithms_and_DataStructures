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
public interface ISearchingAlgorithms {
    /***/
    boolean linearSearch(int[] arr, int num);

    /**
     *Binary search, recusive algo for searching wanted number, represents better version than algo for linear search.
     * 
     *
     * 
     * @param v   number that you are looking for, 
     * @param arr given array, 
     * @param l   index of most left num in array  #0
     * @param r   index of most right num in array #(array.length-1)
     * @return
     */
    boolean binarySearch(int v, int[]arr, int l, int r);
}
