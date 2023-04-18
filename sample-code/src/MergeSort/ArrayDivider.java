package MergeSort;

import java.util.LinkedList;
import java.util.List;

public class ArrayDivider {
    public DividedArrayDto divide(List<Integer> array) {
        List<Integer> head = new LinkedList<>();
        List<Integer> tail = new LinkedList<>();
        int arrayLength = array.size() / 2;
        for (int i = 0; i < arrayLength; i++) {
            head.add(array.get(i));
            array.remove(0);
        }
        for (int i = arrayLength + 1; i < array.size(); i++) {
            tail.add(array.get(i));
            array.remove(0);
        }
        return new DividedArrayDto(head, tail);
    }
}