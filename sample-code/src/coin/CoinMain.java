package coin;

public class CoinMain {
    /*
    1. for i = 1 to n C[i]=∞
    2. C[0]=0
    3. for j = 1 to n { // j는 1원부터 증가하는 (임시) 거스름돈 액수이고, j=n 이면 입력에 주어진 거스름돈이 된다.
    4. for i = 1 to k {   //k = 동전의 갯수
    5. if (d_k ≤ j) and (C[ j- d_i]+1<C[ j])
    6. C[ j]=C[ j-d_i]+1
            }
        }
    7. return C[n]
    */
    public static void main(String[] args) {
        int[] coinStatus = {500, 100, 50, 10};
        int numberOfCoin = coinStatus.length;
        int targetValue = 1230;
        int[] calculateResult = new int[targetValue + 1];
        calculateResult[0] = 0;

        for (int calculateCoinValue = 1; calculateCoinValue <= targetValue; calculateCoinValue++) {
            for (int coinArray = 1; coinArray < numberOfCoin; coinArray++) {
                if (    coinStatus[coinArray] <= calculateCoinValue
                        &&
                        calculateResult[calculateCoinValue - coinStatus[coinArray]] + 1 < calculateResult[calculateCoinValue]
                ) {

                    calculateResult[calculateCoinValue] = calculateResult[calculateCoinValue - coinStatus[coinArray]] + 1;
                }
            }
        }

        System.out.println(calculateResult[calculateResult.length - 1]);
    }
}