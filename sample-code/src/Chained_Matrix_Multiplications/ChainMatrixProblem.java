package Chained_Matrix_Multiplications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChainMatrixProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMatrix = Integer.parseInt(br.readLine());           //행렬 갯수 입력
        int[] matrixInfo = new int[numberOfMatrix + 1];                          //행렬 정보 저장할 배열
        for (int i = 0; i < numberOfMatrix; i++) {                      //행렬 정보 입력
            String[] split = br.readLine().split(" ");
            matrixInfo[i] = Integer.parseInt(split[0]);
            matrixInfo[i + 1] = Integer.parseInt(split[1]);
        }

        long[][] dp = new long[numberOfMatrix + 1][numberOfMatrix + 1];          //계산 내용 기록용 배열
        //op는 계산할 배열의 위치를 맞추기 위함
        //대각선이잖아 맞춰야
        for (int op = 1; op < numberOfMatrix; op++) {                            //행렬의 갯수만큼 연산
            System.out.println("[ Try ] " + op);
            for (int y = 1; y <= numberOfMatrix - op; y++) {

                int x = y + op;
                dp[y][x] = Long.MAX_VALUE;    //계산하기 전에 INF 로 초기화한다.

                for (int k = y; k < x; k++) {
                    long compareValue = dp[y][k] + dp[k + 1][x] + (long) matrixInfo[y - 1] * matrixInfo[k] * matrixInfo[x];
                    dp[y][x] = Math.min(
                            compareValue,
                            dp[y][x]
                    );
                    System.out.println("[ Compare ] x :" + x + ", y :" + y + ", compareValue : " + compareValue);
                }
            }
            System.out.println();
        }

        for (int i = 1; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println(dp[1][numberOfMatrix]);
    }
}
