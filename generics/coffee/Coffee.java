package generics.coffee;

public class Coffee <T>{
    // 제네릭 클래스 선언 방법 : 클래스명 옆에 <타입명>

    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
