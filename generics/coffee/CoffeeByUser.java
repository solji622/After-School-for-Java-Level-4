package generics.coffee;

import generics.user.User;

public class CoffeeByUser <T extends User> {
    // <T extends 클래스명> 클래스명 타입으로만 제한됨

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
