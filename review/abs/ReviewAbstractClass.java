package review.abs;

import review.abs.camera.Camera;
import review.abs.camera.FactoryCam;
import review.abs.camera.SpeedCam;

public class ReviewAbstractClass {
    public static void main(String[] args) {
//        Camera camera = new Camera() -> 추상 클래스는 인스턴스화 불가능

        Camera factoryCam = new FactoryCam();
        factoryCam.showMaininFeafure();

        Camera speedCam = new SpeedCam();
        speedCam.showMaininFeafure();
    }
}
