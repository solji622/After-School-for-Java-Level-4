package lang.wrapper.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_Dongari2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] cost = new int[N];
        int[] budget = new int[M];

        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            budget[i] = sc.nextInt();
        }

        Arrays.sort(cost);
        Arrays.sort(budget);

        int l = 0, r = Math.min(N, M), ans = 0;

        while (l <= N) {
            int m = (l + r) / 2; // l+r의 값이 int의 범위 넘어설 때는 사용하면 안 됨
            if (calc(cost, budget, m) <= X){
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        System.out.println(ans);
    }

    static long calc(int[] cost, int[] budget, int assignCount){
        long needAmount = 0;
        for (int i = 0; i < assignCount; i++) {
            needAmount += Math.max(cost[i] - budget[budget.length - assignCount+i], 0);
        }

        return needAmount;
    }
}
