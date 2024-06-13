package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
int a, b는 값을 복사 -> 값 공유 X
add a, b는 주소값 복사 -> 값 공유

참조형 변수들은 같은 참조값을 통해 같은 인스턴스 참조 가능
b = a 라고 하면 a에 있는 참조값(주소값) x001을 복사해서 b에 전달
- 자바에서 모든 값 대입(=)은 가지고 있는 값을 복사해서 전달한다.
참조값을 복사해서 전달하므로 결과적으로 a, b는 같은 x001 인스턴스 참조

사이드 이펙트
- 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것
위의 코드로 풀어보면,
개발자는 b의 주소값을 서울에서 부산으로 변경할 의도로 값 변경을 시도했다.
다만 a, b는 같은 인스턴스를 참조하기에 a의 값도 함께 부산으로 변경 됨.
이렇게 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 의미함.

프로그래밍에서 사이드 이펙트는 보통 부정적인 의미로 사용
사이드 이펙트는 프로그램의 특정 부분에서 발생한 변경이 의도치 않게
다른 부분에 영향을 미치기 때문

이로 인해 디버깅이 어려워지고 코드의 안정성이 저하됨 -> 에러가 뜨지 않기 때문
 */