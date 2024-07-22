package exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                q.add(q.poll()); // poll(가장 먼저 들어온 값)
            }
            ans[i] = q.poll();
        }

        System.out.print("<");
        for (int i = 0; i < ans.length; i++) {
            if (i == ans.length - 1) System.out.print(ans[i]);
            else System.out.print(ans[i] + ", ");
        }
        System.out.print(">");

        System.out.println();

        System.out.println("<" + Arrays.stream(ans).mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
    }

}
