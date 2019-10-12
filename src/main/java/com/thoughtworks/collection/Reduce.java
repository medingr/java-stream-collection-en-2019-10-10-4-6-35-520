package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
                return arrayList.stream()
                .reduce( (n,v) -> n < v ? v : n )
                .get();

    }

    public double getMinimum() {
        return arrayList.stream()
                .reduce( (n,v) -> n > v ? v : n )
                .get();
    }

    public double getAverage() {
     double average = arrayList.stream()
             .mapToDouble( n -> Double.valueOf(n))
             .reduce(0, (a, b) -> a + b)
             / arrayList.size();
     return average;
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        return arrayList.stream().filter(i -> i % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int firstEven  = arrayList.stream().filter(i -> i % 2 == 0).findFirst().get();
        return arrayList.indexOf(firstEven);
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        List<Integer> odds = new ArrayList<>();
        arrayList.stream().filter(i -> i % 2 != 0).
                forEach( i -> odds.add(i) );
        int last =  odds.size() - 1;
        return odds.get(last);
    }

    public int getIndexOfLastOdd() {
        List<Integer> odds = new ArrayList<>();
        arrayList.stream().filter(i -> i % 2 != 0).
                forEach( i -> odds.add(i) );
       int last =  odds.size() - 1;
       int lastValue = odds.get(last);
       return arrayList.indexOf(lastValue);
    }
}
