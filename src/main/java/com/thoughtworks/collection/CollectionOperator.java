package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
       return  Stream.of(array)
               .mapToInt(i -> i).boxed()
               .filter(i -> i % 2 != 0)
               .collect(Collectors.toCollection());

    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
