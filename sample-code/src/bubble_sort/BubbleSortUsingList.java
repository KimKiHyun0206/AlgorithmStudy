package bubble_sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class BubbleSortUsingList {
    private static Integer[] array = {5,3,2,4,1};

    public static void main(String[] args) {
        Queue<Integer> arrayQueue = new LinkedList<>();

        Arrays.asList(array).stream().forEach(
                a ->{
                    arrayQueue.add(a);
                }
        );

        Queue<Integer> answer = new LinkedList<>();


    }

    private static int findMinValue(Queue<Integer> array){
        int min = array.poll();
        while (!array.isEmpty()){
            if(min> array.peek()){
                min = array.poll();
            }
        }
        return min;
    }
}
