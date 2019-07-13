package com.thoughtworks.collection;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min = leftBorder < rightBorder ? leftBorder : rightBorder;
        int max = rightBorder < leftBorder ? leftBorder : rightBorder;

        return Stream.iterate(min, n->n+1).limit(max-min+1).reduce(0, (total, item) -> {
            total += (item%2==0)?item:0;
            return total;
        });
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().reduce(0, (total, item)-> {
            total += (item%2!=0)?item*3+2 : item;
            return total;
        });

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map((item) -> (item%2!=0)?item*3+2 : item).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {

        return arrayList.stream().filter(item->item%2==0).mapToDouble(item->item).average().getAsDouble();

    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Set<Integer> collect = arrayList.stream().filter(item->item%2==0).collect(Collectors.toSet());
        return Lists.newArrayList(collect);
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
