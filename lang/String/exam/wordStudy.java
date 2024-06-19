package lang.String.exam;

public class wordStudy {
    public static void main(String[] args) {
        String str = "Mississipi";

        char[] arr = str.toCharArray();
        int[] cnt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    cnt[i] += 1;
                }
            }
        }


    }
}
