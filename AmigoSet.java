package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {

        this.map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return super.removeIf(filter);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Set.super.spliterator();
    }

    @Override
    public Stream<E> stream() {
        return super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return super.parallelStream();
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }


}
