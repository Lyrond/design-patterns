package com.epam.rd.autocode.decorator;

import java.util.List;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.AbstractList;

public class Decorators {
    public static <E> List<E> evenIndexElementsSubList(List<E> source) {
        return new AbstractList<E>() {
            @Override
            public E get(int index) {
                return source.get(index * 2);
            }

            @Override
            public int size() {
                return (source.size() + 1) / 2;
            }

            @Override
            public Iterator<E> iterator() {
                return new Iterator<E>() {
                    private int nextIndex = 0;

                    @Override
                    public boolean hasNext() {
                        return nextIndex < size();
                    }

                    @Override
                    public E next() {
                        E value = get(nextIndex);
                        nextIndex++;
                        return value;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public void forEachRemaining(Consumer<? super E> action) {
                        while (hasNext()) {
                            action.accept(next());
                        }
                    }
                };
            }
        };
    }


}
