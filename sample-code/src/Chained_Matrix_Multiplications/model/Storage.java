package Chained_Matrix_Multiplications.model;

public class Storage {
    private int[][] storage;

    public Storage(int length) {
        this.storage = new int[length-1][length-1];

        for(int i=0;i<length;i++){
            storage[i][i] = 0;
        }
    }

    public int getStorage(int x, int y) {
        return this.storage[y][x];
    }

    public void setStorage(int x, int y, int value){
        storage[y][x] = value;
    }
}
