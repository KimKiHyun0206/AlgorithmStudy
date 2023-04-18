package MergeSort;

import java.util.List;

public class DividedArrayDto {
    private List<Integer> head;
    private List<Integer> tail;

    public DividedArrayDto(List<Integer> head, List<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }

    public List<Integer> getHead() {
        return head;
    }

    public void setHead(List<Integer> head) {
        this.head = head;
    }

    public List<Integer> getTail() {
        return tail;
    }

    public void setTail(List<Integer> tail) {
        this.tail = tail;
    }
}
