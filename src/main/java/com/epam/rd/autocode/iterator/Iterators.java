package com.epam.rd.autocode.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;

class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array) {
        return Arrays.stream(array).
                flatMap(value -> IntStream.of(value, value)).
                boxed().iterator();
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        return Arrays.stream(array).
                flatMap(value -> IntStream.of(value, value, value)).
                boxed().iterator();
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        return Arrays.stream(array).
                flatMap(value -> IntStream.of(value, value, value, value, value)).
                boxed().iterator();
    }

    public static Iterable<String> table(String[] columns, int[] rows) {
        return new Table(columns, rows);
    }




}
