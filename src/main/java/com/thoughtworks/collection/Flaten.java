package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        Integer[] flatArray = flattenStream(array)
                .toArray(Integer[] ::new);
       return Arrays.asList(flatArray);

    }
    public static <T> Stream<T> flattenStream(T[][] arrays)
    {
        List<T> list = new ArrayList<>();
        for (T[] array : arrays) {
            Arrays.stream(array)
                    .forEach(list::add);
        }
        return list.stream();
    }
    public List<Integer> transformToUnrepeatedOneDimesional() {
        Integer[] flatArray = flattenStream(array)
                .toArray(Integer[] ::new);
        return Arrays.asList(flatArray).stream().distinct().collect(Collectors.toList());
    }
}
