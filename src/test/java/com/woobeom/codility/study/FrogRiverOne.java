package com.woobeom.codility.study;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wb.heo on 2017-06-15.
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {

        int time = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {

            if (set.contains(A[i])) {
                continue;
            }

            set.add(A[i]);
            time++;

            System.out.println(i + " : " + set + " time : " + time);
        }

        return time;
    }

    public int solution2(int X, int[] A) {

        int sum1ToX = 0;
        for (int i = 1; i <= X; i++) {
            sum1ToX += i;
        }

        int positionSum = 0;
        boolean[] ifLeavesAreOnPositions = new boolean[X + 1];

        for (int j = 0; j < A.length; j++) {
            if (true == ifLeavesAreOnPositions[A[j]]) {
                continue;
            }

            ifLeavesAreOnPositions[A[j]] = true;
            positionSum += A[j];

            if (positionSum == sum1ToX) {
                return j;
            }
        }

        return -1;
    }

    @Test
    public void true_test() {
        assertThat(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4})).isEqualTo(6);
    }

    @Test
    public void true_test2() {
        assertThat(solution(1, new int[]{1, 3, 1, 4, 2, 3, 5, 4})).isEqualTo(1);
    }

}
