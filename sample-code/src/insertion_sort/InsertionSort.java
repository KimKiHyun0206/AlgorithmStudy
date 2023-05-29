package insertion_sort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    private final static int[] array = {7, 6, 5, 4, 9, 8, 2, 1, 3};

    public static void main(String[] args) {
        Service service = new Service();
        new View().showResult(
                service.sort(array)
        );
    }
}

class Service {
    public List<Integer> sort(int[] arr) {

        List<Integer> resultList = new LinkedList<>();

        resultList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            resultList.add(arr[i]);
            resultList.sort(Comparator.naturalOrder());
        }

        return resultList;
    }
}

class View {
    public void showResult(List<Integer> arr) {
        for (int value:arr) {
            System.out.print(value+" ");
        }
    }
}
