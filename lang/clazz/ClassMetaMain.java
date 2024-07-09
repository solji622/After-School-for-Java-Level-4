package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz = String.class;
        
        // 모든 필드 출력
        Field[] fiedss = clazz.getDeclaredFields();
        for (Field field : fiedss) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();

        for (Class i : interfaces) {
            System.out.println("interface: " + i.getName());
        }
    }

}

/*
클래스의 주요 기능
1, 타입 정보 열기: 클래스의 이름. 슈퍼 클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조회할 수 있다
2. 리플래션: 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스 생성하거나 메서도 호출 등의 작업 가능
3. 동작 로딩과 생성: Class.forName() 메소드를 사용하여 클래스 동적으로 로드, newInstance() 메서드 통해 새로운 인스턴드 생성
4. 참고 (동적 로딩): 런타임에 클래스 로드하는 프로세스
5. 애노테이션 처리: 클래스에 적용된 애노테이션 조회하고 처리하는 기능 제공


Class 클래스의 주요 기능
1. getDeclaredFields(): 클래스의 모든 필드를 조회한다
2. getDeclaredMethods(): 클래스의 모든 메서드를 조회한다.
3. getSuperclass(): 클래스의 부모 클래스를 조회한다.
4. getInterfaces(): 클래스의 인터페이스를 조회한다.
 */
