package lang.String.exam;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "WrongAnswer";
        String[] strarr = str.split("");
        char[] chararr = str.toCharArray();

        for (int i = 0; i < chararr.length; i++) {
            if(chararr[i] > 'Z'){
                strarr[i] = strarr[i].toUpperCase();
            } else if (chararr[i] < 'Z'){
                strarr[i] = strarr[i].toLowerCase();
            }
        }

        for(String i : strarr){
            System.out.print(i);
        }

    }
}
