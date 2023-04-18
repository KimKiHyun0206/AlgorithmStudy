package CoinChange;

public class CoinChangeAlgorithm {
    private final static int[] coins = {500,100,50,10};

    public static void main(String[] args) {
        int[] answer = new int[coins.length];
        int money = 5040;

        for(int i=0;i< coins.length;i++) {
            answer[i] = 0;
            if (money >= coins[i]) {
                answer[i] = money / coins[i];
                money %= coins[i];
            }
        }

        for(int i=0;i< answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
