package Chained_Matrix_Multiplications;

import java.util.*;

public class FindCoinMultipleSequence {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("행렬이 이어지도록 작성하세요");
        String[] input = scanner.nextLine().split(" ");
        List<MatrixSide> matrix = new LinkedList<>();

        for (int i = 1; i < input.length - 1; i++) {
            matrix.add(
                    new MatrixSide(
                            Integer.parseInt(input[i]), i
                    )
            );
        }
        matrix.sort(Comparator.comparingInt(MatrixSide::getSideLength).reversed());

        matrix.forEach(m -> {
            System.out.println("Calculate : " + m.getSideNumber()+"x"+(m.getSideNumber()+1));
        });
    }

}
class MatrixSide {

    public MatrixSide(int sideLength, int sideNumber) {
        this.sideLength = sideLength;
        this.sideNumber = sideNumber;
    }

    private final int sideLength;
    private final int sideNumber;

    public int getSideLength() {
        return sideLength;
    }

    public int getSideNumber() {
        return sideNumber;
    }
}
