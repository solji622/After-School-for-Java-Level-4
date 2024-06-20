package lang.String.exam;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "xxyybb";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        int count = 0;
        count += (str1Arr.length + str2Arr.length);
        for (int i = 0; i < str1Arr.length; i++) {
            if (str1Arr[i] == 'b' || str2Arr[i] == 'b'){
                count--;
            }

        }

        System.out.println(count);
    }
}
