package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // b.setValue("부산"); 실행 불가능
        // 값 변경 위해서는 새 인스턴스 생성
        b = new ImmutableAddress("부산");

        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}