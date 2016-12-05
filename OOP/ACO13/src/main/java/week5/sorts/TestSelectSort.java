package week5.sorts;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by gorobec on 25.06.16.
 */
public class TestSelectSort {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(10);

        System.out.println(Arrays.toString(array));
        ArrayUtils.selectSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = ArrayUtils.createArray(10);

        System.out.println(Arrays.toString(array2));
        ArrayUtils.bubleSort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
