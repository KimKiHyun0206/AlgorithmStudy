package Chained_Matrix_Multiplications.service;

import Chained_Matrix_Multiplications.model.Storage;

public class MatrixCalculateService {
    public int calculate(int x, int y, int lastX, int lastY, Storage storage) {
        int minValue = 0;

        for (int i = x; i < lastX; i++) {
            int calculateResult = storage.getStorage(x,y) +
        }

        return minValue;
    }
}
