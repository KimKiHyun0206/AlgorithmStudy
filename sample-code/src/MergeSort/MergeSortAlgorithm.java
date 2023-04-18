package MergeSort;

import java.util.*;

public class MergeSortAlgorithm {
    private final static ArrayDivider arrayDivider = new ArrayDivider();
    private final static ArrayMerger arrayMerger = new ArrayMerger();

    public static void main(String[] args) {
        List<Integer> solution = getSolution();
        int numberOfDivisions = solution.size() / 2;

        Queue<DividedArrayDto> dividedArrayDtos = new LinkedList<>();
        dividedArrayDtos.add(
                arrayDivider.divide(solution)
        );
        for (int i = 1; i < numberOfDivisions; i++) {
            DividedArrayDto dto = dividedArrayDtos.poll();
            List<Integer> head = dto.getHead();
            List<Integer> tail = dto.getTail();
            dividedArrayDtos.add(arrayDivider.divide(head));
            dividedArrayDtos.add(arrayDivider.divide(tail));
        }

        List<Integer> answer = new LinkedList<>();
        while (answer.size()< solution.size()){
            DividedArrayDto dto = dividedArrayDtos.poll();
            answer.addAll(arrayMerger.merge(dto.getHead(),dto.getTail()));
        }
    }

    private static List<Integer> getSolution() {
        List<Integer> solution = new LinkedList<>();
        int[] arr = {7, 8, 9, 4, 2, 3, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            solution.add(arr[i]);
        }
        return solution;
    }


}
