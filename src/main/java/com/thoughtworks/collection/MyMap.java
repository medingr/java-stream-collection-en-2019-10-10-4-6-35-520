package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map( num ->
                num * 3 ).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
       return array.stream().map( num ->
               getLettersFromNum(num)).collect(Collectors.toList());
    }
//
//    private static String getLetterFromNum(int i) {
//        return i < 0 || i > 26 ? "?" : String.valueOf((char) ('A' + i -1 )).toLowerCase();
//    }

    public List<String> mapLetters() {
          return array.stream().map( num ->
                  getLettersFromNum(num)).collect(Collectors.toList());
    }

    private static  String getLettersFromNum(int colNum) {
        int Base = 26;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String colName = "";

        while (colNum > 0) {
            int position = colNum % Base;
            colName = (position == 0 ? 'Z' : chars.charAt(position > 0 ? position - 1 : 0)) + colName;
            colNum = (colNum - 1) / Base;
        }
        return colName.toLowerCase();
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().
                collect(Collectors.toList());
    }
}
