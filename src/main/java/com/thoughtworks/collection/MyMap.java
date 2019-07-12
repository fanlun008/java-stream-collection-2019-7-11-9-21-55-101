package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map( item -> item * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
            return array.stream().map( item -> letters[item-1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map( item-> item < 26 ? letters[item%26-1] : letters[item/26-1] + letters[item%26]).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted((i1, i2)-> i2.compareTo(i1)).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted((i1, i2)-> i1.compareTo(i2)).collect(Collectors.toList());
    }
}
