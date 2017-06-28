package com.woobeom.codility.study;

/**
 * Created by wb.heo on 2017-06-12.
 */
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class PermMissingElem {

    private int[] paramArr = new int[]{2,3,1,5};

    private static Integer solution(int[] arr) {

        int array_sum = 0;
        int element_sum = 0;

        for(int i=0; i < arr.length; i++){
            array_sum += i+1;
            element_sum += arr[i];
        }

        array_sum += arr.length + 1;

        int maxNum = Math.max(array_sum, element_sum);
        int minNum = Math.min(array_sum, element_sum);

        int el = maxNum - minNum;

        System.out.println("element : " + String.valueOf(el));

        return el;
    }

    @Test    
    public void shouldReturnIntElement(){
        Integer result = solution(paramArr);
        assertThat(result).isInstanceOf(Integer.class);
    }

    @Test
    public void shouldReturn3ElementForExample() {
        Integer result = solution(paramArr);
        assertThat(result).isEqualTo(4);
    }

}
