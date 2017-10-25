/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter_class;

import implementation_algorithms.SearchingAlgorithms;
import implementation_algorithms.SortingAlgorithms;


/**
 *
 * @author Milos Dragovic
 */
public class Start {

     

  

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,4,2,6};
//        SortingAlgorithms obj1 = new SortingAlgorithms();
//        obj1.selectionSort(array);
        
            
        SearchingAlgorithms obj2 = new SearchingAlgorithms();
        System.out.println(obj2.LinearSearch(array, 12)) ;
//        SortArrowIconselectionSort(array);
//        selectionSort(new int[]{1,1,1,1,1,1});

//        minValue(array);
//        averageValue(array);
    }
}
