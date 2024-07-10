package lang.math.test;

import java.util.HashSet;
import java.util.Random;

public class LottoGenerator {

    public static int[] generate(){
        Random random = new Random();

        HashSet<Integer> lotto = new HashSet<>();
        int[] numbers = new int[6];

        for (int i = 0; i <=6; i++) {
            int lottoNumber = random.nextInt(45)+1;
            lotto.add(lottoNumber);
        }

        return numbers;
    }
}
