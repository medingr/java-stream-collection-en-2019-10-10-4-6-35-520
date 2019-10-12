package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> range = new ArrayList<Integer>();
        if ( left < right ) {
            range = Stream.iterate(1, n -> n + 1)
                .limit(right)
                .collect(Collectors.toList()) ;
        }else {
            range = Stream.iterate(1, n -> n + 1)
                    .limit(left)
                    .collect(Collectors.toList()) ;
               Collections.reverse(range);
        }
        return range;
    }
    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evens = new ArrayList<>();
          Arrays.stream(array)
               .filter(i -> i % 2 == 0)
               .forEach(evens::add);
          return evens;
    }

    public int popLastElment(int[] array) {
        int last = array.length - 1;
        return array[last];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> common = new ArrayList<>();
         Arrays.stream(firstArray)
                .filter( i -> {
                    return Arrays.stream(secondArray)
                            .anyMatch(s -> i == s );
                }).forEach(common::add);
         return  common;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
