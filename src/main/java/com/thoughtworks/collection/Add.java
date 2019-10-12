package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int lower_limit = Math.min(leftBorder , rightBorder);
        int upper_limit = Math.max(leftBorder , rightBorder);
        int sum = 0;

        for (int i = lower_limit; i <= upper_limit; i++) {
            if (  i % 2 == 0 ){
                sum+= i;
            }
        }
        return  sum;
    };

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int lower_limit = Math.min(leftBorder , rightBorder);
        int upper_limit = Math.max(leftBorder , rightBorder);
        int sum = 0;

        for (int i = lower_limit; i <= upper_limit; i++) {
            if (  i % 2 != 0 ){
                sum+= i;
            }
        }
        return  sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return  arrayList.stream().map(n -> n * 3 +  2)
                .reduce(
                0,
                (a, b) -> a + b);
    };

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(
                num -> { if (num %2 != 0 )
                {
                    return num * 3 + 2 ;
                } else return num ; })
                .collect(Collectors.toList());
    };

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getAverageOfEven(List<Integer> arrayList) {
//        List<Integer> common = new ArrayList<>();
//        double average = arrayList.stream()
//                .filter( n -> n % 2 == 0)
//                .forEach( add -> add == n);
//        return average;
//    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
