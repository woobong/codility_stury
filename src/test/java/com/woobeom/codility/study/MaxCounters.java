package com.woobeom.codility.study;

import org.junit.Test;

import java.util.Arrays;

// https://codility.com/demo/results/trainingE9WM6G-FWZ/ 77% correcteness 100% performance 60%
//
public class MaxCounters {

    private int[] paramArr = new int[]{3, 4, 4, 6, 1, 4, 4};

    private static int[] solution(int[] arr, int N) {
        int[] counter = new int[N];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int counterIdx = arr[i] - 1;
            if (arr[i] == N + 1) {
                setMaxValueBetweenCounters(max, counter);
            } else {
                counter[counterIdx]++;
                if (counter[counterIdx] > max) {
                    max = counter[counterIdx];
                }
            }
        }

        return counter;
    }

    // 100% ㅉㅏ리
    private static int[] solution2(int[] arr, int N) {
        int[] counter = new int[N];

        int max = 0;
        int last_max = 0;

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 1;

            if (arr[i] > N) {
                last_max = max;
            } else {
                counter[idx] = Math.max(counter[idx], last_max);
                counter[idx]++;
                max = Math.max(max, counter[idx]);
            }
        }

        for (int i = 0; i < N; i++) {
            counter[i] = Math.max(counter[i], last_max);
        }

        return counter;
    }

    private static void setMaxValueBetweenCounters(int max, int[] counter) {
        for (int i = 0; i < counter.length; i++) {
            counter[i] = max;
        }
    }

    @Test
    public void result() {
        int[] result = solution(paramArr, 5);
        System.out.println(Arrays.toString(result));
    }

}
