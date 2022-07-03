package com.designpattern.iterator.imperative;

public interface CustomIterator<T> {
    T next();
    T currentElement();
    boolean hasNext();
}
