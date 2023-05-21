package Chained_Matrix_Multiplications.model;

public class CalculateResultStorage {
    private int[][] storage;

    public CalculateResultStorage(int length) {
        this.storage = new int[length-1][length-1];
    }

    public int[][] getStorage() {
        return storage;
    }

    public void setStorage(int x, int y, int value){
        storage[y][x] = value;
    }
}
