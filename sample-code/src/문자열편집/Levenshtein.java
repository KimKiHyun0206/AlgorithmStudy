package 문자열편집;

import java.util.Scanner;

public class Levenshtein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        new Levenshtein().runAlgorithm(str1, str2);
    }

    public int getMinimum(int val1, int val2, int val3) {
        int minNumber = val1;
        if (minNumber > val2) minNumber = val2;
        if (minNumber > val3) minNumber = val3;
        return minNumber;
    }

    public int levenshteinDistance(char[] s, char[] t) {
        int m = s.length;
        int n = t.length;

        int[][] d = new int[m + 1][n + 1];

        for (int i = 1; i < m; i++) {
            d[i][0] = i;
        }

        for (int j = 1; j < n; j++) {
            d[0][j] = j;
        }

        for (int j = 1; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if (s[i] == t[j]) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    d[i][j] = getMinimum(d[i - 1][j], d[i][j - 1], d[i - 1][j - 1]) + 1;
                }
            }
        }
        printDp(d);
        return d[m - 1][n - 1];
    }

    private void printDp(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void runAlgorithm(String str1, String str2) {
        char[] stringA = str1.toCharArray();
        char[] stringB = str2.toCharArray();

        int result = levenshteinDistance(stringA, stringB);
        System.out.println("Answer : " + result);
    }
}