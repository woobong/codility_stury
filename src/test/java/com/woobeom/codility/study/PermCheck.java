package com.woobeom.codility.study;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wb.heo on 2017-06-15.
 */
public class PermCheck {

    public int solution(int a[]) {
        int len = a.length;
        int max = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : a){
            set.add(i);
            max = Math.max(max, i);
        }

        return set.size() == len && max == len ? 1 : 0;
    }

    @Test
    public void true_test() {
        assertThat(solution(new int[]{4, 1, 3, 2})).isEqualTo(1);
    }

    @Test
    public void false_test() {
        assertThat(solution(new int[]{4, 1, 2})).isEqualTo(0);
    }
}
