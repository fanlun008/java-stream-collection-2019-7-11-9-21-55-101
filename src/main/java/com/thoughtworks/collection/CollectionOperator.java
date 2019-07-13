package com.thoughtworks.collection;

import com.google.common.collect.Lists;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        return Stream.iterate(left, n -> (left < right) ? n+1 : n-1)
                .limit(Math.abs(left-right)+1).collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return Stream.iterate(left, n -> (left < right) ? n+1 : n-1)
                .limit(Math.abs(left-right)+1).filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(item -> item%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return IntStream.of(array).boxed().reduce((first, second)->second).get();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
