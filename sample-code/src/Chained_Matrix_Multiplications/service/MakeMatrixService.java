package Chained_Matrix_Multiplications.service;

import Chained_Matrix_Multiplications.model.Matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MakeMatrixService {
    public List<Matrix> getMatrix(int[] lengths){
        List<Matrix> result = new LinkedList<>();
        for(int i=0;i< lengths.length-1;i++){
            result.add(
                    new Matrix(lengths[i], lengths[i+1])
            );
        }
        return result;
    }
}
