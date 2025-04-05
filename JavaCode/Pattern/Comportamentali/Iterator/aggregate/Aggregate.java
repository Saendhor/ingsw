package Iterator.aggregate;

import Iterator.iterator.*;

/* <<interface>> Aggregate */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
