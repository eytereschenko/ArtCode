package data_structures.list;

import java.util.Iterator;

/**
 * Created by gorobec on 16.10.16.
 */
public class MyArrayList implements MyList{

    private Object[] elementData;
    private int size;
    private int defaultCapacity = 3;



    public MyArrayList(){
        elementData = new Object[defaultCapacity];
    }

    public MyArrayList(int capacity){
        elementData = new Object[capacity];

    }


    public boolean add(Object o){

        elementData[size++] = o;


        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public Object get(int index) {
        checkIndex(index);

        return elementData[index];
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty(Object o) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean set(int index, Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
