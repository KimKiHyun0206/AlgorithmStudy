package PivotSort;

import java.util.LinkedList;
import java.util.List;

public class Mover {
    public DivideDto move(List<Integer> array, int pivotLocation) {
        int pivot = array.get(pivotLocation);
        array.remove(pivotLocation);
        List<Integer> small = findSmaller(array,pivot);
        List<Integer> big = findBigger(array,pivot);

        return new DivideDto(small,big,pivot);
    }

    private List<Integer> findBigger(List<Integer> array, int pivot) {
        List<Integer> result = new LinkedList<>();
        array.forEach(
                a -> {
                    if (a >= pivot) {
                        result.add(a);
                    }
                }
        );
        return result;
    }

    private List<Integer> findSmaller(List<Integer> array, int pivot) {
        List<Integer> result = new LinkedList<>();
        array.forEach(
                a -> {
                    if (a < pivot) {
                        result.add(a);
                    }
                }
        );
        return result;
    }
}
