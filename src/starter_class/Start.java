/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter_class;

import implementation_algorithms.SearchingAlgorithms;
import implementation_algorithms.SortingAlgorithms;
import inf_algorithms.ISearchingAlgorithms;
import inf_algorithms.ISortingAlgorithms;
import java.util.Arrays;

/**
 *
 * @author Milos Dragovic
 */
public class Start {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 5, 4, 2, 2, 6};
        int[] array1 = {1,2,3,4,4,5,6,7,7,8};
        ISortingAlgorithms obj1 = new SortingAlgorithms();
//        obj1.selectionSort(array);

        ISearchingAlgorithms obj2 = new SearchingAlgorithms();
//        System.out.println(obj2.LinearSearch(array, 12));
//        SortArrowIconselectionSort(array);
//        selectionSort(new int[]{1, 1, 1, 1, 1, 1});
//        minValue(array);
//        averageValue(array);
//        obj1.bubbleSort(array);
        System.out.println(obj2.binarySearch(8, array1, 0, array1.length-1));
    }
}
