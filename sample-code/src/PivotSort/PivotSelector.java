package PivotSort;

public class PivotSelector {
    private final int option;

    public PivotSelector(int option) {
        this.option = option;
    }

    public int getPivot(int size){
        switch (option) {
            case 1 -> {
                return 0;
            }
            case 2 -> {
                return size / 2;
            }
            case 3 -> {
                return size - 1;
            }
            default -> {
                return 1;
            }
        }
    }
}
