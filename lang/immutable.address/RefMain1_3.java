package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
//        b.setValue("부산");
        change(b, "부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경 합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
/*
불변 객체
필요성
1. 공유하면 안 되는 객체를 여러 변수에서 공유했기에 문제 발생
2. 객체의 공유를 막을 수 있는 방법은 없음
3. 사이드 이펙트의 더 근본적인 원인을 고려해보면 객체 공유 자체는 문제가 되지 않음
4. 객체 공유한다고 바로 사이드 이펙트가 발생하지는 않음
5. 문제의 직접적인 원인은 공유된 객체의 값을 변경한 것에 있음


 */