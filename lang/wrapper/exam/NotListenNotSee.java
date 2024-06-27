package lang.wrapper.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NotListenNotSee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] listen = new String[N];
        for (int i = 0; i < N; i++) {
            listen[i] = sc.next();
        }
        String[] see = new String[M];
        for (int i = 0; i < M; i++) {
            see[i] = sc.next();
        }

        ArrayList<String> member = new ArrayList<String>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(listen[i].equals(see[j])){
                    cnt++;
                    member.add(listen[i]);
                }
            }
        }

        System.out.println(cnt);
        System.out.println(Arrays.toString(member.toArray()));
    }
}
