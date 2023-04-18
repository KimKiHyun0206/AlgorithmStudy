package SelectionProblem;

import java.util.List;

public class DivideDto {
    private final List<Integer> small;
    private final List<Integer> big;
    private final int pivot;


    public DivideDto(List<Integer> small, List<Integer> big, int pivot) {
        this.small = small;
        this.big = big;
        this.pivot = pivot;
    }

    public List<Integer> getSmall() {
        return small;
    }

    public List<Integer> getBig() {
        return big;
    }

    public int getPivot() {
        return pivot;
    }
}

