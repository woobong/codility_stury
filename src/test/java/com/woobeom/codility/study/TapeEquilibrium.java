package com.woobeom.codility.study;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wb.heo on 2017-06-15.
 */
public class TapeEquilibrium {

    private int[] sample = new int[]{};
    private int[] sample2 = new int[]{};

    public static int solution(int a[], int n) {
        if ( n == 0 ) return 0;

        int sumOfLeft = 0;
        int sumOfRight = Arrays.stream(a).sum();
        int minDiff = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            sumOfLeft += a[i-1];
            sumOfRight -= a[i-1];
            int diff = Math.abs(sumOfLeft-sumOfRight);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    @Before
    public void setup() {
        sample = new int[] {3,1,2,4,3};
        sample2 = new int[] {1,2,3,4,5};
    }

    @Test
    public void should_return_zero_with_empty_array(){
        int[] emptyArr = new int[]{};
        assertThat(solution(emptyArr, emptyArr.length)).isEqualTo(0);
    }

    @Test
    public void should_return_1_with_sample_array(){
        assertThat(solution(sample, sample.length)).isEqualTo(1);
    }

    @Test
    public void should_return_3_with_sample2_array(){
        assertThat(solution(sample2, sample2.length)).isEqualTo(3);
    }

    @Test
    public void should_return_11() {
        int[] _a = new int[]{-3,2,5,1,6};
        assertThat(solution(_a, _a.length)).isEqualTo(1);
    }
}
