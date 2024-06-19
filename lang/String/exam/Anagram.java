package lang.String.exam;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "xxyybb";

        String result = str1.concat(str2);
        char[] chararr = result.toCharArray();

        int count = 0;
        for (int i = 0; i < chararr.length; i++) {

            for (int j = chararr.length-1; j > 0; j--) {
                if (chararr[i] != chararr[j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
