package data_structures;

/**
 * Created by gorobec on 21.05.17.
 */
public interface MyCollection extends Iterable{
    boolean add (Object o);
    boolean contains (Object o);
    void clear();
    boolean isEmpty();
    boolean remove(Object o);
    int size();
}
