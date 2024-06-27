package lang.wrapper.exam;

import java.util.*;

public class Ex4_NotListenNotSee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Not Listen
        int M = sc.nextInt(); // Not See

        Set<String> nohear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nohear.add(sc.next()); // 듣지 못하는 사람 추가
        }

        // 듣지 못하고 보지 못하는 사람들의 이름을 list에 저장
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (nohear.contains(name)){ // 입력 받은 이름이 set에 있는지 확인
                ans.add(name); // 있으면 듣보잡이 됨.....(슬픔)
            }
        }

        // 이름 리스트를 오름차순으로 정렬
        Collections.sort(ans);

        System.out.println(ans.size());
        for(String name : ans) {
            System.out.println(name);
        }
    }
}
