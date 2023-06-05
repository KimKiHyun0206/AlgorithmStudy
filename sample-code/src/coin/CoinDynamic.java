package coin;

import java.util.Scanner;

public class CoinDynamic {
    private int mNumOfCoins = 0;
    private int coins[];
    private int select[];
    private int solmap[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                //입력
        int numOfCoin = sc.nextInt();                       //코인의 수
        CoinDynamic cg = new CoinDynamic(numOfCoin);        //코인의 수 입력으로 생성
        for (int i = 0; i < numOfCoin; i++) {
            cg.addCoin(sc.nextInt());                       //코인의 값 입력
        }
        cg.calculate(sc.nextInt());                         //찾아야 하는 거스름돈값
    }

    public CoinDynamic(int numOfCoin) {
        coins = new int[numOfCoin];
    }

    public void addCoin(int coinValue) {
        coins[mNumOfCoins++] = coinValue / 100;
    }

    public void calculate(int value) {  //입력 단위가 100원 부터임
        //이전 솔루션들을 저장하기 위한 메모리 할당
        solmap = new int[value / 100 + 1];
        select = new int[value / 100 + 1];

        //동전 1개에 대한 솔루션 값들을 설정한다.
        for (int i = 0; i < mNumOfCoins; i++) {
            solmap[coins[i]] = 1;
            select[coins[i]] = coins[i];
        }

        //100원부터 입력된 잔돈 까지 솔루션을 계산한다.
        for (int i = 1; i < value / 100 + 1; i++) {
            //이전에 계산된 값일 경우 Pass = 동전 1개에 대한 솔루션들
            if (solmap[i] != 0) {
                continue;
            } else {
                int minNumber = Integer.MAX_VALUE;
                int selectCoin = -1;
                //S(M) = Min(S(M-C1)+1,S(M-C2)+1,...,S(M-Cn)+1) 을 계산하는 로직
                for (int j = 0; j < mNumOfCoins; j++) {
                    if (i - coins[j] > 0) {
                        if (minNumber > solmap[i - coins[j]] + 1) {
                            minNumber = solmap[i - coins[j]] + 1;
                            selectCoin = coins[j];
                        }
                    }
                }
                //최소 동전 개수(솔루션)과 이때 사용된 동전을 저장한다.
                solmap[i] = minNumber;
                select[i] = selectCoin;
            }
        }
        int change = value / 100;

        //잔돈에서 최소 동전 개수를 위해서 사용되었던 동전들을 역으로 트래킹함
        while (change != 0) {
            System.out.println(select[change] * 100);
            change = change - select[change];
        }
    }
}