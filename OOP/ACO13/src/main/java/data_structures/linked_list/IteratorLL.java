package data_structures.linked_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gorobec on 19.06.16.
 */
public class IteratorLL {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);

        Iterator iterator = numbers.iterator();
        System.out.println(iterator.next());


        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

    }
}
