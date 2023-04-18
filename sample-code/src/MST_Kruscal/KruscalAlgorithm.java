package MST_Kruscal;

public class KruscalAlgorithm {
    private final static int[][] graph = {
            {0, 1, 2, 0, 3},
            {1, 0, 3, 0, 2},
            {2, 3, 0, 5, 1},
            {0, 0, 5, 0, 0},
            {3, 2, 1, 0, 0}
    };

    public static void main(String[] args) {
        //간선 짧은 순서로 정렬
        //짧은 것부터 사이클을 만들지 않는다는 가정 하에 고정
        //V-1 개의 간선 선택 후 종료
    }
}