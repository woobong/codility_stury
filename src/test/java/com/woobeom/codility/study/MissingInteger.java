package com.woobeom.codility.study;

/**
 * Created by wb.heo on 2017-06-12.
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

// https://codility.com/demo/results/trainingZ4GQXQ-XPX/
public class MissingInteger {

    private int[] paramArr = new int[]{1, 3, 6, 4, 1, 2};

    // A[N] = K
    // N is an Integer, 1 <= N <= 100,000
    // K range is −2,147,483,648..2,147,483,647

    private static Integer solution(int[] arr) {

        int max = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(new Integer(arr[i]));
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i))
                return i;
        }

        return -1;
    }

    @Test
    public void result() {
        Integer result = solution(paramArr);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        assertThat(result).isEqualTo(5);
    }

}
