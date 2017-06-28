package com.woobeom.codility.study;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wb.heo on 2017-06-01.
 */
public class CycleRotation {

    public int[] solution(int[] A, int K) {

        if (A == null || A.length == 0 || K == 0)
            return A;

        K = K % A.length;

        int[] newA = new int[A.length];

        // [3, 8, 9, 7, 6] , 3
        System.arraycopy(A, 0, newA, K, A.length - K);
        System.arraycopy(A, A.length - K, newA, 0, K);

        return newA;
    }

    @Test
    public void run() {
        int[] result = solution(new int[]{}, 3);
        assertArrayEquals(new int[]{9,7,6,3,8}, result);
    }
}
