package MergeSort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayMerger {
    public List<Integer> merge(List<Integer> start, List<Integer> end){
        List<Integer> merge = new LinkedList<>();
        merge.addAll(start);
        merge.addAll(end);

        merge.sort(Comparator.naturalOrder());

        return merge;
    }
}