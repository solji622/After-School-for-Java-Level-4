package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 큰 숫자를 다룰 때 _로 구분 가능
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis(); // 현재 시스템의 시간 가져오기
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long의 실행 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long의 실행 시간: " + (endTime - startTime) + "ms");
        


    }

}
/*
기본형 연산이 래퍼 클래스보다 대략 10여배 이상 빠른 것을 확인할 수 있다. (시스템마다 다름)
기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다.
래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서
객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 사용하게 된다. (대략 8~16바이트)

위 연산은 10억 번의 연산을 수행했을 때 대략 0.2초와 3.1초의 차이만큼 발생한다.
기본형이든 래퍼 클래스든 이것을 1회로 환산하면 둘다 매우 빠르게 연산이 수행된다.
일반적으로 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 사막의 모래알 하나 정도의 차이가 날 뿐이다

CPU 연산을 아주 많이 수행하는 특수 경우이거나 수만=수십번 이상 연속해서 연산을 수행해야하는 경우라면
기본형을 사용해서 최적화 고려 필요

그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택하면 된다.

유지보수 VS 최적화
우선 고려해야할 사항은 유지보수하기 좋은 코드이다.
특히 최신 컴퓨터는 매우 빠르기 때문에 메모리 창에서 발생하는 연산을 몇번 줄인다고 해도
실질적인 도움이 되지 않는 경우가 많다.



*/
