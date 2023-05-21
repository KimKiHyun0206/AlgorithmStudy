package Chained_Matrix_Multiplications;

import Chained_Matrix_Multiplications.model.Matrix;
import Chained_Matrix_Multiplications.service.MakeMatrixService;

import java.util.List;

public class Main {
    private final static MakeMatrixService makeMatrixService = new MakeMatrixService();
    public static void main(String[] args) {
        int[] lengths ={10,20,5,15,30};

        List<Matrix> matrixs = makeMatrixService.getMatrix(lengths);

    }
}
