package lang.String.exam;

import java.util.Scanner;

public class StringEx2_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 철자를 세어서 포함되지 않는 것을 뻄
        String a = sc.next();
        String b = sc.next();

        int[] cntA = getAlphabetCnt(a);
        int[] cntB = getAlphabetCnt(b);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cntA[i] - cntB[i]);
        }
        System.out.println(ans);
    }

    public static int[] getAlphabetCnt(String str) {
        int[] alphabetCnt = new int[26];
        for(int i = 0; i < str.length(); i++){
            alphabetCnt[str.charAt(i) - 'a']++;
            // i에 해당하는 알파벳에 -a를 해서 나오는 결과값 순으로 오름차순이 되며 알파벳이 담겨짐
        }
        return alphabetCnt;
    }
}
