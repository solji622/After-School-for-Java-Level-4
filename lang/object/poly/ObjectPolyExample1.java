package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();
        Object dog1 = new Dog();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        // 부모는 자식을 품을 수 없기에 자식 메서드 참조가 불가능함
        // dog.sound(); 컴파일 오류, Object에서 sound()가 없음
        // car.move(); 컴파일 오류, Object에서 move()가 없음

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
