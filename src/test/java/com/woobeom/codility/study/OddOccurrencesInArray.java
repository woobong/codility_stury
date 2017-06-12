package com.woobeom.codility.study;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb.heo on 2017-06-01.
 */
public class OddOccurrencesInArray {

    int solution(int[] oddOccurrencesArray) {

        Set<Integer> set = new HashSet<>();

        for(int i : oddOccurrencesArray) {
            if ( set.contains(i)){
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.iterator().next();
    }

    @Test
    public void run(){
        int[] array = new int[] {7,9,7,9,7,9,7,9,7,9,7,3};
        int result = solution(array);
        System.out.println("result = " + result);
    }

}