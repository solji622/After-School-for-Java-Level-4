package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0));  // 0
        System.out.println(findValue(intArr, 1));  // 1
        System.out.println(findValue(intArr, 100));  // -1
        // return -1을 할 경우 값 중에 -1이 있으면 구분이 어려워짐!

    }

    private static MyInteger findValue(MyInteger[] intArr, int target){
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }

        return null;
    }
}

/*


 */
